package com.juaracoding.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table (name="register")
public class Register {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private long no;
	private String nama;
	private String email;
	private String phone;
	private String addres;
}
