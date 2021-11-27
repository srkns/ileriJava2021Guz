package tr.edu.medipol.ilerijavauyg.controller;

import org.springframework.web.bind.annotation.*;
import tr.edu.medipol.ilerijavauyg.objects.InputObject;

@RestController
public class GirisController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name,
                        @RequestParam(value = "surname", defaultValue = "Brother") String surname) {
        return String.format("Hello %s %s!", name, surname);
    }

    @PostMapping("/hi")
    public String hiMine(@RequestBody InputObject inputObject) {
        System.out.println("Giriş Parametreleriniz : " + inputObject);
        return "hiiii";
    }

}
