package nLayeredOdev.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayeredOdev.dataAccess.abstracts.UserDao;
import nLayeredOdev.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	private List<String> eMails;

	public HibernateUserDao() {
		eMails = new ArrayList<String>();
	}

	@Override
	public boolean add(User user) {
		for (String email : eMails) {
			if (email.equals(user.geteMail())) {
				System.out.println("Bu e-posta zaten var !");
				return false;
			}
		}

		System.out.println(user.getFirstName() + " " + user.getLastName() + " db'ye kaydedildi ");
		eMails.add(user.geteMail());
		return true;
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " db'de güncellendi ");

	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " db'den silindi ");

	}

}
