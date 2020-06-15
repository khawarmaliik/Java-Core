package binarygap;

public class BinaryGap {
	public static int solution(int n) {
		int finalGap = 0;
		if (n == 1) {
			return 0;
			}
		char binaryRep[] = Integer.toBinaryString(n).toCharArray();
		int tempGap=0;
		for (int x = 0; x < binaryRep.length; x++) {
			if(binaryRep[x]=='0'){
				tempGap++;
				continue;
				}else if(binaryRep[x]=='1'){
					if(tempGap>finalGap)
						finalGap=tempGap;
					tempGap=0;
					}
			}
		return finalGap;
		}

	public static void main(String[] args) {
		System.out.println(solution(1076));
	}

}
