package abc1;
import java.util.Scanner;
public class abc1b {

	public static void main(String[] args) {
		Scanner bb=new Scanner(System.in);
		String b=bb.nextLine();
		Scanner aa=new Scanner(System.in);
		int c=50;
		while(aa.hasNextInt())
		{	int a=aa.nextInt();
			if(a>=c)
			System.out.println(b+"! 잘했어요~~");
		else
			System.out.println(b+"! 못했어요~~");}
		aa.close();
		bb.close();
	}
}
