package leetcode.design_patterns.singleton_pattern;


/**
 * 懒汉式  支持并发  使用synchronized修饰
 * synchronized给方法上了锁，同一时间只能有一个线程调用该方法，但是一个线程调用的时候，其他线程只能等待，效率低
 */
public class Singleton3 {
    private Singleton3(){

    }
    private static Singleton3 instance = null;
    public synchronized static Singleton3 getInstance(){
        if (instance == null){
           instance = new Singleton3();
        }
        return instance;
    }
}
