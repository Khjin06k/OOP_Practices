package Polymorphism;

public class PolymorphismCoffee {
    public static void main(String[] args) {
        Customer customer = new Customer(); //Customer 클래스 이용을 위해 참조변수 선언 >>customer을 이용하여 해당 클래스 안에 있는 메서드를 불러올 수 있음
        customer.buyCoffee(new Americano()); //customer의 buyCoffee 메서드를 Americano를 이용하여 불러옴
        customer.buyCoffee(new CaffeLatte()); //위와 동일하게 CaffeLatte를 이용하여 불러옴

        System.out.println(String.format("현재 잔액은 %d원 입니다.", customer.money));
    }
}

//코든 클래스는 메인 클래스 외부에 선언
    class Coffee{ //커피 가격을 담은 커피 클래스
        int price; //가격

        public Coffee(int price){ //price를 매개변수로 같는 이너클래스
            this.price = price; //price를 매개변수로 받은 후 해당 가격을 가리킴.
        }
    }

    class Americano extends Coffee {
        public Americano(){
            super(4000); //상위 클래스인 Coffee 클래스의 생성자를 호출
        }
        public String toString() {return "아메리카노";};
    }; //Coffee 클래스를 상속받은 Americano 클래스
    class CaffeLatte extends Coffee {
        public CaffeLatte(){
            super(5000); //상위 클래스인 Coffee 클래스의 생성자를 호출
        }
        public String toString() {return "카페라떼";};
    }; //Coffee 클래스를 상속받은 CaffeLatte 클래스

    class Customer { //처음 가지고 있는 금액을 나타내는 Customer 클래스 생성
        int money = 50000; //가진 돈
/*
        //손님이 아메리카노와 카페라떼를 구입한다고 생각해보기
        //사야하는 커피가 무엇인지 각각 매게변수로 정보를 절달함
        void buyCoffee(Americano americano){ //아메리카노를 구입하는 메서드 생성
            money = money-americano.price; //가진 돈에서 아메리카노 구입 금액만큼 금액 차감 실행
        }
        void buyCoffee(CaffeLatte caffeLatte) {//카페라떼를 구입하는 메서드
            money = money-caffeLatte.price; //가진 돈에서 카페라떼를 구입 금액만큼 금액 차감 실행
        }
        */
        //커피의 종류가 많을 경우 즉, 커피라는 클래스는 하나고 해당 카페가 여러가지 종류일 경우 다형성 이용 가능
        void buyCoffee(Coffee coffee){//매게변수 다형성 이용하여 coffee라는 매게변수로 통일 진행
            if(money <coffee.price){
                System.out.println("잔액이 부족합니다.");
                return;
            }
            money = money - coffee.price;
            System.out.println(coffee+"를 구입했습니다.");
        }
    }

