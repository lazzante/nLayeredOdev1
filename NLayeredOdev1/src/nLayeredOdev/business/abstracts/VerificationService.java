package nLayeredOdev.business.abstracts;

import nLayeredOdev.entities.concretes.User;

public interface VerificationService {
	void sendVerification(User user);

	boolean verify(User user);
}
