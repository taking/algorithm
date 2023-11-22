Solution 1

```
class Solution {
    public int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}
```

Solution 2

```
class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;

        if (number % n == 0 ) {
            if (number % m == 0)
                answer = 1;
        }

        return answer;
    }
}
```

Solution 3

```
class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;

        answer = (number % n == 0 && number % m == 0) ? 1 : 0;

        return answer;
    }
}
```
