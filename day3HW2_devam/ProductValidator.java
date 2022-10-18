package day3HW2_devam;

public  class ProductValidator { // Javada Ana class static olamaz.
	
	static{
		System.out.println("Static yapýcý blok çalýþtý.");
	}
	
	public ProductValidator() {
		System.out.println("Yapýcý blok çalýþtý.");
	}
	
	public static boolean isValid(Product product) { // Metodu static yaptýðýmýzda metod ismiyle çaðrýlabilir.
		if(product.price>0 && !product.name.isEmpty())
			return true;
		else 
			return false;
	}
	public static class baskaBirClas { //Ýnner Class
		public static void sil() {
			
		}
	}
	
}
