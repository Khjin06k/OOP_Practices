import java.util.Scanner;

public class SimpleCalculatorTest { //자바 클래스 파일
    //클래스 파일이기는 하지만 지금까지 배운 범위 내에서 존재했던 클래스 파일로 안에 main함수가 있어 해당 내용들이 실행됨.
    //이후 클래스를 이용한 문제를 학습해야 함

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // 외부 입력을 받을 수 있는 Scanner 객체 생성

        System.out.println("첫 번째 숫자를 입력하세요.");
        String str1 = scan.nextLine(); // 첫 번째 숫자 입력

        System.out.println("사칙연산자를 입력하세요.");
        String op = scan.nextLine(); // 사칙연산자 입력

        System.out.println("두 번째 숫자를 입력하세요.");
        String str2 = scan.nextLine(); // 두 번째 숫자 입력

        int num1 = Integer.parseInt(str1); // 입력받은 첫 번째 문자를 숫자형으로 변환
        int num2 = Integer.parseInt(str2); // 입력받은 두 번째 문자를 숫자형으로 변환
        int result;

        if(op.equals("+")) { // 덧셈 연산
            result = num1 + num2;
        }
        else if(op.equals("-")) { //뺄셈 연산
            result = num1 - num2;
        }
        else if(op.equals("/")) { //나누기 연산
            result = num1 / num2;
        }
        else{
            result = num1 * num2; //곱하기 연산
        }

        System.out.println(str1 + " " + op + " " + str2 + " = " + result); // 결과값 출력
    }

}