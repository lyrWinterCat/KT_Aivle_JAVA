class Calc {
    private double res;
    static final double PI = 3.14159;

    // 인스턴스 메서드 : 원의 넓이 계산
    public double area(double rad){
        res = PI * rad * rad; // 인스턴스 변수에 결과 저장
        return res;
    }

    // 정적 메서드 : 원의 둘레 계산
    public static double circ (double rad){
        return 2 * PI * rad; // 직접 정적 변수 사용
    }
}

public class CalcTest{
    public static void main(String[] args) {
        Calc c = new Calc(); // Calc 인스턴스 생성
        double a = c.area(10); // 인스턴스 메서드 호출
        double d = Calc.circ(20); // 정적 메서드 호출

        System.out.println("넓이 : " + a);
        System.out.println("둘레 : " + d);
    }
}
