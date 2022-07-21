package com.javasource.hibernateAndJpa.DataAccess;

import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import com.javasource.hibernateAndJpa.Entities.BitkiTakvimi;

@Repository
public class HibernateBitkiTakvimiDal implements IBitkiTakvimiDal {

	private EntityManager entityManager;
	
	HibernateBitkiTakvimiDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	// AOP- Aspect Oriented Programming
	@Transactional
	public List<BitkiTakvimi> getAll(){
		Session session = entityManager.unwrap(Session.class);
		List<BitkiTakvimi> bitkiListesi = session.createQuery("from BitkiTakvimi",BitkiTakvimi.class).list();
		return bitkiListesi; 
	}

	@Transactional
	public void add(@RequestBody BitkiTakvimi bitkiTakvimiNesnesi1) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(bitkiTakvimiNesnesi1);
	}

	@Transactional
	public void update(@RequestBody BitkiTakvimi bitkiTakvimiNesnesi1) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(bitkiTakvimiNesnesi1);
	}
	
	@Override
	@Transactional
	public void delete(BitkiTakvimi bitkiId) {
		Session session = entityManager.unwrap(Session.class);
		BitkiTakvimi bitkiSil = session.get(BitkiTakvimi.class, bitkiId.getId());
		session.delete(bitkiSil);
		
	}
	
	@Transactional
	public BitkiTakvimi getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		BitkiTakvimi idyeGoreGelenBitki = session.get(BitkiTakvimi.class, id);
		return idyeGoreGelenBitki;
	}

		
}
