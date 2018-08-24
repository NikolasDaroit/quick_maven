package br.edu.ifrs.canoas.quick_maven.dao;


import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.ifrs.canoas.quick_maven.dto.Product;



public class ProductDAOImplTest {

	private ProductDAO dao;

	@BeforeEach
	public void setup(){
		dao = new ProductDAOImpl();
	}

	@Test
	public void testCreateShouldCreateAProduct() {
		Product product = this.getProduct();

		//Busca o produto pelo Id
		//Product retrievedProduct = dao.retrieve(product.getId());
		Product retrievedProduct;
		//Verifica que não existe o produto na camada de persistência
		//assertNull(retrievedProduct);
		
		//Cria um novo produto
		dao.create(getProduct());

		//Busca o produto pelo Id novamente
		retrievedProduct = dao.retrieve(product.getId());
		//System.out.println(retrievedProduct.getName());
		//Verifica que o produto de nome Phone agora existe.
		assertThat(retrievedProduct.getName()).containsIgnoringCase("Phone");
	
	}
	
	@Test
	public void testUpdateShouldUpdateAProduct() {
		Product product = this.getProduct();
		Product updatedProduct = this.getUpdatedProduct();
		
		dao.create(product);
		Product retrievedProduct = dao.retrieve(product.getId());		
		assertThat(retrievedProduct.getName()).isEqualToIgnoringCase("phone");
		
		dao.update(updatedProduct);
		retrievedProduct = dao.retrieve(updatedProduct.getId());
		assertThat(retrievedProduct.getName()).isEqualToIgnoringCase("smartphone");


		
	}
	
	@Test
	public void testDeleteShouldDeleteAProduct() {
		Product product = this.getProduct();
		int id = product.getId();
		dao.delete(product.getId());
		product = dao.retrieve(id);
		assertThat(product).isNull();
		//Product retrievedProduct = dao.update(product);
		//assertThat(retrievedProduct.getName()).containsIgnoringCase("Phone");
		
	}
	private Product getProduct(){
		Product product = new Product();
		product.setId(1);
		product.setName("Phone");
		product.setDescription("Awesome product!");
		product.setPrice(100.2f);
		return product;
	}
	private Product getUpdatedProduct(){
		Product product = new Product();
		product.setId(1);
		product.setName("SmartPhone");
		product.setDescription("Awesome product!");
		product.setPrice(100.2f);
		return product;
	}

}