package com.codigo.feign.aggregates.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SunatResponse {
    private String razonSocial;
    private String tipoDocumento;
    private String numeroDocumento;
    private String estado;
}
