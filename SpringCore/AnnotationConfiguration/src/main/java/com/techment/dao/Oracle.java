package com.techment.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Oracle implements IDao {

	@Override
	public void databaseName() {
		// TODO Auto-generated method stub
		System.out.println("connecting to oracle database");
	}

}
