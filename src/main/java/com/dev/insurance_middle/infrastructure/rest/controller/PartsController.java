package com.dev.insurance_middle.infrastructure.rest.controller;

import com.dev.generated.middle.controller.PartsApi;
import com.dev.generated.middle.dto.PartControllerDto;
import com.dev.insurance_middle.application.domain.Part;
import com.dev.insurance_middle.application.service.PartsService;
import com.dev.insurance_middle.infrastructure.rest.mapper.PartDtoControllerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class PartsController implements PartsApi {

    private final PartsService partsService;

    private final PartDtoControllerMapper mapper;


    @Override
    public Optional<NativeWebRequest> getRequest() {
        return PartsApi.super.getRequest();
    }

    @Override
    public ResponseEntity<Void> deletePartById(Integer id) {
        return PartsApi.super.deletePartById(id);
    }

    @Override
    public ResponseEntity<List<PartControllerDto>> getAllParts() {
        return PartsApi.super.getAllParts();
    }

    @Override
    public ResponseEntity<PartControllerDto> getPartById(Integer id) {
        return PartsApi.super.getPartById(id);
    }

    @Override
    public ResponseEntity<List<PartControllerDto>> getPartsByPolicyId(Integer policyId) {
        return PartsApi.super.getPartsByPolicyId(policyId);
    }

    @Override
    public ResponseEntity<Void> savePart(PartControllerDto partControllerDto) {
        Part partDomain = mapper.fromDtoControllerToDomain(partControllerDto);

        partsService.uploadPart(partDomain);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> updatePart(Integer id, PartControllerDto partControllerDto) {
        return PartsApi.super.updatePart(id, partControllerDto);
    }
}