package jpa.springboot.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import jpa.springboot.dto.ResponseStructure;
import jpa.springboot.entity.Book;
import jpa.springboot.exception.IdNotFoundException;
import jpa.springboot.exception.InvalidRequestException;
import jpa.springboot.exception.NoRecordFoundException;
import jpa.springboot.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	
	public ResponseStructure<Book> saveBook(Book book)
	{
		ResponseStructure<Book> res=new ResponseStructure<Book>();
		res.setStatusCode(HttpStatus.OK.value());
		res.setMessage("Book record saved");
		res.setData(bookRepository.save(book));
		
		return res;
		
	}
	
	public ResponseStructure<List<Book>> saveAllBooks(List<Book> books)
	{
		if(books.isEmpty())
		{
			throw new InvalidRequestException("No records to insert");
		}
		bookRepository.saveAll(books);
		ResponseStructure<List<Book>> res = new ResponseStructure<List<Book>>();
		res.setStatusCode(HttpStatus.CREATED.value());
		res.setMessage("Books saved successfully");
		res.setData(books);
		
		return res;
	}
	
	public ResponseStructure<List<Book>> getAllBooks()
	{
		ResponseStructure<List<Book>> res=new ResponseStructure<List<Book>>();
		List<Book> blis=bookRepository.findAll();
		
		if(blis.isEmpty())
		{
			throw new NoRecordFoundException("No records to fetch");
		}
		res.setStatusCode(HttpStatus.OK.value());
		res.setMessage("Fetched all the records");
		res.setData(blis);
		
		return res;
	}
	
	public ResponseStructure<Book> getById(Integer id)
	{
		ResponseStructure<Book> res = new ResponseStructure<>();
		Optional<Book> opt=bookRepository.findById(id);
		
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
	
	
	//PutMapping
	public ResponseStructure<Book> updateBook(Book book)
	{
		ResponseStructure<Book> res = new ResponseStructure<Book>();
		//case 1
		if(book.getId()==null)
		{
			throw new IdNotFoundException("Id must be passed to update record");
		}
		
		Optional<Book> opt = bookRepository.findById(book.getId());
		//case 2
		if(opt.isPresent())
		{
			bookRepository.save(book);
			res.setStatusCode(HttpStatus.OK.value());
		    res.setMessage("Book record updated");
		    res.setData(book);
		    
		    return res;

		}
		
		else
		{
			throw new IdNotFoundException("Id with "+book.getId()+"does not exist");
		}
	}
	
	
	//PatchMapping
	public ResponseStructure<Book> updateBook(Integer id, Map<String, Object> map)
	{
		 ResponseStructure<Book> res = new ResponseStructure<>();
		    Optional<Book> opt = bookRepository.findById(id);
	    
		    if(opt.isPresent())
				{
					Book book=opt.get();
					for(Map.Entry<String,Object> entry: map.entrySet())
					{
						String key=entry.getKey();
					    Object value=entry.getValue();
					    
					    switch(key) {
					    case "title":
					    	book.setTitle((String)value);
					    	break;
					    case "author":
					    	book.setAuthor((String)value);
					    	break;
					    case "availability":
					    	book.setAvailability((Boolean)value);
					    	break;
					    case "genre":
					    	book.setGenre((String)value);
					    	break;
					    case "price":
					    	book.setPrice((Double)value);
					    	break;
					    case "publishedYear":
					    	book.setPublishedYear((Integer)value);
					    	break;
					    
				           }
			         }

		        Book updatedBook = bookRepository.save(book);
		        res.setStatusCode(HttpStatus.OK.value());
		        res.setMessage("Book record updated successfully (partial update)");
		        res.setData(updatedBook);
		        return res;

		    } else {
		        throw new IdNotFoundException("Book ID :"+id+" not found in database");
		    }
	}
	
	//DeleteBulk
	public ResponseStructure<String> deleteBulk(List<Integer> ids)
	{
		ResponseStructure<String> res=new ResponseStructure<String>();
		if(ids.isEmpty())
		{
			throw new InvalidRequestException("No ids found to delete");
		}
//		bookRepository.deleteAllById(ids);
//		return "Book with"+ids+" deleted";
		
		res.setStatusCode(HttpStatus.OK.value());
		res.setMessage("Records with "+ids+" got deleted");
		res.setData("Deleted");
		
		return res;
		
	}
	
	//DeleteById
	public ResponseStructure<String> deleteById(Integer id)
	{
		ResponseStructure<String> res=new ResponseStructure();
		Optional<Book> opt=bookRepository.findById(id);
		if(opt.isPresent())
		{
			bookRepository.delete(opt.get());
			res.setStatusCode(HttpStatus.OK.value());
			res.setMessage("Book record with id:"+id+"got deleted");
			res.setData("Success");
			
			return res;
		}
		else
		{
			throw new IdNotFoundException("Book record with id:"+id+" does not exist");
		}
	}
	
	//GetByAuthorName
	public ResponseStructure<List<Book>> getByAuthor(String author)
	{
		List<Book> books=bookRepository.findByAuthor(author);
		ResponseStructure<List<Book>> res=new ResponseStructure<List<Book>>();
		
		if(books.isEmpty())
		{
			throw new NoRecordFoundException("Books with Author:"+author+" does not exist");
		}
		
		res.setStatusCode(HttpStatus.OK.value());
		res.setMessage("Books with Author:"+author+" are fetched");
		res.setData(books);
		
		return res;
	}
	
	//getByAuthorAndTitle
	public ResponseStructure<Book> getByAuthorAndTitle(String author,String title)
	{
		Optional<Book> opt = bookRepository.findByAuthorAndTitle(author, title);
		ResponseStructure<Book> res=new ResponseStructure<Book>();
		if(opt.isEmpty())
		{
			throw new NoRecordFoundException("Id with Author:"+author+" and Title:"+title+" does not exist");
		}
		
		res.setStatusCode(HttpStatus.OK.value());
		res.setMessage("Books with Author:"+author+" and Title:"+title+" is fetched");
		res.setData(opt.get());
		
		return res; 
	}
	
	//GetByPriceGreaterThan
	public  ResponseStructure<List<Book>> getByPriceGreaterThan(Double price)
	{
		List<Book> books=bookRepository.findByPriceGreaterThan(price);
		ResponseStructure<List<Book>> res=new ResponseStructure<List<Book>>();
		
		if(books.isEmpty())
		{
			throw new NoRecordFoundException("Books with price greater than "+price+" does not exist");
		}
		
		res.setStatusCode(HttpStatus.OK.value());
		res.setMessage("Books greater than price:"+price+" are fetched");
		res.setData(books);
		
		return res;
	}
	
	//GetByPriceBetween
	public ResponseStructure<List<Book>> getByPriceBetween(Double start,Double end)
	{
		List<Book> books=bookRepository.findByPriceBetween(start, end);
		ResponseStructure<List<Book>> res=new ResponseStructure<List<Book>>();
		
		if(books.isEmpty())
		{
			throw new NoRecordFoundException("Books with price between "+start+" and "+end+" does not exist");
		}
		
		res.setStatusCode(HttpStatus.OK.value());
		res.setMessage("Books with price between:"+start+" and "+end+" are fetched");
		res.setData(books);
		
		return res;
	}
	
	//GetByAvailability
	public ResponseStructure<List<Book>> getByAvailability()
	{
		List<Book> books=bookRepository.getByAvailability();
		ResponseStructure<List<Book>> res=new ResponseStructure<List<Book>>();
		
		if(books.isEmpty())
		{
			throw new NoRecordFoundException("Books with availabity you are looking for are not present");
		}
		
		res.setStatusCode(HttpStatus.OK.value());
		res.setMessage("Books with particular avialability are fetched");
		res.setData(books);
		
		return res;
	}
	
	//GetByPublishedYear
	public ResponseStructure<List<Book>> getByPublishedYear(Integer publishedYear)
	{
		List<Book> books=bookRepository.getByYear(publishedYear);
		ResponseStructure<List<Book>> res=new ResponseStructure<List<Book>>();
		
		if(books.isEmpty())
		{
			throw new NoRecordFoundException("Books with published year:"+publishedYear+" does not exist");
		}
		
		res.setStatusCode(HttpStatus.OK.value());
		res.setMessage("Books with Published year:"+publishedYear+" are fetched");
		res.setData(books);
		
		return res;
	}
	
	//GetByGenre
	public ResponseStructure<List<Book>> getByGenre(String genre)
	{
		List<Book> books=bookRepository.getByGenre(genre);
		ResponseStructure<List<Book>> res=new ResponseStructure<List<Book>>();
		
		if(books.isEmpty())
		{
			throw new NoRecordFoundException("Books with genre:"+genre+" does not exist");
		}
		
		res.setStatusCode(HttpStatus.OK.value());
		res.setMessage("Books with genre:"+genre+" are fetched");
		res.setData(books);
		
		return res;
	}
	
	//GetByPagination
	public ResponseStructure<Page<Book>> getByPagination(int pageNumber,int pageSize)
	{
		Page<Book> page=bookRepository.findAll(PageRequest.of(pageNumber, pageSize));
		ResponseStructure<Page<Book>> res=new ResponseStructure<Page<Book>>();
		
		if(page.isEmpty())
		{
			throw new NoRecordFoundException("No records in page Number "+pageNumber);
		}
		else
		{
			res.setStatusCode(HttpStatus.OK.value());
			res.setMessage("Records in page "+pageNumber+" are displayed");
			res.setData(page);
			
			return res;
		}
	}
	
	//GetBySorting
	public ResponseStructure<List<Book>> getBySorting(String fieldName)
	{
		List<Book> books=bookRepository.findAll(Sort.by(fieldName).ascending());
		
		ResponseStructure<List<Book>> res=new ResponseStructure<List<Book>>();
		if(books.isEmpty())
		{
			throw new NoRecordFoundException("No records to diaplay");
		}
		else
		{
			res.setStatusCode(HttpStatus.OK.value());
			res.setMessage("Records displayed in sorted order with the field"+fieldName);
			res.setData(books);
			
			return res;
		}
	}
	
	//GetByBothPaginationAndSorting
	public ResponseStructure<Page<Book>> getByPaginationAndSorting(int pageNumber,int pageSize,String field)
	{
		Page<Book> page=bookRepository.findAll(PageRequest.of(pageNumber, pageSize,Sort.by(field).ascending()));
		ResponseStructure<Page<Book>> res =new ResponseStructure<Page<Book>>();
		if(page.isEmpty())
		{
			throw new NoRecordFoundException("No records in page Number "+pageNumber);
		}
		else
		{
			res.setStatusCode(HttpStatus.OK.value());
			res.setMessage("Records in page "+pageNumber+" are displayed in Descending order");
			res.setData(page);
			
			return res;
		}
	}
	
}
