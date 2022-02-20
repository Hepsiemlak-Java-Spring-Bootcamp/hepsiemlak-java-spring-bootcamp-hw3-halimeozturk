package com.example.emlakburada.controller;


import com.example.emlakburada.dto.RealEstateDTO;
import com.example.emlakburada.service.RealEstateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/real-estates")
@RequiredArgsConstructor
public class RealEstateController {
    private final RealEstateService realEstateService;

    @GetMapping
    ResponseEntity<List<RealEstateDTO>> getAllList(){
        return ResponseEntity.ok(realEstateService.getAllList());
    }

    @PostMapping
    ResponseEntity<RealEstateDTO> create(@RequestBody RealEstateDTO realEstateDTO){
        return ResponseEntity.ok(realEstateService.create(realEstateDTO));
    }

    @GetMapping("/{id}")
    ResponseEntity<RealEstateDTO> getRealEstateById(@PathVariable Long id){
        return ResponseEntity.ok(realEstateService.getRealEstateById(id));
    }

    @GetMapping("/userId/{userId}")
    ResponseEntity<Set<RealEstateDTO>> getAdvertListWithUserId(@PathVariable long userId){
        return ResponseEntity.ok(realEstateService.getRealEstateListWithUserId(userId));
    }
}
