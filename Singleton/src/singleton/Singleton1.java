package singleton;

/** 싱글톤을 구현하는 첫 번째 방법
 *  Eager Initialization(이른 초기화)
 *  클래스 로드 시에 new 가 실행되어 항상 1개의 인스턴스를 가지게 된다.
 *  JDK 에서 제공하는 Singleton은 (ex. Collection empty, ValueOf..) 이 방법을 사용하고 있다.
 */
public class Singleton1 {
    /* 외부에서 이 맴버변수로 직접 접근하여 사용할 수 있도록 public static final 로 사용하기도 한다. */
    private static Singleton1 singleton1 = new Singleton1(); // 맴버변수로 자기 자신의 클래스의 인스턴스를 가진다.

    private Singleton1(){ // private 생성자를 사용하여 외부에서 인스턴스를 생성하지 못하게 한다. (현재 클래스에서만 인스턴스 생성 가능)
    }

    public static Singleton1 getInstance(){ // getInstance() 메소드를 통해 객체를 static하게 가져온다.
        return singleton1;
    }
}
