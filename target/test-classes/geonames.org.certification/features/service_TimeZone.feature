
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
      | 50000000 |  -180 | angy84  |  invalid lat/lng       | 14  |


  Scenario Outline: validate the reply message with valid latitude and invalid longitude
    Given the time zone service is consumed with the data
      | <lat>  | <lng> | <username>  |
    Then the service will answer us
      | <message>  | <value> |
    Examples:
      | lat  | lng | username  |  message              |value|
      | -90  | -181 | angy84  |   invalid lat/lng      | 14  |
      | 90   | 181  | angy84  |   invalid lat/lng      | 14  |
      | 90   | 181  | angy84  |   invalid lat/lng      | 14  |
      | 90   | 40000000 | angy84  |   invalid lat/lng      | 14  |


  Scenario Outline: validate that the information is correctly returned, when the latitude and longitude are valid
    Given the time zone service is consumed with the data
      | <lat>  | <lng> | <username>  |
    Then the service will respond to the data
      | <lng> |  <mcountryCode> |<gmtOffset>| <rawOffset>|<timezoneId>         |<dstOffset>|<countryName>|<time>| <lat>|
    Examples:
      | lng |  mcountryCode |gmtOffset| rawOffset|timezoneId          |dstOffset|countryName|time               | lat| username|
      | 20  |    AQ         |  6      | 6        | Antarctica/Vostok  |6        |Antarctica |not null           |-90 | qa_mobile_easy|


  Scenario Outline: Validate the reply message when the user does not exist
    Given the time zone service is consumed with the data
      | <lat>  | <lng> | <username>  |
    Then the service will answer us
      | <message>  | <value> |
    Examples:
      | lat  | lng | username  |  message              |value|
      | 30  | -90 | AngyLizeth |  user does not exist.  | 10  |
      | 40   | 50 | PepitoNieto|   user does not exist. | 10  |


  Scenario Outline: Validate reply message when user is invalid
    Given the time zone service is consumed with the data
      | <lat>  | <lng> | <username>  |
    Then the service will answer us
      | <message>  | <value> |
    Examples:
      | lat  | lng | username  |  message              |value|
      | 50   | 60  |           |  invalid user         | 10  |
      | 20   | 60  | 5455      |  invalid user         | 10  |
      | 20   | 60  | $##%&(/   |  invalid user         | 10  |
      | 20   | 60  | !         |  invalid user         | 10  |
      | 20   | 60  | "         |  invalid user         | 10  |
      | 20   | 60  | $         |  invalid user         | 10  |
      | 20   | 60  | /         |  invalid user         | 10  |
      | 20   | 60  | (         |  invalid user         | 10  |
      | 20   | 60  | )         |  invalid user         | 10  |
      | 20   | 60  | =         |  invalid user         | 10  |
      | 20   | 60  | jaimito*_& |  invalid user         | 10  |
      | 20   | 60  | SELECT * FROM users WHERE id = 10 or 1=1   |  invalid user         | 10  |
      | 20   | 60  | *         |  invalid user         | 10  |



