package com.jdo.example;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;


@PersistenceCapable
public class person {

	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


@Persistent
private String name;
	

 public person(String name)
 {
	 this.name=name;
 }
}
