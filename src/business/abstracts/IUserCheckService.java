package business.abstracts;

public interface IUserCheckService {
	boolean passwordController(String password);
	boolean emailController(String email);
	boolean firstNameController(String firstName);
	boolean lastNameConroller(String lastName);
}
