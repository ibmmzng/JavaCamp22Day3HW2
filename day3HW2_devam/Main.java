package day3HW2_devam;

public class Main {

	public static void main(String[] args) {
		//----------------- �nterfaces-------------------
		ICustomerDal �CustomerDal=new OracleCustomerDal();
		
		CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
		//customerManager.customerDal=new OracleCustomerDal(); //Interface newlenemez.
		customerManager.add();
		
		//----------------- �nner Class & Static-------------------
		ProductManager productManager=new ProductManager();
		Product product=new Product();
		product.price=10;
		product.name="";
		productManager.add(product);
		
		DatabaseHelper.Crud.delete();
		DatabaseHelper.Connection.createConnection();
	}

}
