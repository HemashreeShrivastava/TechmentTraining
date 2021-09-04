package com.techment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.dao.IProductDao;
import com.techment.entity.Product;


@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner {
	@Autowired
	IProductDao iProductDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Product product1= new Product("dell","laptop",8900);
		Product product2= new Product ("lenovo","laptop",10000);
		//iProductDao.save(product1);
		//iProductDao.save(product2);
		System.out.println("inserted");
		List<Product>product=iProductDao.findAll();
		product.forEach(System.out::println);
		
		  Optional <Product> product3 =iProductDao.findById(11);
		if(product3.isPresent())
			System.out.println("yes");
		else
			System.out.println("No");
	Product product4=	iProductDao.findById(11).get();
		System.out.println("Product"+product4);
		
		
		/*
		 * Count
		 *
		 long  totalProduct = iProductDao.count();
		 System.out.println("total data are "+totalProduct);
		 *
		 * deletedById
		 *
		 iProductDao.deleteById(11);
		 System.out.println("deleted....");
		 
			/*
			 * try { iProductDao.existsById(12); } catch(Exception e) {
			 * System.out.println("Id not found"); }
			 */
		 List<Product> p=iProductDao.findByName("nokia");
		 System.out.println(p);
		 
		
		
	}

}
