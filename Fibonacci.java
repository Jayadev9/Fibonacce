import java.util.*;
//create a class name called Fibonacci
public class Fibonacci {
	//The main method is not catching the any exception instead it handles the IOException by throwing it to source
	public static void main(String[] args) throws java.lang.Exception{
		//Scanner class is used to insert the user input
		Scanner sc=new Scanner(System.in);
		//The user input of of T is integer value
		int T=sc.nextInt();
		sc.nextLine();
		//Decrement the T value by one in every loop
		while(T -->0) {
			String str=sc.nextLine();
			char array[]=str.toCharArray();
			HashMap<Character,Integer> map=new HashMap<Character,Integer>();
			for(char val:array) {
				if(map.containsKey(val)) {
					map.put(val, map.get(val)+1);
				}else {
					map.put(val, 1);
				}
			}
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(char val:map.keySet()) {
				list.add(map.get(val));
			}
			boolean fib=true;
			if(list.size()<3) {
				fib=true;
			}else {
				Collections.sort(list);
				for(int i=2;i<list.size();i++) {
					if(list.get(i) != list.get(i-1)+list.get(i-2)) {
						fib=false;
						break;
					}
				}
				if(!fib) {
					fib=true;
					int temp=list.get(0);
					list.set(0, list.get(1));
					list.set(1, temp);
					for(int j=2;j<list.size();j++) {
						if(list.get(j)!=list.get(j-1)+list.get(j-2)) {
							fib=false;
							break;
						}
					}
				}
			}
			if(fib) {
				System.out.println("Dynamic");
			}else {
				System.out.println("Not");
			}
		}
		sc.close();
	}
}
