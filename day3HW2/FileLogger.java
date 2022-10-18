package day3HW2;

public class FileLogger extends BaseLogger {
	public void Log(String message) {
		System.out.println("Logged to file: "+message); // Override
	}
}
