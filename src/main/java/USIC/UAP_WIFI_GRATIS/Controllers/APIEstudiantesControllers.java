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
import USIC.UAP_WIFI_GRATIS.Models.Entity.Usuario;

@RestController
@CrossOrigin
@RequestMapping("/api/usic/e1")
public class APIEstudiantesControllers {
    

	@PostMapping("/obtenerDatos")
    public ResponseEntity<String> obtenerDatos(@RequestBody Usuario usuario ) {

        // Configura los encabezados para la solicitud interna
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("x-api-key", "key 23313ec5ff28a9760886ffcac8c5e815357694e4fee4ba0d78450a27c1950625");

        // Crea un objeto con los datos del cuerpo de la solicitud
        // Puedes ajustar la estructura según lo que el servicio externo requiera
        // Aquí se asume que los datos del cuerpo son un JSON con los campos "usuario" y "clave"
        // String requestBody = "{\"rd\":\"" + usuario.getRd() + "\",\"ci\":\"" + usuario.getClave() + "\"}";

        String requestBody1 = "{ 'rd':1906 , 'ci': '9898264'}";

        // Realiza la solicitud API interna usando RestTemplate
        String urlSolicitudInterna = "http://181.115.188.250:9993/v1/service/api/0ba58e79db4d4f64b08b36ffbb787dd4";
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody1, headers);

        ResponseEntity<String> response = restTemplate.exchange(
            urlSolicitudInterna,
            HttpMethod.POST,
            requestEntity,
            String.class // Tipo de respuesta esperada (ajústala según tu caso)
        );

        // Puedes procesar la respuesta y devolverla como sea necesario
        return response;
    }

    @PostMapping("/ObtenerDatos")
    public ResponseEntity<String> obtenerDatos_API(@RequestBody Usuario usuario) {
        // Configura los encabezados para la solicitud interna
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("x-api-key", "key e73b1991c59a67fe182524e4d12da556136ced8a9da310c3af4c4efbde804a10");

        // Crea un objeto con los datos del cuerpo de la solicitud
        String requestBody = "{\"usuario\":\"" + usuario.getUsuario() + "\",\"clave\":\"" + usuario.getClave() + "\"}";

        // Realiza la solicitud API interna usando RestTemplate
        String urlSolicitudInterna = "http://181.115.188.250:9993/v1/service/api/3e958d74203b465abf8ee8b253cce422";
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);

        ResponseEntity<String> response = restTemplate.postForEntity(urlSolicitudInterna, requestEntity, String.class);
        System.out.println(response.toString());
        // Puedes procesar la respuesta y devolverla como sea necesario
        return response;
    }

}

