package segregation;

public class Main {
    public static void main(String[] args){
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();
        ClassC classC = new ClassC();
        ClassD classD = new ClassD();
        classA.depend1(classB);
        classA.depend2(classB);
        classA.depend3(classB);
        classC.depend1(classD);
        classC.depend4(classD);
        classC.depend5(classD);
    }
}
