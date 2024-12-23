package com.codinghub.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class BookMyShow 
{
	String movies;
	@Id
	int id; 
	String location;
	double price;
	
}
