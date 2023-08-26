package businessdelegate;

import businessdelegate.service.BusinessService;
import businessdelegate.service.impl.EJBService;
import businessdelegate.service.impl.JMSService;

public class BusinessLookup {

    public BusinessService lookup(String type) {
        if ("ejb".equalsIgnoreCase(type)) {
            return new EJBService();
        }

        if ("jms".equalsIgnoreCase(type)) {
            return new JMSService();
        }

//        if ("xxxx".equalsIgnoreCase(type)) {
//            return new XXXXService();
//        }

        throw new RuntimeException("This service type not found");
    }
}
