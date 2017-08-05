package onyxinformatics.lol.stats.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Mortiferum on 05.08.2017.
 */
@Controller
public class IndexController {

    @RequestMapping(value="/", method = GET)
    public String GetIndex(){
        return "index";
    }
}
