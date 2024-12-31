package day8;

public class calculator {
	int a;
	int b;
	 
	
	void add()
	{
		System.out.println("addition:"+(a+b));
	}
	void sub()
	{
		System.out.println("substraction:"+(a-b));
	}
	void mul()
	{
		System.out.println("multiplication:"+(a*b));
	}
	void mod()
	{
		System.out.println("modulus:"+(a%b));
	}
    void div()
    {
    	System.out.println("division:"+(a/b));
    }
    
    public static void main(String[] args) {
    
    calculator calc1=new calculator();
    calc1.a=10;
    calc1.b=20;
    calc1.add();
    calc1.sub();
    calc1.mul();
    calc1.mod();
    calc1.div();
    
    }

}
