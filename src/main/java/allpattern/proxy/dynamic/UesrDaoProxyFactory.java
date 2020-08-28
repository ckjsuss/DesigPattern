package allpattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Liu
 */
public class UesrDaoProxyFactory{
    private IUserDao target;

    public UesrDaoProxyFactory(IUserDao target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        // newProxyInstance(ClassLoader loader, Class<?>[] interfaces,InvocationHandler h)
        // ClassLoader 指定当前目标对象使用的类加载器，获取类加载器；
        // Class<?>[] 目标对象实现的接口类，使用泛型 控制类型传入
        // InvocationHandler事件处理 执行目标对象的方法时，会出发事件处理器的方法，
        // 会表当前目标对象方法作为参数
        Object proxyInstance = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("=======JDK 代理开始=====");
                Object resInvoke = method.invoke(target, args);
                System.out.println("=======JDK 代理提交=====");
                return resInvoke;
            }
        });
        return proxyInstance;
    }

//    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        return null;
//    }
}
