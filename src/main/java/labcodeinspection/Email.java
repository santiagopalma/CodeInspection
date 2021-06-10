package labcodeinspection;
import java.util.Locale;
public class Email {

	final transient private String mfirstName;
	final transient private String mlastName;
	transient private String password;
	transient private String department;
	final transient private int defpasswordLength = 8;
	transient private String email;
	
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 */
	public Email(final String firstName,final String lastName) {
		this.mfirstName = firstName;
		this.mlastName = lastName;
	}
	/**
	 * 
	 */
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + mfirstName + "\nLAST NAME= " + mlastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}
	/**
	 * 
	 * @param depChoice
	 */
	public void setDeparment(final int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			break;
		}
	}

	private String randomPassword(final int length) {
		final String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			final int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}
	/**
	 *  
	 */
	public void generateEmail() {
		this.password = this.randomPassword(this.defpasswordLength);
		this.email = this.mfirstName.toLowerCase(Locale.US) + this.mlastName.toLowerCase(Locale.US) + "@" + this.department
				+ ".espol.edu.ec";
	}
}
