import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * Map 인터페이스
 *  ㄴ Map (key, value) -> 쌍(pair)의 구조를 갖는 배열
 *            ㄴ 예) (02, 서울) (031, 경기)
 *  ㄴ key : 중복을 허락하지 않음.
 *  ㄴ value : 중복을 허락함(key값으로 구분하니깐..)
 *     ㄴ generic 지원함(key, value 타입을 강제할 수 있다.)
 *     
 * Map 인터페이스 구현
 * 구버전 : HashTable 동기화 보장(lock을 갖고 있음) -> 잘 몰라도 됨
 * 신버전 : HashMap(동기화를 강제하지 않다.) -> 성능을 고려해서 설계함
 *           
 */
public class Ex12_Map_Interface {
    public static void main(String[] args) {
        // HashMap<K, V>
        // ㄴ 예)사용자의 ID, PW
        HashMap map = new HashMap();
        map.put("Tiger", "1004");
        map.put("scott", "1004");
        map.put("superman", "1004");

        // 중복 ID 검사
        // containKey
        System.out.println(map.containsKey("tiger")); // 대소문자 구분 -> false나옴
        System.out.println(map.containsKey("scott")); // true

        // containsValue
        System.out.println(map.containsValue("1004")); // true
        System.out.println(map.containsValue("1007")); // false

        // point
        // key제공하면 value값을 알 수 있다.
        // get함수를 사용하면 value값을 리턴함
        System.out.println(map.get("superman")); // 1004 >> value값을 리턴함
        System.out.println(map.get("hong")); // null >> 해당 key에 해당하는 value가 없다면 null값을 리턴함

        // overwrite
        map.put("Tiger", "1007"); // key가 동일하다면 value값을 overwrite(덮어씀)한다.
        System.out.println(map.get("Tiger")); // 1007로 바뀜 -> value값을 overwrite
        System.out.println(map.size());

        Object value = map.remove("superman"); // superman 삭제 , 혹시 너 진짜 삭제해도 괜찮겠뉘...(Object value : 생략해도됨)
        System.out.println("value : " + value); // superman vlaue값 1004 -> key 삭제하면 value도 삭제됨

        System.out.println(map.toString()); // {scott=1004, Tiger=1007} -> 재정의

        // 응용
        Set set = map.keySet(); // key 집합 -> 규칙 -> 순서(x) -> 중복(x) -> Set을 리턴
        Iterator it = set.iterator(); // 순차적
        while (it.hasNext()) {
            System.out.println(it.next()); // scott, Tiger
        }
        
       Collection clist =  map.values(); // values는 collection 리턴 -> 중복데이터가 있으니깐.
       System.out.println(clist.toString()); // 1004, 1007
       
       // 채팅방
       // ㄴstring -> 방
       // ㄴlist -> 사용자
       // ㄴMap 하고 List를 혼합해서 사용
       //    ㄴHashMap<String, List> room = new HashMap<String, List>();
       //      room.add("1", new ArrayList());
       
    }

}
