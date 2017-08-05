package onyxinformatics.lol.stats.resources;

import onyxinformatics.lol.stats.models.Summoner;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

/**
 * Created by Mortiferum on 05.08.2017.
 */
@FeignClient(name = "LoLEuw1Api", url = "${lol.api.host.euw1}")
public interface SummonerResource {

    @RequestMapping(value = "/summoner/v3/summoners/by-name/{summonerName}?api_key={apiKey}", method = RequestMethod.GET, consumes = APPLICATION_JSON_UTF8_VALUE, produces = APPLICATION_JSON_UTF8_VALUE)
    Summoner getSummonerByName(@PathVariable("summonerName") String summonerName, @PathVariable("apiKey") String apiKey);
}
