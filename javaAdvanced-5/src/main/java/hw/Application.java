package hw;

import java.sql.SQLException;

import hw.service.impl.ProductServiceImpl;
import hw.service.impl.UserAccountServiceImpl;

public class Application {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		
		UserAccount user = new UserAccount("Max", "Leskiv", "max@gmail.com", "password", "role");
		Product product = new Product("name", "description", 10.0);
		
		UserAccountServiceImpl uasi = new UserAccountServiceImpl();
		
		ProductServiceImpl psi = new ProductServiceImpl();
		
//		uasi.creat(new UserAccount("firstName", "lastName", "email", "password", "role"));
		
		psi.creat(product);
		
		System.out.println(psi.read(1));
		
		uasi.creat(user);
	}

}
