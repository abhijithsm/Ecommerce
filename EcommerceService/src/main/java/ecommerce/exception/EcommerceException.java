package ecommerce.exception;

public class EcommerceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6876616222878734L;
	public EcommerceException(String message){ 
        	super(message); 
    	} 
	public EcommerceException(String message, Throwable cause){ 
    	super(message, cause); 
	}
}
