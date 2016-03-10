
public class Book {
	private String title;
	private String author;
	private String description;
	private double price;
	private boolean isInStock;
	private int quantity;
	
	public Book()
	{
		this.title="";
		this.author="";
		this.description="";
		this.price=0.0;
		this.isInStock=false;
		this.quantity=0;
	}
	
	public Book(String title, String author, String description, double price, boolean isInStock, int quantity)
	{
		this.title=title;
		this.author=author;
		this.description=description;
		this.price=price;
		this.isInStock=isInStock;
		this.quantity=quantity;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isInStock() {
		return isInStock;
	}

	public void setInStock(boolean isInStock) {
		this.isInStock = isInStock;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getPricing(int quantity)
	{
		if(this.quantity>=quantity)
		{
			this.quantity-=quantity;
			return totalPrice(quantity, this.price);
		}
		else
		{
			System.out.println("Not enough books in stock. Please input a different quantity");
			return 0.0;
		}
	}
	
	public static double totalPrice(int quantity, double price)
	{
		return quantity*price;
	}

}
