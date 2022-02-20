package com.example.emlakburada.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Message extends BaseEntity {
    private User sender;
    private User receiver;
    private String content;
    private String title;
    private Boolean seen;
    private Date sentDate;
    private Date readDate;
}
