import java.lang.Math;
import java.util.Scanner;

public class Robot{
	double xin;
	double xnew;
	double yin;
	double ynew;
	double theta;
	double rads;
	double d;
	Scanner sc = new Scanner(System.in);
	public void computeLocation( ) {
		System.out.print("Input the initial X coordinate of the robot in centimeters... ");
		xin = sc.nextInt();
		System.out.print("Input the initial Y coordinate of the robot in centimeters... ");
		yin = sc.nextInt();
		System.out.print("Input the orientation of the robot in degrees... ");
		theta = sc.nextInt();
		System.out.print("Input the distance for the robot to travel in centimeters... ");
		d = sc.nextInt();
		
		rads = theta * (Math.PI/180);
		xnew = xin + d*Math.cos(rads);
		ynew = yin + d*Math.sin(rads);
		
		System.out.print("The new coordinates of the robot are ("+xnew+","+ynew+")");
	}
}