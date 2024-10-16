package test;

public class P4 {
//	public static int fun(int a, int b) {
//		if(b>a && a>3) {
//			a=(b+1)+a;
//			b=1+3+a;
//			return a-fun(b,b);
//		}
//		return b-1;
//		}
//	public static int fun(int a, int b) {
//		if(b<7 && (a-b)<(b&a)) {
//			b=2+2+a;
//			a=1+1+a;
//			b=2+b+b;
//			return b+fun(b,a)-a+2;
//		}
//		return a+1;
//		}
//	public static int fun(int a, int b) {
//		if((a-4)<(b&5) && (7+b)<(b^a)) {
//			b=a+2;
//			b=3+1+b;
//			b=3+1+a;
//			return fun(a,b)-b+fun(a+b,b);
//		}
//		return b+1;
//		}
	public static int fun(int a, int b) {
		if((b-a)>(a-b)&&(4&a)>(a-4)) {
			a=b+3;
			b=2+1+a;
			b=2+a+b;
			return fun(a,a)+b;
		}
		return a+b;
		}
	public static void main(String[] args) {
//		System.out.println(fun(3,4));
		
//		int p=9,q=5,r=8;
//		p=p+r;
//		for(r=2; r<=3; r++) {
//			if((p-q+r)<(r+p)) {
//				if((r^p)<q && (q&3)<p) {
//					p=r^p;
//				}
//			}
//		}
//		System.out.println(p+q+r);
		
//		int p=2,q=4,r=5;
//		for(r=5; r<=7; r++) {
//			if((r+p)<p || p<r) {
//				if((r-p-q)<(q-r)) {
//					p=(r+p)+p;
//					continue;
//				}
//				else {
//					p=p+p;
//					continue;
//				}
//			}
//		}
//		System.out.println(p+q+r);
		
//		int p=9, q=5, r=5;
//		p = (r&q)&q;
//		r = (r&r)&r;
//		r = (q+5)+q;
//		System.out.println(p+q+r);
		
		
//		int a=3, b=5, c=4;
//		c = (5^2)+a;
//		for(c=3 ; c<=5 ; c++) {
//			b = (a+9)&c;
//			a=3&a;
//			b=(c^b)+c;
//			a=(5+8)&a;
//		}
//		System.out.println(a+b);
		
//		int a=3,b=4,c=10;
//		c=1+b;
//		if((a+b+c)<(c+1)) {
//			if((a+b+c)<(c+a))
//				a=(c+7)+a;
//			else
//				b=(a+5)+c;
//			a=4+b;
//		}
//		else {
//			c=2+b;
//		}
//		System.out.println(a+b+c);
		
//		int a=7, b=3, c=4;
//		b = (a+a)+a;
//		for(c=5 ; c<=7 ; c++) {
//			
//			a=11^b;
//		}
//		a=(c&1)&b;
//		System.out.println(a+b);
		
//		int a=6, b=2, c=9;
//		a = a+b;
//		for(c=4 ; c<=6 ; c++) {
//			a=3+c;
//		}
//		System.out.println(a+b);
		
		
		
//		int p=2,q=3,r=9;
//		q=r+q;
//		if((p^q^r)<(q+r&p)) {
//			p=2&r;
//		}
//		else {
//			if(8<r)
//				r=(4^1)+q;
//			else
//				r=(p+10)&r;
//			
//		}
		
		int a=2,b=4,c=7;
		b=7+a;
		if(c>b)
			b=b+b;
		b=6+a;
		if((a+b)<(b-a)||c<a)
			b=(c+4)+c;
		else
			a=c+b;
		c=(c+9)^a;
		System.out.println(a+b+c);
	}
}
