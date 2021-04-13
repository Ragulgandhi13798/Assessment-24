package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student{
	
	int id;
	String name;
	int marks;
	
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
}

public class Markeg {

	public static void main(String[] args) {
		  List<Student> al = new ArrayList<Student>();
		  al.add(new Student(11,"ragul",99));
		  al.add(new Student(12,"vijay",78));
		  al.add(new Student(13,"ajith",69));
		  al.add(new Student(14,"surya",43));
		  al.add(new Student(15,"sam",34));
		  al.add(new Student(16,"daniel",53));
		  al.add(new Student(17,"antony",87));
		  
		  Predicate<Student> p = s->s.marks>80;
		  
		  for(Student a : al)
		  {
			  if(p.test(a))
			  System.out.println("Distinct"+ " "+a.marks);
 		  }
       Predicate<Student> p1 = s->s.marks>60 && s.marks<80;
		  
		  for(Student a : al)
		  {
			  if(p1.test(a))
			  System.out.println("first class"+ " "+a.marks);
		  }
     Predicate<Student> p2 = s->s.marks>50 && s.marks<60 ;
		  
		  for(Student a : al)
		  {
			  if(p2.test(a))
			  System.out.println("second class"+ " "+a.marks);
		  }
		  
		  Predicate<Student> p3 = s->s.marks>35 && s.marks<50 ;
		  
		  for(Student a : al)
		  {
			  if(p3.test(a))
			  System.out.println("third class"+ " "+a.marks);
		  }
		  Predicate<Student> p4 = s->s.marks<35 ;
		  
		  for(Student a : al)
		  {
			  if(p4.test(a))
			  System.out.println("fail"+ " "+a.marks);
		  }
	}

}
