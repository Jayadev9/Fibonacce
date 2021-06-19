import java.util.*;

public class Temple_Land
{
  public static void main (String[] args)
  {
	  Scanner scn = new Scanner(System.in);
		int s = scn.nextInt();
		
		while(s>0){
		    int n = scn.nextInt();
		    
		        int a[] = new int[n];
		        for(int i=0;i<n;i++){
		            a[i] = scn.nextInt();
		        }
		        int count = 0;
		        int total = 0;
		       for(int i=0;i<n/2;i++){
		           if(a[i+1]-a[i]==1 && a[0]==1){
		               count++;
		           }
		       }
		    
		    for(int i=n/2;i<n-1;i++){
		           if(a[i]-a[i+1]==1){
		              total++;
		           }
		       }
		       
		       if(count == n/2 && total == n/2){
		           System.out.println("yes");
		       }
		       else{
		            System.out.println("no");
		       }
		    s--;
	  }
		scn.close();
  }

}