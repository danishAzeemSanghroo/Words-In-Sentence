import java.util.*;
class ExtractWord{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
	System.out.print("Enter the sentence: ");
		String s=ob.nextLine();
		s=s.trim();
		s=s+" ";
		String str= "";
		int c=0;
		for(int i=0;i<s.length();i++)
		{
		
		char ch=s.charAt(i);
		str=str+ch;
			if(ch==' ')
			{
			c++;
			System.out.println(str);
			str="";
			}
		}
		System.out.println("No: of words in sentence= "+c);
	}
}