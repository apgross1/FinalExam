package QuestionA;

import java.util.Date;

public interface iPersonRead {
	static Date DOB = new Date();
	static final String FirstName = "";
	static final String MiddleName = "";
	static final String LastName = "";
	static final String address = "";
	static final String phone_number = "";
	static final String email_address = "";
	
	
	abstract String getFirstName();
	
	abstract String getMiddleName();
	
	abstract String getLastName();

	abstract Date getDOB();
	
	abstract String getAddress();
	
	abstract String getPhone();
	
	abstract String getEmail();
}
