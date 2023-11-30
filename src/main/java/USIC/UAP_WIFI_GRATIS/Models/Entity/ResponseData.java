package USIC.UAP_WIFI_GRATIS.Models.Entity;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseData {
    private int status;
    private boolean ok;
    private String mensaje;
    private Map<String, Object> data;

}
