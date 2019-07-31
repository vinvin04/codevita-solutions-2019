import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class cb
{
    public static void main (String[] args) throws Exception
    {
        try
        {
            FastReader sc=new FastReader();
            StringBuffer buf=new StringBuffer();
            int n=sc.nextInt();
            String s=sc.next();
            int q=sc.nextInt();
            int a[]=new int[q];
            int b[]=new int[q];
            for(int k=0;k<q;k++)
            {
                a[k]=sc.nextInt();
                b[k]=a[k];
            }
            Arrays.sort(a);
            int ct[]=new int[26];
            HashMap<Integer,Integer> h=new HashMap<>();
            int t=a[0];
            int c=s.charAt(t-1)-'a';
            int ans=0;
            for(int i=0;i<t-1;i++)
            {
                int p=s.charAt(i)-'a';
                ct[p]=ct[p]+1;
            }
            h.put(t,ct[c]);
            for(int k=1;k<q;k++)
            {
                t=a[k];
                c=s.charAt(t-1)-'a';
                for(int i=a[k-1]-1;i<t-1;i++)
                {
                    int p=s.charAt(i)-'a';
                    ct[p]=ct[p]+1;
                }
                h.put(t,ct[c]);
            }
            
            for(int i=0;i<q;i++)
            {
                buf.append(h.get(b[i])+"\n");
            }
            
            
            System.out.print(buf);
            
                buf.append(ans+"\n");
            
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
