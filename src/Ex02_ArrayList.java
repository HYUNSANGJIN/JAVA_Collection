import java.util.List;


import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ListCellRenderer;

// Today Point
// 꼭 알아야함!!!
public class Ex02_ArrayList {

    public static void main(String[] args) {
        // List 인터페이스 구현 : 순서가 있는, 중복허용하는 데이터의 집합을 다룰때 쓰는 클래스
        
        ArrayList arraylist = new ArrayList();
        // Object 타입을 가지는 정적배열이 heap메모리에 생성
        arraylist.add(100);
        arraylist.add(200);
        arraylist.add(300);
        
        for(int i=0; i<arraylist.size(); i++) {
            System.out.println(arraylist.get(i)); // 100,200,300
        }
        System.out.println(arraylist.toString()); // [100,200,300]
        
        System.out.println(arraylist.get(0)); // 100
        
        /* 순차적인 데이터 다루는 것(장단점)에 대한것이 있을까???
                          ㄴ  비순차적인 데이터에 대해서 추가, 삭제 하는 것은 ArrayList가 좋지 않다
                                                                                                           ㄴ 순서가 있는 데이터 집합이여야 한다.
           [100, 200, 300] ->                                                                                        
        */
        arraylist.add(0, 111);  // -> 0번째 방에 111을 넣은것이다
        System.out.println(arraylist); // ->[111, 100, 200, 300]  뒤로 밀려난다
        
        arraylist.add(400);  //
        System.out.println(arraylist); // -> [111, 100, 200, 300, 400]
        
       // arraylist.remove(100); -> java.lang.IndexOutOfBoundsException: Index: 100, Size: 5
        
        //[111, 100, 200, 300, 400] 현재 arraylist에 들어있는 값
        //ArrayList 함수공부(String 함수 학습)
        System.out.println(arraylist.contains(200)); // true -> 배열안에 200이라는 값이 있니??
        System.out.println(arraylist.contains(2000)); // false
        
        arraylist.clear(); // 데이터만 삭제하고 공간은 남아있다.
        System.out.println(arraylist.size());  // 0 -> 데이터를 다 삭제하고 공간만 남음
        System.out.println(arraylist.isEmpty()); // true, false로 답한다.
        
        arraylist.add(101);
        arraylist.add(102);
        arraylist.add(103);
        
        System.out.println(arraylist.isEmpty()); // false -> 새로운 3개의 값을 빈 상태에서 다시 넣었기 때문에 false
        System.out.println("삭제전 : " +arraylist.size());  // 3 -> 데이터 3개 넣었으니깐
        Object value = arraylist.remove(0);  // 0번째 방의 값을 삭제한다. -> 그 값을 return해줌
        System.out.println("value 값은 뭐가 지워집니까 : " + value);
        System.out.println("삭제후 : " +arraylist.size());
        System.out.println(arraylist.toString()); // [102, 103]
        
        // point
        // 개발자 쓰는 코드 .. 일상다반사
        // 다형성..(확장성, 유연성)
        
        List li = new ArrayList();  // li가 vector와 arraylist주소값을 받을수 있다.
        li.add("가");
        li.add("나");
        li.add("다");
        li.add("라");
        
        List li2 = li.subList(0, 2);  // sublist를 통해서 데이터 집합을 하나 더 생성하겠다.
        System.out.println(li2.toString());
        
        
        ArrayList alist = new ArrayList();
        alist.add(50);
        alist.add(1);
        alist.add(7);
        alist.add(40);
        alist.add(46);
        alist.add(3);
        alist.add(15);
        
        System.out.println(alist.toString()); // [50, 1, 7, 40, 46, 3, 15] 0~...
        Collections.sort(alist);  // 초급자는 sort 버블정렬 (x)
        System.out.println(alist.toString()); // [1, 3, 7, 15, 40, 46, 50]
        
        Collections.reverse(alist);
        System.out.println(alist.toString());
        
        
    }

}
