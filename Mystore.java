import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mystore
{
	public static void main (String args[])
	 {
		 Scanner scan=new Scanner(System.in);
		 System.out.print("Enter product name:");
		 String productname=scan.nextLine();
		 System.out.print("Enter product id:");
		 String  productid=scan.nextLine();
		 System.out.print("Enter Transaction id:");
		 long  transid=scan.nextLong();
		 System.out.print("Enter product price:");
		 double productprice=scan.nextDouble();
		 System.out.print("Enter how many units purchased:");
		 int no_of_productsold=scan.nextInt();
		 System.out.print("Enter amount of money paid:");
		 float moneypaid=scan.nextFloat();
		 System.out.println("--------------------------------------------------------------------");
		 System.out.println("              MY STORE                    ");
	     System.out.println("     123 MG RD BANGLORE KA IN 560001       ");
		 System.out.println("          STORE #:22222                   ");
		 System.out.println("       THANK YOU FOR YOUR SHOPPING        ");
		 System.out.println("        TRANSACTION #:"  +transid      );
		 
		 DateFormat dateFormat=new SimpleDateFormat("   MM/dd/yyyy   ");
		 Date date=new Date();
		 System.out.println(           dateFormat.format(date)         );
		 System.out.println("--------------------------------------------------------------------");
		 Receipt r=new Receipt(productname,productid, transid,
				 productprice, no_of_productsold, moneypaid);
		 
		 r.demo();
	 }
}