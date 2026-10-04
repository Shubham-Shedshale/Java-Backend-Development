package jsp.springsecurity.security;

import java.net.UnixDomainSocketAddress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http)
	{
		http
		   .csrf(csrf -> csrf.disable()) //Protects browser based apps
		   //from malicious put/post/delete requests.
		   //CSRF-Cross Site Request Forgery (REST APIs are stateless in nature
		   //and secure hence we disable CSRF
		   .authorizeHttpRequests(auth -> auth.requestMatchers("/user").permitAll() //defines permission regarding who can access the endpoint
				   .anyRequest()//any req. which comes should be verified
				   .authenticated())//user credential is verified
		   .httpBasic(Customizer.withDefaults());//removes form login and enables http basic pop-up
		return http.build();
	}
	
		@Autowired
		private UserDetailsService userDetailService;
		
		@Bean
		//Configure DaoAuthenticationProvider as the AP to authenticate user by validating with DB
		public DaoAuthenticationProvider daoAuthenticationProvider()
		{
			DaoAuthenticationProvider dao=new DaoAuthenticationProvider(userDetailService);
			//obj of UserDetailsService to fetch user info from DB
			dao.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
			//password encoder for comparing and validating server
			return dao;
		}
		   
	}


