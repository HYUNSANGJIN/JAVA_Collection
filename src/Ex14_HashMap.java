import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * HashMap<k,v>
 * 
 * HashMap<String, String>
 * HashMap<Integer, String>
 * HashMap<String, Emp> -> values가 여러개의 값을 가진다.
 * -> put("kim", new Emp()); -> kim 이라는 객체의 주소를 넣는다.
 * 
 */
class Student {
    int kor;
    int math;
    int eng;
    String name;

    public Student(int kor, int math, int eng, String name) {
        super();
        this.kor = kor;
        this.math = math;
        this.eng = eng;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [kor=" + kor + ", math=" + math + ", eng=" + eng + ", name=" + name + "]";
    }

}

public class Ex14_HashMap {
    public static void main(String[] args) {
        // 선생님이 학생마다 ID 부여
        // 반 20명의 학생을 관리
        HashMap<String, Student> sts = new HashMap<String, Student>(); // 20명 등록
        sts.put("kim", new Student(100, 99, 88, "현상진")); // student 객체로 관리
        sts.put("hong", new Student(50, 40, 60, "김유신"));

        // 성적보기
        // id만 알면 됨
        Student std = sts.get("hong");
        System.out.println(std);

        // tip
        // ㄴ Map (key, value)관리
        // ㄴ 두가지를 한번에 볼 수 있음
        Set set = sts.entrySet(); // -> key + "=" + value (하나의 문자열로 만들어서 관리)
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
//           hong=Student [kor=50, math=40, eng=60, name=김유신]
//           kim=Student [kor=100, math=99, eng=88, name=현상진]

            // tip 2
            // 분리된 key, value 획득
            // class Entry {Object key, Object value}
            // Map{Entry[] elements } -> Map.Entry 인터페이스
            // Map.Entry 타입으로 받으면 key 와 value를 분리해서 얻을 수 있다.
            for (Map.Entry m : sts.entrySet()) {
                System.out.println(m.getKey() + "/" + m.getValue());
//                hong/Student [kor=50, math=40, eng=60, name=김유신]
//                kim/Student [kor=100, math=99, eng=88, name=현상진]
            }

        }

    }

}
