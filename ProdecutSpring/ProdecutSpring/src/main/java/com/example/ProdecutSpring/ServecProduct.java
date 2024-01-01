package com.example.ProdecutSpring;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
@Component
public class ServecProduct {
	@Autowired
	ProductDB db;
	 
	public void getAll(){
	db.deleteAll();
}

}
