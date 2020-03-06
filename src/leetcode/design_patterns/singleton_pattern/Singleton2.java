package leetcode.design_patterns.singleton_pattern;


/**
 * 懒汉式 不支持并发
 * 这种写法只能运行在单线程下，在调用获取实例的方法时才创建实例，节省空间
 */
public class Singleton2 {
    private Singleton2(){

    }
    private static Singleton2 instance = null;
    public static Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
