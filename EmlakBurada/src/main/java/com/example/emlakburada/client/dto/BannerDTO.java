package com.example.emlakburada.client.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class BannerDTO {
    private int advertNo;
    private String phone;
    private int total;
    private AddressDTO address;
}
