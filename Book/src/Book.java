class Book {
	
String author,title,publisher;
int price;
Book(String a,String t,String p,int price){
	author=a;
	title=t;
	publisher=p;
	this.price=price;
}

public String toString() {
	return "title:" + title + "author:" + author + "publisher:" + publisher + "price:" + price;
}

	 
}