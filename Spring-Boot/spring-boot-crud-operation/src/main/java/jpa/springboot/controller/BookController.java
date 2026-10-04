package jpa.springboot.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.swing.text.html.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import jpa.springboot.dto.ResponseStructure;
import jpa.springboot.entity.Book;
import jpa.springboot.exception.IdNotFoundException;
import jpa.springboot.exception.InvalidRequestException;
import jpa.springboot.exception.NoRecordFoundException;
import jpa.springboot.repository.BookRepository;
import jpa.springboot.service.BookService;

@RequestMapping("/book")
@RestController
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private BookService bookService;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<Book>> saveBook(@RequestBody Book book)
	{
		
//		bookRepository.save(book);
		return new ResponseEntity<>(bookService.saveBook(book),HttpStatus.OK);
	}

//	@PostMapping
//	public ResponseEntity<ResponseStructure<Book>> saveBook(@RequestBody Book book)
//	{
//		Book b= bookRepository.save(book);
//		ResponseStructure<Book> res=new ResponseStructure();
//		res.setStatusCode(201);
//		res.setMessage("Book saved Succesfully");
//		res.setData(b);
//		                                      
//		return new ResponseEntity(res, HttpStatus.CREATED);
//		
//	}

//	@PostMapping
//	public ResponseEntity<Book> saveBook(@RequestBody Book book)
//	{
//		return new ResponseEntity(bookRepository.save(book),HttpStatus.CREATED);
//	
//	}
//	
//	@PostMapping("/book/all")
//	public String saveAllBook(@RequestBody List<Book> books)
//	{
//		bookRepository.saveAll(books);
//		return "Books saved Successfully";
//		
//	}
	
	@PostMapping("/all")
	public ResponseEntity<ResponseStructure<List<Book>>> saveAllBooks(@RequestBody List<Book> books)
	{
		
		return new ResponseEntity<>(bookService.saveAllBooks(books),HttpStatus.CREATED);
	}
	
//	@PostMapping("/all")
//	public ResponseEntity<Book> saveBook(@RequestBody List<Book> book)
//	{
//		return new ResponseEntity(bookRepository.saveAll(book),HttpStatus.CREATED);
//	
//	}
	
//	@GetMapping("/book")
//	public List<Book> fetchRecord()
//	{
//		return bookRepository.findAll();
//	}
	
	//using ResponseEntity
	
	@GetMapping
	public ResponseEntity<ResponseStructure<List<Book>>> fetchRecord()
	{
		return new ResponseEntity(bookService.getAllBooks(),HttpStatus.OK);
		
	}
	
	
	@GetMapping("{id}")
	public ResponseEntity<ResponseStructure<Book>> fetchById(@PathVariable Integer id)
	{
		
        return new ResponseEntity<>(bookService.getById(id),HttpStatus.OK);
         
	}
	
//	@PutMapping("/book")
//	public String updateBook(@RequestBody Book book)
//	{
//		//case 1
//		if(book.getId()==null)
//			return "Id must be passed to update a record";
//		
//		
//		Optional<Book> opt = bookRepository.findById(book.getId());
//		//case 2
//		if(opt.isPresent())
//		{
//			bookRepository.save(book);
//		    return "Book record Updated";
//		}
//		
//		else
//		{
//			return "Id does not exist in the db";
//		}
//	}
	
	@PutMapping()
	public ResponseEntity<ResponseStructure<Book>> updateBook(@RequestBody Book book)
	{
		return new ResponseEntity<>(bookService.updateBook(book),HttpStatus.OK);
	}
	
//	@PatchMapping("/book/{id}")
//	public String updateBook(@PathVariable Integer id, @RequestBody Map<String, Object> map)
//	{
//		Optional<Book> opt = bookRepository.findById(id);
//		
//		if(opt.isPresent())
//		{
//			Book book=opt.get();
//			for(Map.Entry<String,Object> entry: map.entrySet())
//			{
//				String key=entry.getKey();
//			    Object value=entry.getValue();
//			    
//			    switch(key) {
//			    case "title":
//			    	book.setTitle((String)value);
//			    	break;
//			    case "author":
//			    	book.setAuthor((String)value);
//			    	break;
//			    case "availability":
//			    	book.setAvailability((Boolean)value);
//			    	break;
//			    case "genre":
//			    	book.setGenre((String)value);
//			    	break;
//			    case "price":
//			    	book.setPrice((Double)value);
//			    	break;
//			    case "published_year":
//			    	book.setPublishedYear((Integer)value);
//			    	break;
//			    
//		           }
//	         }
//			bookRepository.save(book);
//			return "record updated";
//         }
//		else
//			return "No record Found";
//	}
	
	@PatchMapping("/{id}")
	public ResponseEntity<ResponseStructure<Book>> updateBook(@PathVariable Integer id, @RequestBody Map<String, Object> map) {
	    return new ResponseEntity<>(bookService.updateBook(id, map),HttpStatus.OK);
	}
	
