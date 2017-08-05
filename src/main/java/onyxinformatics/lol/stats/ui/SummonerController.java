package onyxinformatics.lol.stats.ui;

import onyxinformatics.lol.stats.config.LoLStatsConfiguration;
import onyxinformatics.lol.stats.models.Summoner;
import onyxinformatics.lol.stats.resources.SummonerResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Mortiferum on 05.08.2017.
 */
@Controller
public class SummonerController {

    @Autowired
    private SummonerResource summonerResource;

    @Autowired
    private LoLStatsConfiguration loLStatsConfiguration;

    @RequestMapping(value = "/summoner/{summonerName}/", method = GET)
    public String getSummonerByName(@PathVariable final String summonerName, final Model model){
        final String apiKey = loLStatsConfiguration.getApiKey();
        final Summoner summoner = summonerResource.getSummonerByName(summonerName, apiKey);
        model.addAttribute("summoner", summoner);
        return "summoner";
    }
}
