package day3HW2_devam;

public  class ProductValidator { // Javada Ana class static olamaz.
	
	static{
		System.out.println("Static yap�c� blok �al��t�.");
	}
	
	public ProductValidator() {
		System.out.println("Yap�c� blok �al��t�.");
	}
	
	public static boolean isValid(Product product) { // Metodu static yapt���m�zda metod ismiyle �a�r�labilir.
		if(product.price>0 && !product.name.isEmpty())
			return true;
		else 
			return false;
	}
	public static class baskaBirClas { //�nner Class
		public static void sil() {
			
		}
	}
	
}
