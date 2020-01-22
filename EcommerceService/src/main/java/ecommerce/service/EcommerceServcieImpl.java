package ecommerce.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import ecommerce.exception.EcommerceException;
import ecommerce.repository.EcommerceRepository;
import ecommerce.vo.GetProductRequest;
import ecommerce.vo.Product;

@Service
public class EcommerceServcieImpl implements  EcommerceService{
	
	@Autowired
	private EcommerceRepository ecommerceRepository;
	
	public List<Product> getProductsByType(GetProductRequest getProductRequest) throws EcommerceException{
		List<Product> products = ecommerceRepository.getProducByType(getProductRequest.getProduct_type());
		if(!StringUtils.isEmpty(getProductRequest.getProduct_size())) {
			products = products.stream().filter(p-> getProductRequest.getProduct_size().equals(p.getProduct_size())).collect(Collectors.toList());
		}
		if(!StringUtils.isEmpty(getProductRequest.getProduct_color())) {
			products = products.stream().filter(p-> getProductRequest.getProduct_color().equals(p.getProduct_color())).collect(Collectors.toList());
		}
		if(!StringUtils.isEmpty(getProductRequest.getProduct_brand())) {
			products = products.stream().filter(p-> getProductRequest.getProduct_brand().equals(p.getProduct_brand())).collect(Collectors.toList());
		}
		return products;
		
	}
}
