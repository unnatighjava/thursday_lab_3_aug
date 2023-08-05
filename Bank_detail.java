package thursday_lab_3_aug;

public class Bank_detail {
	//intitillized private and default variable
	String Bank_name,user_name,branch_name;
	private int ac_no,pin=121,bal=2000;
	int amount;
	//use getter setter method for private variable
	public int getAc_no() {
		return ac_no;
	}
	public void setAc_no(int ac_no) {
		this.ac_no = ac_no;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	

}
