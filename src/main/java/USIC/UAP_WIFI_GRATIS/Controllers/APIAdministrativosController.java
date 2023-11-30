package USIC.UAP_WIFI_GRATIS.Controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/api/usic/a1")
public class APIAdministrativosController {
    

    /* @PostMapping("/obtenerDatos")
    public Map<String , Object> Estudiantes(@RequestBody Usuario usuario){

		String url = "https://apirest-production-0e0a.up.railway.app/api/londraPost/v1/obtenerDatos";

		HttpHeaders headers = new HttpHeaders();

		headers.setContentType(MediaType.APPLICATION_JSON);

		HttpEntity<String> req = new HttpEntity(requests, headers);

		RestTemplate restTemplate = new RestTemplate();


		ResponseEntity<String> resp = restTemplate.exchange(url, HttpMethod.POST, req, String.class);

        return (Map<String, Object>) resp;

        if (resp.getBody().get("status").toString().equals("200")) {			

			Map<String, Object> data = (Map) resp.getBody().get("data");

            System.out.println(data);
			return data;
		}
        return requests;

    } */

    /* @PostMapping("/obtenerDatos")
    public ResponseEntity<String> obtenerDatos(@RequestBody Usuario usuario) {

        String ApiUrl = "https://apirest-production-0e0a.up.railway.app/api/londraPost/v1/obtenerDatos";

        // Configurar el encabezado
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");

        // Crear el cuerpo de la solicitud
        String requestBody = "{\"usuario\": \"" + usuario.getUsuario() + "\", \"contrasena\": \"" + usuario.getClave() + "\"}";

        // Configurar la entidad HTTP
        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);

        RestTemplate restTemplate = new RestTemplate();

        // Realizar la solicitud POST a la API externa
        ResponseEntity<String> response = restTemplate.exchange(ApiUrl, HttpMethod.POST, requestEntity, String.class);

        return response;
    } */
}
