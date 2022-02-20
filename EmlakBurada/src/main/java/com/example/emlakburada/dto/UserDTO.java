package com.example.emlakburada.dto;

import com.example.emlakburada.enums.UserType;
import com.example.emlakburada.model.Message;
import com.example.emlakburada.model.RealEstate;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserDTO extends BaseEntityDTO {
    private UserType userType;
    private String name;
    private String surname;
    private String email;
    private String path;
    private String phoneNumber;
    private String officePhone;
    private String vkn;
    private List<RealEstateDTO> realEstateList;
    private Set<AdvertDTO> favorite;
    private List<MessageDTO> messageList;
}
