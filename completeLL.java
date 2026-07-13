import java.util.LinkedList;
import java.util.Collections;

public class LinkedListOperations {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add Elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.addFirst("Orange");
        list.addLast("Grapes");

        System.out.println("LinkedList: " + list);

        // Size
        System.out.println("Size: " + list.size());

        // Get Elements
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // Update Element
        list.set(2, "Pineapple");
        System.out.println("After Update: " + list);

        // Contains
        System.out.println("Contains Mango: " + list.contains("Mango"));

        // Index
        System.out.println("Index of Banana: " + list.indexOf("Banana"));

        // Remove Elements
        list.remove("Banana");
        list.removeFirst();
        list.removeLast();

        System.out.println("After Remove: " + list);

        // Traverse using for loop
        System.out.print("For Loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        // Traverse using for-each loop
        System.out.print("For-Each: ");
        for (String item : list) {
            System.out.print(item + " ");
        }

        System.out.println();

        // Sort
        Collections.sort(list);
        System.out.println("Sorted: " + list);

        // Reverse
        Collections.reverse(list);
        System.out.println("Reversed: " + list);

        // Peek
        System.out.println("Peek: " + list.peek());

        // Poll
        System.out.println("Poll: " + list.poll());
        System.out.println("After Poll: " + list);

        // Offer
        list.offer("Guava");
        System.out.println("After Offer: " + list);

        // Is Empty
        System.out.println("Is Empty: " + list.isEmpty());

        // Clear
        list.clear();
        System.out.println("After Clear: " + list);
        System.out.println("Is Empty: " + list.isEmpty());
    }
}