package day3HW2;

public class DataBaseLogger extends BaseLogger {
	
	public void Log(String message) {
		System.out.println("Logged to database: "+message); //Override
	}
}
