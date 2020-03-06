package leetcode.design_patterns.singleton_pattern;


/**
 * 双重校验锁 volatile synchronized（常用）
 * volatile关键字防止指令重排序造成实例无法创建，
 * synchronized保证多线程环境下只有一个实例，锁在代码块上
 *volatile 关键字保证了内存可见性，所有线程都会去主存中取数据而不是在线程的缓存中取，保证了数据的更新能实时地对任何线程可见。
 * 假如有两个线程同时到达了1，它们都去创建实例，这时候如果没有第二次判断，就会多次创建实例了。二次判断保证了多线程下只创建一个实例。
 */
public class Singleton4 {
    private Singleton4(){

    }
    private volatile static Singleton4 instance = null;
    public static Singleton4 getInstance(){
        //1
        if (instance == null){
            synchronized (Singleton4.class){
                //2
                if (instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
