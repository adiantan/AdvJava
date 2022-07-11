package com.cdacapp;

import java.util.ArrayList;
import java.util.List;

import com.cdac.Dao.GenericDao;
import com.cdac.entity.Author;
import com.cdac.entity.Book;

public class BookAuthorExample {

	
	
	public static void main(String[] args) {
	
		GenericDao dao= new GenericDao();
	
		//adding few authors
		
	/*	Author author=new Author();
		author.setName("Elisabeth Robinson");
		author.setEmail("elisa@gmail.com");
		dao.save(author);
		*/
		
		Book book=new Book();
		book.setName("Fire of Wings");
		book.setCost(2500);
		
		List<Author>authors=new ArrayList<Author>();
		authors.add((Author)dao.fetchById(Author.class,1));
		//authors.add((Author)dao.fetchById(Author.class,2));
         
		book.setAuthors(authors);
		dao.save(book);
	}
}
