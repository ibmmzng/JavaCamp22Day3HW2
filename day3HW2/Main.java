package day3HW2;

public class Main {

	public static void main(String[] args) {
		
		BaseLogger[] loggers=new BaseLogger[] {new DataBaseLogger(),new EmailLogger(),new FileLogger(), new ConsoleLogger() };
		for(BaseLogger logger:loggers) {
			logger.Log("Log mesaj�");
		}
		System.out.println("------------------------------------------------------");
		
		CustomerManager customerManager=new CustomerManager(new DataBaseLogger());
		customerManager.add();
		
		System.out.println("--------Override altyap�s�yla �al��mak----------");
		
		BaseKrediManager[] krediManagers=new BaseKrediManager[] {new ��retmenKrediManager(),new Tar�mKrediManager(),new ��renciKrediManager()};
		for(BaseKrediManager krediManager:krediManagers) {
			System.out.println(krediManager.hesapla(1500));
		}
		System.out.println("--------Abstact Class----------");
		
		GameCalculator gameCalculator=new WomanGameCAlculator();
		
		System.out.println("--------Abstact Demo----------");
		
		CustomerManager customerManager2=new CustomerManager(new BaseLogger());
		customerManager2.databaseManager=new OracleDataBaseManager();
		customerManager2.getCustomers();
	}

}
