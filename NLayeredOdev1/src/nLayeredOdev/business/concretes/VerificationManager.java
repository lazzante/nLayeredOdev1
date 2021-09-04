package nLayeredOdev.business.concretes;

import java.util.ArrayList;
import java.util.Scanner;

import nLayeredOdev.business.abstracts.VerificationService;
import nLayeredOdev.business.abstracts.userCheckService;
import nLayeredOdev.dataAccess.abstracts.UserDao;
import nLayeredOdev.entities.concretes.User;

public class VerificationManager implements VerificationService {
	private userCheckService userCheckService;
	private UserDao userDao;
	static Scanner scanner = new Scanner(System.in);

	public VerificationManager(userCheckService userCheckService, UserDao userDao) {
		super();
		this.userCheckService = userCheckService;
		this.userDao = userDao;
	}

	@Override
	public void sendVerification(User user) {
		if (userCheckService.check(user) == true) {
			System.out.println(user.geteMail() + " adresine gönderilen doðrulama linkine týklayýn !");
		} else {
			return;
		}
	}

	@Override
	public boolean verify(User user) {

		System.out.println("Onaylamak için 1,Reddetmek için 2");
		int onay = scanner.nextInt();
		if (onay == 1) {
			if (userDao.add(user)) {
				System.out.println("E-posta Onaylandý");
				return true;
			}
		} else if (onay == 2) {
			System.out.println("Reddedildi");
			return false;
		}
		return false;
	}

}
