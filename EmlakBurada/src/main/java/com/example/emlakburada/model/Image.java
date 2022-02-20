package com.example.emlakburada.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image  extends BaseEntity{
    private String path;
    private Integer sort;
}
