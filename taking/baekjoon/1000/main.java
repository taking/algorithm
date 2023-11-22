import java.util.Scanner;

/*
    num : 1000
    description : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
    url : https://www.acmicpc.net/problem/1000
    ---
    input : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
    output : 첫째 줄에 A+B를 출력한다.
    ---
*/

/*
    Scanner() Method
    ---
    Scanner 클래스는 "Token (공백문자로 구분) 단위"로 읽음
    ---
    import java.util.Scanner;
    Scanner sc = new Scanner(System.in);
    sc.next();  // String, Token 구분
    sc.nextLine();  // String, Enter 구분
    sc.nextInt();  // Int
    sc.nextBoolean();  // Boolean
    sc.nextByte();  // Byte
    sc.nextShort();  // Short
    sc.nextLong();  // Long
    sc.nextFloat();  // Float
    sc.nextDouble();  // Double
*/

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    if (0 < a || b < 10) {
      System.out.printf("%d", a + b);
    }
  }
}