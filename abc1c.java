package abc1;
import java.util.Scanner;
class q{
	public void q1(String a,int aa,String b,int bb) {
		
		if(aa>bb)
			System.out.println(a+"�� "+(aa-bb)+"�� �̰���ϴ�.");
		else if(aa==bb)
			System.out.println("�����Դϴ�.");
		else
			System.out.println(b+"�� "+(bb-aa)+"�� �̰���ϴ�.");
	}
}
public class abc1c{
	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		String s1a=s1.nextLine();
		Scanner s2=new Scanner(System.in);
		int s2a=s2.nextInt();
		Scanner s3=new Scanner(System.in);
		String s3a=s3.nextLine();
		Scanner s4=new Scanner(System.in);
		int s4a=s4.nextInt();
		
		q qq=new q();
		qq.q1(s1a,s2a,s3a,s4a);
		
		s1.close();
		s2.close();
		s3.close();
		s4.close();
	}

}
