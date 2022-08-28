package com.finzly.springbootdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SprigBootDemo {

@RequestMapping("checkk")
	public String Checkdemo() {
	System.out.println("string");
		return "Hello";
	}


@RequestMapping("int")
public int num() {
	System.out.println("int");
	return 21;
}
@RequestMapping("array")
public String[] name() {
	String[]a = new String[6];
	a[0]="Srini";
	a[1]="thavukkala";
	a[2]="boolappa";
	a[4]="nandu";
	a[3]="naakuppochi";
	return a;
	
}

@RequestMapping("ArrayList")
public ArrayList name1() {
	ArrayList b = new ArrayList();
	b.add("gslv");
	b.add(2);
	return b;
}
@RequestMapping("getdata")
public HashMap<String, ArrayList> al(){
	ArrayList<StudentInfo> as = new ArrayList<>();
	as.add(new StudentInfo(1,"srini","ece",13));
	as.add(new StudentInfo(2,"loke","eee",21));
	as.add(new StudentInfo(3,"bala","ece",33));
	System.out.println(as);
	
	ArrayList<StudentInfo> as1 = new ArrayList<>();
	as1.add(new StudentInfo(4,"sk","mech",23));
	as1.add(new StudentInfo(5,"guru","mechonotrics",13));
	System.out.println(as1);
	
	ArrayList finall = new ArrayList();
	finall.add(as);
	finall.add(as1);
	
	HashMap<String,ArrayList> hm = new HashMap<>();
    hm.put("hsm", finall);
	return hm;	
}
@RequestMapping("PathVar/{name}")
public String method(@PathVariable String name) {
	if("Srini".equals(name)) {
		return "Hello Srini!";
	}
	return "0";
}
@RequestMapping("pathvar/{num}")
public int met(@PathVariable int num) {
	
	if(1 == num){
		return 1;
	}
	return 0;
}
@RequestMapping("ReqBod")
public String me(@RequestBody String name2) {
	if("GSLV".equalsIgnoreCase(name2)){
		return "done";
	}
	return "fail";	
}
@RequestMapping("sql")
public ArrayList m1() throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lokesh", "root", "1234");
	Statement stm = con.createStatement();
	String quary = "select * from employee";
	ResultSet rs = stm.executeQuery(quary);
	ArrayList as = new ArrayList<>();
	 while(rs.next()) {
		 as.add(rs.getString(1));
	 }

	return as;
	
}
}

	
	


