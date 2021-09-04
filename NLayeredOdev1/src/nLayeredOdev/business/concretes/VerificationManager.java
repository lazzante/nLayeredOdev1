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
			System.out.println(user.geteMail() + " adresine g�nderilen do�rulama linkine t�klay�n !");
		} else {
			return;
		}
	}

	@Override
	public boolean verify(User user) {

		System.out.println("Onaylamak i�in 1,Reddetmek i�in 2");
		int onay = scanner.nextInt();
		if (onay == 1) {
			if (userDao.add(user)) {
				System.out.println("E-posta Onayland�");
				return true;
			}
		} else if (onay == 2) {
			System.out.println("Reddedildi");
			return false;
		}
		return false;
	}

}
