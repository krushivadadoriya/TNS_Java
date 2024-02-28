package library.info;

public class LibraryPackageDemo {

	public static void main(String[] args) {
		Book b = new Book();
		b.setTitle("ખભે કોથળો ને દેશ મોકળો");
		b.setAuthor("rashmi bansal");
		b.setAva_status(true);
		b.setIsbn(123456789);
		
		System.out.println(b.toString());
		
		Lib_users user = new Lib_users();
		user.setId(101);
		user.setName("krushi");
		user.setBorrowed_book(1);
		
		System.out.println(user.toString());
		
	}

}
