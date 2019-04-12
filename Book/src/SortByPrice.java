import java.util.*;
class Sortbyprice implements Comparator<Book> 
{ 
    // Used for sorting in ascending order of 
    // price 
    public int compare(Book a, Book b) 
    { 
        return a.price - b.price; 
    } 
} 