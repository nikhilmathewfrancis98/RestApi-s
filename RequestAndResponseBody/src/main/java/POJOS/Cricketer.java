package POJOS;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
//@AllArgsConstructor
public class Cricketer {
    private String fname;
    private String lname;
//    private String email;
//    private int age;

    public Cricketer(String fname, String lname) {
        this.fname=fname;
        this.lname=lname;
//        this.email=email;this.age=age;
    }

    public Cricketer(){}
}
