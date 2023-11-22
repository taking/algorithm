class Solution {
    

    /*
     * 제목 : 접두사인지 확인하기
     * 번호 : 181906 
     * 내용 : 어떤 문자열에 대해서 접두사는 특정 인덱스까지의 문자열을 의미합니다. 
     *        예를 들어, "banana"의 모든 접두사는 "b", "ba", "ban", "bana", "banan", "banana"입니다.
     *        문자열 my_string과 is_prefix가 주어질 때, is_prefix가 my_string의 접두사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
    */

    public static int solution(String my_string, String is_prefix) {

        if(is_prefix.length() > my_string.length()) {
            return 0;
        }
        
        Integer prefixLength = is_prefix.split("").length;
        String stringSplit = my_string.substring(0, prefixLength);

        // java 에서는 == 로 문자열 비교가 불가능, equals를 사용한다.
        if(is_prefix.equals(stringSplit)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("banana", "ban"));
        System.out.println(solution("banana", "nan"));
        System.out.println(solution("banana", "abcd"));
        System.out.println(solution("banana", "bananan"));
    }
}