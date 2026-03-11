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

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PartsController implements PartsApi {

    private final PartsService partsService;

    private final PartDtoControllerMapper mapper;

    @Override
    public ResponseEntity<Void> deletePartById(Integer id) {
        partsService.deletePart(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<List<PartControllerDto>> getAllParts() {
        return ResponseEntity.ok(partsService.getAllParts().stream()
                .map(mapper::fromDomainToDtoController)
                .toList());
    }

    @Override
    public ResponseEntity<PartControllerDto> getPartById(Integer id) {
        return ResponseEntity.ok(mapper.fromDomainToDtoController(partsService.getPartById(id)));
    }

    @Override
    public ResponseEntity<List<PartControllerDto>> getPartsByPolicyId(Integer policyId) {
        return ResponseEntity.ok(partsService.getPartsByPolicyId(policyId).stream()
                .map(mapper::fromDomainToDtoController)
                .toList());
    }

    @Override
    public ResponseEntity<Void> savePart(PartControllerDto partControllerDto) {
        Part partDomain = mapper.fromDtoControllerToDomain(partControllerDto);

        partsService.uploadPart(partDomain);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> updatePart(Integer id, PartControllerDto partControllerDto) {
        partsService.updatePart(id, mapper.fromDtoControllerToDomain(partControllerDto));
        return ResponseEntity.ok().build();
    }
}