package com.javasource.hibernateAndJpa.Entities;

import javax.persistence.*;

@Entity
@Table(name="bitki_takvimi")
public class BitkiTakvimi {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="BITKILER")
	private String bitkiler;
	
	@Column(name="AYLAR")
	private String aylar;
	
	public BitkiTakvimi(int id, String bitkiler, String aylar) {
		this.id = id;
		this.bitkiler = bitkiler;
		this.aylar = aylar;
	}
	
	public BitkiTakvimi() {
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getBitkiler() {
		return bitkiler;
	}
	
	public void setBitkiler(String bitkiler) {
		this.bitkiler = bitkiler;
	}
	
	public String getAylar() {
		return aylar;
	}
	
	public void setAylar(String aylar) {
		this.aylar = aylar;
	}
}
