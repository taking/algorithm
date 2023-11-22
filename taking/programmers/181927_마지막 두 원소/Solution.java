import java.util.Arrays;

class Solution {
    

    /*
     * 제목 : 마지막 두 원소
     * 번호 : 181927 
     * 내용 : 정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.
    */

    public static int[] solution(int[] num_list) {

        int N = num_list.length;

        // Arrays copyOf를 사용해서, 배열 수 늘리기
        num_list = Arrays.copyOf(num_list, N + 1);

        // 마지막 원소가 그전 원소보다 크면
        if(num_list[N-2] < num_list[N-1]) {
            num_list[num_list.length-1] = num_list[N-1] - num_list[N-2];
        } 
        
        if(num_list[N-2] >= num_list[N-1]) {
            num_list[num_list.length-1] = num_list[N-1]*2;
        }

        return num_list;
    }

    public static void main(String[] args) {
        int[] num_list01 = {2, 1, 6};
        int[] num_list02 = {5, 2, 1, 7, 5};
        int[] num_list03 = {3, 4, 6, 7, 10};
        int[] num_list04 = {3, 5, 1, 7};
        int[] num_list05 = {1, 4, 7, 1};
        int[] num_list06 = {3, 5};
        int[] num_list07 = {6, 2};
        
        System.out.println(Arrays.toString(solution(num_list01)));
        System.out.println(Arrays.toString(solution(num_list02)));
        System.out.println(Arrays.toString(solution(num_list03)));
        System.out.println(Arrays.toString(solution(num_list04)));
        System.out.println(Arrays.toString(solution(num_list05)));
        System.out.println(Arrays.toString(solution(num_list06)));
        System.out.println(Arrays.toString(solution(num_list07)));
    }
}