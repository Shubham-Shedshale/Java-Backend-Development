package jsp.springsecurity.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jsp.springsecurity.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{
	
//	@Query("select u from Users u where u.username=:username")
//	Optional<Users> findByUsername(String username);
	Optional<Users> findByUsername(String username);
}
