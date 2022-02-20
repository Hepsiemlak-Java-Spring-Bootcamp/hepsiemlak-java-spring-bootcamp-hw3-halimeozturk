package com.example.emlakburada.model;

import com.example.emlakburada.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity{
    private UserType userType;
    private String name;
    private String surname;
    private String email;
    private String path;
    private String phoneNumber;
    private String officePhone;
    private String vkn;
    private List<RealEstate> realEstateList;
    private Set<RealEstate> favorite;
    private List<Message> messageList;
}
