package com.mphasis.dao;


import com.junit.Assert.assertEquals;
import com.junit.Assert.assertNotNull;
import com.mockito.Mockito.mock;
import com.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import com.junit.BeforeClass;
import com.junit.Test;

import com.mphasis.model.Book;

public class TestBookDao {

	  private static BookDao mockedBookDao;
	  private static Book book1;
	  private static Book book2;

	  @BeforeClass
	  public static void setUp(){
	    mockedBookDao = mock(BookDao.class);
	    book1 = new Book("8131721019","Compilers Principles",
	            Arrays.asList("D. Jeffrey Ulman","Ravi Sethi", "Alfred V. Aho", "Monica S. Lam"),
	            "Pearson Education Singapore Pte Ltd", 2008,1009,"BOOK_IMAGE");

	    book2 = new Book("9788183331630","Let Us C 13th Edition",
	            Arrays.asList("Yashavant Kanetkar"),"BPB PUBLICATIONS", 2012,675,"BOOK_IMAGE");

	    when(mockedBookDao.getAllBooks()).thenReturn(Arrays.asList(book1, book2));
	    when(mockedBookDao.getBook("8131721019")).thenReturn(book1);
	    when(mockedBookDao.addBook(book1)).thenReturn(book1.getIsbn());

	    when(mockedBookDao.updateBook(book1)).thenReturn(book1.getIsbn());

	  }

	  @Test
	  public void testGetAllBooks() throws Exception {

	    List<Book> allBooks = mockedBookDao.getAllBooks();
	    assertEquals(2, allBooks.size());
	    Book myBook = allBooks.get(0);
	    assertEquals("8131721019", myBook.getIsbn());
	    assertEquals("Compilers Principles", myBook.getTitle());
	    assertEquals(4, myBook.getAuthors().size());
	    assertEquals((Integer)2008, myBook.getYearOfPublication());
	    assertEquals((Integer) 1009, myBook.getNumberOfPages());
	    assertEquals("Pearson Education Singapore Pte Ltd", myBook.getPublication());
	    assertEquals("BOOK_IMAGE", myBook.getImage());
	  }

	  @Test
	  public void testGetBook(){

	    String isbn = "8131721019";

	    Book myBook = mockedBookDao.getBook(isbn);

	    assertNotNull(myBook);
	    assertEquals(isbn, myBook.getIsbn());
	    assertEquals("Compilers Principles", myBook.getTitle());
	    assertEquals(4, myBook.getAuthors().size());
	    assertEquals("Pearson Education Singapore Pte Ltd", myBook.getPublication());
	    assertEquals((Integer)2008, myBook.getYearOfPublication());
	    assertEquals((Integer)1009, myBook.getNumberOfPages());

	  }

	  @Test
	  public void testAddBook(){
	    String isbn = mockedBookDao.addBook(book1);
	    assertNotNull(isbn);
	    assertEquals(book1.getIsbn(), isbn);
	  }

	  @Test
	  public void testUpdateBook(){

	    String isbn = mockedBookDao.updateBook(book1);
	    assertNotNull(isbn);
	    assertEquals(book1.getIsbn(), isbn);
	  }
	}
