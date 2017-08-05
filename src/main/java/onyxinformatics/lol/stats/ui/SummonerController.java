package onyxinformatics.lol.stats.ui;

import onyxinformatics.lol.stats.config.LoLStatsConfiguration;
import onyxinformatics.lol.stats.models.CompleteSummoner;
import onyxinformatics.lol.stats.models.Summoner;
import onyxinformatics.lol.stats.resources.SummonerResource;
import onyxinformatics.lol.stats.service.SummonerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @Autowired
    private SummonerService summonerService;

    @RequestMapping(value = "/summoner", params = "name", method = GET)
    public String getSummonerByName(@RequestParam final String name, final Model model){
        final String apiKey = loLStatsConfiguration.getApiKey();
        final Summoner summoner = summonerResource.getSummonerByName(name, apiKey);
        final CompleteSummoner completeSummoner = summonerService.getCompleteSummoner(summoner.getId());
        model.addAttribute("summoner", summoner);
        model.addAttribute("completeSummoner", completeSummoner);
        return "summoner";
    }
}
