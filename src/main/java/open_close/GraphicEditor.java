package open_close;

/**
 * 开闭原则反例
 *
 * @author Liu
 */
public class GraphicEditor {
    public void drawShape(Shape s) {
        if (s == null) {
            return;
        }
        if(s instanceof Rectangle){
            System.out.println(" 绘制矩形");
        }else if (s instanceof Circle){
            System.out.println(" 绘制圆形");
        }else if (s instanceof Triangle){
            System.out.println(" 绘制三角形");
        }
    }

}


