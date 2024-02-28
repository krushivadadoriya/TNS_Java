package library.info;

public class Book {
	private String title;
	private String author;
	private int isbn;
	private boolean ava_status;
	
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
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public boolean isAva_status() {
		return ava_status;
	}
	public void setAva_status(boolean ava_status) {
		this.ava_status = ava_status;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", ava_status=" + ava_status + "]";
	}
}
