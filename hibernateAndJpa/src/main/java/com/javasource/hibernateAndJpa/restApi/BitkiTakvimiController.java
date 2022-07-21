package com.javasource.hibernateAndJpa.restApi;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javasource.hibernateAndJpa.Business.IBitkiService;
import com.javasource.hibernateAndJpa.Entities.BitkiTakvimi;

@RestController
@RequestMapping("/api")
public class BitkiTakvimiController {
	
	private IBitkiService bitkiServisInterfaceNesnesi;
	
	public BitkiTakvimiController(IBitkiService bitkiServisInterfaceNesnesi1) {
		this.bitkiServisInterfaceNesnesi = bitkiServisInterfaceNesnesi1;	
	}
	
	@GetMapping("/servis-test")
	public String servisTest() {
		return "Başarılı!";
	}
	
	@GetMapping("/bitkiservices")
	public List<BitkiTakvimi> get(){
		return bitkiServisInterfaceNesnesi.hepsiniGetir();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody BitkiTakvimi bitkiTakvimiNesnesi2) {
		bitkiServisInterfaceNesnesi.ekle(bitkiTakvimiNesnesi2);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody BitkiTakvimi bitkiTakvimiNesnesi2) {
		bitkiServisInterfaceNesnesi.guncelle(bitkiTakvimiNesnesi2);
	}
	
	@PostMapping("/delete")
	public void delete(@PathVariable BitkiTakvimi bitkiSil) {
		bitkiServisInterfaceNesnesi.sil(bitkiSil);
	}
	
	@GetMapping("/bitkiservices/{id}")
	public BitkiTakvimi getById(@PathVariable int id){
		return bitkiServisInterfaceNesnesi.idyeGoreGetir(id);
	}
}
