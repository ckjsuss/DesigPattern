package liskov_substitution;

public class Main {
    public static void main(String[] args){
        AClass aClass = new AClass();
        aClass.func1(5,6 );

        BClass bClass = new BClass();
        bClass.func1(5,6 );
    }
}

class AClass{
    public void func1(int a,int b){
        System.out.println("a+b:"+(a+b));
    }
    public void func2(int a,int b){
        System.out.println("a+b:"+(a+b));
    }
}

class BClass extends AClass{
    @Override
    public void func1(int a,int b){
        System.out.println("ab:"+(a-b));
    }
}
