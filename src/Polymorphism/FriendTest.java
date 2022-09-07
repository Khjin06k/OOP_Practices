package Polymorphism;

class Friend { //상위 클래스
    public void friendInfo() {
        System.out.println("나는 당신의 친구입니다.");
    }
}

class BoyFriend extends Friend { //Friend 상속받은 BoyFriend 클래스 (하위 클래스)

    public void friendInfo() {
        System.out.println("나는 당신의 남자친구입니다.");
    }
}

class GirlFriend extends Friend { //Friend 상속받은 GirlFriend 클래스 (하위 클래스)

    public void friendInfo() {
        System.out.println("나는 당신의 여자친구입니다.");
    }
}

public class FriendTest {

    public static void main(String[] args) {
        Friend friend1 = new Friend(); // 객체 타입과 참조변수 타입의 일치
        BoyFriend boyfriend = new BoyFriend(); //객체 타입과 참조변수 타입 일치
        Friend girlfriend = new GirlFriend(); // 객체 타입과 참조변수 타입의 불일치
        //GirlFriend() 클래스 인스턴스를 생성하고 이를 girlfriend에 할당하고 있음. 이 girlfriend는 Friend 타입의 참조변수가 됨.
        //GirlFriend는 자식 클래스이기에 부모 클래스인 Friend로의 타입 변환이 가능함
        GirlFriend girlfriend2 = (GirlFriend) friend1;
        //GirlFriend friend2 = (GirlFriend) new Friend(); //위와 반대로 하위 클래스 타입으로 상위 클래스 객체 잠조는 불가능함.

        friend1.friendInfo();
        boyfriend.friendInfo();
        girlfriend.friendInfo();
    }
}