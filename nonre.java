import java.io.*;
import java.util.*;
public class nonre{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
int i,j,count=0;
String h=new String();
for(i=0;i<a.length();i++)
{
    count=0;
    for(j=0;j<a.length();j++)
    {
        if(a.charAt(i)==a.charAt(j))
        count++;
    }
    if(count==1)
    h=h+String.valueOf(a.charAt(i));
}
System.out.print(h);
}}
