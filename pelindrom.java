import java.util.*;
class pelindrom
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the No : ");
		
		int no=sc.nextInt();
		int no1=no;
		int reminder,temp=0;
		
		while(no!=0)
		{
			reminder=no%10;
			temp=temp*10+reminder;
			no=no/10;
		}
		System.out.println("Reverse Number is : " + temp);
		
		if(no1==temp)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not Palindrome Number");
		}
	}
}