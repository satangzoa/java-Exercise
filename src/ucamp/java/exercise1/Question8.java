package ucamp.java.exercise1;

//기 수 :
//이 름 :

//[문제] 프로그램을 수행하면 value값의 결과가 22가 아닌 20으로 출력된다.
//      22가 출력되도록 아래 한줄의 코드를 수정하시오.

public class Question8 {
	public static void main(String[] args) {
		int value = 10;
		
		value = value++ * 2;	//이 행을 수정하시오.
		//value = ++value * 2;로 고친다
		
		System.out.println("value 값 : " + value);
	}
}
