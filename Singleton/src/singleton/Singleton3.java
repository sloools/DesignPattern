package singleton;
/** 싱글톤을 구현하는 세 번째 방법
 *  성능적인 측면도 고려하면서 인스턴스가 필요하지 않을 때 아예 생성하지 않는 장점을 혼합한 방식
 *  if 문을 두 번 사용하여 여러 개의 쓰레드가 동시에 집입 할 때 두 번 분기를 하는 방식
 */
public class Singleton3 {

    /** volatile : 변수를 Main Memory에 저장한다는 뜻 => 변수 값 불일치 해결 (변수의 원자성 보장) Java 1.5
     * 일반 변수는 멀티쓰레드 환경에서 성능 향상을 위해 Main Memory에서 읽은 변수를 CPU Cache에 저장하게 되는데, 이런 경우 다중 쓰레드가 값을 읽어올 때 변수 값 불일치 문제가 발생할 수 있다.
     * CPU Cache 보다 Main Memory 비용이 더 크기 때문에 성능에 영향을 미치긴 한다.
     * 하나의 쓰레드가 Write 하고 나머지 쓰레드는 Read를 하는 경우에만 적합하다
     * 여러 쓰레드가 Write 하는 상황에서는 synchronized 변수를 사용
     */
    private volatile static Singleton3 singleton3;

    private Singleton3(){}

    public static Singleton3 getInstance(){
        if (singleton3 == null){ // 인스턴스가 생성 된 이후라면 synchronize 까지 아예 가지 않음 => 성능 저하 문제 해결
            synchronized (Singleton3.class){ // 동기화 블록
                if (singleton3 == null){
                    singleton3 = new Singleton3(); // 처음으로 진입한 쓰레드만 인스턴스를 생성
                }
            }
        }
        return singleton3;
    }
}