//	@DeleteMapping("/bulk")
//	public String delteBulk(@RequestBody List<Integer> ids)
//	{
//		if(ids.isEmpty())
//		{
//			throw new InvalidRequestException("No ids found to delete");
//		}
//		bookRepository.deleteAllById(ids);
//		return "Book with"+ids+" deleted";
//	}
	
	@DeleteMapping("/bulk")
	public ResponseEntity<ResponseStructure<String>> deleteBulk(@RequestBody List<Integer> ids)
	{
		return new ResponseEntity<>(bookService.deleteBulk(ids),HttpStatus.OK);
	}
	
	
	
	//return type "String"
//	@DeleteMapping("/book/{id}")
//	public String deleteById(@PathVariable Integer id)
//	{
//		Optional<Book> opt=bookRepository.findById(id);
//		if(opt.isPresent())
//		{
//			bookRepository.deleteById(id);
//			return "Book with id="+id+" is deleted";
//		}
//		else
//		{
//			return "record not found";
//		}
//	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<ResponseStructure<String>> deleteById(@PathVariable Integer id)
	{
		return new ResponseEntity<>(bookService.deleteById(id),HttpStatus.OK);
			
	}
	
	@GetMapping("/author/{author}")
	public ResponseEntity<ResponseStructure<List<Book>>> getByAuthor(@PathVariable String author)
	{
		return new ResponseEntity<>(bookService.getByAuthor(author),HttpStatus.OK);
	}
	
	@GetMapping("/{author}/{title}")
	public ResponseEntity<ResponseStructure<Book>> getByAuthorAndTitle(@PathVariable String author,@PathVariable String title)
	{
		return new ResponseEntity<>(bookService.getByAuthorAndTitle(author, title),HttpStatus.OK);
	}
	
	@GetMapping("/price/{price}")
	public ResponseEntity<ResponseStructure<List<Book>>> getByPriceGreaterThan(@PathVariable Double price)
	{
		return new ResponseEntity<>(bookService.getByPriceGreaterThan(price),HttpStatus.OK);
	}
	
	@GetMapping("/price/{start}/{end}")
	public ResponseEntity<ResponseStructure<List<Book>>> getByPriceBetween(@PathVariable Double start, @PathVariable Double end)
	{
		return new ResponseEntity<>(bookService.getByPriceBetween(start, end),HttpStatus.OK);
	}
	
	@GetMapping("/availability")
	public ResponseEntity<ResponseStructure<List<Book>>> getByAvailability()
	{
		return new ResponseEntity<>(bookService.getByAvailability(),HttpStatus.OK);
	}
	
	@GetMapping("/publishedYear/{publishedYear}")
	public ResponseEntity<ResponseStructure<List<Book>>> getByPublishedYear(@PathVariable Integer publishedYear)
	{
		return new ResponseEntity<>(bookService.getByPublishedYear(publishedYear),HttpStatus.OK);
	}
	
	@GetMapping("/genre/{genre}")
	public ResponseEntity<ResponseStructure<List<Book>>> getByGenre(@PathVariable String genre)
	{
		return new ResponseEntity<>(bookService.getByGenre(genre),HttpStatus.OK);
	}
	
	//Pagination
	@GetMapping("/page/{pageNumber}/{pageSize}")
	public ResponseEntity<ResponseStructure<Page<Book>>> getByPagination(@PathVariable int pageNumber,@PathVariable int pageSize)
	{
		return new ResponseEntity<>(bookService.getByPagination(pageNumber, pageSize),HttpStatus.OK);
	}

	
	//Sorting
	@GetMapping("/page/{fieldName}")
	public ResponseEntity<ResponseStructure<List<Book>>> getBySorting(@PathVariable String fieldName)
	{
		return new ResponseEntity<>(bookService.getBySorting(fieldName),HttpStatus.OK);
	}
	
	//BothPaginationAndSorting
	@GetMapping("/page/{pageNumber}/{pageSize}/{field}")
	public ResponseEntity<ResponseStructure<Page<Book>>> getByPaginationAndSorting(@PathVariable int pageNumber,@PathVariable int pageSize,@PathVariable String field)
	{
		return new ResponseEntity<>(bookService.getByPaginationAndSorting(pageNumber, pageSize, field),HttpStatus.OK);
	}

	
}
