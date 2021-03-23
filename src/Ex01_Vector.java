import java.util.Vector;

/*
 * Collection FrameWork
 *  ㄴ Collection : 다수의 데이터, 즉 데이터 그룹
 *  ㄴ [다수의 데이터를] 다루는 [표준환된 인터페이스]를 [구현하고 있는 클래스의 집합]이다.
 *  
 *  
 *  Collection 인터페이스 -> List 인터페이스 상속 -> ArrayList(구현하고 있는 대표적인 것)***
 *                    -> Set 인터페이스 상속 -> HashSet, TreeSet(구현)
 *                    
 *                    
 *  Map 인터페이스(key, value) -> HashMap(구현)
 *              ㄴ예) 02는 서울
 *                   031은 경기도..                  
 *  
 *  
 *  > List - 순서가 있는 데이터의 집합, 데이터의 중복을 허용 -> 예) 대기자 명단(줄을 서세요~ 번호표 드릴게요)
 *         - 내부적으로 데이터(자료, 객체)를 **[배열]**로 관리 -> 예)[홍길동][홍길동][홍길동]
 *     - Vector(구버전)     -> 동기화 보장(멀티 스레드) -> Lock(장치) -> 성능 조금 -> 안전성
 *     - ArrayList(신버전)  -> 동기화 보장(멀티 스레드) -> Lock(장치(x)) : 필요에 따라서 -> 성능 우선 -> 안전성 조금 떨어짐
 *     ㄴ ArrayList(신버전), LinkedList, Stack, Vector(구버전)
 *     
 *  ----------------------------------------------------------------------------------------------------------   
 * * 기존의 여러개의 같은 타입의 데이터 관리 : Array 정적(고정)
 *  - 방의 개수가 한번 정해지면 (방의 크기는 변경 불가)
 *    ㄴ int[] arr = new int[5];
 *      arr[0] = 100;
 *  10개의 방이 필요하면? -> 다시 만들어야 됨 [줄이거나 늘리는 작업이 불가]
 *  ㄴ int[] arr2 = new int[10];
 *    arr 자원은 arr2 이관
 *    
 *    Array
 *    1. 배열의 크기 고정 : Car[] cars = {new Car(), new Car()};  -> 방 2개 만든것
 *    2. 접근 방법 (index)방번호 접근 : cars[0],,,n번째 방까지 : length-1
 *    3. 초기에 대한 설정이 변경 불가
 *    
 *    <-> Collection
 *    List > Vector, ArrayList
 *    1. 배열의 크기를 동적으로 확장할 수 있다. : 축소도 가능 -> 말도 안되는 이야기,, -> ***사실은 [배열의 재할당] 이용***
 *    2. 순서를 유지(내부적으로 index 배열), 중복값 허용
 *    3. 데이터 저장 공간 : Array
 *  
 *  > Set - 순서를 유지하지 않는 데이터의 집합, 데이터의 중복을 허용하지 않는다 -> 예) 양의 정수집합, 소수의 집합
 *     ㄴ HashSet, TreeSet
 *  
 *  > Map - 키(key)와 값(value)의 쌍(pair)으로 이루어진 데이터의 집합
 *      - 순서는 유지되지 않으며, 키는 중복을 허용하지 않고, 값은 중복을 허용한다.
 *      - 예) 우편번호, 지역번호
 *     ㄴ HashMap, TreeMap, Hashtable, Properties    
 */
public class Ex01_Vector {

    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println("초기 default : 용량 : " + v.capacity()); // v.capacity() ->10개짜리 배열을 만들어준다
        System.out.println("size : " + v.size());
        
        // 배열이니까 중복데이터 상관 없음
        v.add("AA");
        v.add("AA");
        v.add("AA");
        
        System.out.println("데이터 크기  : size : " + v.size());
        System.out.println(v.toString()); // [AA, AA, AA] -> 재정의 
        //Array 에서 length 가
        // ㄴ Collection 에서는 size
        for(int i=0; i<v.size(); i++) {
            System.out.println(v.get(i));  // array[i]를 해서 출력했다면 -> get함수를 이용 get()에 인덱스를 준다.
        }
        // 개선된 for문
        for(Object obj : v) {  // v라고하는 vector라고 하는 객체가 가지는 자원을 하나씩 끄집어서 출력
            System.out.println(obj);
        }
        
        // 제너릭 -> 타입을 강제 할 수 있는 방법 -> 나중에 배울거임!!
        Vector<String> v2 = new Vector<String>();  //<>안에 타입을 써준다.
        v2.add("hello");
        v2.add("world");
        v2.add("king");
        
        for(String str : v2) {
            System.out.println(str);
        }
        
        Vector v3 = new Vector();
        System.out.println(v3.capacity());
        
        // 11개로 늘렸는데 capacity는 2배씩 늘어난다. -> 애총체 10개니깐 20개로 늘어남
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        System.out.println(v3.capacity());  // 20개 2배로 늘어남
        System.out.println(v3.size());  // 11개

    }

}
