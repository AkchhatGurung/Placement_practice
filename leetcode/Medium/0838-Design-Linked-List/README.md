# Design Linked List

**Difficulty:** Medium  
**Topics:** Linked List, Design  
**LeetCode URL:** [Design Linked List](https://leetcode.com/problems/design-linked-list/)

## Problem Description

<p>Design your implementation of the linked list. You can choose to use a singly or doubly linked list.<br />
A node in a singly linked list should have two attributes: <code>val</code> and <code>next</code>. <code>val</code> is the value of the current node, and <code>next</code> is a pointer/reference to the next node.<br />
If you want to use the doubly linked list, you will need one more attribute <code>prev</code> to indicate the previous node in the linked list. Assume all nodes in the linked list are <strong>0-indexed</strong>.</p>

<p>Implement the <code>MyLinkedList</code> class:</p>

<ul>
	<li><code>MyLinkedList()</code> Initializes the <code>MyLinkedList</code> object.</li>
	<li><code>int get(int index)</code> Get the value of the <code>index<sup>th</sup></code> node in the linked list. If the index is invalid, return <code>-1</code>.</li>
	<li><code>void addAtHead(int val)</code> Add a node of value <code>val</code> before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.</li>
	<li><code>void addAtTail(int val)</code> Append a node of value <code>val</code> as the last element of the linked list.</li>
	<li><code>void addAtIndex(int index, int val)</code> Add a node of value <code>val</code> before the <code>index<sup>th</sup></code> node in the linked list. If <code>index</code> equals the length of the linked list, the node will be appended to the end of the linked list. If <code>index</code> is greater than the length, the node <strong>will not be inserted</strong>.</li>
	<li><code>void deleteAtIndex(int index)</code> Delete the <code>index<sup>th</sup></code> node in the linked list, if the index is valid.</li>
</ul>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input</strong>
[&quot;MyLinkedList&quot;, &quot;addAtHead&quot;, &quot;addAtTail&quot;, &quot;addAtIndex&quot;, &quot;get&quot;, &quot;deleteAtIndex&quot;, &quot;get&quot;]
[[], [1], [3], [1, 2], [1], [1], [1]]
<strong>Output</strong>
[null, null, null, null, 2, null, 3]

<strong>Explanation</strong>
MyLinkedList myLinkedList = new MyLinkedList();
myLinkedList.addAtHead(1);
myLinkedList.addAtTail(3);
myLinkedList.addAtIndex(1, 2);    // linked list becomes 1-&gt;2-&gt;3
myLinkedList.get(1);              // return 2
myLinkedList.deleteAtIndex(1);    // now the linked list is 1-&gt;3
myLinkedList.get(1);              // return 3
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>0 &lt;= index, val &lt;= 1000</code></li>
	<li>Please do not use the built-in LinkedList library.</li>
	<li>At most <code>2000</code> calls will be made to <code>get</code>, <code>addAtHead</code>, <code>addAtTail</code>, <code>addAtIndex</code> and <code>deleteAtIndex</code>.</li>
</ul>

## Solution

```java
// LeetCode Problem: Design Linked List
// Link: https://leetcode.com/problems/design-linked-list/
// Difficulty: Medium
// Language: java

class MyLinkedList {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;

        }

    }
    Node head;
    int size;
    public MyLinkedList() {
        head=null;
        size=0;
    }
    
    public int get(int index) {
        if(index<0||index>=size){
            return -1;
        }    
        Node current=head;
        for(int i=0;i<index;i++){
            current=current.next;
        }
        return current.val;
    }
    
    public void addAtHead(int val) {
        Node newNode=new Node(val);

        newNode.next=head;
        head = newNode;

        size++;
    }
    
    public void addAtTail(int val) {
        Node newNode=new Node(val);
    
        if(head==null){
            head=newNode;
        }
        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
        size++;
    }   
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        Node newNode = new Node(val);

        newNode.next = current.next;
        current.next = newNode;

        size++;
    }
    
    public void deleteAtIndex(int index) {
         if (index < 0 || index >= size) {
            return;
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            current.next = current.next.next;
        }

        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
