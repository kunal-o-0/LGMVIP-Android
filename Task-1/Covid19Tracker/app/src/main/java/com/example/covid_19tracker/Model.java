package com.example.covid_19tracker;

public class Model {
    String state;
    String recovered;
    String deaths;
    String confirmedCases;

    public Model(String state,String recovered,String deaths,String confirmedCases)
    {
        this.state=state;
        this.recovered=recovered;
        this.deaths=deaths;
        this.confirmedCases=confirmedCases;
    }
}
