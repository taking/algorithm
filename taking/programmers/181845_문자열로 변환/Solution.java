class Solution {
    

    /*
     * 제목 : 문자열로 변환
     * 번호 : 181845 
     * 내용 : 정수 n이 주어질 때, n을 문자열로 변환하여 return하도록 solution 함수를 완성해주세요.
    */

    public static String solution(int n) {
        Integer g = n;
        return g.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(123));
        System.out.println(solution(2573));
    }
}