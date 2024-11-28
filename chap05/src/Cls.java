public class Cls {
    // 필드 (변수)
    double radius;
    
    //생성자
    public Cls(double r){
        radius = r; // 반지름 초기화
    }
    
    // 메서드 - 반지름에서 부피 계산
    double getVolume(){
        return 4.0 / 3.0 * Math.PI*Math.pow(radius,3);
    }
    
    // 메서드 - 부피를 이용하여 표면적 계산
    double getArea(){
        return 4 * Math.PI * radius * radius;
    }

    // 메인메서드 - 프로그램 실행
    public static void main(String[] args) {
        Cls ball = new Cls(2.0);
        System.out.println("부피 : " + ball.getVolume());
        System.out.println("표면적 : "+ball.getArea());
    }
}
