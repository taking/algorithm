import java.util.Scanner;

/*
    num : 2750
    description : N개의 수가 주어졌을 때 이를 오름차순 정렬하는 프로그램을 작성하시오.
    url : https://www.acmicpc.net/problem/2750
    ---
    input : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
    output : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
    limitTime : 2초
    ---
*/

/*
    정렬한다 → Sorting Algorithm
    ---
    1. Bubble Sort [O(n²)]
    2. Merge Sort [O(n log n)]
    3. Insertion Sort [O(n²)]
    4. Selection Sort [O(n²)]
    5. Heap Sort [O(n log n)]
    6. Quick Sort [O(n²)]
    7. Shell Sort [O(n²)]
    ---
    cf. (animaion) https://www.toptal.com/developers/sorting-algorithms
    cf. (solved) https://medium.com/@joongwon/%EC%A0%95%EB%A0%AC-%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EA%B8%B0%EC%B4%88-805391cb088e
    cf. (solved) https://www.freecodecamp.org/news/sorting-algorithms-explained-with-examples-in-python-java-and-c/
*/

/*
    연산 횟수 계산 방법
    > 연산 횟수는 1초에 1억 번 연산을 기준으로 생각함
    ---
    연산 횟수 = 알고리즘 시간 복잡도 X 데이터 크기
    ---
    버블 정렬 = (1,000,000)^2 = 1,000,000,000,000 > 200,000,000 (2초 기준) → 부적합 알고리즘
    병합 정렬 = 1,000,000log(1,000,000) = 약 20,000,000 < 200,000,000 (2초 기준) → 적합 알고리즘
*/

public class Main {
  private static int[] sorted;

  public static void mergeSort(int[] arr) {
    System.out.println("1");
  }
  public static void mergeSort(int[] arr, int begin, int end) {
    System.out.println("2");
  }
  public static void mrege(int[] arr, int begin, int middle, int end) {
    System.out.println("3");
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int arrLenth = sc.nextInt();

    int[] Numbers = new int[arrLenth];

    for(int i=0; i < arrLenth ; i++) {
      Numbers[i] = sc.nextInt();
    }

    mergeSort(Numbers);
  }

}