package br.edu.ifrs.canoas.quick_maven.bo;

import org.junit.jupiter.api.BeforeEach;

import br.edu.ifrs.canoas.quick_maven.dao.ProductDAO;
import br.edu.ifrs.canoas.quick_maven.dao.ProductDAOImpl;
import br.edu.ifrs.canoas.quick_maven.dto.Product;

public class ProductBOImpl implements ProductBO{
	private ProductDAO dao;
	
	public ProductBOImpl(ProductDAO dao) {
		super();
		this.dao = new ProductDAOImpl();
	}
	@Override
	public void create(Product product) {
		if (product.getPrice() > 100) {
			product.setDescription(product.getDescription()+" limited sale");
		}else if (product.getPrice() <= 0) {
			throw new IllegalArgumentException("You should set a price");
		}
		
		 
		dao.create(product);
		
		// TODO Auto-generated method stub
		
	}
	@Override
	public Product find(int id) {
		if (id < 0) {
			throw new IllegalArgumentException("You should inform a valid product id");
		}
		Product product;
		try {
			product = dao.retrieve(id);			
		}catch (Exception e) {
			throw new IllegalArgumentException("This product was not found");
		}
		return product;
	}
}