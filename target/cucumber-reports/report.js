$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/covidupdates.feature");
formatter.feature({
  "name": "As a customer,I need to be able to see the covid 9 restrictions",
  "description": "         so  I know whether I am still OK to place an order or not",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Checking Covid 19 Service Updates",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "That  I am viewing the DIY webpage",
  "keyword": "Given "
});
formatter.step({
  "name": "I press the \u0027\u003cCovid\u003e\u0027 button",
  "keyword": "When "
});
formatter.step({
  "name": "The \u0027\u003cCovids\u003e\u0027 page will be displayed same as B2B but with B2C theme",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Covid",
        "Covids"
      ]
    },
    {
      "cells": [
        "Covid-19 Service Updates",
        "Covid-19:Customer Notice"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Checking Covid 19 Service Updates",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "That  I am viewing the DIY webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDef.UpdatesCovid19.that_I_am_viewing_the_DIY_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press the \u0027Covid-19 Service Updates\u0027 button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDef.UpdatesCovid19.i_press_the_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The \u0027Covid-19:Customer Notice\u0027 page will be displayed same as B2B but with B2C theme",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.UpdatesCovid19.the_page_will_be_displayed_same_as_B2B_but_with_B2C_theme(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});