package JsonUsingOOPs;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;
	private String email;
	private int age;
private List<Integer> mobile;

	public List<Integer> getMobile() {
	return mobile;
}

public void setMobile(List<Integer> mobile) {
	this.mobile = mobile;
}

	public Person(String name , String email, int age) {
		this.name=name;
		this.email=email;
		this.age=age;
		mobile=new ArrayList<Integer>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public void addMobileNumber(int mobileNo) {
		mobile.add(mobileNo);
		
	}
	
}
