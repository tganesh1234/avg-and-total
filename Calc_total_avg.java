package gani.assignments;

import java.util.Scanner;

public class Calc_total_avg {

	public static void main(String[] args) {
		// calc total and avg marks of n students
		int n=5;
		Scanner sc=new Scanner(System.in);
		double[] a=new double[3];
		double[] b=new double[3];
		double[] c=new double[3];
		double[] d=new double[3];
		double[] e=new double[3];
		System.out.print("enter first student marks :");
		for (int i=0;i<3;i++) {
			a[i]=sc.nextDouble();
		}
		System.out.print("enter second student marks :");
		for (int i=0;i<3;i++) {
			b[i]=sc.nextDouble();
		}
		System.out.print("enter third student marks :");
		for (int i=0;i<3;i++) {
			c[i]=sc.nextDouble();
		}
		System.out.print("enter fourth student marks :");
		for (int i=0;i<3;i++) {
			d[i]=sc.nextDouble();
		}
		System.out.print("enter fifth student marks :");
		for (int i=0;i<3;i++) {
			e[i]=sc.nextDouble();
		}
		double sum=0;
		double sum1=0;
		double sum2=0;
		double sum3=0;
		double sum4=0;
		for (int i=0;i<3;i++) {
			sum+=a[i];
		}
		System.out.println("------------------------------");
		System.out.println("first student total is :"+sum);
		System.out.println("first student avg is :"+sum/3);
		System.out.println("------------------------------");
		for (int i=0;i<3;i++) {
			sum1+=b[i];
		}
		System.out.println("second student total :"+sum);
		System.out.println("second student avg is :"+sum/3);
		System.out.println("------------------------------");
		for (int i=0;i<3;i++) {
			sum2+=c[i];
		}
		System.out.println("third student total :"+sum);
		System.out.println("third student avg is :"+sum/3);
		System.out.println("------------------------------");
		for (int i=0;i<3;i++) {
			sum3+=d[i];
		}
		System.out.println("fourth student total :"+sum);
		System.out.println("fourth student avg is :"+sum/3);
		System.out.println("------------------------------");
		for (int i=0;i<3;i++) {
			sum4+=e[i];
		}
		System.out.println("fifth student total :"+sum);
		System.out.println("fifth student avg is :"+sum/3);
		sc.close();

	}

}
