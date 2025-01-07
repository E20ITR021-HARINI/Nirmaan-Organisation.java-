package Day11;

public class ForEach {
	
	public static void main(String[]args )
	{//for loop
		int a[]= {10,20,30,40,50};
		int l=a.length;
		int b=0;
		for (int i=0;i<l;i++)
		{
			System.out.println(a[i]);
			b+=a[i];
			
		}
		//for loop array addition
		System.out.println(b);
	//for each loop
	 int total=0;
	for(int num:a)
	{
		System.out.println(num);
	   
	    total+=num;
	}
	System.out.println(total);
   //user input
	int number[]=new int[5];
	number[0]=21;
	number[1]=22;
	number[2]=23;
	number[3]=24;
	number[4]=25;
	int value=0;
	
	 for(int nums:number) {
		 System.out.println(nums);
		 value+=nums;
	 }
	 System.out.println(value   
			 );
	
	
}
	}
