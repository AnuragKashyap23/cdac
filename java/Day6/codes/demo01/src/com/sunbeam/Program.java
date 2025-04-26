package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		Date dt1 = new Date(1, 1, 2020);
		Date dt2 = new Date(1, 1, 2020);
		
		boolean res = (dt1 == dt2); 
		//System.out.println("Res : "+res);// false 
		// == is comparing the references and references are not same 
		
		res = dt1.equals(dt2); 
		//System.out.println("Res : "+res);// false
		//equals method is not there inside data class 
		// so object class equals method is called and it compares references 
		// references cannot be same so false 
		
		res = dt1.equals(dt2); 
		//System.out.println("Res : "+res);// True
		//Date class equals method is getting called here 
		
		//res = dt1.equals(null); 
		System.out.println("Res : "+res);// false  
		
		//res = dt1.equals(dt1); 
		System.out.println("Res : "+res);// false
	
		res = dt1.equals("26-4-2025"); 
		//System.out.println("Res : "+res);// false  
	}

}
