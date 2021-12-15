package singleton;
/** 싱글톤을 구현하는 두 번째 방법
 *  클래스 로드시에 인스턴스를 생성하는 첫 번째 방법과는 다르게, getInstance()가 처음 호출될 때 인스턴스가 생성된다.
 *  synchronized 키워드를 사용하였기 때문에 성능은 비교적 안 좋지만 인스턴스를 사용하지 않을 때는 인스턴스를 생성하지 않는다는 장점이 있다.
 */
public class Singleton2 {
    private static Singleton2 singleton2;

    private Singleton2(){
    }

    /* synchronized : 현재 데이터를 사용하고 있는 해당 스레드를 제외한 다른 스레드들은 접근할 수 없게 막음 => 데이터의 thread-safe */
    public static synchronized Singleton2 getInstance(){
        if(singleton2 == null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

}
