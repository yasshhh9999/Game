package cam;
import java.util.*;
public class pro1 {
	public void log(int p[],int g1[],int g2[],int b,String a1,String a2)
	{
		int p1=0;
		int p2=0;
		for(int i=0;i<b;i++)
		{
			System.out.print(i+" rond won by");
			if(p[i]==g1[i])
			{
				System.out.println(a1+" worn the game");
				p1++;
			}
			else if(p[i]==g2[i])
			{
				System.out.println(a2+" worn the game");
				p2++;
			}
			else if(p[i]==g1[i]&& p[i]==g2[i])
			{
				System.out.println("its a draw");
				
			}
			else {
				System.out.println("continue");
			}
			
		}
		if(p1==p2)
		{
			System.out.println("Draw");
		}
		else if(p1>p2)
		{
			System.out.println(a1+"won");
		}
		else {
			System.out.println(a2+"won");
		}
		
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	Scanner s1=new Scanner(System.in);
	Scanner s2=new Scanner(System.in);
	Scanner s3=new Scanner(System.in);
	Scanner s4=new Scanner(System.in);
	System.out.println("Enter the number of rounds");
	int b=s.nextInt();
	System.out.println("p enter your name");
	String a=s3.nextLine();
	System.out.println("G1 enter your name");
	String a1=s1.nextLine();
	System.out.println("G2 enter your name");
	String a2=s2.nextLine();
	int p[]=new int[b];
	int g1[]=new int[b];
	int g2[]=new int[b];
	for(int i=0;i<b;i++)
	{
		System.out.println(a+" gess your num");
		p[i]=s4.nextInt();
		System.out.println(a1+" gess your num");
		g1[i]=s4.nextInt();
		System.out.println(a2+" gess your num");
		g2[i]=s4.nextInt();
	}
	pro1 pem=new pro1();
	pem.log(p,g1,g2,b,a1,a2);
	
	
}
}
