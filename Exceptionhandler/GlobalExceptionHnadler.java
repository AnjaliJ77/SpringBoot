package EceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHnadler {
	
	
	@ExceptionHandler(DuplicateNameException.class)
	public ResponseEntity<ErrorResponse> duplicateNameException(DuplicateNameException dnex, WebRequest webrequest){
		ErrorResponse errorresponse= new ErrorResponse
				(dnex.getMessage(),webrequest.getDescription(false)," Duplicate Name Found");
		return new ResponseEntity<>(errorresponse, HttpStatus.CONFLICT);
	}

	
	
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<ErrorResponse> idNotFoundException(IdNotFoundException dnex, WebRequest webrequest){
		ErrorResponse errorresponse1= new ErrorResponse
				(dnex.getMessage(),webrequest.getDescription(false),"Id not found exception");
		return new ResponseEntity<>(errorresponse1, HttpStatus.NOT_FOUND);
	}

	
}
