
public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("Lord of the Rings", "J.R.R.Tolkien", "An epic adventure set in a fantasy world filled with magical beings and mythical creatures. Tolkien's grand saga  set the standards for modern fantsy.", 80.0, true);
		print(book.getTitle());
		print(book.getAuthor());
		print(book.getDescription());
	}

	public static void print(String a)
	{
		System.out.println(a);
	}
}
