package day3HW2;

public class ÖğrenciKrediManager extends BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar*1.10; //Override(Üzerine yazılabilir) , C# da virtual olarak yapılır.
	}
}
