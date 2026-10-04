package jsp.springsecurity.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import jsp.springsecurity.dto.ResponseStructure;
import jsp.springsecurity.entity.Users;
import jsp.springsecurity.exception.IdNotFoundException;
import jsp.springsecurity.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public ResponseStructure<Users> saveUser(Users user)
	{
		Users savedUser = userRepository.save(user);
		ResponseStructure<Users> res=new ResponseStructure<Users>();
		res.setStatusCode(HttpStatus.OK.value());
		res.setMessage("User record saved");
		res.setData(savedUser);
		
		return res;
		
	}
	
	public ResponseStructure<List<Users>> getAllUsers()
	{
		ResponseStructure<List<Users>> res = new ResponseStructure<List<Users>>();
		List<Users> userList=userRepository.findAll();
		res.setStatusCode(HttpStatus.OK.value());
		res.setMessage("User records fetched");
		res.setData(userList);
		
		return res;
		
	}
	
	public ResponseStructure<Users> getUserById(Integer id)
	{
		ResponseStructure<Users> res = new ResponseStructure<>();
		Optional<Users> opt=userRepository.findById(id);
		
	     if(opt.isPresent())
	     {
	    	 res.setStatusCode(HttpStatus.OK.value());
             res.setMessage("Record fetched");
             res.setData(opt.get());
             return res;
	     }    
	    	 
	     else
	     {
	    	 throw new IdNotFoundException("Record with id:"+id+" not found");
	     }
		
	}
	
	
}
	