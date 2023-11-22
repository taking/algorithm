import java.util.*;

class Solution {
    

    /*
     * 제목 : 카운트 업
     * 번호 : 181920
     * 내용 : 정수 start_num와 end_num가 주어질 때, start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
    */

    public static List<Integer> solution(int start_num, int end_num) {
        
        List<Integer> answer = new ArrayList<>();

        for(int i=start_num; i <= end_num; i++) {
            answer.add(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 10));
        System.out.println(solution(1, 5));
    }
}