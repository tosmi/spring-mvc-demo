package at.stderr.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

	private String firstName;

	@NotNull(message="is required")
	@Size(min=1, message="is required")	
	private String lastName;

	@Min(value=0, message="must be greater than or equal to 0")
	@Max(value=10, message="must be less than or equal to 10")
	private int freePasses;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}
	
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastname) {
		this.lastName = lastname;
	}

	public int getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}
}
