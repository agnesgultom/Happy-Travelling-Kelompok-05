package del.ac.id.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import del.ac.id.demo.model.Bandara;
import del.ac.id.demo.service.BandaraService;

public class BandaraController {
	
	@Autowired
	private BandaraService bandaraService;
	
	@GetMapping("/showNewBandaraForm")
    public String showNewBandaraForm(Model model) {
        // create model attribute to bind form data
        Bandara bandara = new Bandara();
        model.addAttribute("bandara", bandara);
        return "new_bandara";
    }
    
    @PostMapping("/saveBandara")
    public String saveBandara(@ModelAttribute("bandara") Bandara bandara) {
        // save bandara to database
        bandaraService.saveBandara(bandara);
        return "redirect:/";
    }
}
