### Linked Lists
```java
        LinkedList<String> list = new LinkedList<String>();

        list.add("rob");
        list.add("alex");
        list.add("jose");

        System.out.println(list); //[rob, alex, jose]
        System.out.println(list.getFirst()); //rob
        System.out.println(list.get(1)); //alex
```

### Reverse a Linked List (from class object)
```java
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        
        if(head.next == null){
            return head;
        }
        
        ListNode node = reverseList(head.next);
        
        head.next.next = head;
        head.next = null;
        
        return node;
    }
}
```
