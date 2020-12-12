package solution;

public class Solution476 {
	public static int findComplement(int num) {
		boolean startIndex = false;
		for(int i = 31; i >= 0; i --){
			if((num & (1 << i)) == 0 && !startIndex){
				continue;
			}else{
				num = num ^ (1 << i);
				startIndex = true;
			}

		}

		return num;
	}

	public static void main(String[] args) {
		System.out.println(findComplement(5));
	}
}
