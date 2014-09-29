package oopexample;

public class OOP1 {

	
	private String name;
	private int phoneNum;
	
	public OOP1(String name, int phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}
	
	
	//getter for name
	public String getName() {
		return this.name;
	}
	
	
	//getter for phoneNum
	public int getphoneNum() {
		return this.phoneNum;
	}
	
	
	//setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	//setter for phoneNum
	public void setphoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
	public String toString() {
		return "Name: "+ name +", Ph: " + phoneNum;
	}
	
	
}
