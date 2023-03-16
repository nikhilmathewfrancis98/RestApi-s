package POJOS;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Registration {
    @JsonProperty(value = "firstname")
    private String firstname;

//    @JsonProperty(value = "lastname")
//    private String lastname;

//    @JsonProperty(value = "email")
//    private String email;
//
//    @JsonProperty(value = "age")
//    private int age;
//
//    @JsonProperty(value = "psswd")
//    private String psswd;
}
