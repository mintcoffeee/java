package operator;

public class Dice {
	
	public static void main(String[] args) {
		int dice1, dice2;
//		System.out.println(Math.random());
		dice1 = (int)(Math.random() * 5 + 1);
		dice2 = (int)(Math.random() * 5 + 1);
	
		String result = dice1 > dice2 ? "주사위1 승" :
			dice1 < dice2 ? "주사위2 승" : "무승부";
		System.out.println("주사위1 : " + dice1 + " 주사위2 : " +dice2 + 
				"\n"+ result);		
		
//		if(dice1> dice2) 
//			System.out.println("주사위1 : " + dice1 + " 주사위2 : " +dice2 + 
//				"\n주사위1 승");
//		else if(dice1 < dice2)
//			System.out.println("주사위1 : " + dice1 + " 주사위2 : " +dice2 + 
//				"\n주사위2 승");
//		else
//			System.out.println("주사위1 : " + dice1 + " 주사위2 : " +dice2 + 
//					"\n무승부");	
		
		
	}

}


/*
[문제] 주사위 게임 - 난수
2개의 주사위를 던져서 큰값을 가진 주사위가 승이다.
주사위 값의 합도 출력하시오

[실행결과]
주사위1 : 3   주사위2 : 1
주사위1 승
-----------------------------
주사위1 : 4   주사위2 : 6
주사위2 승
-----------------------------
주사위1 : 3   주사위2 :3
무승부

난수
- 컴퓨터가 불규칙하게 발생하는 수 
- 0 <= 난수 < 1

x ~ y 사이의 난수
(int)(Math.random() * (y - x + 1) + x)

ex) 65 ~ 90 사이의 난수 => (int)(Math.random() * 26 + 65)
 */
