import java.util.Scanner;

/**
 * 
 * @作者
 * @author admin
 *
 */


public class HelloWorld {

	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		double r=input.nextDouble();
		System.out.println("Hello World");
		String b=input.next();
		char c=input.next().charAt(0);
		
		//判断是否是大写字母
		if(c>='A'&&c<='Z') {
			System.out.println("OK");
			System.out.println(r);
		}
		else {
			System.out.print(b);
		}
		input.close();
		
		switch(c) {
		case 'A':
			System.out.print(b);
			break;
		case 'B':
			System.out.print(c);
			break;
		default:
			System.out.print(r);
		}
		
		int i=0;
		while(i<10) {
			i++;
			//随机数a-b：
			//(int)(Math.random()*100000)%(b-a+1)+a
			int w=(int)(Math.random()*10000)%10+5;
			Thread.sleep(1000);
			Thread.sleep(1000);
			System.out.print(w);
		}
		
		do {
			i++;
			String ans="Y";
			String str=String.format("%d%s",123,"abc");
			"Y".equalsIgnoreCase(ans);
		}while(i<10);
	}
}