package singletonPattern;
/**
 * multi thread 에서 문제 발생
 * 두 스레드가 동시에 호출하게되면 두개의 인스턴스가 만들어질 수 있다.
 * */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {

    }

    public Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

}
