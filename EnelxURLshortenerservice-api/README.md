Shortener URL Service API

Web Application to create a URL Shortening Service


Getting Started


These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.


Prerequisites

To install, run and see functionalities working in this project is necessary the following software:

JDK 11 or above


Maven


Spring


Eclipse


MySQL


Postman


Build


mvn clean install


How to Run the Shortener URL Service Application


Start as a Spring Boot Application.


Running and see functionalities Working


Postman / Internet browser (GET, POST)


http://localhost:8080/urls


http://localhost:8080/urls/shortenerUrl?shortUrl=FLnDec


Sample JSON on Postman with POST method:


http://localhost:8080/urls


{
    "originalUrl": "https://github.com/orgs/claudiobraga/dashboard",
    "creationDate": "2021-05-31"
}


Response Body with status 201 Created


{
    "id": 8,
    "originalUrl": "https://github.com/orgs/claudiobraga/dashboard",
    "shortUrl": "FLnDec",
    "creationDate": "2021-05-31"
}



OBS: the value in shortUrl is the Shortener URL ("shortUrl": "FLnDec") in this case the shortener URL is FLnDec
that will resolve to the original URL that is https://github.com/orgs/claudiobraga/dashboard.


Built With


Spring Framework


Maven - Dependency Management


JavaSE-11


Author
Cláudio Braga