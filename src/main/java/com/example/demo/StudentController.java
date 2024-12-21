package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
@GetMapping("/getData")
//http://localhost:8080/student/getData

public String getUser() {
 return"student details";
}

@GetMapping("/getById/{id}")
//http://localhost:8080/student/getById?id=101
public String getUserById(@RequestParam int id ) {
 return "int id";
}
@GetMapping("/getByName/{name}")
//http://localhost:8080/student/getByName/raj
public String getUserById(@PathVariable String  name ) {
return "MyName is"+name;
}
@GetMapping("/getDataByHeader")
//http://localhost:8080/student/getDataByHeader
//send value auther from key value from header
public String getData(@RequestHeader String auther) {
System.out.println("hello request header");	
	return auther;
	
}
@PostMapping("/getByName")
//http://localhost:8080/student/getByName

/*
 * send this from bady { "name":"raj", "num":121, "address":"sonepur" }
 */
public String sendObject(@RequestBody Student e ) {
return e.getName();
}
}
