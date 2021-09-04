/*
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {
    list res=null;
       if(l1.size()==l2.size()){
         Add(head1,head2);
       }
       else if(l1.size1<l2s.size2)
       {
            Node temp=head1;
            head1=head2;
            head2=temp;
       }
       else
       {

       }
       int diff=Math.abs(size1-size2);
       // one loop for the curry
       while(diff >0)
       {
       diff--;
       cur=temp;
       temp=temp.next;
       }
       Add(cur, head);

Add(node head1,node head2){
        Add(head1.next,head.next);
        int add=head1.data+head2.data;
        curry=sum/10;
        sum=sum%10;
       res.push(sum);
}











public static ListNode AddTwoNumbers(ListNode l1, ListNode l2, int carry = 0) {
 if (l1 == null && l2 == null && carry == 0)
  return null;
  if (l1 == null && l2 == null && carry == 1)
  return new ListNode(1);
   var s1 = l1 != null ? l1.val : 0;
   var s2 = l2 != null ? l2.val : 0;
   var s = s1 + s2 + carry;
    var sumNode = new ListNode(s % 10);
     sumNode.next = AddTwoNumbers(l1?.next, l2?.next, s / 10);
      return sumNode;
 */


/*
bool recur_search(int key, int values[], int lower, int upper)
        { // base case 1: not in haystack if (upper < lower) {
            // return false;
        // }
        // int mid = (lower + upper) / 2;
        // base case 2: found if (key == values[mid]) {
        // return true; }
        // recursive cases else if (key < values[mid]) {
        // recur_search(key, values, lower, mid - 1);
         } else // (key > values[mid]) {
         recur_search(key, values, mid + 1, upper);
          } // to get rid of "error: control may reach end of non-void function" return false; }
 */
