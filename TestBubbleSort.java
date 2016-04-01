import java.util.Scanner;

public class TestBubbleSort {
	public static void main(String[] args){
		
		BubbleSort BS = new BubbleSort();
		Scanner input = new Scanner(System.in);
		System.out.println("e");
		int b = input.nextInt();
		int [] a = new int[b];
		System.out.println("e");
		for(int i = 0; i < b; i++){
			a[i] = input.nextInt();
		}
		BS.Sort(a);
		for(int i = 0; i < b; i++){
			System.out.print(a[i]);
		}
	
	}
}
