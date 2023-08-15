package com.kurdev.xiaomiapi.entity;

import lombok.Data;

@Data
public class Dots {
    private Long id;
    private Long training_id;
    private Long time;
    private Double speed;
    private Integer cadence;
    private Integer pulse;
    private Double cord_lat;
    private Double cord_lon;
}
