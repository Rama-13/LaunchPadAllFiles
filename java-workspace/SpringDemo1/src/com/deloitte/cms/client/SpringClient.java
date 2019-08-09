package com.deloitte.cms.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deloitte.cms.model.Customer;

public class SpringClient {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml","secondbeans.xml"});
		
		/*Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Customer customer = (Customer) factory.getBean("cust");*/
		
		Customer customer = (Customer) context.getBean("cust");
		Customer customer1 = (Customer) context.getBean("cust");
		System.out.println(customer);

context.registerShutdownHook();
//For default scope which is singleton, destroy gets called after registering shutdown hook. IF we change the scope to prototype, mutilple objects get created so destroy method gets called only after all the created objects are eligible for garbage collection.


}
}
