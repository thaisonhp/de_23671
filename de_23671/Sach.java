package de_23671;

public abstract class Sach {
	private String title ; 
	private String author ;
	
	
	public Sach() {
		
	}




	public Sach(String title, String author) {
		this.title = title;
		this.author = author;
	}




	public String getTitle() {
		return title;
	}




	public String getAuthor() {
		return author;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public void setAuthor(String author) {
		this.author = author;
	}




	@Override
	public String toString() {
		return "Sach [title=" + title + ", author=" + author + "]";
	} 
	
	public abstract boolean getInfor();
	
	
}
