package com.bookutil;

import java.util.Scanner;

import com.book.Book;

public class BookUtil {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		

		Book ob=new Book("123","Thyiii","Ayushi","Ayushi1",1078);
		
		Book ob3=new Book("456","Tbhhh","life","yashi",1569);
		
		com.book.BookStore.addBook(ob);
		com.book.BookStore.addBook(ob3);/*
		//-----------displaying all books------------
		System.out.println("--------------------------");
		com.book.BookStore.displayAll();
		System.out.println("------------------------");*/
		
		/*String title=sc.nextLine();
		
		com.book.BookStore.searchByTitle(title);*/
		
		/*String author=sc.nextLine();
		com.book.BookStore.searchByAuthor(author);*/
		
		/*String bookID="B103";
		com.book.BookStore.deleteBook(bookID);*/
		
		
		
		
		//com.book.BookStore.displayAll();
		
		/*String bookID="B103";
		String bookset="B111";
		com.book.BookStore.modifyBook(bookID,bookset);
		com.book.BookStore.displayAll();*/
		
		//Book ob= new Book();
		//com.book.BookStore.addBook(ob);
		//com.book.BookStore.displayAll();
		
		
		
		
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		
		while(choice <9) {
		switch(choice) {
		case 1 : Book object= new Book();
		         com.book.BookStore.addBook(object);
		         break;
		         
		case 2 : //modify
			     System.out.println("enter book id");
			     String modifybookID=sc.next();
			     System.out.println("enter new book id");
				 String bookset=sc.next();
				 com.book.BookStore.modifyBook(modifybookID,bookset);
				 com.book.BookStore.displayAll();
				 break;
			     
		case 3 : //delete a book
			    System.out.println("enter book id");
			     String deletebookID=sc.next();
			     com.book.BookStore.deleteBook(deletebookID);
			     break;
		case 4 ://display all
			     com.book.BookStore.displayAll();
			     break;
		case 5 ://display specific book
			     System.out.println("enter book id");
			     String specificbookID=sc.nextLine();
			     com.book.BookStore.displayBook(specificbookID);
			     break;
		case 6 ://search title
			System.out.println("enter book title");
			String title=sc.next();
			com.book.BookStore.searchByTitle(title);
			break;
			
		case 7 ://search author
			System.out.println("enter book author");
			String author=sc.next();
			com.book.BookStore.searchByAuthor(author);
			break;
			
		case 8 : //exit

			System.exit(0);
			
		}
		System.out.println("Enter another Choice:-");
		int ch=sc.nextInt();
		choice=ch;
		
		
		}

	}

}
