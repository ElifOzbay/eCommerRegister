package business.concretes;

import business.abstracts.IUserVerificationService;

public class UserVerificationManager implements IUserVerificationService {

	@Override
	public void postVerificationCode(String email) {
		System.out.println("Verification code sent to: " + email);
		
	}

	@Override
	public boolean verificationMailIsItClicked(String email, String code) {
		String baseCode = "https://verificationcode";
		if(baseCode==code) {
			System.out.println("E-mail is verified : " + email);
			return true;
		}else {
			System.out.println("E-mail is not a verified");
			return false;
		}
		
	}

}
