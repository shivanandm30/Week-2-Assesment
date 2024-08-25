package com.SpringbootWeek2Ass.week2ass.dto;
import com.SpringbootWeek2Ass.week2ass.annotation.PasswordValidation;
import com.SpringbootWeek2Ass.week2ass.annotation.PrimeNumberValidation;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class DepartmentDTO {

    private Long id;

    @NotBlank(message = "title should not be blanked")
    @Size(min = 3,max = 12, message = "number of char in title should be in range [3,10]")
    private String title;

    @AssertTrue(message = "User should be active")
    @JsonProperty("isActive")
    private boolean isActive;

    @PastOrPresent(message = "Date  of created depeartment is not in futhure")
    @NotNull
    private LocalDateTime createdAt;

    @PrimeNumberValidation
    private Integer checkPrime;

    @PasswordValidation
    private String password;

}
