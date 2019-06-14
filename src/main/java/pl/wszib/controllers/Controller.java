package pl.wszib.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.wszib.domain.Samochod;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    private List<Samochod> listaSamochodow;

    public Controller() {
        listaSamochodow = generateList();
    }

    @GetMapping("lista")
    public String list(Model model){  //iteration

        model.addAttribute("list", listaSamochodow);
        return "basicTemplate";
    }

    @GetMapping("single")
    public String single(Model model){
        model.addAttribute("single", listaSamochodow.get(1));
        return "single";
    }


    @GetMapping("links")
    public String links(Model model){

        return "linksTemplate";
    }

    @GetMapping("formularz")
    public String form(Model model){
        model.addAttribute("samochod", new Samochod());
        return "forms";
    }

    @PostMapping("formsSave")
    public String formsSave(Samochod samochod, Model model){
        listaSamochodow.add(samochod);
        return "successTemplate";
    }

    private List<Samochod> generateList(){
        List<Samochod> lista = new ArrayList<>();

        Samochod samochod1 = new Samochod();
        samochod1.setMarka("Fiat");
        samochod1.setModel("a");
        samochod1.setRocznik(1990);
        samochod1.setCena(1000);
        samochod1.setPrzebieg(100000);
        lista.add(samochod1);

        Samochod samochod2 = new Samochod();
        samochod2.setMarka("Ford");
        samochod2.setModel("b");
        samochod2.setRocznik(1991);
        samochod2.setCena(1001);
        samochod2.setPrzebieg(200000);
        lista.add(samochod2);

        Samochod samochod3 = new Samochod();
        samochod3.setMarka("Audi");
        samochod3.setModel("c");
        samochod3.setRocznik(1992);
        samochod3.setCena(1002);
        samochod3.setPrzebieg(150000);
        lista.add(samochod3);

        Samochod samochod4 = new Samochod();
        samochod4.setMarka("Opel");
        samochod4.setModel("d");
        samochod4.setRocznik(1997);
        samochod4.setCena(1003);
        samochod4.setPrzebieg(160000);
        lista.add(samochod4);

        Samochod samochod5 = new Samochod();
        samochod5.setMarka("Opel");
        samochod5.setModel("e");
        samochod5.setRocznik(1997);
        samochod5.setCena(1003);
        samochod5.setPrzebieg(160000);
        lista.add(samochod5);

        Samochod samochod6 = new Samochod();
        samochod6.setMarka("Toyota");
        samochod6.setModel("f");
        samochod6.setRocznik(1999);
        samochod6.setCena(2000);
        samochod6.setPrzebieg(80000);
        lista.add(samochod6);

        Samochod samochod7 = new Samochod();
        samochod7.setMarka("BMW");
        samochod7.setModel("g");
        samochod7.setRocznik(1991);
        samochod7.setCena(1001);
        samochod7.setPrzebieg(200000);
        lista.add(samochod7);

    return lista;
    }


}
