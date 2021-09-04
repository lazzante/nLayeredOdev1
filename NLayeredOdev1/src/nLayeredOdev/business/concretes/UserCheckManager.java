package nLayeredOdev.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nLayeredOdev.business.abstracts.userCheckService;
import nLayeredOdev.dataAccess.abstracts.UserDao;
import nLayeredOdev.entities.concretes.User;

public class UserCheckManager implements userCheckService {

	@Override
	public boolean check(User user) {
		if (user.getPassword().length() < 6) {
			System.out.println("Parola en az 6 karakterden olu�mal�d�r !");
			return false;
		}
		if (user.getPassword() == null) {
			System.out.println("Parola bo� b�rak�lamaz !");
			return false;
		}

		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.geteMail());
		boolean deger = matcher.matches();

		if (deger == false) {
			System.out.println("Bu eposta kullan�lamaz !");
			return false;
		}
		if (user.geteMail() == null) {
			System.out.println("E-posta bo� b�rak�lamaz !");
			return false;

		}

		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Ad ve Soyad en az 2 karakterden olu�mal�d�r !");
			return false;
		}

		return true;
	}

}
