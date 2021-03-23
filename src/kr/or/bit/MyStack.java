package kr.or.bit;

// Stack 자료구조 설계

// 1. 저장공간이 필요 : Array -> Object[] sarray
//     ㄴ MyStack my = new MyStack(10);  -> 기본적으로 배열이 생성되어야 한다. -> 크기를 설정 가능
//                                 ㄴ 10을 주면 Object배열이 10개 생긴다
// 위치정보 : 저장되는 값이 있는 위치정보가 필요하다.(position, index)
// 기능 : push(Object) , Object pop, isEmpty, Full


// (수요일 종이 시험)
public class MyStack {
    private Object[] stackarr; // 저장공간
    private int maxsize; // 최대크기
    private int top; // 배열의 index(위치정보)

    public MyStack(int maxsize) {
        this.maxsize = maxsize;
        stackarr = new Object[maxsize]; // object배열의 갯수를 maxsize(10개) 만들거다.
        top = -1;

    }

    public boolean isEmpty() {
        return (top == -1); // true, false
    }

    public boolean isFull() {
        return (top == maxsize - 1);
    }

    public void push(Object i) {
        if (isFull()) {
            System.out.println(".....stack full.....");
        } else {

            stackarr[++top] = i; // -1이였으니까 0으로 만들고 그 방에다가 데이터를 넣는다.
        }
    }
    public Object pop() {
        Object value = null;
        
        if(isEmpty()) {
            System.out.println(".....stack empty.....");
        }else {
            value = stackarr[top];
            top--;
        }
        
        return value;
    }

}
