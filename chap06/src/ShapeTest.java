class Circle{
    double r;

    // 생성자 : 원의 반지름을 초기화함
    Circle(double r){
        this.r = r; // 원의 반지름
    }
    
// 원의 반지름을 반환하는 메서드
    double getRadius(){
        return r;
    }

    // 원의 면적을 계산하는 메서드
    double area() {
        return Math.PI * r * r;
    }

}

class Sphere extends Circle{
    // 생성자 : 구의 반지름 초기화
    Sphere(double r){
        super(r);
    }
    
    // 구의 부피 계산 메서드
    double vol(){
        return(4.0/3.0)*Math.PI*Math.pow(r,3);
    }
    
    // 구의 표면적 계산 메서드
    double surfArea(){
        return 4 * super.area();
    }

    // 구의 정보 출력 메서드
    void info(){
        System.out.println("반지름 : "+getRadius()+"인 구 부피 : "+vol()+ "입니다.");
        System.out.println("반지름 : "+getRadius()+"인 구 표면적 : "+surfArea()+ "입니다.");
    }
}

// 실행 클래스
public class ShapeTest {
    public static void main(String[] args) {
        // 반지름이 10인 구 객체 생성, 정보 출력
        Sphere b = new Sphere(10.0);
        b.info();
    }
}
