import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CHandler implements InvocationHandler {
    private Object target;
    public CHandler(Object obj) {
        super();
        target = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=method.invoke(target, args);
        return result;
    }
}
