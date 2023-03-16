package Controller;


import POJOS.Cricketer;
import POJOS.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class RegistrationController {
private Cricketer result=null;
    @PostMapping(value = "/register",consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String  Register(@RequestParam Registration registration){

//         result=registerCricketer(registration.getBody(),new Cricketer());
        System.out.println(registration.getFirstname()+" ");

//        System.out.println(result.getFname()+" "+result.getLname());
//        HttpHeaders httpHeaders=new HttpHeaders();
//        httpHeaders.add("tokenInReturn","TokenValue");
//        return new ResponseEntity<Cricketer>(result,HttpStatus.OK);
//        return ResponseEntity.ok().headers(httpHeaders).body(result);
//        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
//        return result;
        return "Ok";
    }
    protected Cricketer registerCricketer(Registration r,Cricketer crk){
        crk.setFname(r.getFirstname());
//        crk.setLname(r.getLastname());
//        crk.setEmail(r.getEmail());
//        crk.setAge(r.getAge());
//        System.out.println(r.getFirstname()+" "+r.getLastname()+" "+r.getEmail()+" "+r.getPsswd());
        return crk;
    }
    @GetMapping(value = "/getCricketer")
    public ResponseEntity<Map<String,Boolean>> GetCricketer(){
//        Cricketer c=new Cricketer("Nikhil Mathew","Francis","nikhilmathew@gmail.com",24);
//        Cricketer c=new Cricketer("Nikhil Mathew","Francis","nikhilmathew@gmail.com",24);
        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.add("tokenInReturn","TokenValue");
       Map<String,Boolean> result=new HashMap<>();
       result.put("Successful",Boolean.TRUE);
        return ResponseEntity.ok(result) ;
    }

    @GetMapping(value = "/getCricketerDetails")
    public List<Cricketer> getCricketerDetails(){

        return  Arrays.asList(new Cricketer("Nikhil","Francis"),new Cricketer("Joseph","George"));
    }
}
