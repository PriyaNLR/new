import java.io.*;
import java.util.*;
public class freq{
    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
       String a=s.nextLine();
        String[] d=a.split(" ");
        Integer b[]=new Integer[d.length];
        for(int i=0;i<d.length;i++)
        {
            a=d[i];
            b[i]=Integer.parseInt(a);
        }
        List<Integer> c=Arrays.asList(b);
        int m;
        for(int i=0;i<c.size();i++)
        {
            int e=c.get(i);
           m=Collections.frequency(c,e);
          System.out.println(e+"-"+m);
        }
    }
}
