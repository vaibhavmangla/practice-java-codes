import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char arr[]=s.toCharArray();
        int value[]=new int[arr.length];
        int ans=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]=='I')
            value[i]=1;
            else if(arr[i]=='V')
            value[i]=5;
            else if(arr[i]=='X')
            value[i]=10;
            else if(arr[i]=='L')
            value[i]=50;
            else if(arr[i]=='C')
            value[i]=100;
            else if(arr[i]=='D')
            value[i]=500;
            else
            value[i]=1000;
        }
        int i=0;
        for(i=arr.length-1;i>0;i=i-2)
        {
            //System.out.print(arr[i]+""+value[i]+" ");
            if(value[i]>=value[i-1])
            {
                ans=ans+value[i]-value[i-1];
            }
            else
            ans=ans+value[i]+value[i-1];
        }
       if(i==0)
        ans+=value[0];
        System.out.print(ans);
	    
	}
}