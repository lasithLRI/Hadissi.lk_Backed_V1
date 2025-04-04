package com.LRITechnologies.Ads_Site.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestUserDto {

    private String fullName;
    private String username;
    private String password;
}
