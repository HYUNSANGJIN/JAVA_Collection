import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_Set_Tree {

    public static void main(String[] args) {
        // Set 인터페이스 : 순서를 보장하지 않는다, 중복 허용하지 않는다.
        HashSet<String> hs = new HashSet<String>();
        
        hs.add("B");
        hs.add("A");
        hs.add("F");
        hs.add("K");
        hs.add("G");
        hs.add("D");
        hs.add("F");
        hs.add("P");
        hs.add("A");
        hs.add("C");
        System.out.println(hs.toString());  //[P, A, B, C, D, F, G, K] -> 순서 상관(x) 중복 (x)
        
        // TreeSet
        //  ㄴ 검색하거나 데이터를 정렬할때 필요함.(데이터 집합)
        // 약속 : 순서를 보장하지 않고, 중복을 허용하지 않는다. 
        //       ㄴ 정렬해주세요..ㅎㅎ
        
        // 1. 이진트리구조(균형잡힌트리)
        // 2. 데이터가 저장될때 정렬됨
        // lotto 이걸로 짜면 편함.....중복데이터 안들어가고, 순서 상관없움, 데이터는 정렬된다.
        Set<Integer> lotto = new TreeSet<Integer>();
        for(int i=0; lotto.size()<6; i++) {
            lotto.add((int)(Math.random()*45+1));
        }
        System.out.println(lotto.toString());
        



        

    }

}
