package InterfaceEx;

public class OrderExample {
    public static void main(String[] args) throws Exception{
        CafeOwner cafeOwner = new CafeOwner(); //CafeOwner 생성자 생성 후 cafeOwner 매게변수에 저장
        CafeCustomerA a = new CafeCustomerA();//CafeCustomerA 생성자 생성 후 a라는 매게변수에 저장
        CafeCustomerB b = new CafeCustomerB();//CafeCustomerB 생성자 생성 후 b라는 매게변수에 저장

        cafeOwner.giveItem(a); //CafeOwner 클래스 내 giveItem 매세드에서 매게변수를 a로 가지는 메서드를 호출
        cafeOwner.giveItem(b); //CafeOwner 클래스 내 giveItem 메서드에서 매게변수를 b로 가지는 메서드를 호출
    }
}

class CafeCustomer{
    public String cafeCustomerName;

    public void setCafeCustomerName(String cafeCustomerName){ //메서드 선언
        //손님의 이름을 매게변수로 받아 전달함.
        this.cafeCustomerName =cafeCustomerName;
    }
}
class CafeCustomerA extends CafeCustomer{ //CafeCustomer을 상속받은 클래스

}

class CafeCustomerB extends CafeCustomer{ //CafeCustomer을 상속받은 클래스

}

class CafeOwner{
    public void giveItem(CafeCustomerB cafeCustomerB) {
        System.out.println("give a glass of strawberry latte to CafeCustomer B");
    }

    public void giveItem(CafeCustomerA cafeCustomerA) {
        System.out.println("give a glass of iced americano to CafeCustomer A");
    }
}