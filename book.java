package Day21;

public class book {
	
	int id;
	String name;
	double price;
	
	public book() {
		
		
		
	         }
	public book(int id,String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
		
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}


