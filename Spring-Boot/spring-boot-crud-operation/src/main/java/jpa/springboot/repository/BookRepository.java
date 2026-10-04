package jpa.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import jpa.springboot.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
	
	List<Book> findByAuthor(String author);
	
	Optional<Book> findByAuthorAndTitle(String author,String title);
	
	List<Book> findByPriceGreaterThan(double price);
	
	List<Book> findByPriceBetween(double start, double end);
	
	@Query("select b from Book b where b.availability=false")
	List<Book> getByAvailability();
	
	@Query("select b from Book b where b.publishedYear=?1")
	List<Book> getByYear(Integer publishedYear);
	
	@Query("select b from Book b where b.genre=:genre")
	List<Book> getByGenre(String genre);

}
