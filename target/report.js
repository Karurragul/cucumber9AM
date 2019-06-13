$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/user/eclipse-workspace/ragul/cucumber9AM/src/test/resources/feature/scenariooutline.feature");
formatter.feature({
  "name": "To Add customer",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user should be in telecom homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "User click the add customer",
  "keyword": "Given "
});
formatter.step({
  "name": "User should provide valid details\"\u003cfname\u003e\",\"\u003clname\u003e\",\"\u003cemail\u003e\",\"\u003caddress\u003e\",\"\u003cmobile\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Customer id is generated",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "fname",
        "lname",
        "email",
        "address",
        "mobile"
      ]
    },
    {
      "cells": [
        "Ragul",
        "kumar",
        "abc@gmail.com",
        "chennai",
        "12345"
      ]
    },
    {
      "cells": [
        "ram",
        "kumar",
        "zxc@gmail.com",
        "mumbai",
        "42536"
      ]
    },
    {
      "cells": [
        "dinesh",
        "raj",
        "mkl@gmail.com",
        "kolkata",
        "87654"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user should be in telecom homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Addcustomer.user_should_be_in_telecom_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the add customer",
  "keyword": "Given "
});
formatter.match({
  "location": "Addcustomer.user_click_the_add_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should provide valid details\"Ragul\",\"kumar\",\"abc@gmail.com\",\"chennai\",\"12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "Addcustomer.user_should_provide_valid_details(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "Addcustomer.customer_id_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user should be in telecom homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Addcustomer.user_should_be_in_telecom_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the add customer",
  "keyword": "Given "
});
formatter.match({
  "location": "Addcustomer.user_click_the_add_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should provide valid details\"ram\",\"kumar\",\"zxc@gmail.com\",\"mumbai\",\"42536\"",
  "keyword": "When "
});
formatter.match({
  "location": "Addcustomer.user_should_provide_valid_details(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "Addcustomer.customer_id_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user should be in telecom homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Addcustomer.user_should_be_in_telecom_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the add customer",
  "keyword": "Given "
});
formatter.match({
  "location": "Addcustomer.user_click_the_add_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should provide valid details\"dinesh\",\"raj\",\"mkl@gmail.com\",\"kolkata\",\"87654\"",
  "keyword": "When "
});
formatter.match({
  "location": "Addcustomer.user_should_provide_valid_details(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Customer id is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "Addcustomer.customer_id_is_generated()"
});
formatter.result({
  "status": "passed"
});
});