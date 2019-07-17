package DataStructure;

public class LiList {
    Node head;

            static class Node
            {
                int data;
                Node(int d)
                {
                    data = d;
                }
                Node next = null;
            }


            static LiList insert(LiList list,int data)
            {
                Node new_node = new Node(data);
                new_node.next = null;

                if(list.head == null)
                {
                    list.head = new_node;
                }
                else
                {
                    Node last = list.head;
                    while (last.next != null)
                    {
                        last = last.next;
                    }

                    last.next = new_node;
                }
                return list;
            }

            static void display(LiList list)
            {
                Node curnode = list.head;

                while (curnode != null)
                {
                    System.out.println(curnode.data);
                    curnode = curnode.next;
                }
            }

    public static void main(String[] args) {

                LiList list = new LiList();
                list = insert(list,10);
                list = insert(list,20);

                display(list);

    }
}
