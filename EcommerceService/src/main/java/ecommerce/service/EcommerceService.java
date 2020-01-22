package ecommerce.service;

import java.util.List;

import ecommerce.exception.EcommerceException;
import ecommerce.vo.GetProductRequest;
import ecommerce.vo.Product;;

public interface EcommerceService {
	public List<Product> getProductsByType(GetProductRequest getProductRequest) throws EcommerceException;
}
