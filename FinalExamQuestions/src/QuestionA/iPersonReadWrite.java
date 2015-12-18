package QuestionA;

import java.util.Date;

public interface iPersonReadWrite {
	static Date DOB = new Date();
	static final String FirstName = "";
	static final String MiddleName = "";
	static final String LastName = "";
	static final String address = "";
	static final String phone_number = "";
	static final String email_address = "";
	
	abstract void setFirstName(String FirstName);
	
	abstract void setMiddleName(String MiddleName);
	
	abstract void setLastName(String LastName);
	
	abstract void setDOB(Date DOB);
	
	abstract void setAddress(String newAddress);
	
	abstract void setPhone(String newPhone_number);

	abstract void setEmail(String newEmail);

}
