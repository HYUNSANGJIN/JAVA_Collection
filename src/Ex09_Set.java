import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Set 인터페이스를 구현하는 클래스
// Set (예) 원 안에 들어가세요) -> 순서를 보장하지 않는다, 중복을 허용하지 않는다. -> 순서가 없고 중복을 허락하지 않는 데이터의 집합
// HashSet, TreeSet

public class Ex09_Set {

    public static void main(String[] args) {
        
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(100);
        boolean bo2 = hs.add(55);
        System.out.println(bo2);  // 자루안에 55가 정상적으로 들어갔다. true
        
        bo2 = hs.add(1); // 보장 : 중복값은 안된다.(위에 이미 자루에 1을 넣었음)
        System.out.println(bo2);  // false
        
        System.out.println(hs.toString()); // [1, 100, 55]
        
        hs.add(2);
        System.out.println(hs.toString()); // [1, 2, 100, 55] -> 순서대로라면 2가 마지막에 나와야 하는데 
                                           // 순서가 보장되지 않는다(배열이 아니기 때문에!)
        
        HashSet<String> hs2 = new HashSet<String>();
        hs2.add("b");
        hs2.add("A");
        hs2.add("F");
        hs2.add("c");
        hs2.add("Z");
        hs2.add("A");
        hs2.add("A");
        hs2.add("A");
        
        System.out.println(hs2.toString()); // [A, b, c, F, Z] -> 중복값 없음!!
        
        String[] obj = {"A", "B", "C", "D", "D", "A"};
        HashSet<String> hs3 = new HashSet<String>();
        for(int i=0; i<obj.length; i++) {
            hs3.add(obj[i]);  // 중복된 데이터는 갖고오지 않는다.
        }
        System.out.println(hs3.toString()); // [A, B, C, D]
        
        // Quiz
        // HashSet 을 1~45까지의 난수 6개를 넣어라
        // lotto : for문
        
//        for(int i = 0 ; i < 6 ; i++) {
//            numbers[i] = (int)(Math.random()*45 + 1);
//             for(int j = 0 ; j < i ; j++) { //j < i (채워진 개수 만큼 비교)
//                 if(numbers[i] == numbers[j]) {
//                     i--; //point 같은 방의 값을 바꾸어여 한다
//                     break;
        
        HashSet<Integer> lotto = new HashSet<Integer>();
        for(int i=0; lotto.size()<6; i++) {  // lotto.size()<6 은 기존 lotto에서 i--; 랑 같은거다
            int num = (int)(Math.random()*45 + 1);
            lotto.add(num);
            System.out.println("i : " + i + " | num : " + num);
            
        }
        System.out.println(lotto.size());  // add가 될때마다 사이즈가 늘어난다.
        System.out.println(lotto);
        
        ///////////////////////////////////////////////////////////////////////////////////////
        
        // lotto : while 문
        // for문보단 while문이 더 실용적일 수 도 있다.
        Set set2 = new HashSet(); // 다형성 Set 인터페이스 받기
        int index = 0;
        while(set2.size() < 6) {  
            int num = (int)(Math.random()*45 +1);
            set2.add(num);
        }
            System.out.println("lotto : " + set2);
            
            ////////////////////////////////////////////////////////////////////////////////////
            
            HashSet<String> set3 = new HashSet<String>();
            set3.add("AA");
            set3.add("DD");
            set3.add("ABC");
            set3.add("FFF");
            System.out.println(set3.toString());
            
            // iterator로 출력
            Iterator<String> st = set3.iterator();
            
            while(st.hasNext()) {
                System.out.println(st.next());  // set 배열(x) -> 순차적으로 데이터 출력 가능
                                                // AA DD ABC FF
               
            }
            

    }

}
