package hw.service.impl;

import java.util.List;

import hw.Product;
import hw.dao.ProductDao;
import hw.dao.impl.ProductDaoImpl;
import hw.service.ProductService;

public class ProductServiceImpl implements ProductService{

	private ProductDao productDao;
	
	public ProductServiceImpl() {
		try {
			productDao = new ProductDaoImpl();
		} catch (Exception e) {
		}
	}
	
	@Override
	public Product creat(Product product) {
		
		return productDao.creat(product);
	}

	@Override
	public Product read(Integer id) {
		return productDao.read(id);
	}

	@Override
	public Product update(Product product) {
		return productDao.update(product);
	}

	@Override
	public void delete(Integer id) {
		productDao.delete(id);
	}

	@Override
	public List<Product> readAll() {
		return productDao.readAll();
	}

}
