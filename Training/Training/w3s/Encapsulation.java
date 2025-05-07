package w3s;

public class Encapsulation {
	private int age;
	private int birthday;
	private String fname;
	private String mname;
	
	
	
	
	

	public String getfName() {
		return fname;
	}

	public String getmName() {
		return mname;
	}

	public int getAge() {
		return age;
	}

	public int getBirth() {
		return birthday;
	}

	public void setfName(String newfName) {
		this.fname = newfName;
	}
	
	public void setmName(String newmName) {
		this.mname = newmName;
	}

	public void setAge(int newAge) {
		this.age = newAge;
	}
	public void setBirthday(int newBirthday) {
		this.birthday = newBirthday;
	}
	

}
