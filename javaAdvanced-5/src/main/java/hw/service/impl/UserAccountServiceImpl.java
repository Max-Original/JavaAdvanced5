package hw.service.impl;

import java.sql.SQLException;
import java.util.List;

import hw.UserAccount;
import hw.dao.UserAccountDao;
import hw.dao.impl.UserAccountDaoImpl;
import hw.service.UserAccountService;

public class UserAccountServiceImpl implements UserAccountService {

	private UserAccountDao userAccountDao;
	
	public UserAccountServiceImpl() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		userAccountDao = new UserAccountDaoImpl();
	}
	
	@Override
	public UserAccount creat(UserAccount userAccount) {
		return userAccountDao.creat(userAccount);
	}

	@Override
	public UserAccount read(Integer id) {
		return userAccountDao.read(id);
	}

	@Override
	public UserAccount update(UserAccount userAccount) {
		return userAccountDao.update(userAccount);
	}

	@Override
	public void delete(Integer id) {
		userAccountDao.delete(id);
	}

	@Override
	public List<UserAccount> readAll() {
		return userAccountDao.readAll();
	}

}
