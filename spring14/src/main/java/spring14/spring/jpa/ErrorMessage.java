package spring14.spring.jpa;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessage {
	private int StatusCode;
	private String message;
	
}
