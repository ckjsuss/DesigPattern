package allpattern.builder;

/**
 * 普通房子建造
 * @author Liu
 */
public abstract class AbstractBuilding {
    /**
     * 打地基
     */
    public abstract void buildBasic();

    /**
     * 砌墙
     */
    public abstract void buildWall();

    /**
     * 封顶
     */
    public abstract void buildEnd();

    public void build(){
        buildBasic();
        buildWall();
        buildEnd();
    }
}
