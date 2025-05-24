package com.dev.insurance_middle.application.service;

import com.dev.insurance_middle.application.domain.*;
import com.dev.insurance_middle.application.repository.PartRepository;
import com.dev.insurance_middle.application.repository.UserThirdRepository;
import com.dev.insurance_middle.application.repository.VehicleThirdRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PartsService {

    private final UserThirdRepository userThirdRepository;
    private final VehicleThirdRepository vehicleThirdRepository;
    private final PartRepository partRepository;

    public void uploadPart(Part part) {

        //SALVAR USUARIOS DE TERCEROS (IMPLICARÁ MODIFICAR USERS PARA QUE RECIBA EL JSON NUEVO

        //RECOGER LOS IDS DE LOS USUARIOS QUE DEVUELVE LA LLAMADA A USERS Y METERSO AL PARTE Y LLAMAR A PARTES

        //CONTROLAR MEDIANTE EXCEPCIONES Y SI FALLA LA LLAMADA A PARTES, LLAMAR AL ROLLBACK (AHORA SOLO HABRÄ QUE ENVIAR LOS IDS DE USUARIO PARA BORRARLO EN USERS)
        // (AQUI PUEDES MIRAR LA EXCEPCION QUE SE CONTROLABA EN EL CODIGO VIEJO)

    }

    private void savePart(Part part) {
        partRepository.savePart(part);
    }

    public void deletePartById(Long id) {
        partRepository.deletePart(id);
    }

    public List<Part> getAllParts() {
        return partRepository.getAllParts();
    }

    public List<Part> getPartsByPolicyId(Long id) {
        return partRepository.getPartsByPolicyId(id);
    }

    public Part findById(Long id) {
        return partRepository.getPartById(id);
    }
}
