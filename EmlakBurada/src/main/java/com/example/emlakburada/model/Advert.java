package com.example.emlakburada.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Advert extends BaseEntity {
    private Integer advertNo;
    private String title;
    private String description;
    private Date duration; // date yap
    private Integer putFordward; //one cikarilanlar
    private List<User> reviewed;// bir ilana birden fazla user bakmis olabilir bir user birden fazla ilana bakabilir cogun coga iliskisi
    private Boolean active;
    private User owner;      // bir ilani bir user yayinlamistir bir user birden fazla ilan yayinlayabilir
    private RealEstate realEstates;
}
