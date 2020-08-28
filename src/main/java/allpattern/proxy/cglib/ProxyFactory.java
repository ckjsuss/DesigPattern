package allpattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Liu
 */
public class ProxyFactory implements MethodInterceptor {
    /**
     * 被代理的对象
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 获取代理对象
     * @return
     */
    public Object getProxyInstance(){
        //Enhancer动态的创建给定类的子类并且拦截代理类的所有的方法
        Enhancer enhancer = new Enhancer();
        //设置代理目标
        enhancer.setSuperclass(target.getClass());
        //设置单一回调对象，在调用中拦截对目标方法的调用
        enhancer.setCallback(this);
        //创建代理对象
        Object object = enhancer.create();
        return object;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("========Cglib代理，开始========");
        Object result = method.invoke(target, objects);
        System.out.println("========Cglib代理，提交========");
        return result;
    }


}
