package day3HW2;

public class CustomerManager {
	private BaseLogger logger;
	public CustomerManager(BaseLogger logger) {
		this.logger=logger;
	}
	
	public void add() {
		System.out.println("Müþteri eklendi.");
		this.logger.Log("log mesajý");
	}
	
	BaseDatabaseManager databaseManager;
	public void getCustomers() {
		databaseManager.getData();
	}
}
