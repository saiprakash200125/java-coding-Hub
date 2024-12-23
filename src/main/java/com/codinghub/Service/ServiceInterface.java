package com.codinghub.Service;

import java.util.List;

import com.codinghub.Entity.BookMyShow;

public interface ServiceInterface 
{
	public BookMyShow insert(BookMyShow bookMyShow);
	//public List<BookMyShow> print();
	public String delete(int id);
	public BookMyShow findBy(int id);
	
	public BookMyShow operation1(int id);
	public BookMyShow update(BookMyShow bookMyShow,int id);
	public BookMyShow PutMap(BookMyShow bookMyShow,int id);
	
	public List<BookMyShow> findByLocation(String location);
	
	public List<BookMyShow> print();
	
	public List<BookMyShow> fetch(int id,String movies);
	
	public List<BookMyShow> findByApplication();
}
