package AirbnbClone.AirbnbClone.dto;

import AirbnbClone.AirbnbClone.entity.User;
import AirbnbClone.AirbnbClone.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
