package Trashs;

public class trash {

	public static void main(String[] args) {

		double a = 31.235;
		int b;
		b = (int)a;
		System.out.println(b);
		
		float c = 1.2456f;
		double d = 2.546;
		System.out.println(c);
		System.out.println(d);
		
		long e = 1245697451475l;
		System.out.println(e);
		
		int f=5;
		int g=2;
		float i;
		i=f/g;

		int K=50;
		int l=50;
		int m=40;
		int n=40; 
		K++;      //k=k+1; for post increment
		System.out.println(K);
		++l;      //first it will do k+1 and then it will store into k the k=k+1
		System.out.println(l);
		m--;      //same as K just decrement
		System.out.println(m); 
		--n;     //same as l just decrement
		System.out.println(n);

		int o=10;
		int p;  // here first we assign the value and then increment O=10 becomes 0=11
		p=o++;  // first it will asign the value to the p and then it will increment o++ and stored it in o
		System.out.println(o); // output is 11 because it is incremented and stored in o
		System.out.println(p);// output is 10 because it is asigned 

		int q=20;
		int r;  // here first value will increment q=20 becomes q=21 and then assign to r
		r=++q;  // first it will increment the value to q and then it becomes q++ then value of q changes to 20 --> 21 and and same value goes to r
		System.out.println(q);// output is 21 because it is incremented and stored in q
		System.out.println(r);// output is 21 because it is after before it is incremented and asigned to r

		int s=30;
		int t; // here first we assign the value and then decrement s=30 becomes s=29
		t=s--; // first it will asign the value to the t and then it will decrement s-- and stored it in s
		System.out.println(s);// output is 29 because it is decremented and stored in ss
		System.out.println(t);// output is 30 because it is asigned 

		int u=40;
		int v;// here first value will decrement u=20 becomes u=21 and then assign to v
		v=--u;// first it will decrement the value to u and then it becomes u-- then value of q changes to 40 --> 39 and same value goes to v
		System.out.println(u);// output is 39 because it is decremented and stored in u
		System.out.println(v);// output is 39 because it is after before it is decremented and asigned to it

		Character j = new Character('x'); // we can write like this also as a wrapper class
		System.out.println(j);
		System.out.println(i);

		int w=10;
		int x;
		// x=w++ + w++;                 // 12 , 21
		// x=++w + ++w;                 // 12 , 23
		// x = ++w + w++ + ++w;         // 13 , 35
        // x = w++ + ++w + w++;         // 13 , 34
		// x = w++ + w++ + ++w + w--;   // 12 , 47
		 x = --w + w++ + --w + ++w;     // 10 , 37
		System.out.println(w);
		System.out.println(x);
	
	}

}
