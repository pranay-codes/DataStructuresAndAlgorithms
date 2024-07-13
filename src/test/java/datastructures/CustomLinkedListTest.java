package datastructures;

import org.junit.jupiter.api.Test;

import com.narotam.datastructures.CustomLinkedList;

public class CustomLinkedListTest {
    
    @Test
    public void testAddingToLinked() {
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println(linkedList);
    }
}
