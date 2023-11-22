package main
import (
    "fmt"
)

/*
    num : 1000
    description : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
    url : https://www.acmicpc.net/problem/1000
    ---
    input : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
    output : 첫째 줄에 A+B를 출력한다.
    ---
*/

func main() {
    var a,b int
    fmt.Scanln(&a, &b)
    fmt.Println(a+b)
}