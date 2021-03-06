package com.mphasis.dao;

import java.util.Collections;
import java.util.List;

import com.mphasis.model.Book;

/**
* API layer for persisting and retrieving the Book objects.
*/
public class BookDao {

  private static BookDao bookDao = new BookDao();

  	public List<Book> getAllBooks(){
  		return Collections.EMPTY_LIST;
  	}

  	public Book getBook(String isbn){
      	return null;
  	}

  	public String addBook(Book book){
	  	return book.getIsbn();
  	}

  	public String updateBook(Book book){
	  	return book.getIsbn();
  	}

  	public static BookDao getInstance(){
	  	return bookDao;
  	}
}
