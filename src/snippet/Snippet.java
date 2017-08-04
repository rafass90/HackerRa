package snippet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Snippet {
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
        if(scan.hasNextInt())
            System.out.println("Int: " + scan.nextInt());
        else if(scan.hasNextDouble())
        	System.out.println("Double: " + scan.nextDouble());
        else
        	System.out.println("String: " + scan.next());
	
//		System.out.println(exist(a, 8));
	
		
//		oddNumbers(3, 5);
	
	}
	
	public static int[] oddNumbers(int l, int r) {
		int size = l;
		List<Integer> ops = new ArrayList();
		while(size >= l && size <= r){
			if(size % 2 != 0){
				ops.add(size);
			}
		}
		
		size = 0;
		int[] resposta = new int[ops.size()];
		while(size <= ops.size()){
			resposta[size] = ops.get(size);
			size++;
		}
		return resposta;
    }
	
	public static String exist(int[] arr, int k){
		for(int a = 0; a < arr.length; a++){
			if(k == arr[a])
				return "SIM";
		}
		return "NÃO";
	}
}

