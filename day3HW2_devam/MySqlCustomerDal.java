package day3HW2_devam;

public class MySqlCustomerDal implements ICustomerDal,IRepository {

	@Override
	public void add() {
		System.out.println("Mysql'e eklendi.");
		
	}

}
