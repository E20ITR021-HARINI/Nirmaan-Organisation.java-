package Day21;

import java.util.*;

public class libraryManagement1 {
	public static void main(String[] args) {
		ArrayList<book> a1 = new ArrayList<book>();
		book b1 = new book();
		Scanner scan = new Scanner(System.in);
     boolean isTrue=true;
		while (isTrue) {

			System.out.println("Enter your choice");
			System.out.println("1 for add");
			System.out.println("2 for show");
			System.out.println("3 for update");
			System.out.println("0 for exit");
			int key = scan.nextInt();
			scan.nextLine();

			switch (key) {
			case 1: {
				System.out.println("enter book id");
				int id = scan.nextInt();
				scan.nextLine();

				System.out.println("enter book name");
				String name = scan.nextLine();

				System.out.println("enter your price");
				double price = scan.nextDouble();

             a1.add(b1=new book(id,name,price));
				break;

			}
			
			case 2: {
				System.out.println(a1);
				break;
			}
			case 3:{
				System.out.println("enter your book id");
				int id=scan.nextInt();
				scan.nextLine();
				for(book d1:a1) {
					if(id==d1.getId()) {
						System.out.println("rename the book");
						String name=scan.nextLine();
						d1.setName(name);
						System.out.println("enter book price");
						double price=scan.nextDouble();
						d1.setPrice(price);
					}
					
					
				}
				
				
			}case 0:{
				isTrue=false;
				System.out.println("thank you");
			}

			}

		}
	}


	

}
