//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
//Explanation: 342 + 465 = 807.
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum,carry=0;
        ListNode resul=new ListNode(0);
        ListNode temp=new ListNode(0);
        resul=temp;
      while(l1!=null && l2!=null)
      {
          sum=l1.val+l2.val+carry;
          carry=0;
          if(sum>9)
          {
              sum=sum-10;
              carry=1;
          }
          ListNode temp2=new ListNode(sum);
          temp.next=temp2;
          temp=temp.next; 
          l1=l1.next;
          l2=l2.next;
      }
       while(l1!=null)
       {
           sum=l1.val+carry;
           carry=0;
           if(sum>9)
          {
              sum=sum-10;
              carry=1;
          }
          ListNode temp2=new ListNode(sum);
          temp.next=temp2;
          temp=temp.next; 
          l1=l1.next;
       }  
        while(l2!=null)
        {
            sum=l2.val+carry;
           carry=0;
           if(sum>9)
          {
              sum=sum-10;
              carry=1;
          }
          ListNode temp2=new ListNode(sum);
          temp.next=temp2;
          temp=temp.next; 
          l2=l2.next;
        }
        if(carry==1)
        {
        ListNode temp2=new ListNode(1);
          temp.next=temp2;
          temp=temp.next;
        }
        return resul.next;
    }
}