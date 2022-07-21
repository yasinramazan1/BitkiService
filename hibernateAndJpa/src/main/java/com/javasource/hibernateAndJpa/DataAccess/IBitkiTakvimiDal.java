package com.javasource.hibernateAndJpa.DataAccess;

import java.util.List;
import com.javasource.hibernateAndJpa.Entities.BitkiTakvimi;

public interface IBitkiTakvimiDal {
	List<BitkiTakvimi> getAll();
	void add(BitkiTakvimi bitkiTakvimiNesnesi);
	void update(BitkiTakvimi bitkiTakvimiNesnesi);
	void delete(BitkiTakvimi bitkiId);
	BitkiTakvimi getById(int id);	
}
