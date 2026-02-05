package EceptionHandling;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class ErrorResponse {

	LocalDateTime timestamp;
	String errorMsg;
	String errorDetails;
	String errorCode;
	
	
	
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorDetails() {
		return errorDetails;
	}
	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public ErrorResponse(String errorMsg, String errorDetails, String errorCode) {
		super();
		this.timestamp = LocalDateTime.now();
		this.errorMsg = errorMsg;
		this.errorDetails = errorDetails;
		this.errorCode = errorCode;
	}
	
}
