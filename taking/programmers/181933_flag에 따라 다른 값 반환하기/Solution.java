class Solution {
    

    /*
     * 제목 : flag에 따라 다른 값 반환하기
     * 번호 : 181933
     * 내용 : 두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.
    */

    public static int solution(int a, int b, boolean flag) {
        return (flag) ? a + b : a - b;
    }

    public static void main(String[] args) {
        System.out.println(solution(-4, 7, true));
        System.out.println(solution(-4, 7, false));
    }
}