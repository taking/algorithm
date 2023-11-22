Solution 1

```
import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(numList, n - 1, numList.length);
    }
}
```
