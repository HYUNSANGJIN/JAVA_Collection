import java.util.ArrayList;

/*
 * <<Today Point>>
 * Collection 클래스를 설계했을때 -> 데이터 저장 공간의 타입을 -> Object로 설계
 * 1. Object 타입 저항 -> 타입 문제 -> 처음 객체를 생성할때 -> Type을 강제하자 -> generic
 * 2. 타입 안정성(타입 강제성)
 * 3. 강제적인 형변환(casting) : Car c = (Car)obj (x)
 * 
 * class MyGen<T>{ // type parameter
    Object obj;
    
    void add(Object obj) {
        this.obj = obj;
    }
    
    Object get() {
        return this.obj;
    }
    
}
 * 
 */

// 클래스 설계 (제너릭 적용) 설계도를 생성
class MyGen<T> { // type parameter
    T obj;

    void add(T obj) {
        this.obj = obj;
    }

    T get() {
        return this.obj;
    }

}

class Person extends Object {
    int age = 100;
}

public class Ex06_Generic {
    public static void main(String[] args) {
        MyGen<String> mygen = new MyGen<String>();
        mygen.add("문자열");
        String str = mygen.get();
        System.out.println(str);

        ArrayList list = new ArrayList();
        // 내부적인 저장 공간의 타입 : Object[] elements
        list.add(10);
        list.add(new Person()); // -> object타입이라 다 들어갈 수 있음
        list.add("홍길동");

        for (Object obj : list) {
            // 출력하려면 방안에 있는 녀석들의 타입 정보를 알아야한다.
            // 값타입, 객체타입 casting...
            if (obj instanceof Person) { // 타입을 확인
                Person p = (Person) obj;
                System.out.println(p.age);
            } else {
                System.out.println(obj);
            }
        }
        ArrayList<Person> plist = new ArrayList<Person>();
        plist.add(new Person());
        plist.add(new Person());
        
        for(Person p : plist) {
            System.out.println(p.age);
        }

    }

}
