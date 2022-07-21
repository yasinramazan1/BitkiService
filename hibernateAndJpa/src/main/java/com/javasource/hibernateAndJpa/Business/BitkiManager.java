package com.javasource.hibernateAndJpa.Business;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.javasource.hibernateAndJpa.DataAccess.IBitkiTakvimiDal;
import com.javasource.hibernateAndJpa.Entities.BitkiTakvimi;

@Service
public class BitkiManager implements IBitkiService{
	
	private IBitkiTakvimiDal iBitkiTakvimiDal;
	
	// Constructor injection
	public BitkiManager(IBitkiTakvimiDal bitkitakvimiDal) {
		this.iBitkiTakvimiDal = bitkitakvimiDal;
	}

	@Override
	@Transactional
	public List<BitkiTakvimi> hepsiniGetir() {
		return this.iBitkiTakvimiDal.getAll();
	}

	@Override
	@Transactional
	public void ekle(BitkiTakvimi bitkiservisi) {
		this.iBitkiTakvimiDal.add(bitkiservisi);
		
	}

	@Override
	@Transactional
	public void guncelle(BitkiTakvimi bitkiservisi) {
		this.iBitkiTakvimiDal.update(bitkiservisi);
		
	}

	@Override
	@Transactional
	public void sil(BitkiTakvimi bitkiSil) {
		this.iBitkiTakvimiDal.delete(bitkiSil);
		
	}

	@Override
	@Transactional
	public BitkiTakvimi idyeGoreGetir(int id) {
		return this.iBitkiTakvimiDal.getById(id);
	}

}
