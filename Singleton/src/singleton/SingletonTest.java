package singleton;

/**
 * Singleton 패턴 : 오로지 한 개의 인스턴트만 제공하는 클래스.
 */
public class SingletonTest {
    public static void main(String[] args){

        Singleton1 st11 = Singleton1.getInstance();
        Singleton1 st12 = Singleton1.getInstance();

        System.out.println(st11);
        System.out.println(st12);

        Singleton2 st21 = Singleton2.getInstance();
        Singleton2 st22 = Singleton2.getInstance();

        System.out.println(st21);
        System.out.println(st22);

        Singleton3 st31 = Singleton3.getInstance();
        Singleton3 st32 = Singleton3.getInstance();

        System.out.println(st31);
        System.out.println(st32);

        Singleton4 st41 = Singleton4.getInstance();
        Singleton4 st42 = Singleton4.getInstance();

        System.out.println(st41);
        System.out.println(st42);

    }


}

