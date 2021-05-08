package com.juaracoding.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juaracoding.main.entity.Register;
import com.juaracoding.main.repository.RegisterRepository;

@RestController
@RequestMapping ("/register")
public class RegisterController {
	
	@Autowired
	RegisterRepository registerRepo;
	
	@GetMapping ("/")
	public List<Register> getAll() {
		return (List<Register>) registerRepo.findAll();
	}
	
	@PostMapping("/addRegister/")
	public String addRegister (@RequestBody Register register ) {
		registerRepo.save(register);
		return "Insert Berhasil";
	}
	
	@GetMapping ("/searchRegister/{name}")
	public List<Register> getAllByNama (@PathVariable String name) {
		System.out.println(name);
		return registerRepo.findByNama(name);
	}
	
	@GetMapping ("/searchRegister/{email}")
	public List<Register> getAllByEmail (@PathVariable String email){
		System.out.println(email);
		return registerRepo.findByEmail(email);
		
	}
	
	@GetMapping ("/searchRegister/{phone}")
	public List<Register> getAllByPhone (@PathVariable String phone){
		System.out.println(phone);
		return registerRepo.findByPhone(phone);
	}
	
	@GetMapping ("/searchRegister/{addres}")
	public List<Register> getAllByAddres (@PathVariable String addres){
		System.out.println(addres);
		return registerRepo.findByAddres(addres);
	}
	
	@DeleteMapping("/deleteRegister/{no}")
	public String deleteRegister (@PathVariable String no) {
		registerRepo.deleteById(Long.parseLong(no));
		return "Delete Berhasil";
	}
	
	@PutMapping("/updateRegister/{no}")
	public String updateRegister (@PathVariable String no, @RequestBody Register register) {
		register.setNo(Long.parseLong(no));
		registerRepo.save(register);
		return "Update Berhasil";
	}
	
}
