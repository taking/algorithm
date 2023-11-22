Solution 1

```
class Solution {
    public int solution(String my_string, String is_prefix) {
        if (my_string.startsWith(is_prefix)) return 1;
        return 0;
    }
}
```

Solution 2

```
class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        int a = my_string.indexOf(is_prefix);
        System.out.print(a);

        return a==0? 1 : 0;
    }
}
```

Solution 3

```
import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String myString, String isPrefix) {
        return IntStream.rangeClosed(0, myString.length())
            .mapToObj(i -> myString.substring(0, i))
            .anyMatch(s -> s.equals(isPrefix)) ? 1 : 0;
    }
}
```
