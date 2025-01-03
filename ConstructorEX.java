package day10;

public class ConstructorEX {
 int id;
 String Carname;
 
 ConstructorEX(int id,String name){
	 this.id=id;
	 this.Carname=name;
 }
  
 ConstructorEX(){
	 
 
 }
 

 
 public static void main(String []args) {
	 
	 ConstructorEX Car=new ConstructorEX(1001,"honda");
	 
       System.out.println(Car.id);
       System.out.println(Car.Carname);
  
     ConstructorEX car1=new ConstructorEX();
      car1.Carname="tata";
      System.out.println(car1.Carname);
	 
 
 }
 }