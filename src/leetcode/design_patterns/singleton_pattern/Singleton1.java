package leetcode.design_patterns.singleton_pattern;


/**
 * 饿汉式 不支持并发
 * 这种写法只能在单线程下执行，且类在加载时就已经创建好了实例（static修饰变量）
 */
public class Singleton1 {
    private Singleton1(){
    }
    private static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance(){
        return instance;
    }
}
