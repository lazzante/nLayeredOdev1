package nLayeredOdev.business.adapters;

import nLayeredOdev.business.abstracts.UserRegisterService;
import nLayeredOdev.entities.concretes.User;

public class GoogleRegisterAdapter implements UserRegisterService{

	@Override
	public void register(User user) {
		System.out.println("Google hesabý ile üyelik tamamlandý");
		
	}

}
