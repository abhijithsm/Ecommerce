package ecommerce.vo;

import java.util.List;

public class GetProductResponse{

	private String responseCode;
	private String responseDesc;
	private List<Product> items;
	public List<Product> getProduct() {
		return items;
	}
	public void setProduct(List<Product> items) {
		this.items = items;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseDesc() {
		return responseDesc;
	}
	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}
	
}
