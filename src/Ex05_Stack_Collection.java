import java.util.Stack;

import kr.or.bit.MyStack;

/*
 * JAVA API가 Stack 과 Queue를 제공
 * 
 * Stack 자료구조 그림 그리고 암기(응용)
 */
public class Ex05_Stack_Collection {

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("A");
        s.push("B");
        System.out.println(s.pop()); // B
        System.out.println(s.pop()); // A
        //System.out.println(s.pop()); -> 데이터가 없을때 pop을 하면 예외
        System.out.println(s.isEmpty()); // true
        System.out.println("***************************************");
        // MyStack 
        MyStack my = new MyStack(5);
        System.out.println(my.isEmpty());
        System.out.println(my.isFull());
        my.push("A");
        my.push("B");
        my.push("C");
        my.push("D");
        my.push("E");
       // my.push("F");
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());

    }

}
