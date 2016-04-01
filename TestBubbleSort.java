import java.util.Scanner;

public class TestBubbleSort {
	public static void main(String[] args){
		
		BubbleSort BS = new BubbleSort();
		Scanner input = new Scanner(System.in);//creat scanner
		System.out.println("How many numbers do you want to sort?");
		int b = input.nextInt();
		int [] a = new int[b];
		System.out.println("Enter " + b +" numbers");
		for(int i = 0; i < b; i++){//store numbers in array
			a[i] = input.nextInt();
		}
		BS.Sort(a);
		for(int i = 0; i < b; i++){
			System.out.print(a[i]);
		}
	
	}
}
