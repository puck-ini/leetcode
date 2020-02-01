package leetcode.test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test1 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        //1.通过Class.forName()方法
        Class c1 = Class.forName("java.lang.Integer");

        //2.通过类的class属性
        Class c2 = Test1.class;

        //3.通过类的对象的.getClass()方法
        Test1 test1 = new Test1();
        Class c3 = test1.getClass();

//        Object o = c1.newInstance();

        //获取所有属性
        Field[] fs = c1.getDeclaredFields();

        //定义可变长的字符串，用来存储属性
        StringBuffer sb = new StringBuffer();
        //通过追加的方法，将每个属性拼接到此字符串中
        //最外边的public定义
        sb.append(Modifier.toString(c1.getModifiers()) + " class " + c1.getSimpleName() +"{\n");
        //里边的每一个属性
        for(Field field:fs){
            sb.append("\t");//空格
            sb.append(Modifier.toString(field.getModifiers())+" ");//获得属性的修饰符，例如public，static等等
            sb.append(field.getType().getSimpleName() + " ");//属性的类型的名字，getType()获取的是Class对象
            sb.append(field.getName()+";\n");//属性的名字+回车
        }
        sb.append("}");
        System.out.println(sb.toString());

//        //获取类
//        Class c = Class.forName("User");
//        //获取id属性
//        Field id = c.getDeclaredField("id");
//        //实例化这个类赋给o
//        Object o = c.newInstance();
//        //打破封装
//        id.setAccessible(true); //使用反射机制可以打破封装性，导致了java对象的属性不安全。
//        //给o对象的id属性赋值"110"
//        id.set(o, "110"); //set
//        //get
//        System.out.println(id.get(o));


    }
}
