package project_7;

 import java.util.Scanner;

 public class Triagolnik {

	public static void main(String[] args) {
		double a,b,c;
		
		Scanner tastatura= new Scanner(System.in);
		System.out.println("Vnesete gi stranite na triagolnikot:");
		a = tastatura.nextDouble();
		System.out.println("Vnesi ja prvata strana:");
		b = tastatura.nextDouble();
		System.out.println("Vnesi ja vtorata strana:");
		c = tastatura.nextDouble();
		System.out.println("Vnesi ja tretata strana:");
		
	    if(a+b>c && a+c>b && b+c>a) {
		System.out.println("So dadenite strani se formira triagolnik:");
	    }
		else {
		System.out.println("Ne se formira triagolnik:");
		System.exit(0);
	    }
		if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a) {
        System.out.println("Triagolnikot e pravoagolen:");
        }
        else if(a*a+b*b<c*c || a*a+c*c<b*b || b*b+c*c<a*a) {
        System.out.println("Triagolnikot e topoagolen:");
        }
        else {
        System.out.println("Triagolnikot e ostroagolen");
        }
	}

}
