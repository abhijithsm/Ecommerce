package ecommerce.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ecommerce.exception.EcommerceException;
import ecommerce.service.EcommerceService;
import ecommerce.vo.GetProductRequest;
import ecommerce.vo.GetProductResponse;
import ecommerce.vo.Product;



@RestController
public class EcommerceController {
    @Autowired
    EcommerceService ecommerceService;

    @RequestMapping(value = "/getAllItems", method = RequestMethod.POST, produces="application/json")
    @ResponseBody
    public ResponseEntity<GetProductResponse> getAllItems(@RequestBody GetProductRequest getProductRequest){
    	ResponseEntity<GetProductResponse> response = null;
    	GetProductResponse getProductResponse = new GetProductResponse();;
    	if(StringUtils.isEmpty(getProductRequest.getProduct_type())) {
    		getProductResponse = new GetProductResponse();
    		getProductResponse.setResponseCode("400");
    		getProductResponse.setResponseDesc("product type is required");
            response = new ResponseEntity<GetProductResponse>(getProductResponse, HttpStatus.BAD_REQUEST);
            return response;

    	}
         List<Product> productList = null;
		try {
			productList = ecommerceService.getProductsByType(getProductRequest);
		} catch (EcommerceException e) {
			 getProductResponse.setResponseCode("500");
	         getProductResponse.setResponseDesc(e.getMessage());
	         response = new ResponseEntity<GetProductResponse>(getProductResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	         return response;
		}
         getProductResponse.setProduct(productList);
         getProductResponse.setResponseCode("200");
         getProductResponse.setResponseDesc("SUCCESS");
         response = new ResponseEntity<GetProductResponse>(getProductResponse, HttpStatus.OK);
         return response;
    }

   
}