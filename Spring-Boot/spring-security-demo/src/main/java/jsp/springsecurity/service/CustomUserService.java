package jsp.springsecurity.service;

import java.lang.classfile.ClassFile.Option;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import jsp.springsecurity.entity.Users;
import jsp.springsecurity.repository.UserRepository;

@Service
public class CustomUserService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		Optional<Users> opt=userRepository.findByUsername(username);
		
		if (opt.isPresent()) {
		    return new CustomUserDetails(opt.get());
		} else {
		    throw new UsernameNotFoundException("User does not exist in db");
		}	
		
	}
}
