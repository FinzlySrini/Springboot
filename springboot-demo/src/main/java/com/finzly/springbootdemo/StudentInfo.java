package com.finzly.springbootdemo;

public class StudentInfo {
public int id;
public String name;
public String dept;
public int regNo;
public int getId() {
	return id;
}
public StudentInfo(int id, String name, String dept, int regNo) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.regNo = regNo;
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
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public int getRegNo() {
	return regNo;
}
public void setRegNo(int regNo) {
	this.regNo = regNo;
}
@Override
public String toString() {
	return "StudentInfo [id=" + id + ", name=" + name + ", dept=" + dept + ", regNo=" + regNo + "]";
}

}
