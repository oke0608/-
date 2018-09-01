package abc1;
import java.util.Scanner;

class test{
	int a,b;
	String c;
	public void test1(int a, int b,String c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void test2() {
		for(int e=0;e<this.b;e++)
			System.out.print(this.c);
		System.out.print("\n");
		for(int e=0;e<this.a-2;e++)
		{
			System.out.print(this.c);
			for(int f=0;f<this.b*(this.c.length())-2*this.c.length();f++)
				System.out.print(" ");
			System.out.print(this.c+"\n");
		}
		for(int e=0;e<this.b;e++)
			System.out.print(this.c);
		}
	}
	public class abc1a {
	
		public static void main(String[] args) {
			Scanner aa=new Scanner(System.in);
			int a=aa.nextInt();
			Scanner bb=new Scanner(System.in);
			int b=bb.nextInt();
			String c=new String();
			Scanner cc=new Scanner(System.in);
			c=cc.nextLine();
			test t=new test();
			t.test1(a,b,c);
			t.test2();
			aa.close();
			bb.close();
			cc.close();
}}