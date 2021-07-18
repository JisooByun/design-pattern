package singletonPattern;
/**
 * LazyHolder 기법으로 Class가 로딩되고 초기화되는 시점은 thread-safe하다. 이를 이용한다
 * LazyHolder.INSTANCE를 참조하는 순간
 * class가 로딩되며 객체가 생성된다.
 * 
 * */
public class AdvanceMultiThreadSingleton {
    private AdvanceMultiThreadSingleton(){};
    public static AdvanceMultiThreadSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }
    private static class LazyHolder{
        private static final AdvanceMultiThreadSingleton INSTANCE = new AdvanceMultiThreadSingleton();
    }
}
