### Bubble Sort, Selection Sort, and Insertion Sort (ascending and descending):
```java
    //Ascending bubble sort:
    public static void ascendingBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Descending bubble sort:
    public static void descendingBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] > arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Ascending selection sort:
    public static void ascendingSelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[max]) {
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Descending selection sort:
    public static void descendingSelectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Ascending Insertion Sort:
    public static void ascendingInsertionSort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            int curr = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] > curr)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = curr;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Descending Insertion Sort:
    public static void descendingInsertionSort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            int curr = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] < curr)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = curr;
        }
        System.out.println(Arrays.toString(arr));
    }
```

### ArrayList Methods (insert, set, and delete):
```java
     Insertions:
    
     ArrayList<Integer> list = new ArrayList<>();
     list.add(1);
     list.add(2);
     list.add(3);
    
     The list would be:
     Indices: [0, 1, 2]
     Values:  [1, 2, 3]
    
     Inserting value 5 at index 1: list.add(1, 5);
     The list would then be:
     Indices: [0, 1, 2, 3]
     Values:  [1, 5, 2, 3]
    
     Set:
    
     ArrayList<Integer> list = new ArrayList<>();
     list.add(1);
     list.add(2);
     list.add(3);
    
     The list would be:
     Indices; [0, 1, 2]
     Values:  [1, 2, 3]
    
     Setting index 0 to value 5: list.set(0, 5);
     The list would then be:
     [5, 2, 3]
    
     Delete:
    
     ArrayList<Integer> list = new ArrayList<>();
     list.add(1);
     list.add(2);
     list.add(3);
    
     The list would be:
     Indices: [0, 1, 2]
     Values:  [1, 2, 3]
    
     Deleting index 1: list.remove(1);
     The list would then be:
     [1, 3]
```

### Binary Search (given ascending sorted array):
```java
    //Binary Search (given an ascending sorted array):
    public static void binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (true) {
            if (low > high) {
                System.out.println(-1); //Invalid index value if the target does not exist
                break;
            }
            int i = (low + high) / 2;
            if (arr[i] == target) {
                System.out.println(i);
                break;
            }
            if (arr[i] < target) {
                low++;
            }
            if (arr[i] > target) {
                high++;
            }
        }
    }
```

### Stacks:
```java
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        System.out.println(stack); //[1, 2]

        stack.push(4);
        System.out.println(stack); //[1, 2, 4] (adds 4 to the end of the stack)

        System.out.println(stack.peek()); //4 (returns the last element in the stack)
        System.out.println(stack.get(1)); //2 (returns the element @ index 1 of the stack)

        stack.pop(); //removes the last element in the stack
        System.out.println(stack); [1, 2]
```
