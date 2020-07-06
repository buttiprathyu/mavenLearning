package com.mavenproj.product.bo;

import com.mavenproj.product.dto.Product;

public interface ProductBO {

	public void create(Product product);

	public Product findProduct(int id);

}
