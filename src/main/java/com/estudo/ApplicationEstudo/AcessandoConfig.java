package com.estudo.ApplicationEstudo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/***
 * Atributos e metodos tem que ter o mesmo nome das properties que estao
 * no path informados no configuration;
 */


@Component
@ConfigurationProperties("notificador.email")
public class AcessandoConfig {

    private String host;
    private int porta;

    public String getHost(){
        return this.host;
    }

    public int getPorta(){
        return this.porta;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }
}
