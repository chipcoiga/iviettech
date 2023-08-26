package businessdelegate;

import businessdelegate.client.Client;

public class Main {
    public static void main(String[] args) {

        BusinessDelegate delegate = new BusinessDelegate();
        Client client = new Client(delegate);

        delegate.setServiceType("ejb");
        client.doProcessing();

        delegate.setServiceType("jms");
        client.doProcessing();

        delegate.setServiceType("xxxx");
        client.doProcessing();
    }
}
