package com.sami.sami_app.api.dto.response;



import com.sami.sami_app.util.enums.RhType;
import com.sami.sami_app.util.enums.UserType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class UserResponse {
    private long idUser;
    private String email;
    // private String password;
    private String firstName;
    private String lastName;
    private String phone;
    private RhType rhType;
    private UserType userType;
}
