package model;

public class Loan {

	public boolean HasNotBeenReturned(){
		return ReturnDate == null ;
	}
	
	public void MarkAsReturned(){
		ReturnDate = dateTime.Now ;
	}

	
}
