/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;

//import java.time.LocalDate;
import java.util.*;
import java.time.temporal.ChronoUnit;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);

	    SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
	     String first=sc.next();
	    int f=sc.nextInt();
	    String second=sc.next();
	    int s=sc.nextInt();
	    Dictionary geek = new Hashtable();

        // put() method
        geek.put(first,f);
        geek.put(second,s);
try
{	    Date d1 = formatter.parse(first);
			Date d2 = formatter.parse(second);

					long diff = d2.getTime() - d1.getTime();
			long diffDays = diff / (24 * 60 * 60 * 1000);

		System.out.println("total days: "+diffDays);
		int arr[]=new int[5];
		int count=0;

// 	        Enumeration enu = geek.elements();
// while (enu.hasMoreElements()) {
//             System.out.println(enu.nextElement());
//         }

		 for (Enumeration i = geek.elements(); i.hasMoreElements();)
        {
          arr[count]=(Integer)i.nextElement();
          count++;
        }


        int dif=arr[--count]-arr[0];
        int e=arr[0];

        System.out.println("difference in values: "+dif);
        int div=dif/(int)diffDays;
        System.out.println("value to increment: "+div);




         Calendar c = Calendar.getInstance();
        c.setTime(d1);
        System.out.print("{");
        for(int i=1;i<=diffDays;i++){
        c.add(Calendar.DAY_OF_MONTH, 1);

         Date currentDatePlusOne = c.getTime();
e+=div;
        System.out.print(formatter.format(currentDatePlusOne)+":"+e);
        if(i!=diffDays)
        System.out.print(",");
        }
        System.out.print("}");





    // for (Enumeration k = geek.keys(); k.hasMoreElements();)
    //     {
    //         String t=(String)k.nextElement();
    //         System.out.println(t +":"+geek.get(t));
    //     }
        //  for (Enumeration i = geek.elements(); i.hasMoreElements();)
        // {
        //     System.out.println("Value in Dictionary : " + i.nextElement());
        // }
//       for (String key : geek.keySet()) {
//     System.out.println(key + ":" + geek.get(key));
// }
}
 catch (Exception e) {
			e.printStackTrace();
		}
}
}

