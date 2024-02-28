package library.info;

public class Lib_users {
	private String name;
	private int id;
	private int borrowed_book;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBorrowed_book() {
		return borrowed_book;
	}
	public void setBorrowed_book(int borrowed_book) {
		this.borrowed_book = borrowed_book;
	}
	@Override
	public String toString() {
		return "Lib_users [name=" + name + ", id=" + id + ", borrowed_book=" + borrowed_book + "]";
	}
}
