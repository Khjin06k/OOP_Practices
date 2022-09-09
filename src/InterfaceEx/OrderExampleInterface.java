package InterfaceEx;

public class OrderExampleInterface {
    public static void main(String[] args) throws Exception{
        CafeOwner cafeOwner = new CafeOwner(); //CafeOwner 생성자 생성 후 cafeOwner 매게변수에 저장
        CafeCustomerA cafeCustomerA = new CafeCustomerA();//CafeCustomerA 생성자 생성 후 a라는 매게변수에 저장
        CafeCustomerB cafeCustomerB = new CafeCustomerB();//CafeCustomerB 생성자 생성 후 b라는 매게변수에 저장

        cafeOwner.giveItem(cafeCustomerA); //CafeOwner 클래스 내 giveItem 매세드에서 매게변수를 a로 가지는 메서드를 호출
        cafeOwner.giveItem(cafeCustomerB); //CafeOwner 클래스 내 giveItem 메서드에서 매게변수를 b로 가지는 메서드를 호출
    }
}

interface CafeCustomer{ //인터페이스 선언
    public abstract String getOrder(); //getOrder은 각 클래스에서 오버라이딩 진행하기에 빈블럭으로 남겨둠
}
class CafeCustomerA implements CafeCustomer{ //CafeCustomer을 상속받은 클래스
    public String getOrder(){
        return "a glass of iced americano"; //인터페이스 적용 후 각각의 클래스에서 오버라이딩 진행
    }
}

class CafeCustomerB implements CafeCustomer{ //CafeCustomer을 상속받은 클래스
    public String getOrder(){
        return "a glass of strawberry latte"; //인터페이스 적용 후 각각의 클래스에서 오버라이딩 진행
    }
}

class CafeOwner {
    public void giveItem(CafeCustomer cafeCustomer) {
        System.out.println(String.format("Item : %s", cafeCustomer.getOrder()));
    }
}