package SpringRESTFull.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@ControllerAdvice                       //gestore errori nelle risposte
public class MyExceptionHandler extends ResponseEntityExceptionHandler{
	
	//classe si attiva automaticamente ogni volta che si verifica un eccezione di questo tipo
	//per farla attivare metto annotation

	

	@ExceptionHandler(EntityExistsException.class)
	                              //nome                       //oggetto passato
	public ResponseEntity<String> manageEntityExistsException(EntityExistsException e) {
		return new ResponseEntity<String>(e.getMessage() + " MyExcpetionHandler!!!", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<String> manageEntityExistsException(EntityNotFoundException e) {
		return new ResponseEntity<String>(e.getMessage() + " MyExcpetionHandler!!!", HttpStatus.FOUND);
	}
}
