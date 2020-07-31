package allpattern.prototype;

import java.io.*;

/**
 * 深拷贝
 * @author Liu
 */
public class DeepClone implements Serializable,Cloneable {
    private String Name;
    private String Color;
    public DeepCloneTarget deepCloneTarget;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object =  super.clone();
        DeepClone deepClone = (DeepClone)object;
        deepClone.deepCloneTarget = (DeepCloneTarget)deepCloneTarget.clone();
        return deepClone;
    }

    /**
     * 序列化的方式clone
     * @return
     */
    public Object serializClone(){
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //当前对象转成流输出
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepClone deepClone = (DeepClone)ois.readObject();
            return deepClone;
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
