class Solution {
    

    /*
     * 제목 : 첫 번째로 나오는 음수
     * 번호 : 181896 
     * 내용 : 정수 리스트 num_list가 주어질 때, 첫 번째로 나오는 음수의 인덱스를 return하도록 solution 함수를 완성해주세요. 음수가 없다면 -1을 return합니다.
    */

    public static int solution(int[] num_list) {

        //1번
        // Integer idx = 0;
        // for(Integer num : num_list) {
        //     if(num < 0) return idx;
        //     idx++;
        // }

        //2번
        for(int i = 0; i < num_list.length; i ++) {
            if(num_list[i] < 0) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] num_list01 = {12, 4, 15, 46, 38, -2, 15};
        int[] num_list02 = {13, 22, 53, 24, 15, 6};
        int[] num_list03 = {5, 3, 13, 55, 32, 18};
        int[] num_list04 = {7, 10, 15, -1, 5, 8};
        int[] num_list05 = {-1, 3, 7, 4, 2, 5};
        
        System.out.println(solution(num_list01));
        System.out.println(solution(num_list02));
        System.out.println(solution(num_list03));
        System.out.println(solution(num_list04));
        System.out.println(solution(num_list05));
    }
}