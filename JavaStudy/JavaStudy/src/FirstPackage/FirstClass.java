package FirstPackage;
import Entity.*;

public class FirstClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sBuffer = new StringBuffer("木子网:");
		sBuffer.append("www.lisen.me");
		System.out.println(sBuffer);//木子网:www.lisen.me
		
		StringBuffer reverseStringBuffer = sBuffer.reverse();
		System.out.println(sBuffer);//em.nesil.www:网子木
		System.out.println(reverseStringBuffer);//em.nesil.www:网子木
		
		sBuffer.reverse();
		sBuffer.delete(0, 4);
		System.out.println(sBuffer);//www.lisen.me
		sBuffer.insert(0, "木子网:");
		System.out.println(sBuffer);//木子网:www.lisen.me
		sBuffer.replace(0, 4, "");
		System.out.println(sBuffer);//www.lisen.me
		
		System.out.println(sBuffer.capacity());//20
	}

	public static void PrintBooks(String... books) {
		for (String book : books) {
			System.out.println(book);
		}
	}	
}

class Person{
	 public String name;
	 public String color;
	 public double weight;
	 
	 public Person(String name,String color){
		 this.name = name;
		 this.color = color;
	 }
	 
	 public Person(String name,String color,double weight){
	 this(name, color);
	 this.weight=weight;
	 }
}




