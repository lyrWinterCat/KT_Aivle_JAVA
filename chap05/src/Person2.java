public class Person2 {
    private String name;
    private int age;

    // 이름 설정 메서드. 반환형은 Person 객체
    public Person2 setName(String name) {
        this.name = name;
        return this;
    }

    // 나이 설정 메서드. 빈환형은 Person 객체
    public Person2 setAge(int age) {
        this.age = age;
        return this;
    }

    // 인사 메서드
    public void Hello(){
        System.out.println("안녕, 나는 "+name+"이고 "+age+" 살이야");
    }

    public static void main(String[] args) {
        Person2 person2 = new Person2(); // Person 객체 생성
        person2.setAge(30).setName("진호").Hello(); // 메서드 체이닝으로 속성 설정 후 인사
    }
}
