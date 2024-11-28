public class Demo { // 클래스 정의
    int field; // 필드 선언

    public void showDiff() { // 메소드 정의
        int local = 7; // 지역변수

        // 클래스 필드와 지역변수의 값을 출력
        System.out.println("클래스 필드: " + field); // 출력: 클래스 필드: 0
        System.out.println("메소드 지역변수: " + local); // 출력: 메소드 지역변수: 7
    }

    public void changeField() { // 다른 메소드에서 클래스 필드의 값을 변경
        field = 10; // 필드 값 변경
        // 'local' 변수는 여기서 접근할 수 없음 (showDiff 메소드 내에서만 존재)
    }

    public static void main(String[] args) { // 메인 메소드
        Demo demoInstance = new Demo(); // Demo 객체 생성
        demoInstance.showDiff(); // showDiff 메소드 호출
        demoInstance.changeField(); // changeField 메소드 호출

        // 필드 값이 변경된 후 출력
        System.out.println("변경된 클래스 필드: " + demoInstance.field); // 출력: 변경된 클래스 필드: 10
    }
}
