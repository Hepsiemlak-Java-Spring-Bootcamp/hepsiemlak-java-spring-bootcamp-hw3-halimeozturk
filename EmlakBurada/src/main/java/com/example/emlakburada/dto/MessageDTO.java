package com.example.emlakburada.dto;

import com.example.emlakburada.model.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
public class MessageDTO extends BaseEntityDTO{
    private UserDTO sender;
    private UserDTO receiver;
    private String content;
    private String title;
    private Boolean seen;
    private Date sentDate;
    private Date readDate;
}
