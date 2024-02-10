package com.codigo.feign.service;

import com.codigo.feign.aggregates.request.PersonaRequest;
import com.codigo.feign.aggregates.response.BaseResponse;

public interface EmpresaService {
    BaseResponse crearEmpresa(PersonaRequest personaRequest);
    BaseResponse getInfoSunat(String numero);
}
