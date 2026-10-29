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
class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur=head;
        while(cur.next!=null){
            int Gcd=gcd(cur.val,cur.next.val);
            ListNode gcdNode=new ListNode(Gcd,cur.next);
            cur.next=gcdNode;
            cur=gcdNode.next;
        }
        return head;
    }
}