package com.kurdev.xiaomiapi.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Training {
    private Long id;
    private Long user_id;
    private Date date;
    private Double dots;
}
