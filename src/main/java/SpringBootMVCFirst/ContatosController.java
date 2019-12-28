package SpringBootMVCFirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ContatosController {
    @Autowired
    private Contatos contatos;

    @RequestMapping("/contatos")
    public ModelAndView listar(){
        List<Contato> lista = contatos.findAll();

        ModelAndView modelAndView = new ModelAndView("contatos");
        modelAndView.addObject("contatos", lista);

        return modelAndView;
    }
}
