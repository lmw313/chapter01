package chapter01;

public class StudentTest {

	public static void main(String[] args){
		Student 이민우 = new Student();
		
		이민우.name = "이민우";
		이민우.address = "서울특별시 노원구 상계동 1322번지 중계센트럴파크 아파트 101동 716호";
		
		System.out.println(이민우.name + "님의 자택은 " + 이민우.address + "입니다.");
	}
	
}
