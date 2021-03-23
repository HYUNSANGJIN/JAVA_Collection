import java.util.Properties;

/*
 * Property
 * Map 인터페이스 구현한 클래스 
 * 특수한 목적을 가짐 : <String, String> (key, value) 강제
 * 사용 목적이 명확함
 * ㄴ DB 연결정보 (id = kglim, pw = 1004)
 * ㄴ App 전체에 사용되는 자원 관리
 * ㄴ 환경변수
 * ㄴ 프로그램 버전
 * ㄴ 공통 파일 경로
 * ㄴ 공통 변수
 */
public class Ex16_Properties {
    public static void main(String[] args) {
        Properties prop = new Properties();  // key, value가 고정되어 있음
        prop.setProperty("admin", "bit@bit.co.kr");
        prop.setProperty("version", "1.x.x.x");
        prop.setProperty("patch", "C:\\Temp\\images");
        // 각각의 개발 페이지
        System.out.println(prop.getProperty("admin")); // key값을 넣으면 value가 나옴
        System.out.println(prop.getProperty("version"));

    }

}
