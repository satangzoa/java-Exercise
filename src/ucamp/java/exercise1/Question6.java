package ucamp.java.exercise1;


//[문제] 아래 코드는 컴파일 오류가 발생한다. 오류를 수정하고, 왜 오류가 발생했는지 구체적인 이유를 적으시오. 
// 

//[오류가 발생한 이유]
//
//for(sum=1; sum <=10; sum++)

public class Question6 {
	public static void main(String[] args) {
		int sum=0;
		
		
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		sum = sum + 6;
		sum = sum + 7;
		sum = sum + 8;
		sum = sum + 9;
		sum = sum + 10;
		
		System.out.println("1부터 10까지의 합 : " + sum);
	}
}
