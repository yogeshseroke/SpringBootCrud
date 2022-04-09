package com.crud1.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="info")
public class User {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String number;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public User(int id, String name, String number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", number=" + number + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
}
