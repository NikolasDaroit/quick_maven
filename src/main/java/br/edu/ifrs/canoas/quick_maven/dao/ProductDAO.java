package br.edu.ifrs.canoas.quick_maven.dao;

import br.edu.ifrs.canoas.quick_maven.dto.Product;

public interface ProductDAO {

	void create(Product product);
	Product retrieve (int id);
	void update(Product product);
	void delete (int id);

} 