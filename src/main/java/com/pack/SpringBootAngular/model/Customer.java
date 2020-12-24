package com.pack.SpringBootAngular.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "customer")
public class Customer {
 
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
 
  //@Column(name = "name")
  private String name;
 
 //@Column(name = "age")
  private int age;
 
  @Column(name = "gender")
  @Enumerated(EnumType.STRING)   //EnumType.ORDINAL
  private Gender gender;
 
  public Customer() {
  }
 
 
  

public Customer(String name, int age, Gender gender) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
}




public Customer(long id, String name, int age, Gender gender) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.gender = gender;
}




public long getId() {
    return id;
  }
 
  public void setName(String name) {
    this.name = name;
  }
 
  public String getName() {
    return this.name;
  }
 
  public void setAge(int age) {
    this.age = age;
  }
 
  public int getAge() {
    return this.age;
  }




public Gender getGender() {
	return gender;
}




public void setGender(Gender gender) {
	this.gender = gender;
}




public void setId(long id) {
	this.id = id;
}




@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
}
 
 
 
}
