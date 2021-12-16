package tr.edu.medipol.restvedata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.edu.medipol.restvedata.entity.Kisi;
import tr.edu.medipol.restvedata.objects.InputObject;
import tr.edu.medipol.restvedata.objects.KisiInput;
import tr.edu.medipol.restvedata.repository.KisiRepository;

import java.util.ArrayList;

@RestController
public class VeriController {

    @Autowired
    KisiRepository kisiRepository;

    long id = 0;

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

    @PostMapping("/kisiolustur")
    public String kisiOlustur(@RequestBody KisiInput kisiInput) {
        System.out.println("Giriş Parametreleriniz : " + kisiInput);
        Kisi kisi = new Kisi();
        kisi.setId(++id);
        kisi.setName(kisiInput.getName());
        kisi.setSurname(kisiInput.getSurname());
        kisi.setYas(kisiInput.getYas());
        kisiRepository.save(kisi);
        return "Kisi alındı";
    }

    @GetMapping("/kisiler")
    public ArrayList<Kisi> kisileriListele() {
        ArrayList<Kisi> tumKisiler = (ArrayList<Kisi>) kisiRepository.findAll();

        return tumKisiler;
    }

    @GetMapping("/kisibirGuncelle")
    public Kisi kisiBirYasGuncelle(int yas) {
        Kisi kisiBir = kisiRepository.findById(1L).get();
        kisiBir.setYas(yas);
        kisiRepository.save(kisiBir);
        return kisiBir;
    }

    @GetMapping("/kisiIkiyiSil")
    public String kisiIkiYasGuncelle() {
        kisiRepository.deleteById(2L);
        return "2 Nolu kisi silindi";
    }

}
