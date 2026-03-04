import java.util.Arrays;
import java.util.Scanner;
class StringSort{
	public static void main(String[] args)
	{
		int count=0;
		String tmp;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no.of String");
		count=s.nextInt();
		String strlist[] = new String [count];
		Scanner s1 = new Scanner (System.in);
		System.out.println("Enter your String:");
		for(int i=0;i<count;i++)
			strlist[i]=s1.nextLine();
			System.out.println("choose1 or 2 from menu below:");
			System.out.println("1:in-built sort");
			System.out.println("2:user defined sort");
			int choice;
			choice= s.nextInt();
			switch(choice)
			{
			  case 1:Arrays.sort(strlist);
			  System.out.println(Arrays.toString(strlist));
			  break;
			  case 2: for(int i=0;i<count;i++)
			                  for(int j=i+1;j<strlist.length;j++)
			                    if(strlist[i].compareTo(strlist[j])>0){
			                      tmp=strlist[i];
			                      strlist[i]=strlist[j];
			                      strlist[j]=tmp;
			                    }
			              System.out.println(Arrays.toString(strlist));
			              break;
		 }
	}
}		
