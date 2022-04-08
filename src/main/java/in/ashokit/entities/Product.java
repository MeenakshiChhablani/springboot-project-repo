package in.ashokit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//@Data
@Entity
@Table(name="product_tbl")
public class Product {
	
@Id
@Column(name="product_id")
private Integer productId;


@Column(name="product_name")
private String productName;

@Column(name="product_price")
private Integer productPrice;

@Override
public String toString() {
	return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice + "]";
}




public void setProductId(Integer productId) {
	this.productId = productId;
}

public void setProductName(String productName) {
	this.productName = productName;
}

public void setProductPrice(Integer productPrice) {
	this.productPrice = productPrice;
}

}
