/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      ListNode temp=headA;
      ListNode temp1=headB;
      int len=0;
      while(temp!=null){
        len++;
        temp=temp.next;
      }
     temp1=headB;
      int len1=0;
      while(temp1!=null){
        len1++;
        temp1=temp1.next;
      }
      temp=headA;
      temp1=headB;
      if(len>len1){
        for(int i=0;i<len-len1;i++){
            temp=temp.next;
        }
      }
      else{
      for(int i=0;i<len1-len;i++){
        temp1=temp1.next;
      }
      }
      while(temp!=temp1){
        temp=temp.next;
        temp1=temp1.next;

      }
      return temp; }}