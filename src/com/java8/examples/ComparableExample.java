package com.java8.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Note implements Comparable<Note>
{

	private Long id;
	private String name;
	private Long rollNo;

	public Note() {

	}

	public Note(Long id, String name, Long rollNo) {
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;

	}

	public Long getRollNo() {
		return rollNo;
	}

	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Note o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.id);
	}

	@Override
	public String toString() {
		return "Note [id=" + id + ", name=" + name + ", rollNo=" + rollNo + "]";
	}

}

public class ComparableExample {

	public static void main(String args [])
	{
		Note n1 = new Note(100l, "Priyanshu", 100l);
		Note n2 = new Note(101l, "Sachin", 101l);
		Note n3 = new Note(102l, "Nitin", 102l);
		List<Note> l = new ArrayList<>();
		l.add(n1);
		l.add(n2);
		l.add(n3);
		
		Collections.sort(l);
		System.out.println(l);
	}
	
}
