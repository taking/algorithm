class Solution {
    

    /*
     * 제목 : 원소들의 곱과 합
     * 번호 : 181929 
     * 내용 : 정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
    */

    public static int solution(int[] num_list) {

        Integer sum = 0;
        Integer mix = 1 ;
        
        for(int num : num_list) {
            sum += num;
            mix *= num;
        }

        return (mix < (sum*sum)) ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] num_list01 = {3, 4, 5, 2, 1};
        int[] num_list02 = {5, 7, 8, 3};
        
        System.out.println(solution(num_list01));
        System.out.println(solution(num_list02));
    }
}