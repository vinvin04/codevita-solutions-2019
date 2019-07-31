

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class cd
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            FastReader sc=new FastReader();
            StringBuffer buf=new StringBuffer();
            int n=sc.nextInt();
            int x=10;
            int k=n*(n+1);
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<i;j++)
                {
                    buf.append("**");
                }
                for(int j=0;j<n-i;j++)
                {
                    buf.append(x);
                    x=x+10;
                }
                int a[]=new int[n-i];
                for(int j=0;j<n-i;j++)
                {
                    a[j]=k;
                    k--;
                }
                buf.append(a[n-i-1]);
                for(int j=n-i-2;j>=0;j--)
                {
                    buf.append("0"+a[j]);
                }
                buf.append("\n");
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
