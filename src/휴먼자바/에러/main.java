package 휴먼자바.에러;

public class main {
    public static void main(String[] args) {
        part 프론트 = new part("front", "홈페이지" );
        part 백엔드 = new part("back", "정보처리" );
        part 데이터 = new part("data", "데이터베이스" );
        part 매니저 = new part("manager", "기획관리" );

        member 김종기 = new member("김종기", 프론트);
        member 이종기 = new member("김종기", 백엔드);
        member 박종기 = new member("김종기", 데이터);
        member 추종기 = new member("김종기", 매니저);

        System.out.println(김종기.part.partname);


    }
}
