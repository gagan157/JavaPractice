
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         ListNode l3 = new ListNode(0);
//         return addTwoNumbersRecursive(l1, l2, l3);
//     }
    
//     public ListNode addTwoNumbersRecursive(ListNode l1, ListNode l2, ListNode l3) {
//         if (l1 == null || l2 == null) {
//             return null;
//         }
        
//         int num = l1.val + l2.val + l3.val;
//         if (l1.next != null) {
//             l3.next = new ListNode(0);
//         }
//         if (num > 9) {
//             int carry = num / 10;
//             num = num % 10;
//             l3.next.val = carry;
//         }
//         l3.val = num;
//         addTwoNumbersRecursive(l1.next, l2.next, l3.next);
//         return l3;
//     }
// }