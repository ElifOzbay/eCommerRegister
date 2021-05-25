import business.abstracts.IUserService;
import business.concretes.UserCheckManager;
import business.concretes.UserManager;
import business.concretes.UserValidityManager;
import core.concretes.GoogleLoggerManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	

	public static void main(String[] args) {
		User user=new User();
		user.setId(1);
		user.setFirstName("Elif");
		user.setLastName("Özbay");
		user.setEmail("elif.ozby0@hotmail.com");
		user.setPassword("asD1235");
		
		User user2=new User();
		user.setId(2);
		user.setFirstName("Elif");
		user.setLastName("Özbay");
		user.setEmail("elif.ozby0@hotmail.com");
		user.setPassword("asD123f35");
		
		User user3=new User();
		user.setId(3);
		user.setFirstName("Sena");
		user.setLastName("Þahin");
		user.setEmail("fsnashn@gmail.com");
		user.setPassword("aagfdklkgfbDD1234");
		
		
		
		IUserService userService = new UserManager(new UserCheckManager(), new HibernateUserDao(), new GoogleLoggerManager());
		userService.userRegister(user2);
		
	
		
		
		
		
		
	}

}
