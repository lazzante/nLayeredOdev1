package nLayeredOdev.business.concretes;

import nLayeredOdev.business.abstracts.UserRegisterService;
import nLayeredOdev.business.abstracts.VerificationService;
import nLayeredOdev.business.abstracts.userCheckService;
import nLayeredOdev.dataAccess.abstracts.UserDao;
import nLayeredOdev.entities.concretes.User;

public class UserRegisterManager implements UserRegisterService {

	private VerificationService verificationService;

	public UserRegisterManager(VerificationService verificationService) {
		super();
		this.verificationService = verificationService;
	}

	@Override
	public void register(User user) {

		if (verificationService.verify(user)) {

			System.out.println("�yelik Tamamland�");
		} else {
			System.out.println("�yelik Ba�ar�s�z !");
			return;

		}
	}

}
