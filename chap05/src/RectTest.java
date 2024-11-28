class Rect {
    private double w; //너비
    private double h; //높이

    // 디폴트 생성자
    public Rect() {
        this.w = 1.0;
        this.h = 1.0;
    }

    public Rect(double width, double height){
        this.w = width;
        this.h = height;
    }

    public void printSize(){
        System.out.println("너비 : "+w+ ", 높이 : "+h);
    }
}

public class RectTest {
    public static void main(String[] args) {
        Rect r1 = new Rect();
        Rect r2 = new Rect(2.0, 3.0);

        r1.printSize();
        r2.printSize();
    }
}
