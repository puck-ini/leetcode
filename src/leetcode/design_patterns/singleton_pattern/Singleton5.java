package leetcode.design_patterns.singleton_pattern;


/**
 * 静态内部类 （常用）
 */
public class Singleton5 {
    private Singleton5(){

    }
    private static class SingletonHolder{
        private static Singleton5 instance = new Singleton5();
    }
    public static Singleton5 getInstance(){
        return SingletonHolder.instance;
    }
}
