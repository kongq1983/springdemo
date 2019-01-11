package com.kq.mynamespace;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;

import java.text.SimpleDateFormat;

/**
 * ServerNamespaceHandler
 * @author kq
 * @date 2019-01-11
 */
public class ServerNamespaceBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    protected Class getBeanClass(Element element) {
        return Server.class;
    }

    protected void doParse(Element element, BeanDefinitionBuilder bean) {
        String ip = element.getAttribute("ip");
        int port = Integer.valueOf(element.getAttribute("port"));
        String protocol = element.getAttribute("protocol");

        String str = "ip=%s,port=%s,protocol=%s";
        System.out.println(String.format(str,ip,port,protocol));

        bean.addPropertyValue("ip", ip);
        bean.addPropertyValue("port", port);
        bean.addPropertyValue("protocol", protocol);

    }


}
