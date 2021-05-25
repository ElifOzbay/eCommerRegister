package business.concretes;

import business.abstracts.IUserValidityService;
import dataAccess.abstracts.IUserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class UserValidityManager implements IUserValidityService {
	private IUserDao userDao;

	public UserValidityManager(IUserDao userDao) {
		super();
		this.userDao = userDao;
	}

	public boolean isItUsed(String email, String password) {
		for(User user:userDao.getAll()) {
			if (email==user.getEmail() && password==user.getPassword()) {
					System.out.println("Access successful.");
					return true;
					
			}else{
				System.out.println("Access failed. It belongs to another user.");
					return false;
			}	
					
		}
		System.out.println("Active user not found.");
		return false;
	}

}

	
