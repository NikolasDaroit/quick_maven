package br.edu.ifrs.canoas.quick_maven.bo;

import br.edu.ifrs.canoas.quick_maven.dto.Product;

public interface ProductBO {
	void create(Product product);
	Product find (int id);
}
	