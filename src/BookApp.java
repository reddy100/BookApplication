
public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//commented out for bookDB
		/*
		Book book1 = new Book("Lord of the Rings", "J.R.R.Tolkien", "An epic adventure set in a fantasy world filled with magical beings and mythical creatures. Tolkien's grand saga  set the standards for modern fantsy.", 20.0, true, 25);
		print(book1.getTitle());
		print(book1.getAuthor());
		print(book1.getDescription());
		Book book2 = new Book("Hitchiker's Guide to the Galaxy", "Douglas Adams", "A quirky sci fi space comedy that dwells on some interesting philosophical thought experiments while tickling your funny bone all the way ", 20.0, true, 12); 
		Book book3 = new Book("Pride and Prejudice", "Jane Austen", "A romantic tale set in 19th century England that revolves around the main character as she deals with issues such as manners, upbringing, education and marriage. ", 20.0, false, 5); 
		Book book4 = new Book("Prelandra", "C.S.Lewis", "It is the second book in the Space Trilogy of C. S. Lewis, set in the Field of Arbol. It was first published in 1943.", 20.0, true, 1); 
		Book book5 = new Book("Nineteen Eighty-four", "George Orwell", "It is a dystopian novel by English author George Orwell published in 1949.[1][2] The novel is set in Airstrip One (formerly known as Great Britain), a province of the superstate Oceania in a world of perpetual war, omnipresent government surveillance and public manipulation, dictated by a political system euphemistically named English Socialism (or Ingsoc in the government's invented language, Newspeak) under the control of a privileged elite of the Inner Party, that persecutes individualism and independent thinking as \"thoughtcrime.\" ", 20.0, true, 10); 
		*/
		Book book = BookDB.getBook("lotr");
		
	}

	public static void print(String a)
	{
		System.out.println(a);
	}
	
	
}
