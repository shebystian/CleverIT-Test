package cl.cleverit.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceException extends Exception {
	    private Integer httpStatusCode;
	 
	    private static final long serialVersionUID = -1873750263916403862L;
	 
	    public ServiceException() {
	        super();
	    }
	    
	    public ServiceException(String message, Integer httpStatusCode) {
	        super(message);
	        this.httpStatusCode = httpStatusCode;
	    }
	 
	    public Integer getHttpStatusCode() {
	        return httpStatusCode;
	    }
	 
	    public void setHttpStatusCode(Integer httpStatusCode) {
	        this.httpStatusCode = httpStatusCode;
	    }
	

}