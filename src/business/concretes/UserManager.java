package business.concretes;

import business.abstracts.IUserCheckService;
import business.abstracts.IUserService;
import business.abstracts.IUserValidityService;
import core.abstracts.IGoogleLoggerService;
import dataAccess.abstracts.IUserDao;
import entities.concretes.User;

public class UserManager implements IUserService {
	
	private IUserCheckService userCheckService;
	private IUserDao userDao;
	private IGoogleLoggerService gLoggerService;
	
	
	public UserManager() {
		
	}
	public UserManager(IUserCheckService userCheckService, IUserDao userDao,
			IGoogleLoggerService gLoggerService) {
		super();
		this.userCheckService = userCheckService;
		this.userDao = userDao;
		this.gLoggerService = gLoggerService;}

	@Override
	public void userRegister(User user) {
		 IUserValidityService validityService = new UserValidityManager(userDao);
			
			if(userCheckService.firstNameController(user.getFirstName())
			&& userCheckService.lastNameConroller(user.getLastName())
			&& userCheckService.passwordController(user.getPassword())
			&& userCheckService.emailController(user.getEmail())
			&& validityService.isItUsed(user.getEmail(), user.getPassword()))
			{
				userDao.add(user);
				gLoggerService.googleAccount(null, null);
			}
		
	}

	@Override
	public void singIn(String email, String password) {
		for(User user : userDao.getAll()) {
			if(email.equals(user.getEmail()) && password.equals(user.getPassword())) {
				System.out.println("Successfully logged in. "+user.getFirstName()+" "+user.getLastName());
			}else {
				System.out.println("Your password or your email are incorrect.");
			}	
		}
		
	}

}
