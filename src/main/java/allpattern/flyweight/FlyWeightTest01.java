package allpattern.flyweight;

/**
 * 字符串String中的intern方法，
 * 是当前的字符对象（通过new出来的对象）
 * 可以使用intern方法从常量池中获取；
 * 如果常量池中不存在该字符串，那么就新建一个这样的字符串放到常量池中
 * @author Liu
 */
public class FlyWeightTest01 {
    public static void main(String[] args){
        String s3 = new String("str1") + new String("str2");
        // Native 方法
        s3.intern();
        String s4 =  "str1str2";
        System.out.println(s3 == s4);
    }

}
