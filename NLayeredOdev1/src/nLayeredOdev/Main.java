package nLayeredOdev;

import nLayeredOdev.business.abstracts.UserRegisterService;
import nLayeredOdev.business.adapters.GoogleRegisterAdapter;
import nLayeredOdev.business.concretes.UserCheckManager;
import nLayeredOdev.business.concretes.UserRegisterManager;
import nLayeredOdev.business.concretes.VerificationManager;
import nLayeredOdev.dataAccess.concretes.HibernateUserDao;
import nLayeredOdev.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		user1.seteMail("example@hotmail.com");
		user1.setPassword("123456");
		user1.setFirstName("mert");
		user1.setLastName("yilmaz");

		UserRegisterService userRegisterManager = new UserRegisterManager(
				new VerificationManager(new UserCheckManager(), new HibernateUserDao()));
		userRegisterManager.register(user1);

	}

}
