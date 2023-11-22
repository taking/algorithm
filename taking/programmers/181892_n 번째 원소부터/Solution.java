import java.util.*;

class Solution {
    

    /*
     * 제목 : N 번째 원소부터
     * 번호 : 181892
     * 내용 : 정수 리스트 num_list와 정수 n이 주어질 때, n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
    */

    public static List<Integer> solution(int[] num_list, int n) {

        List<Integer> answer = new ArrayList<>();

        for(int i = n-1; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] num_list01 = {2, 1, 6};
        int[] num_list02 = {5, 2, 1, 7, 5};
        
        System.out.println(solution(num_list01, 3));
        System.out.println(solution(num_list02, 2));
    }
}