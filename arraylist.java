package day20;
import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args)
	{
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("ROSE");
		l1.add("JASMINE");
		l1.add("HIBISCUS");
		l1.add("LOTUS");
		l1.add("LILLY");
		 
		ArrayList<String> l2=new ArrayList<String>();
		l2.add("ROSE");
		l2.add("JASMINE");
		l2.add("HIBISCUS");
		l2.add("LOTUS");
		l2.add("LILLY");
		
	
		l1.addFirst("harini");
		System.out.println(l1);
	}
}
