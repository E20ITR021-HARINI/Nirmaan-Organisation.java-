package day3;

public class reverse {
    public static void main(String[] args) {
	  
    	String name="harini";
    	String rs="";
	   
	   for(int i=5;i>=0;i--) {
	   
		   rs+=name.charAt(i);
	   }
	   
	   System.out.println(rs.toLowerCase());
	   System.out.print(rs.toUpperCase());
	   
	   
			  String number[]= {"banana","apple","mango"};
			  for(int i=0;i<number.length;i++) {
				  System.out.println(number[i]);
				  
			  }	   

    }
}
