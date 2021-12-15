package singleton;

/** 싱글톤을 구현하는 sp 번째 방법
 *  Inner Class 를 사용허는 방법
 *  앞 3가지와는 다르게 Singleton 클래스가 자기 자신 타입의 맴버변수를 가지고 있지 않고 Inner Class가 가지고 있다.
 *  Inner Class가 호출되는 시점에 최초로 생성이 되기 때문에 성능적인 이슈도 없고 인스턴스가 필요하지 않다면 생성하지 않는다.
 */
public class Singleton4 {

    private Singleton4(){}

    private static class SingletonHolder{
        static final Singleton4 singleton4 = new Singleton4();
    }

    public static Singleton4 getInstance(){
        return SingletonHolder.singleton4;
    }
}
