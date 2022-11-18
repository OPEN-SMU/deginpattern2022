package com.example.smudesign.ch6_FactoryMethod.domain;

/**
 * Abstract class, Interface 둘 다 가능
 */
public interface Logistics {
    default Transport doDeliver(){
        Transport transport = createTransport();
        transport.prepareStuff();
        transport.packageStuff();
        transport.deliver();

        return transport;
    }

    Transport createTransport();
}
