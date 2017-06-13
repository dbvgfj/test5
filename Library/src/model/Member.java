package model;

import java.util.ArrayList;

public class Member {

	private String Id  ;
	private String name ;
	ArrayList<String> loan = new ArrayList<String>();
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public final void Return(Book book){
		model.Loan loan = FindCurrentLoanFor(book);
		if(loan != null){
			loan.MarkAsReturned();
			book.setLoanTo(null);
		}
	}
	
	private Loan FindCurrentLoanFor(Book book) {  //找到制定书的借阅记录
		// TODO Auto-generated method stub
		String txtQuery = "SELECT loanbook FROM library  WHERE book = "+book;
        TypedQuery<Book> query = em.createQuery(txtQuery, Book.class);
        query.setParameter("book", book);
        return queryUser(query);
		
	}

	public final boolean CanLoan(Book book){
		return book.getLoanTo() == null;
	}
	
	public final Loan Loan(Book book){
		Loan loan = null ;
		if(CanLoan(book)){
			loan = LoanFactory.CreateLoan(book,this);
			getLoans().add(loan);
		}
		retuen loan ;
	}

	

	
}
