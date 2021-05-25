package core.concretes;

import core.abstracts.IGoogleLoggerService;

public class GoogleLoggerManager implements IGoogleLoggerService {

	@Override
	public boolean googleAccount(String userName, String password) {
		return true;
	}

}
