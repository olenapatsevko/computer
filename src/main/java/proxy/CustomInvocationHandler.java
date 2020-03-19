package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import static java.lang.System.out;

public class CustomInvocationHandler implements InvocationHandler {
    private Object object;
     public CustomInvocationHandler(Object object){
         this.object = object;
     }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        out.println("Invocation Handler invoked: "+ method.getName());
        if (method.getName().contains("set")){
             throw new UnsupportedOperationException("setter was tried to invoke");
        }
         return method.invoke(object, args);
    }
}
