package ecommerce.repository;

import java.util.List;

import ecommerce.exception.EcommerceException;
import ecommerce.vo.Product;

public interface EcommerceRepository {
	public List<Product> getProducByType(String productType) throws EcommerceException;
}
