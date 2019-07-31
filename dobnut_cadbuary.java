

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class cc
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            FastReader sc=new FastReader();
            int minl=sc.nextInt();
            int maxl=sc.nextInt();
            int minw=sc.nextInt();
            int maxw=sc.nextInt();
            int a=0;
            for(int l=minl;l<=maxl;l++)
            {
                for(int w=minw;w<=maxw;w++)
                {
                    int i=l,j=w;
                    while(1==1)
                    {
                        if(i==j)
                        {
                            a++;
                            break;
                        }
                        if(i<j)
                        {
                            j=j-i;
                            a++;
                        }
                        else
                        {
                            i=i-j;;
                            a++;
                        }
                    }
                }
            }
            System.out.print(a);
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
