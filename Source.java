import java.util.*;

public class Source {
    public static void main(String []args) {
    	int num=13,div=4;
       int mod= findModulus(num,div);
       System.out.println("modulus= "+mod);
       
       findPerfectSquares(-1,200);
  
    }

	private static int findModulus(int num, int div) {
		int product=Integer.MIN_VALUE;
		int i=1;
		
		if(num<0) {
			num= Math.abs(num);
		}
		
		if(div<0) {
			div=Math.abs(div);
		}
		
		if(num==0) {
			return 0;
		}
		
		if(div==0) {
			throw new IllegalArgumentException("div is 0");
		}
		while(product<=num) {
			product= div * i;
			i++;
		}
		
		//System.out.println(product);
		return num-product+ div;
	}
    
    private static void findPerfectSquares1(int left, int right) {
    	int root=0;
    	
    	if(left<0) {
    		System.out.print(0+" ");
    		left=1;
    	}
    	
    	for(int i=left;i<=right;i++) {
    		root= (int) Math.sqrt(i);
    		if(i== (root*root)) {
    			System.out.print(i+" ");
    		}
    	}
    }
    
    private static void findPerfectSquares(int left, int right) {
    	int product=1;
    	if(left<0) {
    		System.out.print(0+" ");
    		left=1;
    	}
    	
    	int j=1;
    	for(int i=left;i<=right;i++) {
    		while(product<i) {
    			product=j*j;
    			j++;
    		}
    		
    		if(product==i)
    			System.out.print(i+" ");
    }

    }}