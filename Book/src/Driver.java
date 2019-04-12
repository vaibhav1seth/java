import java.util.*;
import java.util.Scanner;

public class Driver {
	Scanner sc =new Scanner(System.in);
	ArrayList<Book> db=new ArrayList<Book>();
	void acceptDetails() {
		System.out.print("Enter no .of books");
		int n=sc.nextInt();
		String au,ti,pu;
		int pr;
		for(int i=0;i<n;i++) {
		System.out.print("Enter title of the book");
		ti=sc.next();
		System.out.print("Enter author of the book");
		au=sc.next();
		System.out.print("Enter publisher of the book");
		pu=sc.next();
		System.out.print("Enter price of the book");
		pr=sc.nextInt();
		Book b=new Book(au,ti,pu,pr);
		db.add(b);		
		}
	}
	
	ArrayList<Book> sortList(ArrayList<Book> b){
		ArrayList<Book> ar=new ArrayList<Book>();
		Collections.sort(db, new Sortbyprice ()); 
        System.out.println("\nSorted by rollno"); 
        for (int i=0; i<db.size(); i++) 
         ar.add(db.get(i));
        return ar;
	}
	
	void display() {
		Iterator iterator = db.iterator();
		while (iterator.hasNext()) 
            System.out.print(iterator.next() + " "); 
  
        System.out.println(); 
	}
	public static void main(String args[]) {
		ArrayList<Book> sortedList =new ArrayList<Book>();
		Driver d=new Driver();
		d.acceptDetails();
		d.display();
		sortedList=d.sortList(d.db);
		Iterator iterator = sortedList.iterator();
		while (iterator.hasNext()) 
            System.out.print(iterator.next() + " ");
		
		
	}
}