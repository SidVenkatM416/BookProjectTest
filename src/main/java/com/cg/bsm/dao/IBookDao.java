package com.cg.bsm.dao;

import java.util.List;

import com.cg.bsm.exception.BookStoreException;

import com.cg.bsm.model.Book;

public interface IBookDao {	
	
	String add(Book book) throws BookStoreException;
	
	boolean delete(String bcode)throws BookStoreException;
	
	Book get(String bcode) throws BookStoreException;;
	
	List<Book> getAll() throws BookStoreException;;
	
	boolean update(Book book) throws BookStoreException;
	
	// for some future reference
	 void persist()throws BookStoreException;
}