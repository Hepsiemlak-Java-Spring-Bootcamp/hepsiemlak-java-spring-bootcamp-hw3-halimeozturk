package com.example.emlakburada.dto;

import com.example.emlakburada.model.RealEstate;
import com.example.emlakburada.model.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
public class AdvertDTO extends BaseEntityDTO{
    private Integer advertNo;
    private String title;
    private String description;
    private Date duration;
    private Integer putFordward;
    private Boolean active;
    private UserDTO owner;
    private RealEstate realEstates;
}
