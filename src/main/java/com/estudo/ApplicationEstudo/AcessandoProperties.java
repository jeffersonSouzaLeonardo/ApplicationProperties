package com.estudo.ApplicationEstudo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AcessandoProperties {

    @Value("${notificador.email.host}")
    private String host;

    @Value("${notificador.email.porta}")
    private String porta;

    public String getNotificadorHost(){
        return this.host;
    }

    public String getNotificadorPorta(){
        return this.porta;
    }

}
