package pl.wszib;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SamochodController {
private List<Samochod> listSamochod;

    @GetMapping("iteration")
    public String iteration(Model model) {
        List<Samochod> list = generateList();
        model.addAttribute("list", list);
        return "iterationTemplate";
    }

    @GetMapping("forms")
    public String forms(Model model) {
        model.addAttribute("samochod", new Samochod());
        return "formsTemplate";
    }

    @PostMapping("formsSave")
    public String formSave(Samochod samochod, Model model) {
        listSamochod.add(samochod);
        return "successTemplate";
    }

    private List<Samochod> generateList() {
        List<Samochod> list = new ArrayList<>();

        Samochod samochod = new Samochod();
        samochod.setMarka("sam1");
        samochod.setModel("mo1");
        samochod.setRocznik(2001);
        samochod.setCena(1.000);
        samochod.setPrzebieg(100000);
        samochod.setVisible(true);
        list.add(samochod);

        Samochod samochod2 = new Samochod();
        samochod2.setMarka("sam2");
        samochod2.setModel("mo2");
        samochod2.setRocznik(2002);
        samochod2.setCena(2.000);
        samochod2.setPrzebieg(200000);
        samochod2.setVisible(true);
        list.add(samochod2);

        Samochod samochod3 = new Samochod();
        samochod3.setMarka("sam3");
        samochod3.setModel("mo3");
        samochod3.setRocznik(2003);
        samochod3.setCena(3.000);
        samochod3.setPrzebieg(300000);
        samochod3.setVisible(true);
        list.add(samochod3);

        Samochod samochod4 = new Samochod();
        samochod4.setMarka("sam4");
        samochod4.setModel("mo4");
        samochod4.setRocznik(2004);
        samochod4.setCena(4.000);
        samochod4.setPrzebieg(400000);
        samochod4.setVisible(true);
        list.add(samochod4);

        Samochod samochod5 = new Samochod();
        samochod5.setMarka("sam5");
        samochod5.setModel("mo5");
        samochod5.setRocznik(2005);
        samochod5.setCena(5.000);
        samochod5.setPrzebieg(500000);
        samochod5.setVisible(true);
        list.add(samochod5);

        Samochod samochod6 = new Samochod();
        samochod6.setMarka("sam6");
        samochod6.setModel("mo6");
        samochod6.setRocznik(2006);
        samochod6.setCena(6.000);
        samochod6.setPrzebieg(600000);
        samochod6.setVisible(true);
        list.add(samochod6);

        Samochod samochod7 = new Samochod();
        samochod7.setMarka("sam7");
        samochod7.setModel("mo7");
        samochod7.setRocznik(2007);
        samochod7.setCena(7.000);
        samochod7.setPrzebieg(700000);
        samochod7.setVisible(true);
        list.add(samochod7);

        Samochod samochod8 = new Samochod();
        samochod8.setMarka("sam8");
        samochod8.setModel("mo8");
        samochod8.setRocznik(2008);
        samochod8.setCena(8.000);
        samochod8.setPrzebieg(800000);
        samochod8.setVisible(true);
        list.add(samochod8);

        Samochod samochod9 = new Samochod();
        samochod9.setMarka("sam9");
        samochod9.setModel("mo9");
        samochod9.setRocznik(2009);
        samochod9.setCena(9.000);
        samochod9.setPrzebieg(900000);
        samochod9.setVisible(true);
        list.add(samochod9);

        Samochod samochod10 = new Samochod();
        samochod10.setMarka("sam10");
        samochod10.setModel("mo10");
        samochod10.setRocznik(20010);
        samochod10.setCena(10.000);
        samochod10.setPrzebieg(1100000);
        samochod10.setVisible(true);
        list.add(samochod10);

        return list;

    }
}
