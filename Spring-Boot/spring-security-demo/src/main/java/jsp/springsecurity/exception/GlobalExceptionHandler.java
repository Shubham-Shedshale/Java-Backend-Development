package jsp.springsecurity.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jsp.springsecurity.dto.ResponseStructure;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(IdNotFoundException.class)  
	public ResponseEntity<ResponseStructure<String>> handleINFE(IdNotFoundException e)
	{
		ResponseStructure<String> res =new ResponseStructure<String>();
		res.setStatusCode(HttpStatus.NOT_FOUND.value());
		res.setMessage(e.getMessage());
		res.setData("Failure");
		  
		return new ResponseEntity<>(res,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NoRecordFoundException.class)
	public ResponseEntity<ResponseStructure<String>> handleNRFE(NoRecordFoundException e)
	{
		ResponseStructure<String> res=new ResponseStructure<String>();
		res.setStatusCode(HttpStatus.NOT_FOUND.value());
		res.setMessage(e.getMessage());
		res.setData("Failure");
		
		return new ResponseEntity<>(res,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(InvalidRequestException.class)
	public ResponseEntity<ResponseStructure<String>> handleIRE(InvalidRequestException e) {
	    ResponseStructure<String> res = new ResponseStructure<>();
	    res.setStatusCode(HttpStatus.BAD_REQUEST.value());
	    res.setMessage(e.getMessage());
	    res.setData("Failure");
	    return new ResponseEntity<>(res, HttpStatus.BAD_REQUEST);
	}

}
