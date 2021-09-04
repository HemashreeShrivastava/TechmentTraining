package com.techment.entity;

import javax.persistence.*;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private int id;
	@Column(name = "NAME", unique = true, nullable = false, length = 100)
	private String name;
	@Column(name = "PRICE", unique = false, nullable = false, length = 100)
	private float price;

}
