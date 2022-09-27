package com.myproject.hibernate.lms.client.done;

import com.myproject.hibernate.book.service.done.BookService;
import com.myproject.hibernate.lms.book.done.Book;

public class LMSClient 
{

	public static void main(String[] args) 
	{
		System.out.println("Start Main method of LMSClient Class");
		
		
		BookService bookService = new BookService();
		
//		//1. Verify Users
//		String isValidUser = bookService.verifyUsers("Tony", "password");
//		//String isValidUser = bookService.verifyUsers("Tony", "pswd");//Intentionally putting wrong password
//		
//		System.out.println(isValidUser);
		
		
		//2. Add Book
		
//		Book book = new Book(11, "Java Book", "Tony Stark", "Home Edition Java Done", 11000, 43471114);
//		
//		int record = bookService.addBook(book);
//		
//		if(record>0)
//			System.out.println("Records are updated Successfully");
//		else
//			System.err.println("Error occured while inserting the data");
		
		
		//Get Book_name by Book_ID
		
		int bookID = 11;
		
		String byBookIDReturnBOOK_NAME = bookService.getBookByID(bookID);
		
		System.out.println(byBookIDReturnBOOK_NAME);
		
		
		//Update
		//Delete
		//Get All Books
		
		
		
		System.out.println("End Main method of LMSClient Class");

	}

}
