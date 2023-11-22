Solution 1

```
class Solution {
    public int solution(int[] num_list) {
        for (int i = 0;i < num_list.length;i++)
            if (num_list[i] < 0)
                return i;
        return -1;
    }
}
```

Solution 2

```
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numList) {
        return IntStream.range(0, numList.length).filter(i -> numList[i] < 0).findFirst().orElse(-1);
    }
}
```

Solution 3

```
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] < 0) {
                answer=i ;
                break;
            } else answer = -1;
        }

        return answer;
    }
}

```

Solution 4

```
class Solution {
    public int solution(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if (-num_list[i] > 0) return i;
        }
        return -1;
    }
}
```
