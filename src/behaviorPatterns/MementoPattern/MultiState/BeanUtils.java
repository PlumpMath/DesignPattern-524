package behaviorPatterns.MementoPattern.MultiState;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

class BeanUtils {

	public static HashMap<String, Object> backProp(Object object) {
		HashMap<String, Object> result=new HashMap<String, Object>();
		try {
			BeanInfo beanInfo=Introspector.getBeanInfo(object.getClass());
			PropertyDescriptor[] descriptors=beanInfo.getPropertyDescriptors();
			for(PropertyDescriptor descriptor:descriptors){
				String fieldName=descriptor.getName();
				Method getter=descriptor.getReadMethod();
				Object value=getter.invoke(object, new Object[]{});
				if(!fieldName.equalsIgnoreCase("class")){
					result.put(fieldName, value);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public static void restoreProp(Object bean,HashMap<String, Object> propMap){
		try {
			BeanInfo beanInfo=Introspector.getBeanInfo(bean.getClass());
			PropertyDescriptor[] descriptors=beanInfo.getPropertyDescriptors();
			for(PropertyDescriptor descriptor:descriptors){
				String fieldName=descriptor.getName();
				if(propMap.containsKey(fieldName)){
					Method getter=descriptor.getWriteMethod();
					getter.invoke(bean, new Object[]{propMap.get(fieldName)});
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
