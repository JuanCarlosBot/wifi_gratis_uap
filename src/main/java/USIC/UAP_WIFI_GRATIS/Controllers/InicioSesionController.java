package USIC.UAP_WIFI_GRATIS.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/UAP")
public class InicioSesionController {
    
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String Vista_Login(){

        return "Login/login";
    }
}
