package springbootvue01.demo.mvcr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mvcI {

    @GetMapping("/index")
    public String index()
    {
        return "index";
    }
}
