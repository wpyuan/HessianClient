package test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;

import org.junit.Test;

import com.caucho.hessian.client.HessianProxyFactory;
import com.test.hessian.Basic;

public class HessianTest {

	@Test
	public void test() throws MalformedURLException {
		//定义访问远程主机的地址  
        String target = "http://localhost:8180/HessianWeb/hello";  
        //获取工厂对象  
        HessianProxyFactory factory = new HessianProxyFactory();  
        //通过工厂的create方法，获取Basic接口的实现类，  
        //第一个参数是要获取的对象的类型，第二个是要访问主机的地址  
        //获取的basic对象其实是服务器端的一个Basic的代理对象，  
        //我们使用其方法的时候实际访问的是远程主机的方法  
        Basic basic =   (Basic) factory.create(Basic.class, target);  
          
        //调用远程主机的功能。  
        System.out.println(basic.hello("1234")); 
        System.out.println(basic.say("你好!")); 
        System.out.println("10+20=" + basic.sum(10, 20));
        
	}

}
