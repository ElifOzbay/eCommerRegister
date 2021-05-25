package business.abstracts;

import entities.concretes.User;

public interface IUserService {
	void userRegister (User user);
	void singIn (String email, String password);
}
