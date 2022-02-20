package com.example.emlakburdabanner.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class BannerDTO extends BaseEntityDTO {
    private int advertNo;
    private String phone;
    private int total;
    private AddressDTO address;
}
