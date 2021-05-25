package business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.IUserCheckService;

public class UserCheckManager implements IUserCheckService{
	 String emailPattern = "^(?=.{1,32}@)[A-Za-z0-9_]+(\\.[A-Za-z0-9_]+)*@"+"[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
	 String firstNamePattern = "^[\\p{L}A-Z a-z]{2,}$";
	 String lastNamePattern = "^[\\p{L}A-Z a-z]{2,}$";
	 String passwordPattern = "^(?=.[0-9A-Za-z.]).{6,16}$";

	@Override
	public boolean passwordController(String password) {
		Pattern pattern = Pattern.compile(passwordPattern);
		Matcher matcher = pattern.matcher(password);
	    if(matcher.matches()) {
	    	return true;
	    }else {
			System.out.println("Your password is invalid. Please enter a valid password.");
			return false;
		}
			
		
		
	}

	@Override
	public boolean emailController(String email) {
		Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()) {
        	return true;
        }else {
        	System.out.println("Your mail is invalid! Please enter a valid e-mail after checking the e-mail you entered.");
        return false;
        }
	}

	@Override
	public boolean firstNameController(String firstName) {
		Pattern pattern = Pattern.compile(firstNamePattern);
        Matcher matcherFirstName = pattern.matcher(firstName);
        return matcherFirstName.matches();
	}

	@Override
	public boolean lastNameConroller(String lastName) {
		Pattern pattern = Pattern.compile(lastNamePattern);
		Matcher matcherLastName = pattern.matcher(lastName);
		return matcherLastName.matches();
	}

}
