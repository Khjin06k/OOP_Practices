public class CarTests {
    public static void main(String[] args) {
       /* Car bmw = new Car(); //bmw라는 인스턴스를 Car 클래스를 기반으로 생성함
        Car tesla = new Car();
        Car audi = new Car();*/
        //위와 같이 Car라는 클래스는 일종의 틀이기에 그 틀로부터 여러 종류의 인스턴스를 뽑아낼 수 있음.
        // Car bmw = new Car();
        // Car : 클래스 명 / bmw : 참조 변수명 / Car() : 생성자 / new : 힙 메모리에 생성 객체를 넣으라는 의미의 키워드로 주소값을 참조 변수에 저장함
        Car tesla = new Car("Model 3", "빨강"); //객체 생성 >>생성자 Car()는 클래스에서 인스턴스 초기화를 위한 생성자 함수 이용

        System.out.println("내 차의 모델은 " + tesla.model + "이고 색은 " + tesla.color + "입니다");
        //tesla.model은 테슬라에 대한 모델 즉 위의 테슬라 객체에 생성자를 이용해 저장한 모델 / tesla.color 테를라에 저장된 색상 을 지정함.
        tesla.power(); //메서드 호출
        tesla.accelerate();
        tesla.stop();
        //메서드를 호출하며 tesla는 위의 Car tesla로 인해 class Car에 대한 인스턴스이기에 클래스 Car를 가져온다. 따라서 해당 메서드는 클래스에서 불러옴
    }
}

    class Car {
        // Car에 대한 속성 내용들 (속성 = 변수)
   /* private String model;
    private int whells;
    private int doors;
    private String color;

    // Car에 대한 기능 내용 (기능 = 메서드)
    void power() {};
    void accelerate() {};
    void stop() {};*/

        //Car에서 차의 모델과 색을 지정
        public String model;
        public String color; // 필드 선언

        public Car(String model, String color) { //인스턴스 초기화를 위한 생성자 함수
            this.model = model;
            this.color = color;
        }

        //메서드 선언
        void power() {
            System.out.println("시동을 걸었습니다.");
        }

        void accelerate() {
            System.out.println("더 빠르게!");
        }

        void stop() {
            System.out.println("멈춰!");
        }
    }


