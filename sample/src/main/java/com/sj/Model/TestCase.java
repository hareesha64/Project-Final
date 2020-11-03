package com.sj.Model;
 
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table (name="test")
public class TestCase 
{  
//Defining book id as primary key  
@Id  
@Column  
private int id;  
@Column  
private String title;  
@Column  
private String description;  
@Column  
private int runtime;
@Column
private String Status;
 public int getId() {
	return id;
}
 
public String getStatus() {
	return Status;
}

public void setStatus(String status) {
	Status = status;
}

public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getRuntime() {
	return runtime;
}
public void setRuntime(int runtime) {
	this.runtime = runtime;
}


public TestCase(int id, String title, String description, int runtime, String status) {
	super();
	this.id = id;
	this.title = title;
	this.description = description;
	this.runtime = runtime;
	Status = status;
}

public TestCase()
{
	
}

@Override
public String toString() {
	return "TestCase [id=" + id + ", title=" + title + ", description=" + description + ", runtime=" + runtime
			+ ", Status=" + Status + "]";
}
}