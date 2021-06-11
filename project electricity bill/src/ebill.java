import java.util.*;
import java.io.*;
public class ebill {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Select Type\n1.Domestic\n2.commercial");
int type=sc.nextInt();
float units=sc.nextFloat();
double billpay=0;	
if(type==1) {
 if(units<50)
 {
 billpay=units*2.3;
 }
else if(units<100)
 {
 billpay=50*2.3+(units-50)*4.2;
 }
else if(units>100)
{
billpay=50*2.3+100*4.2+(units-100)*5.5;
}}
if(type==2) {
	 if(units<50)
	 {
	 billpay=units*5.2;
	 }
	else if(units<100)
	 {
	 billpay=50*5.2+(units-50)*6.8;
	 }
	else if(units>100)
	{
	billpay=50*5.2+100*6.8+(units-100)*3;
	}}

	}
}
