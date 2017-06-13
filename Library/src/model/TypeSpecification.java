package model;

public class TypeSpecification implements Specification{
	private String type ;
	public TypeSpecification(String type){
		this.type = type ;
	}
	
	public boolean isStatisfiedBy(Book book){
		return (book.getType().equals(type));
	}
}
