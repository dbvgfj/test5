package model;

public class Book {

	private String Id ;
	public final String getId() {
		return Id ;
	}
	public final void setId(String value){
		Id = value ;
	}
	private String ISBN;
	public final void setISBN(String value){
		ISBN = value ;
	}
	private String Title;
	public final String getTitle(){
		return Title ;
	}
	public final void setTitle(String value){
		Title = value ;
	}
	private Member LoanTo;
	public Member getLoanTo(){
		return LoanTo ;
	}
	public void setLoanTo(Member value){
		LoanTo = value ;
	}
	public void add(Book book) {
		if(validate(book))
			book.add(book);
		
	}
	private String author ;
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	private String type ;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private boolean validate(Book book) {
		AuthorSpecification as =new AuthorSpecification(author);
		TypeSpecification ts = new TypeSpecification(type);
		return (as.isStatisfiedBy(book)&&ts.isStatisfiedBy(book));
	}
	
}
