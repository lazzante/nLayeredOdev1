package nLayeredOdev.dataAccess.abstracts;

import java.util.List;

import nLayeredOdev.entities.concretes.User;

public interface UserDao {
	boolean add(User user);

	void update(User user);

	void delete(User user);

}
