// Ball 클래스 정의
class Ball {
    double radius; // 반지름

    // Ball 클래스의 생성자
    public Ball(double r) {
        radius = r;
    }

    // 반지름을 설정하는 메소드
    public void setRadius(double r) {
        radius = r;
    }
}

// 메인 클래스
public class Prim {
    public static void main(String[] args) {
        int a = 10; // 기본 단위 변수 선언과 초기화
        int b = a;  // a를 b에 복사

        System.out.println("a의 값은: " + a); // a의 값 출력
        System.out.println("b의 값은: " + b); // b의 값 출력

        // Ball 객체 생성 및 참조 변수 할당
        Ball myBall = new Ball(4.0); // 반지름이 4.0인 Ball 객체 생성
        Ball yourBall = myBall; // 참조 변수 할당 복사
        yourBall.setRadius(5.0); // yourBall을 통해 객체의 radius 변경

        System.out.println("myBall의 반지름은: " + myBall.radius); // myBall의 radius 값 출력
        System.out.println("yourBall의 반지름은: " + yourBall.radius); // yourBall의 radius 값 출력
    }
}
