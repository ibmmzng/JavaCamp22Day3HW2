package day3HW2_devam;

public class CustomerManager {
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	public void add() {
		// iþ kodlarý
		customerDal.add();
	}
}
