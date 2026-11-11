public class mergeTwoListSolution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode(0);
        ListNode point=head;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                point.next=list1;
                point=point.next;
                list1=list1.next;
            }
            else{
                point.next=list2;
                point=point.next;
                list2=list2.next;
            }
        }
        if(list1==null){
            point.next=list2;
        }
        else{
            point.next=list1;
        }
        return head.next;
    }
}
