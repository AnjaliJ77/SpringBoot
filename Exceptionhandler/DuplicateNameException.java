package EceptionHandling;

public class DuplicateNameException extends RuntimeException{
	
	DuplicateNameException(String msg){
		super(msg);
	}

}
