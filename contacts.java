package pack1;
import java.util.HashMap;
import java.util.Scanner; 
import java.util.LinkedList;
import java.util.Calendar;
import java.util.Date;
//import java.util.ListIterator;
//import java.util.ArrayList;

class misscall{
	Date time;
	Integer no;
	String name;
	misscall(Date t,Integer n,String na)
	{
		time=t;
		no=n;
		name=na;
	}
}
class contact{
	Scanner sc=new Scanner(System.in);
	
	private HashMap<Integer,String>hm=new HashMap<Integer,String>();
	private LinkedList<misscall>call=new LinkedList<misscall>();
	private int count=0;
	private misscall ob;
	
	
	contact()
	{
		hm.put(81045290,"Abhishek");
		hm.put(81045291,"Mandal");
		hm.put(81045292,"Sourav");
		hm.put(81045293,"Choudhary");
		hm.put(81045294,"Banerjee");
		hm.put(81045295,"Danish");
		hm.put(81045296,"Raza");
		hm.put(81045297,"Sunil");
		hm.put(81045298,"Pandey");
		hm.put(81045299,"Vaibhav");
		hm.put(81045210,"Saraf");
		hm.put(81045211,"Vishal");
		hm.put(81045212,"Vivek");
		hm.put(81045213,"Manish");
		hm.put(81045214,"Ashmit");
		hm.put(81045215,"Anand");
		hm.put(81045216,"Sunny");
		hm.put(81045217,"Sahil");
		hm.put(81045218,"Rohan");
		hm.put(81045219,"Vikash");
	}
	
	void give_misscall()
	{
		Integer n;
		Calendar c=Calendar.getInstance();
		System.out.println("enter number to give misscall:");
		n=sc.nextInt();
		Date d = c.getTime();
		if(hm.containsKey(n))
			ob=new misscall(d,n,hm.get(n));
		else
			ob=new misscall(d,n,"PRIVATE NUMBER");
		
		if(count<10)
			call.add(count,ob);
		else
			call.set(count%10,ob);
		count+=1;
	}
	void show(int i)
	{
		if(call.size()<i+1)
			System.out.println("no further misscalls");
		else
		{
			misscall a=call.get(i);
			System.out.println(a.no+" gave you a misscall");
		}
	}
	void showall(int i)
	{
		//ListIterator<misscall> l =call.listIterator();
		//while(l.hasNext())
		//{
			misscall a=call.get(i);
			if(a.name!="PRIVATE NUMBER")
				System.out.println(a.name+" has called at "+a.time);
			else
				System.out.println("PRIVATE NUMBER"+" "+a.no+" has called at "+a.time);
			//System.out.println();
			
		//}
	}
	
	void delete(int i)
	{
		//int i=call.indexOf(ob);
		if(call.size()==0)
			System.out.println("no miscalls");
		else
		{
			call.remove(i);
			count-=1;
			System.out.println("deleted successfully.");
		}
	}
	
	void delete_no(Integer n)
	{
		int i;
		for(i=0;i<call.size();i++)
		{
			misscall ob=call.get(i);
			if(ob.no==n)
				break;
		}
		call.remove(i);
	}
	
	boolean check()
	{
		if(call.size()==0)
			return true;
		else
			return false;
	}
}

public class contacts {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int n;
		contact ob=new contact();
		char c='y';
		do
		{
			System.out.println("1 give misscall\n2 show misscalls\nSELECT your choice:");
			n=sc.nextInt();
			switch(n)
			{
			case 1:ob.give_misscall();
				break;
			case 2: if(ob.check())
					System.out.println("no misscalls.");
					else	
					{	int i=0,f;
						char choice='y';
						do
						{
							if(ob.check())
								System.out.println("no misscalls.");
							else
							{
								//ob.show(i);
								System.out.println("1.delete call 2.next misscall 3.show details \n select your choice:");
								f=sc.nextInt();
								switch(f)
								{
								case 1:ob.delete(i);
									break;
								case 2:i+=1;
									ob.show(i);
									break;
								case 3:ob.showall(i);
									break;
								default:System.out.println("wrong choice.");
								}
							}
							System.out.println("try again [y/n]:");
							choice=sc.next().charAt(0);
						}while(choice=='Y' || choice=='y');
					}
				break;
			default:System.out.println("wrong choice.");
				break;
			}
			System.out.println("TRY again [y/n]:");
			c=sc.next().charAt(0);
		}while(c=='y' || c=='Y');
	}
}