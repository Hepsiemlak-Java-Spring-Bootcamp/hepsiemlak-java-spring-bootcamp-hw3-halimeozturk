package com.example.emlakburada.model;


import com.example.emlakburada.dto.ImageDTO;
import com.example.emlakburada.enums.BuildState;
import com.example.emlakburada.enums.BuildType;
import com.example.emlakburada.enums.Currency;
import com.example.emlakburada.enums.PublicationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class RealEstate extends BaseEntity{
    private Currency currency;
    private Double price;
    private String description;
    private Integer room;
    private Integer livingRoom;
    private Integer age;
    private Integer bathRoom;
    private List<Image> imageList;
    private String floor;
    private Integer numberOfFloor;
    private Double netSquareMeters;
    private Double squareMeters;
    private PublicationType publicationType;
    private BuildType buildType;
    private BuildState buildState;
    private Address address;
    private Category mainCategory;
    private Category subCategory;
    private String roomAndLivingRoom;
}
