package ecommerce.vo;

public class Product {

    private int product_id;
    private String product_name;
    private String product_type;
    private String product_brand;
    private String product_color;
    private String product_price;
    private String product_size;

    public Product() {
    }

    public Product(int product_id, String product_name, String product_type, String product_brand, String product_color, String product_price, String product_size) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_type = product_type;
        this.product_brand = product_brand;
        this.product_color = product_color;
        this.product_price = product_price;
        this.product_size = product_size;
    }

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	public String getProduct_brand() {
		return product_brand;
	}

	public void setProduct_brand(String product_brand) {
		this.product_brand = product_brand;
	}

	public String getProduct_color() {
		return product_color;
	}

	public void setProduct_color(String product_color) {
		this.product_color = product_color;
	}

	public String getProduct_price() {
		return product_price;
	}

	public void setProduct_price(String product_price) {
		this.product_price = product_price;
	}

	public String getProduct_size() {
		return product_size;
	}

	public void setProduct_size(String product_size) {
		this.product_size = product_size;
	}

    
}
