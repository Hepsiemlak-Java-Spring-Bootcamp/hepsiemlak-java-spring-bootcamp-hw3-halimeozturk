package com.example.emlakburdabanner.mapper;



import com.example.emlakburdabanner.dto.AddressDTO;
import com.example.emlakburdabanner.model.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper extends BaseMapper<Address, AddressDTO>{
}
