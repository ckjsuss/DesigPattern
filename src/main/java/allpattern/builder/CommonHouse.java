package allpattern.builder;

public class CommonHouse extends AbstractBuilding {
    @Override
    public void buildBasic() {
        System.out.println("CommonHouse 打地基");
    }

    @Override
    public void buildWall() {
        System.out.println("CommonHouse 砌墙");
    }

    @Override
    public void buildEnd() {
        System.out.println("CommonHouse 封顶");
    }

}
