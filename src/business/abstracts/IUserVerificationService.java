package business.abstracts;

public interface IUserVerificationService {
	void postVerificationCode(String email);
	boolean verificationMailIsItClicked(String email, String code);
}
