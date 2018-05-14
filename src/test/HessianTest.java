package test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;

import org.junit.Test;

import com.caucho.hessian.client.HessianProxyFactory;
import com.test.hessian.Basic;

public class HessianTest {

	@Test
	public void test() throws MalformedURLException {
		//�������Զ�������ĵ�ַ  
        String target = "http://localhost:8180/HessianWeb/hello";  
        //��ȡ��������  
        HessianProxyFactory factory = new HessianProxyFactory();  
        //ͨ��������create��������ȡBasic�ӿڵ�ʵ���࣬  
        //��һ��������Ҫ��ȡ�Ķ�������ͣ��ڶ�����Ҫ���������ĵ�ַ  
        //��ȡ��basic������ʵ�Ƿ������˵�һ��Basic�Ĵ������  
        //����ʹ���䷽����ʱ��ʵ�ʷ��ʵ���Զ�������ķ���  
        Basic basic =   (Basic) factory.create(Basic.class, target);  
          
        //����Զ�������Ĺ��ܡ�  
        System.out.println(basic.hello("1234")); 
        System.out.println(basic.say("���!")); 
        System.out.println("10+20=" + basic.sum(10, 20));
        
	}

}
