package business.abstracts;

public interface IUserValidityService {
	boolean isItUsed(String email, String password);
}
