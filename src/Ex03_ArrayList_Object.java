import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object {

    public static void main(String[] args) {
        // 사원 한명 만들기
        Emp emp = new Emp(100, "김유신", "군인");
        System.out.println(emp.toString());
        
        // 사원 2명을 만드세요
        // Array
        Emp[] emplist = {new Emp(100, "김씨", "일반인") , new Emp(200, "박씨", "학생")};
        for(Emp e : emplist) {
            System.out.println(e.toString());
        }
        // 1명이 입사를 더 했다. 추가하세요!!
        
        // 기존에서는 ..
        // Emp[] emplist = new Emp[3];
        // 기존 데이터를 이동시켜야 한다...
        
        // 지금은..!
        // Collection으로
        // ArrayList
        ArrayList elist = new ArrayList();
        elist.add(new Emp(1, "강씨" , "IT"));
        elist.add(new Emp(2, "김씨" , "IT"));
        // 1명 더 입사
        elist.add(new Emp(3, "이씨", "IT"));
        System.out.println(elist.size());
        for(int i=0; i<elist.size(); i++) {
           // System.out.println(elist.get(i));
           // Emp e = elist.get(i); -> ArrayList가 갖고있는 배열 타입이 Object[]이다.
            Object obj = elist.get(i);
           // System.out.println(obj);  // 재정의 한 toString()을 호출
            Emp e = (Emp)obj;
            System.out.println(e.getEmpno() + "/" + e.getEname() + "/" + e.getJob());
        }
        
        for(Object e : elist) {
            // 목적에 따라서는 downcasting이 필요할때도 있다.
            Emp e2 = (Emp) e;
        }
        
        // 개발자가 제일 싫어하는 건 casting 예외
        // 짜증난다 ㅠㅡㅠ
        // ㄴ Object 싫어,,안쓰고 싶다 ㅠㅠ
        //   ㄴ JAVA만든 사람..! 요청합니다!! -> generic 타입을 만들었다.(객체에 대한 생성 타입을 강제)
        // 현업에서는 90%가 generic을 쓴다.
        ArrayList<Emp> list2 = new ArrayList<Emp>();
        list2.add(new Emp(1,"A","IT"));
        
        for(Emp e : list2) {
            System.out.println(e.getEmpno());
        }

    }

}
