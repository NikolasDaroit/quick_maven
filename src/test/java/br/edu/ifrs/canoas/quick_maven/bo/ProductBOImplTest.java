package br.edu.ifrs.canoas.quick_maven.bo;

import static org.junit.jupiter.api.Assertions.fail;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import br.edu.ifrs.canoas.quick_maven.dao.ProductDAO;
import br.edu.ifrs.canoas.quick_maven.dto.Product;

class ProductBOImplTest {
	private ProductDAO dao;
	ProductBOImpl  prodBO;
	
	@BeforeEach
	void setup() {
		prodBO = new ProductBOImpl(dao);
	}
	@Test
	void testCreateWithZeroPrice() {
		Product retProd, prod = this.getCustomProduct("zero", 0);
		
		
		
		assertThatThrownBy(() -> { prodBO.create(prod); })
		.isInstanceOf(IllegalArgumentException.class)
		.hasMessageContaining("You should set a price");
		
		//System.out.println(prod.getId());
		//retProd = prodBO.find(prod.getId());
//		assertThat(prod).isEqualTo(retProd);
		//System.out.println("aqui");
		
		
		
		// when
	  // Throwable thrown = catchThrowable(() -> { prod.equals(retProd); });

	   // then
	   //assertThat(thrown).isInstanceOf(Exception.class);
//	                     .hasMessageContaining("boom");
//		Throwable thrown = catchThrowable( -> ());
//		assertThat(thrown).isInstanceOf(Exception.class);
	}
	@Disabled
	@Test
	void testCreateWithLowPrice() {
		fail("Not yet implemented");
	}
	@Disabled
	@Test
	void testCreateWithHighPrice() {
		fail("Not yet implemented");
	}
	@Disabled
	@Test
	void testCreateWithNegativePrice() {
		fail("Not yet implemented");
	}
	@Disabled
	@Test
	void testFindNoText() {
		fail("Not yet implemented");
	}
	@Disabled
	@Test
	void testFindNoProduct() {
		fail("Not yet implemented");
	}
	
	@Disabled
	@Test
	void testFindWithProduct() {
		fail("Not yet implemented");
	}
	private Product getProduct(){
		Product product = new Product();
		product.setId(1);
		product.setName("Phone");
		product.setDescription("Awesome product!");
		product.setPrice(100.2f);
		return product;
	}
	private Product getCustomProduct(String name, float price){
		Product product = new Product();
		product.setId(1);
		product.setName(name);
		product.setDescription("Awesome product!");
		product.setPrice(price);
		return product;
	}
}
