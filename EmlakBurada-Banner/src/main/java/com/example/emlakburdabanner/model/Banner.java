package com.example.emlakburdabanner.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Banner extends BaseEntity {
    private int advertNo;
    private String phone;
    private int total;
    private Address address;
}
