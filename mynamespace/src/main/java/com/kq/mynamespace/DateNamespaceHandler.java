package com.kq.mynamespace;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * DateNamespaceHandler
 * @author kq
 * @date 2019/1/9
 */
public class DateNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("dateformat", new SimpleDateFormatBeanDefinitionParser());
        registerBeanDefinitionParser("server", new ServerNamespaceBeanDefinitionParser());
    }

}
