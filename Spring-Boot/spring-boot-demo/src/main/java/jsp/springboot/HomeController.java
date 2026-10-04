package jsp.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String homePage()
	{
		return "Welcome to home page....";
	}
	
	@GetMapping("/student")
	public String studentDetails(@RequestParam int id, @RequestParam String name)
	{
		return "ID :"+id+"NAME :"+name;
	}

	@GetMapping("/employee/{role}/{salary}")
	public String studentDetails(@PathVariable String role, @PathVariable double salary)
	{
		return "ROLE :"+role+" SALARY :"+salary;
	}
	
	@GetMapping("/product")
	public String productDetails(@RequestHeader String pname, @RequestHeader double price)
	{
		return "PNAME : "+pname+" PRICE : "+price;
	}

	@PostMapping("/student")
	public String saveStudent(@RequestBody Student s)
	{
		return s.toString();   //if return s then { json } coz java -->json (@Responsebody)
		                       // json --> java (@RequestBody)
	}
}
