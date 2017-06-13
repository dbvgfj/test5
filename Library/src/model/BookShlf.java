package model;

import java.util.ArrayList;
import java.util.List;

public class BookShlf {

	private List books ;
	
	public BookShlf(){
		books = new ArrayList() ;
		
	}
	
	public void addBook(Book book){
		book.add(book);
	}
}
