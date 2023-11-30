package USIC.UAP_WIFI_GRATIS.Controllers;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import USIC.UAP_WIFI_GRATIS.Models.Entity.Docente;

@RestController
@CrossOrigin
@RequestMapping("/api/usic/d1")
public class APIDocentesControllers {
    
    @PostMapping("/obtenerDatos")
    public ResponseEntity<String> obtenerDatos(@RequestBody Docente docente ) {

        // Configura los encabezados para la solicitud interna
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("x-api-key", "key 23313ec5ff28a9760886ffcac8c5e815357694e4fee4ba0d78450a27c1950625");

        // Crea un objeto con los datos del cuerpo de la solicitud
        // Puedes ajustar la estructura según lo que el servicio externo requiera
        // Aquí se asume que los datos del cuerpo son un JSON con los campos "usuario" y "clave"
        String requestBody = "{\"rd\":\"" + docente.getRd() + "\",\"ci\":\"" + docente.getCi() + "\"}";


        // Realiza la solicitud API interna usando RestTemplate
        String urlSolicitudInterna = "http://181.115.188.250:9993/v1/service/api/0ba58e79db4d4f64b08b36ffbb787dd4";
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);

        ResponseEntity<String> response = restTemplate.exchange(
            urlSolicitudInterna,
            HttpMethod.POST,
            requestEntity,
            String.class // Tipo de respuesta esperada (ajústala según tu caso)
        );

        // Puedes procesar la respuesta y devolverla como sea necesario
        return response;
    }


}
