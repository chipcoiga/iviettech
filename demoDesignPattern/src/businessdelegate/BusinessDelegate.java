package businessdelegate;

import businessdelegate.service.BusinessService;

public class BusinessDelegate {
    private BusinessLookup lookup = new BusinessLookup();
    private BusinessService service;
    private String serviceType;

    public void setServiceType(String type) {
        this.serviceType = type;
    }

    public void doTask() {
        service = lookup.lookup(this.serviceType);
        service.doProcessing();
    }
}
