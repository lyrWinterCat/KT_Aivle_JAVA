public class Person { // 클래스 필드
    private String name; // 개인 필드

    // 생성자
    public Person(String name) {
        this.name = name; // 초기 이름 설정
    }

    // alt + insert
    // 접근자 메서드
    public String getName() {
        return name;
    }

    // 설정자 메서드
    public void setName(String name) {
        this.name = name;
    }

    // 메인 메소드
    public static void main(String[] args) {
        Person person = new Person("Jane Doe"); // Person 객체 생성

        // 접근자 메소드를 호출하여 이름 출력
        System.out.println("이름: " + person.getName()); // 이름: Jane Doe

        // 설정자 메소드를 사용하여 이름 변경
        person.setName("John Doe");

        // 변경된 이름 출력
        System.out.println("변경된 이름: " + person.getName()); // 변경된 이름: John Doe
    }
}
