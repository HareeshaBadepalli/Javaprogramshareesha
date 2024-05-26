import java.util.*;
public class convertingstringtounicode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1="Hello world";
		System.out.println(s1);
		char []ch=s1.toCharArray();
		for(int i:ch)
		{
			System.out.print(i+" ");
		}
	}

}
