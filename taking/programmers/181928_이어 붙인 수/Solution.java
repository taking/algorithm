class Solution {
    
    /*
     * 제목 : 이어 붙인 수
     * 번호 : 181928
     * 내용 : 정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
    */

    public static int solution(int[] num_list) {

        String even = ""; // 짝수
        String odd = ""; // 홀수

        for(int num : num_list) {

            if(num%2 == 0) {
                even = even + String.valueOf(num);
            } else {
                odd = odd + String.valueOf(num);
            }
        }

        return (int)(Integer.parseInt(even) + Integer.parseInt(odd));
    }

    public static void main(String[] args) {
        int[] num_list01 = {3, 4, 5, 2, 1};
        int[] num_list02 = {5, 7, 8, 3};
        
        System.out.println(solution(num_list01));
        System.out.println(solution(num_list02));
    }
}