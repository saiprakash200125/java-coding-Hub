package com.codinghub.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codinghub.Entity.BookMyShow; 

@Repository
public interface Dao extends JpaRepository<BookMyShow,Integer>
{
	public List<BookMyShow> findByLocation(String location);
	
	@Query(value="from BookMyShow")
	public List<BookMyShow> print();
	
	@Query(value="from BookMyShow where id=:id and movies=:movies")
	public List<BookMyShow> fetch(int id,String movies);
}
