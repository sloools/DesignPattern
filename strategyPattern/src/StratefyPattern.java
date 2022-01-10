/**
 * Strategy Pattern : 행위를 클래스로 캡슐화하여 동적 행위를 자유롭게 바꿀 수 있게 해주는 패턴
 *                    전략을 쉽게 바꿀 수 있도록 해주는 디자인 패턴.
 *                    캡슐화된 여러 알고리즘의 클래스들를 상황에 따라 교체할 수 있게 함으로 동일한 문제를 다른 알고리즘으로 해결할 수 있도록 도와줌.
 *                    인터페이스의 구현체를 바꿈으로서 로직을 변경함
 */
public class StratefyPattern {
    public static void main(String[] args) {
        Pc desktop = new DesktopPc();
        Pc laptop = new LaptopPc();

        Customer customer1 = new Customer(desktop); // 인터페이스를 사용하는 Customer 클래스가 외부로 공개됨 (Context).
        customer1.whatKindOf();

        Customer customer2 = new Customer(laptop);
        customer2.whatKindOf();

    }
}
