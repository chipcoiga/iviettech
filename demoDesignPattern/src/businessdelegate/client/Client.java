package businessdelegate.client;

import businessdelegate.BusinessDelegate;

public class Client {
    private BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    public void doProcessing() {
        this.businessDelegate.doTask();
    }
}
