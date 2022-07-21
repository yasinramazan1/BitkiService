package com.javasource.hibernateAndJpa.Business;

import java.util.List;
import com.javasource.hibernateAndJpa.Entities.BitkiTakvimi;

public interface IBitkiService { // İsimlendirme standardı bu şekildedir.
	List<BitkiTakvimi> hepsiniGetir();
	void ekle(BitkiTakvimi bitkiservisi);
	void guncelle(BitkiTakvimi bitkiservisi);
	void sil(BitkiTakvimi bitkiId);
	BitkiTakvimi idyeGoreGetir(int id);
}
