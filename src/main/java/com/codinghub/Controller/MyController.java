package com.codinghub.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codinghub.Entity.BookMyShow;
import com.codinghub.Service.ServiceInterface;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class MyController
{
	@Autowired
	private ServiceInterface serviceInterface;
	
	
	public MyController(ServiceInterface serviceInterface) 
	{
		super();
		this.serviceInterface = serviceInterface;
	}
	
	@PostMapping("/")
	@CrossOrigin(origins="http://localhost:4200")
	public BookMyShow insert(@RequestBody BookMyShow bookMyShow)
	{
		return serviceInterface.insert(bookMyShow);
	}
	
	@GetMapping("/a")
	@CrossOrigin(origins="http://localhost:4200")
	public List<BookMyShow> display()
	{
		return serviceInterface.print();
	}
	@DeleteMapping("/{id}")
	@CrossOrigin(origins="http://localhost:4200")
	public String delete(@PathVariable int id)
	{
		return serviceInterface.delete(id);
	}
	@GetMapping("/{id}")
	@CrossOrigin(origins="http://localhost:4200")
	public BookMyShow findBy(@PathVariable int id)
	{
		return serviceInterface.findBy(id);
	}
	
	/*@GetMapping("/{id}")
	public BookMyShow find(@PathVariable int id)
	{
		return serviceInterface.operation1(id);
	}*/
	@PostMapping("/{id}")
	public BookMyShow update(@RequestBody BookMyShow bookMyShow, @PathVariable int id)
	{
		return serviceInterface.update(bookMyShow, id);
	}
	
	@PutMapping("/{id}")
	public BookMyShow PutMap(@RequestBody BookMyShow bookMyShow,@PathVariable int id) 
	{
		return serviceInterface.PutMap(bookMyShow, id);
	}
	
	@GetMapping("/{location}")
	@CrossOrigin(origins="http://localhost:4200")
	public List<BookMyShow> findByLocation(@PathVariable String location) 
	{
		return serviceInterface.findByLocation(location);
	}
	
	@GetMapping("/b")
	@CrossOrigin(origins="http://localhost:4200")
	public List<BookMyShow> find()
	{
		return serviceInterface.print();
	}
	
	@GetMapping("/{id}/{movies}")
	@CrossOrigin(origins="http://localhost:4200")
	public List<BookMyShow> fetch(@PathVariable int id,@PathVariable String movies)
	{
		return serviceInterface.fetch(id, movies);
	}
	
	@GetMapping("/")
	@CrossOrigin(origins="http://localhost:4200")
	public List<BookMyShow> findByApplication()
	{
		return serviceInterface.findByApplication();
	}
}
