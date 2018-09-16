package com.how2java.test;

import com.how2java.pojo.Category;
import com.how2java.pojo.Product;
import com.how2java.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: superhan
 * @Contact: chenchaohan@live.com
 * @Date: 2018/9/16 15:42
 * @Description:
 */
public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
        ProductService s= (ProductService) context.getBean("s");
        s.doSomeService();
    }
}
