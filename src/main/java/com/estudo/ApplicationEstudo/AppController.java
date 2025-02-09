package com.estudo.ApplicationEstudo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

    @Autowired
    private AcessandoProperties acessandoProperties;

    @Autowired
    private AcessandoConfig acessandoConfig;

    @GetMapping("/value")
    @ResponseBody
    public String acessarValue(){
        return "Acessando as propriedades pelo @Value. PORTA: " + acessandoProperties.getNotificadorPorta() + " - HOST: " + acessandoProperties.getNotificadorHost();
    }

    @GetMapping("/config")
    @ResponseBody
    public String acessarConfig(){
        return "Acessando as propriedades pelo CONFIG. PORTA: " + acessandoConfig.getPorta() + " - HOST: " + acessandoConfig.getHost();
    }


}
