package com.example.emlakburada.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {
    private Long id;
    private Date creationDate;
    private Date modificationDate;
}
