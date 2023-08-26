package businessdelegate.service.impl;

import businessdelegate.service.BusinessService;

public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("EJB processing");
    }
}
