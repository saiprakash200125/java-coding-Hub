package com.codinghub.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.codinghub.Entity.BookMyShow;
import com.codinghub.Repository.Dao;


@Service
public class ServiceImpl implements ServiceInterface
{
	@Autowired
	private Dao dao;
	
	public ServiceImpl(Dao dao) 
	{
		super();
		this.dao = dao;
	}

	@Override
	public BookMyShow insert(BookMyShow bookMyShow) 
	{
		
		return dao.save(bookMyShow);
	}

	/*@Override
	public List<BookMyShow> print() {
		List<BookMyShow> list= (List<BookMyShow>) dao.findAll();
		return list;
	}*/

	@Override
	public String delete(int id) {
		BookMyShow bookMyShow=findBy(id);  
		dao.delete(bookMyShow);
		return "1 RECORD DELETED SUCCESSFULLY";
	}

	@Override
	public BookMyShow findBy(int id) {
		Optional<BookMyShow> opt=dao.findById(id);
		BookMyShow bookMyShow=opt.get();
		return bookMyShow;
	}
	
	@Override
	public BookMyShow operation1(int id)
	{
		Optional<BookMyShow> bookMyShow=dao.findById(id);
		return bookMyShow.get();
	}

	@Override
	public BookMyShow update(BookMyShow bookMyShow, int id) {
		BookMyShow bookMyShow1 = operation1(id);
		bookMyShow1.setMovies(bookMyShow.getMovies());
		bookMyShow1.setLocation(bookMyShow.getLocation());
		bookMyShow1.setPrice(bookMyShow.getPrice());
		return dao.save(bookMyShow1);
	}

	@Override
	public BookMyShow PutMap(BookMyShow bookMyShow, int id) 
	{
		BookMyShow bookMyShow1 = operation1(id);
		bookMyShow1.setLocation(bookMyShow.getLocation());
		return dao.save(bookMyShow1);
	}

	@Override
	public List<BookMyShow> findByLocation(String location) 
	{
		return dao.findByLocation(location);
	}

	@Override
	public List<BookMyShow> print() 
	{
		List<BookMyShow> list= (List<BookMyShow>) dao.findAll();
		return list;
	}

	@Override
	public List<BookMyShow> fetch(int id, String movies) 
	{
		return dao.fetch(id, movies);
	}

	@Override
	public List<BookMyShow> findByApplication() 
	{
		return dao.findAll(Sort.by("id").ascending());
	}

}
