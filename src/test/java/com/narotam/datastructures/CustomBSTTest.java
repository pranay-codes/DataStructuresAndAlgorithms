package com.narotam.datastructures;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CustomBSTTest {
    @Test
    void testAdd() {
        CustomBST bst = new CustomBST();

        bst.add(500);
        System.out.println("after");
        System.out.println(bst);
        bst.add(34);
        System.out.println("after");
        System.out.println(bst);
        bst.add(501);
        System.out.println("after");
        System.out.println(bst);
        bst.add(305);

        System.out.println("after");
        System.out.println(bst);    }

    @Test
    void testSearch() {
        CustomBST bst = new CustomBST();

        bst.add(500);
        bst.add(34);
        bst.add(501);
        bst.add(305);

        assertTrue(bst.search(34));
    }
}
