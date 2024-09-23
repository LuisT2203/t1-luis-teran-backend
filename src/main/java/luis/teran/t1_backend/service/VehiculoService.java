package luis.teran.t1_backend.service;

import luis.teran.t1_backend.dto.VehiculoRequestDTO;


public interface VehiculoService {

    String [] buscarvehiculo(VehiculoRequestDTO vehiculoRequestDTO) throws Exception;
}
