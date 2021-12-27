import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example2 {
	
	
	
	public static void main(String args[]) {
		List<Integer> list1=new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		
		List<Integer> result=new ArrayList<>();
		list1=Arrays.asList(1,4,5,7,8,11);
		list2= Arrays.asList(2,4,6,8,12);
	     result=merge(list1,list2);
	     System.out.println(result);
		
	}
	
	static List<Integer> merge( List<Integer> l1, List<Integer> l2){
		
		List<Integer> list= new ArrayList<>();
		int i=0,j=0;
		while(i<l1.size() || j<l2.size()) {
			if(i==l1.size()) {
				list.add(l2.get(j));
				j++;
				continue;
			}
			
			if(j==l2.size()) {
				list.add(l1.get(i));
				i++;
				continue;
			}
			
			if(l1.get(i)<l2.get(j)) {
				list.add(l1.get(i) );
				
				i++;
			}
			
			else if(l1.get(i)>l2.get(j)) {
				list.add(l2.get(j));
				
					j++;
			}
			
			else {
				list.add(l2.get(j));
				list.add(l2.get(j));
					j++;
					i++;
			}
		}
		return list;
	}
	
}
