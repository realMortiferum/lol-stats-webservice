package onyxinformatics.lol.stats.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Mortiferum on 05.08.2017.
 */
public class Summoner {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("accountId")
    private Integer accountId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("profileIconId")
    private Integer profileIconId;
    @JsonProperty("revisionDate")
    private Long revisionDate;
    @JsonProperty("summonerLevel")
    private Integer summonerLevel;

    public Integer getId() {
        return id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public String getName() {
        return name;
    }

    public Integer getProfileIconId() {
        return profileIconId;
    }

    public Long getRevisionDate() {
        return revisionDate;
    }

    public Integer getSummonerLevel() {
        return summonerLevel;
    }
}
