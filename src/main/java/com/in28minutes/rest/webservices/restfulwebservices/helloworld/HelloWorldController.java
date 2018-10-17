package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
// two things need to be done : @RestController & mapping the controller to the URI. 

//1 Controller
       // you tell with this annotation to Spring MVC that this is going to handle REST
@RestController               // Request (URI - / hello-world) , the HelloWorldController now becomes a controller.
public class HelloWorldController {
	
	
	// GET
	// URI - /hello-world
	//method - "hello World"
	
	
	// mapping to  the URI
	//@RequestMapping(method=RequestMethod.GET, path = "/hello-world")
	//shorter form
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		
		return "Hello Khalid" ; 
		
	}
	
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		
		return new HelloWorldBean(" Hello World"); 
		
	}
	
	
	
	@GetMapping(path = "/hello-world/path/{param}")
	public HelloWorldBean helloWorldPath(@PathVariable String param) {
		
		return new HelloWorldBean(String.format(" Hello World, %s" , param)); 
		
	}
	
	
	

}
