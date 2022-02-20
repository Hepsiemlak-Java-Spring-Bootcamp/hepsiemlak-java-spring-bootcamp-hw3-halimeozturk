package com.example.emlakburdabanner.controller;

import com.example.emlakburdabanner.dto.BannerDTO;
import com.example.emlakburdabanner.service.BannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banners")
@RequiredArgsConstructor
public class BannerController {
    private final BannerService bannerService;

    @GetMapping
    ResponseEntity<List<BannerDTO>> getAllList(){
        return ResponseEntity.ok(bannerService.getAllList());
    }

    @PostMapping
    ResponseEntity<BannerDTO> create(@RequestBody BannerDTO advertDTO){
        return ResponseEntity.ok(bannerService.create(advertDTO));
    }
}
