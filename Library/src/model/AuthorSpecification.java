package model;

public class AuthorSpecification implements Specification{

	private String author ;
	public AuthorSpecification(String author){
		this.author = author ;
	}
	
	public boolean isStatisfiedBy(Book book){
		return (book.getAuthor().equals(author));
	}
}
