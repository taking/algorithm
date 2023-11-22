class Solution {
    

    /*
     * 제목 : 공배수
     * 번호 : 181936 
     * 내용 : 정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.
    */

    // number 는 n 의 배수, m 의 배수이면 1
    public static int solution(int number, int n, int m) {
        int answer = 0;
        
        boolean chk1 = (number % n == 0) ? true : false;
        boolean chk2 = (number % m == 0) ? true : false;
        
        if(chk1 && chk2) {
            return 1;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(60, 2, 3));
        System.out.println(solution(55, 10, 5));
    }
}