
Feature: as a quality analyst I want to ensure the correct operation and test the time zone service


  Scenario Outline: validate response message to with invalid latitude
    Given the time zone service is consumed with the data
     | <lat>  | <lng> | <username>  |
    Then the service will answer us
      | <message>  | <value> |
    Examples: 
      | lat  | lng | username  |  message               |value|
      | 100  |  10 | angy84    |  invalid lat/lng       | 14  |
      | -100 |  180 | angy84   |  invalid lat/lng       | 14  |
      | -100 |  -180 | angy84  |  invalid lat/lng       | 14  |


  Scenario Outline: validate the reply message with valid latitude and invalid longitude
    Given the time zone service is consumed with the data
      | <lat>  | <lng> | <username>  |
    Then the service will answer us
      | <message>  | <value> |
    Examples:
      | lat  | lng | username  |  message              |value|
      | -90  | -181 | angy84  |   invalid lat/lng      | 14  |
      | 90   | 181  | angy84  |   invalid lat/lng      | 14  |


  Scenario Outline: validate that the information is correctly returned, when the latitude and longitude are valid
    Given the time zone service is consumed with the data
      | <lat>  | <lng> | <username>  |
    Then the service will respond to the data
      | <lng> |  <mcountryCode> |<gmtOffset>| <rawOffset>|<timezoneId>         |<dstOffset>|<countryName>|<time>| <lat>|
    Examples:
      | lng |  mcountryCode |gmtOffset| rawOffset|timezoneId          |dstOffset|countryName|time               | lat| username|
      | 20  |    AQ         |  6      | 6        | Antarctica/Vostok  |6        |Antarctica |not null           |-90 | qa_mobile_easy|
