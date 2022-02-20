package com.example.emlakburada.dto;

import com.example.emlakburada.model.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class MessageFilterDTO extends BaseEntityDTO {
    private User sender;
    private User receiver;
    private String content;
}
