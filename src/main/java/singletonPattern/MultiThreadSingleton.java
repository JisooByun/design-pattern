package singletonPattern;
/**
 * DCL(Double checking Locking)
 * uniqueInstance가 없는 경우에만 synchronized를 건다
 * 처음 생성될때만 sync라 성능상의 이슈도 없다.
 * 하지만 1.5버전 이후에서만 가능하다.
 * */
public class MultiThreadSingleton {
    private volatile static MultiThreadSingleton uniqueInstance;
    private MultiThreadSingleton(){};
    public static MultiThreadSingleton getInstance(){
        if(uniqueInstance == null){
            synchronized (MultiThreadSingleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new MultiThreadSingleton();
                }
            }
        }
        return uniqueInstance;
    }

}
