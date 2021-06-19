import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ordering_Team
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int h=1;h<=t;h++)
		{
		    int f=0;
		    int l1[]=new int[3];
		    int l2[]=new int[3];
		    int l3[]=new int[3];
		    
		    for(int i=0;i<3;i++)
		     l1[i]=sc.nextInt();
		    
		    for(int i=0;i<3;i++)
		     l2[i]=sc.nextInt();
		     
		    for(int i=0;i<3;i++)
		     l3[i]=sc.nextInt();
		
		if(((l1[0]<l2[0])||(l1[1]<l2[1])||(l1[2]<l2[2]))&&((l1[0]<=l2[0])&&(l1[1]<=l2[1])&&(l1[2]<=l2[2])))
        
        if(((l2[0]<l3[0])||(l2[1]<l3[1])||(l2[2]<l3[2]))&&((l2[0]<=l3[0]) &&(l2[1]<=l3[1]) && (l2[2]<=l3[2])))
            f=1;
    
    if(((l3[0]<l2[0]) ||(l3[1]<l2[1]) || (l3[2]<l2[2]))&&((l3[0]<=l2[0]) && (l3[1]<=l2[1]) && (l3[2]<=l2[2])))
        
        if(((l2[0]<l1[0]) || (l2[1]<l1[1]) || (l2[2]<l1[2]))&&((l2[0]<=l1[0]) && (l2[1]<=l1[1]) && (l2[2]<=l1[2])))
            f=1; 
            
    if(((l2[0]<l1[0]) || (l2[1]<l1[1]) || (l2[2]<l1[2]))&&((l2[0]<=l1[0]) &&(l2[1]<=l1[1]) && (l2[2]<=l1[2])))
        
        if(((l1[0]<l3[0]) || (l1[1]<l3[1]) || (l1[2]<l3[2]))&&((l1[0]<=l3[0]) && (l1[1]<=l3[1]) && (l1[2]<=l3[2])))
            f=1;
    
    if(((l2[0]<l3[0])||(l2[1]<l3[1])||(l2[2]<l3[2]))&&((l2[0]<=l3[0]) && (l2[1]<=l3[1]) && (l2[2]<=l3[2])))
        
        if(((l3[0]<l1[0]) || (l3[1]<l1[1])|| (l3[2]<l1[2]))&&((l3[0]<=l1[0]) && (l3[1]<=l1[1]) && (l3[2]<=l1[2])))
            f=1;
            
    if(((l1[0]<l3[0]) || (l1[1]<l3[1]) || (l1[2]<l3[2]))&&((l1[0]<=l3[0]) && (l1[1]<=l3[1]) && (l1[2]<=l3[2])))
        
        if(((l3[0]<l2[0]) || (l3[1]<l2[1]) || (l3[2]<l2[2]))&&((l3[0]<=l2[0])&&(l3[1]<=l2[1])&&(l3[2]<=l2[2])))
            f=1;
    
    if(((l3[0]<l1[0]) || (l3[1]<l1[1]) || (l3[2]<l1[2]))&&((l3[0]<=l1[0])&& (l3[1]<=l1[1]) && (l3[2]<=l1[2])))
        
        if(((l1[0]<l2[0]) || (l1[1]<l2[1]) || (l1[2]<l2[2]))&&((l1[0]<=l2[0]) &&(l1[1]<=l2[1]) && (l1[2]<=l2[2])))
            f=1;
            
    if(f==1)
    System.out.println("yes");
    else
    System.out.println("no");
            
		}
		sc.close();
	}
}