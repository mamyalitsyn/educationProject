package leetcode.easy;

import leetcode.model.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    AddTwoNumbers numbers;

    @BeforeEach
    public void setUp() {
        numbers = new AddTwoNumbers();
    }

    @Test
    void addTwoNumbers_sameNumberOfDigits() {
        ListNode l1 = createList(2, 4, 3);
        ListNode l2 = createList(5, 6, 4);

        ListNode result = numbers.addTwoNumbers(l1, l2);

        checkResult(result, 7, 0, 8);
    }

    @Test
    void addTwoNumbers_onlyZeros() {
        ListNode l1 = createList(0);
        ListNode l2 = createList(0);

        ListNode result = numbers.addTwoNumbers(l1, l2);

        checkResult(result, 0);
    }

    @Test
    void addTwoNumbers_differentNumberOfDigits() {
        ListNode l1 = createList(9, 9, 9, 9, 9, 9, 9);
        ListNode l2 = createList(9, 9, 9, 9);

        ListNode result = numbers.addTwoNumbers(l1, l2);

        checkResult(result, 8, 9, 9, 9, 0, 0, 0, 1);
    }

    @Test
    void addTwoNumbers_whenOneListIsNull() {
        ListNode l2 = createList(0, 1);

        ListNode result = numbers.addTwoNumbers(null, l2);

        checkResult(result, 0, 1);
    }

    @Test
    void addTwoNumbers_whenBothListsAreNull() {

        ListNode result = numbers.addTwoNumbers(null, null);

        assertNull(result);
    }

    @Test
    void addTwoNumbers_extraCarry() {
        ListNode l1 = createList(9, 9);
        ListNode l2 = createList(1);

        ListNode result = numbers.addTwoNumbers(l1, l2);

        checkResult(result, 0, 0, 1);
    }

    @Test
    void leetValidationTest() {
        ListNode l1 = createList(9);
        ListNode l2 = createList(1, 9, 9, 9, 9, 9, 9, 9, 9, 9);

        ListNode result = numbers.addTwoNumbers(l1, l2);

        checkResult(result, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1);
    }

    @Test
    void leetValidationTest2() {
        ListNode l1 = createList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        ListNode l2 = createList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);

        ListNode result = numbers.addTwoNumbers(l1, l2);

        checkResult(result, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2);
    }

    private void checkResult(ListNode result, int... entries) {
        assertNotNull(result);
        ListNode current = result;
        for (int entry : entries) {
            assertNotNull(current);
            assertEquals(entry, current.val);
            current = current.next;
        }
    }

    private ListNode createList(int... entries) {
        ListNode result = new ListNode(0);
        ListNode current = result;
        for (int entry : entries) {
            current.next = new ListNode(entry);
            current = current.next;
        }
        return result.next;
    }
}