Solution 1

```
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];

        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        int last = num_list[num_list.length-1];
        int before = num_list[num_list.length-2];

        answer[answer.length-1] = last > before ? last - before : last*2;

        return answer;
    }
}
```

Solution 2

```
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] num_list) {
        return IntStream.iterate(0, i -> i + 1)
                        .limit(num_list.length + 1)
                        .map(i -> i == num_list.length ? (num_list[i - 1] > num_list[i - 2] ? num_list[i - 1] - num_list[i - 2] : 2 * num_list[i - 1]) : num_list[i])
                        .toArray();
    }
}
```

Solution 3

```
class Solution {

    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len + 1];

        for (int i = 0; i < len; i++) {
            answer[i] = num_list[i];
        }

        if (num_list[len - 1] <= num_list[len - 2]) {
            answer[len] = (num_list[len - 1] * 2);
        } else {
            answer[len] = (num_list[len - 1] - num_list[len -2]);
        }
        return answer;
    }
}
```

Solution 4

```
class Solution {
    public int[] solution(int[] num_list) {
        int idx = 0;
        int[] answer = new int[num_list.length + 1];
        for (int num : num_list)
            answer[idx++] = num;
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2])
            answer[idx] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        else
            answer[idx] = num_list[num_list.length - 1] * 2;
        return answer;
    }
}
```
