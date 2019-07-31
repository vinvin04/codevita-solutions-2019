/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ca
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            FastReader sc=new FastReader();
            StringBuffer buf=new StringBuffer();
            int n=sc.nextInt();//no of bottles
            int a[]=new int[n+1];//diameter of bottles
            int c[]=new int[n+1];//to count how many balls
            //to read input
            for(int i=1;i<=n;i++)
            {
                a[i]=sc.nextInt();
            }
            int m=sc.nextInt();
            for(int k=0;k<m;k++)
            {
                int d=sc.nextInt();//diameter of ball
                int f=0;//flag
                for(int i=n;i>0;i--)
                {
                    if(d<=a[i])
                    {
                        if(c[i]<i)
                        {
                            buf.append(i+" ");
                            c[i]=c[i]+1;
                            f=1;
                            break;
                        }
                    }
                }
                if(f==0)
                {
                    buf.append(0+" ");
                }
            }
            System.out.print(buf);
            
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
        
    }
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt()
        {
            return Integer.parseInt(next());
        }
        long nextLong()
        {
            return Long.parseLong(next());
        }
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
