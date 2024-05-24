package exceptionHandlings;

public class InvalidPassword extends Exception{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Password is not correct";
	}
}
