package ucamp.java.exercise1;


//[문제] 1025를 30으로 나눈 몫과 나머지를 아래와 같은 형식으로 출력하도록 클래스를 완성하시오.
//[결과 예] 1025를 30으로 나눈 몫은 XX이고, 나머지는 XX입니다.      

public class Question5 {
	public static void main(String[] args) {
		int d1 = 1025;
		int d2 = 30;
		
		int result = d1 / d2; //몫
		int na = d1 % d2 ; //나머지
		
		System.out.println(d1+ "을 " + d2+ "로 나눈 몫은 "+ result + "이고 나머지는 "+ na + " 입니다");
	}
}
