package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.IUserService;
import dataAccess.abstracts.IUserDao;
import entities.concretes.User;

public class HibernateUserDao  implements IUserDao{
	
	public List<User> users= new ArrayList<User>();

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+ " "+ user.getLastName()+" "+ "User added.");
		users.add(user);
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+ " "+ user.getLastName()+" "+ "User updated.");
	}

	@Override
	public void delete(User user) {
		for(User user2 : users) {
			if(user2.getId() == user.getId()) {
				users.remove(user2);
			}
		}
		users.remove(user);
	}

	@Override
	public User get(int id) {
		for (User user : users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		List<User> users = new ArrayList<User>();
		User user = new User(1,"Elif","Özbay","elif.ozby0@hotmail.com","asD1235");
		User user2 = new User(2,"Elif","Özbay","elif.ozby0@hotmail.com","asD123f35");
		User user3=new User(3,"Sena","Şahin","fsnashn@gmail.com","aagfdklkgfbDD1234");
		User user4=new User(4,"Emine","Susen","susenemine@gmail.com","356df");
		users.add(user);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		return users;
	}

}
