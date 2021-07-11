package br.com.cmdev.javaejavautil.util;

public class TestOutrosWrapper {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(48); //autoboxing
		System.out.println(idadeRef.intValue()); //unboxing
		
		Double dRef = Double.valueOf(2.6); //autoboxing
		System.out.println(dRef.doubleValue()); //unboxing
		
		Boolean bRef = Boolean.FALSE; //autoboxing
		System.out.println(bRef.booleanValue()); //unboxing
		
		Number num = Integer.valueOf(48);
		System.out.println(num.doubleValue()); //unboxing
	}

}
