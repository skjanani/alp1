package janani;
import java.util.Scanner;
public class Alp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,a=0,b=1,sum=0,l;
String str;
System.out.println("enter the string");
Scanner ja=new Scanner(System.in);
str=ja.next();
char []str1=str.toCharArray();
l=str1.length;
for(i=0;i<l;i++){
	if(str1[i]>65 && str1[i]<122){
		a=1;
	}
	if(str1[i]>48 && str1[i]<57){
		b=1;
	}
	sum=a+b;
}
if(sum==2){
	System.out.println("yes");
}
else{
	System.out.println("no");
}
	}

}
