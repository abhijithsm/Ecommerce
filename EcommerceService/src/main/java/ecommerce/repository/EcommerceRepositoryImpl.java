package ecommerce.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ecommerce.exception.EcommerceException;
import ecommerce.vo.Product;

@Repository
public class EcommerceRepositoryImpl implements  EcommerceRepository{

    @Autowired
    JdbcTemplate template;

    public List<Product> getProducByType(String productType) throws EcommerceException{
  
        try {
			return template.query("select * from products where product_type=?",new Object[]{productType}, (result,rowNum)->new Product(result.getInt("product_id"),
			        result.getString("product_name"),result.getString("product_type"), result.getString("product_brand"), result.getString("product_color"), result.getString("product_price"), result.getString("product_size")));
		} catch (Exception e) {
			throw new EcommerceException("Exception while fetching details from DB", e.getCause());
		}
    }
}