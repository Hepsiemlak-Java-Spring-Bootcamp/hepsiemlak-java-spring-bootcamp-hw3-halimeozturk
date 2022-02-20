package com.example.emlakburada.dto;

import com.example.emlakburada.enums.BuildState;
import com.example.emlakburada.enums.BuildType;
import com.example.emlakburada.enums.Currency;
import com.example.emlakburada.enums.PublicationType;
import com.example.emlakburada.model.Address;
import com.example.emlakburada.model.Category;
import com.example.emlakburada.model.Image;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class RealEstateDTO extends BaseEntityDTO {
    private Currency currency;
    private Double price;
    private String description;
    private Integer room;
    private Integer livingRoom;
    private Integer age;
    private Integer bathRoom;
    private List<ImageDTO> imageList;
    private String floor;
    private Integer numberOfFloor;
    private Double netSquareMeters;
    private Double squareMeters;
    private PublicationType publicationType;
    private BuildType buildType;
    private BuildState buildState;
    private AddressDTO address;
    private CategoryDTO mainCategory;
    private CategoryDTO subCategory;
    private String roomAndLivingRoom;
}
