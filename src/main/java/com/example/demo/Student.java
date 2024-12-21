package com.example.demo;

public class Student{
private String name;

private int num;
private String address;


public String getName() {
	return name;
}

public int getNum() {
	return num;
}

public String getAddress() {
	return address;
}

public void setName(String name) {
	this.name = name;
}

public void setNum(int num) {
	this.num = num;
}

public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return "StudentName [name=" + name + ", num=" + num + ", address=" + address + "]";
}
}
