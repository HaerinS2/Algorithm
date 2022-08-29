import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectionSort {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int[] numsArray = new int[size];

		// 배열 입력받기
		for (int i = 0; i < size; i++) {
			numsArray[i] = Integer.parseInt(br.readLine());
			System.out.println("numsArray[" + i + "] = " + numsArray[i]);
		}

		// 정렬 전 배열 출력
		System.out.print("정렬 전 numsArray={ ");
		for (int i = 0; i < size; i++) {
			System.out.print(numsArray[i] + " ");
		}
		System.out.print("}\n");

		// 정렬하는 코드
		int minIndex;
		for(int i = 0; i < size; i++){
			for(int j = i+1; j < size; j++){
			}
		}

		// 정렬 후 배열 출력
		System.out.print("정렬 후 numsArray={ ");
		for (int i = 0; i < size; i++) {
			System.out.print(numsArray[i] + " ");
		}
		System.out.print("}\n");
	}
}