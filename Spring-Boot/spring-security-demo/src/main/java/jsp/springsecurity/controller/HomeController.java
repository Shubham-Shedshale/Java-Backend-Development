package jsp.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jsp.springsecurity.dto.ResponseStructure;
import jsp.springsecurity.entity.Users;
import jsp.springsecurity.service.UserService;

@RestController
public class HomeController {
	@Autowired
	UserService userService;

	
	@GetMapping("/home")
	public String homePage()
	{
		return "Welcome to home page...";
	}
	
	@GetMapping("/search")
	public String browser()
	{
		return "Browser available....search for anything";	
	}
	
	@PostMapping("/user")
	public ResponseEntity<ResponseStructure<Users>> saveUser(@RequestBody Users user)
	{
		return new ResponseEntity<>(userService.saveUser(user),HttpStatus.OK);
	}
	
	@GetMapping("/user/all")
	public ResponseEntity<ResponseStructure<List<Users>>> getAllUsers()
	{
		return new ResponseEntity(userService.getAllUsers(),HttpStatus.OK);
		
	}
	
	
	@GetMapping("/user/{id}")
	public ResponseEntity<ResponseStructure<Users>> getUserById(@PathVariable Integer id)
	{
		
        return new ResponseEntity<>(userService.getUserById(id),HttpStatus.OK);
         
	}
	

}
