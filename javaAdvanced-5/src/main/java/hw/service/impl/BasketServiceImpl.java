package hw.service.impl;

import java.util.List;

import hw.Basket;
import hw.dao.BasketDao;
import hw.dao.impl.BasketDaoImpl;

public class BasketServiceImpl implements BasketDao {

	private BasketDao basketDao;

	public BasketServiceImpl() {
		try {
			basketDao = new BasketDaoImpl();
		} catch (Exception e) {
		}
	}

	@Override
	public Basket creat(Basket basket) {
		return basketDao.creat(basket);
	}

	@Override
	public Basket read(Integer id) {

		return basketDao.read(id);
	}

	@Override
	public Basket update(Basket basket) {

		return basketDao.update(basket);
	}

	@Override
	public void delete(Integer id) {
		basketDao.delete(id);
	}

	@Override
	public List<Basket> readAll() {

		return basketDao.readAll();
	}

}
