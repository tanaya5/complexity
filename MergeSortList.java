class Node
  {
    int val;
    Node next;
    public Node()
    {}
    public Node(int  val)
    {
      this.val = val;
      this.next =  null;
    }
  }

 class LinkedList
{
  Node head = null;
  Node tail = null;
  int size = 0;
  
  
  public void add(Node node)
  {
    if(size == 0)
    {
      head = node;
      tail = node;
    }
    else
    {
    tail.next = node;
    tail = tail.next;
    }
    size++;
  }
  
  public Node mergeLinkedList(Node a , Node b)
  {
    if(a == null)
      return b;
    if(b == null)
      return a; 
    Node result = null;
    if(a.val <= b.val)
    {
      result = a;
      a.next = mergeLinkedList(a.next , b);
    }
    else
    {
      result = b;
      b.next = mergeLinkedList(a , b.next);
    }
    
    return result;
  }
  
  public Node mergeSort(Node h)
  {
     if (h == null || h.next == null) 
        { 
            return h; 
        } 
    Node middle = getMiddle(h); 
    Node nextofmiddle = middle.next; 
  
        
    middle.next = null; 
  
    Node left = mergeSort(h); 
  
    Node right = mergeSort(nextofmiddle); 
  
    Node sortedlist = new Node();
    sortedlist = mergeLinkedList(left, right); 
    return sortedlist; 
    
  }
  public Node getMiddle(Node h)  
    { 
        //Base case 
        if (h == null) 
            return h; 
        Node fastptr = h.next; 
        Node slowptr = h; 
          
        // Move fastptr by two and slow ptr by one 
        // Finally slowptr will point to middle node 
        while (fastptr != null) 
        { 
            fastptr = fastptr.next; 
            if(fastptr!=null) 
            { 
                slowptr = slowptr.next; 
                fastptr=fastptr.next; 
            } 
        } 
        return slowptr; 
    } 
}

public class HelloWorld
{

  
  public static void main(String[] args)
  {
    LinkedList list1 = new LinkedList();
    list1.add(new Node(5));
    list1.add(new Node(9));
    list1.add(new Node(1));
    list1.add(new Node(4));
    list1.add(new Node(3));
    
    list1.head = list1.mergeSort(list1.head);
    Node temp = new Node();
     temp = list1.head;
    while(temp != null)
    {
      System.out.print(" "+temp.val);
      temp = temp.next;
    }
    
  }
  
  
}
