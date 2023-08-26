package businessdelegate.service.impl;

import businessdelegate.service.BusinessService;

public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("JMS processing");
    }
}
