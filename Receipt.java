import java.util.*;


public class Receipt {
  String productname;
  String productid;
  long  transid;
  double productprice;
   int no_of_productsold;
   float moneypaid;
 float subtotal,salestax,total,balance;
 
 public Receipt(String productname, String productid,long transid, double productprice,
		 int no_of_productsold,float moneypaid)
 {
 this.productname=productname;
 this.productid=productid;
 this.transid=transid;
 this.productprice=productprice;
 this.no_of_productsold=no_of_productsold;
 this.moneypaid=moneypaid;
 }
 
 
 public void demo()
 {
	
	 Scanner scan=new Scanner(System.in);
	 System.out.println( productname+": "+no_of_productsold  );
	 System.out.println(   "Unit Price:"  +productprice   );
	   subtotal=(float)(productprice*no_of_productsold);
	 System.out.println("Subtotal:"  +subtotal  );
	 salestax=(float)(subtotal*8.25/100);
	 System.out.print("Tax(8.25%):");
	 System.out.printf("%.1f",+ salestax);
	 total=subtotal+salestax;
	 System.out.println();
	 System.out.print(  "Total:");
	System.out.printf("%.1f", +total);
	System.out.println();
	 System.out.println("------------------------------------------------------------");
	 System.out.println("Cash:" +moneypaid );
	 balance=moneypaid-total;
	 System.out.print( "Change:");
	 System.out.printf("%.1f",+balance);
	 }
}
 
 