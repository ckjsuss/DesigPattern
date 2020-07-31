package allpattern.prototype;

public class Sheep implements Cloneable {
    private String Name;
    private String Color;
    public Sheep friend;

    public Sheep(String name, String color) {
        Name = name;
        Color = color;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
