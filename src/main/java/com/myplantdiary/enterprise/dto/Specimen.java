package com.myplantdiary.enterprise.dto;

import lombok.Data;

public @Data class Specimen {
    private String plantId;
    private String specimenId;
    private String latitude;
    private String longitude;
    private String description;

}
