import java.util.HashMap;

import java.util.Scanner;

public class Ex13_HashMap {
    public static void main(String[] args) {
        // HashMap
        // 지역번호, 출석부, 우편번호, 회원가입 등등
        
        // 회원가입 
        // 회원정보
        HashMap loginmap = new HashMap();
        loginmap.put("kim", "kim1004");
        loginmap.put("scott", "tiger");
        loginmap.put("lee", "kim1004");
        
        // 회원가입은 처리 끝~!~!
        // 로그인 시스템
        // id(o) , pw(o) -> 회원님 안녕~
        // id(o) , pw(x) -> 비밀번호를 다시 입력해주세요
        // id(x) , pw(o) 
        // id(x) , pw(x)
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("id 와 pw를 입력하세요");
            System.out.println("ID");
            String id = sc.nextLine().trim().toLowerCase();  // trim -> 양쪽 공백 제거 , toLowerCase -> 모두 소문자로 받겠다
            
            System.out.println("PW");
            String pw = sc.nextLine().trim();
            
            if(!loginmap.containsKey(id)) {
                // id(x)
                System.out.println("id가 맞지 않습니다.");
            }else {
                // id(o)
                if(loginmap.get(id).equals(pw)) {  // get(id)문자열을 equals로 비교
                    System.out.println("회원님 좋은하루 되세요 ^^");
                    break;
                    
                }else {
                    System.out.println("pw를 확인해주세요");
                }
            }
        }

       
    }

}
