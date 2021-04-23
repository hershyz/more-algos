### Queues vs Stacks

```java
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Queue<String> q = new LinkedList<String>();
        q.add("rob");
        q.add("tom");
        q.add("harry");

        System.out.println(q); //[rob, tom, harry]
        q.poll();
        System.out.println(q); //[tom, harry] (first in, first out)

        Stack<String> s = new Stack<String>();
        s.add("rob");
        s.add("tom");
        s.add("harry");

        System.out.println(s); //[rob, tom, harry]
        s.pop();
        System.out.println(s); //[rob, tom] (last in, first out)
    }
}
```
