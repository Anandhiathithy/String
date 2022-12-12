
import java.util.Scanner;

public class Billingsystem {
	public static void main(String args[]) {
		
double vanilaicecream,strawberryicecream,chocolateicecream,orangejuice,totalamount;
double vanilaicecreamprice=0,strawberryicecreamprice=0,chocolateicecreamprice=0,orangejuiceprice=0;
Scanner sc=new  Scanner(System.in);
System.out.println("ENTER THE MENU ID"+"\nchoose 1 for vanilaicecream "+
                                      "\nchoose 2 for strawberryicecream"+
		                              "\nchoose 3 for chocolateicecream"+
                                      "\nchoose 4 for orangejuice "+
		                              "\nchoose 5 for totalamount");

int n=0;
while(n!=5)
{
	System.out.println("Enter menu id");
	n=sc.nextInt();
	switch(n) {
	case 1:
		System.out.println("Enter the icecream:");
	vanilaicecream=sc.nextDouble();
	vanilaicecreamprice+=vanilaicecream*80;
	break;
	case 2:
		System.out.println("Enter the icecream:");
	strawberryicecream=sc.nextDouble();
	strawberryicecreamprice=strawberryicecreamprice+strawberryicecream*90;
	break;
	case 3:
		System.out.println("Enter the icecream:");
	chocolateicecream=sc.nextDouble();
	chocolateicecreamprice+=chocolateicecream*100;
	break;
	case 4:
		System.out.println("Enter the icecream:");
		orangejuice=sc.nextDouble();
		orangejuice+=orangejuice*40;
	break;
	case 5:
		System.out.println("-------------My Dream ice Cream-----------------");
		System.out.println("                take yourBill                   ");
		System.out.println("             date 12-12-2022                    ");
		System.out.println("                                                ");
		if(vanilaicecreamprice >0)
			System.out.println(vanilaicecreamprice/80+"----vanilaicecream----Rs."+vanilaicecreamprice );	
	   if(strawberryicecreamprice >0)
		System.out.println(strawberryicecreamprice/90+"----strawberryicecream----Rs."+strawberryicecreamprice );
	   if(chocolateicecreamprice >0)
			System.out.println(chocolateicecreamprice/100+"---chocolateicecream----Rs."+chocolateicecreamprice );
	   if(orangejuiceprice >0)
			System.out.println(orangejuiceprice/40+"---orangejuice----Rs."+orangejuiceprice );
	   totalamount=vanilaicecreamprice+strawberryicecreamprice+chocolateicecreamprice+orangejuiceprice;
	   System.out.println(    "Total bilol amount :"+totalamount );
	   System.out.println("-Have a nice day please come again!!-");
	   System.out.println("**************************************");
	   break;
	   default:
	   System.out.println("invalid input");
	   
	   
	}
	}
		
}
}

