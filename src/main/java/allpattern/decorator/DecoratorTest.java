package allpattern.decorator;

import java.io.*;

/**
 * 装饰者模式测试
 * @author Liu
 */
public class DecoratorTest {
    public static void main(String[] args) {
        System.out.println("来一份鸳鸯锅底");
        Hotpot hotpot = new YYHotpot();
        System.out.println("加一份 牛肉");
        hotpot = new Beef(hotpot);
        System.out.println("加一份 蘑菇");
        hotpot = new Mushroom(hotpot);
        System.out.println("加一份 蘑菇");
        hotpot = new Mushroom(hotpot);
        System.out.println("价格为：" + hotpot.getPrice() + "元");
//        getDate();
    }

    /**
     * InputStream ==》Hotpot
     * FileInputStream ==》 YYHotpot
     * DataInputStream ==》Mushroom
     * OutputStream 也一样的
     */
    private static void getDate(){
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(new File("D://test.txt")));
            StringBuffer inputLine = new StringBuffer();
            String tmp;
            while ((tmp = dataInputStream.readLine()) != null) {
                inputLine.append(tmp);
                System.out.println(tmp);
            }
            dataInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
