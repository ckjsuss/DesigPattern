package allpattern.prototype;

/**
 * 深度克隆
 * 1、重写clone() 的方式
 * 2、序列化、反序列化方式
 * @author Liu
 */
public class DeepCloneTest {
    public static void main(String[] args){
        DeepClone deepClone = new DeepClone();
        deepClone.deepCloneTarget = new DeepCloneTarget();
        try {
            DeepClone clone = (DeepClone)deepClone.clone();
            DeepClone clone1 = (DeepClone)deepClone.clone();
            System.out.println("NormalClone:"+clone.deepCloneTarget.hashCode());
            System.out.println("NormalClone:"+clone1.deepCloneTarget.hashCode());

            DeepClone clone2 = (DeepClone)deepClone.serializClone();
            DeepClone clone3 = (DeepClone)deepClone.serializClone();
            System.out.println("SerializClone:"+clone2.deepCloneTarget.hashCode());
            System.out.println("SerializClone:"+clone3.deepCloneTarget.hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
