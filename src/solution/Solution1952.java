package solution;

public class Solution1952 {

	public static boolean isThree(int n) {
//         int temp = 1;
//         int count = 0;
//         while(temp <= n){
//             if(n % temp == 0){
//                 count ++;
//             }
//             temp ++;
//         }

//         return count == 3;
//         if(n == 4){
//            return true;
//         }
		int[] primeNumbers = new int[]{
				3, 5, 7, 11,
				13, 17, 19, 23,
				29, 31, 37, 41,
				43, 47, 53, 59,
				61, 67, 71, 73,
				79, 83, 89, 97
		};
		for (final int primeNumber : primeNumbers) {
			if (Math.sqrt(n) == primeNumber) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(isThree(15));
	}
}
