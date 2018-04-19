package com.kq.springdemo.beanwrapper;

import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;

import com.kq.springdemo.entity.Company;

/**
 * TODO
 * @author kongqi
 * @date  2018-04-18 13:35 
 * @since 
 */
public class BeanWrapperTest {

	public static void main(String[] args) {
		Company company = new Company();
		BeanWrapperImpl companyWapper = new BeanWrapperImpl(company);
		
		PropertyValue value = new PropertyValue("name", "Some Company Inc.");
		companyWapper.setPropertyValue(value);
		
		PropertyValue idPropValue = new PropertyValue("id", String.valueOf(System.currentTimeMillis()));
		PropertyValue addressPropValue = new PropertyValue("address", "海创园18幢");
		
		MutablePropertyValues pvs = new MutablePropertyValues();
		pvs.addPropertyValue(idPropValue);
		pvs.addPropertyValue(addressPropValue);
		companyWapper.setPropertyValues(pvs);
		
		System.out.println(company.getId());
		System.out.println(company.getName());
		System.out.println(company.getAddress());
	}
	
}
