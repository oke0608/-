package abc1;
import java.util.Scanner;
class run{
	int a,b;
	String c,d;
	public void run1(int a, int b,String c,String d) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;}
	public void run2(){
		for(int c=0;c<this.a;c++)
			System.out.println(this.c);
		for(int c=0;c<this.b;c++)
			System.out.println(this.d);
	}
	public void run3() {
		for(int c=0;c<a+b;c++)
		{if(c%2==0)
			System.out.println(this.c);
		else
			System.out.println(this.d);}
	}
	public void run4() {
		
	}
}
public class abc1d {

	public static void main(String[] args) {
		Scanner aa=new Scanner(System.in);
		int a=aa.nextInt();
		Scanner bb=new Scanner(System.in);
		int b=bb.nextInt();
		Scanner cc=new Scanner(System.in);
		String c=cc.nextLine();
		Scanner dd=new Scanner(System.in);
		String d=dd.nextLine();
		run abc=new run();
		abc.run1(a,b,c,d);
		abc.run2();
		abc.run3();
		aa.close();
		bb.close();
		cc.close();
		dd.close();
	}

}
