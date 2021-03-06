# Coivoituliege API
## Requests

The different communication between a mobile phone using our application and the server can be described by the following protocol : 

| Objective | Request | URL argument/body | Header and Body Response |
| ------ | ------ | ------ | ------ |
|Add user in database | GET /sign_up |	`user`, `password`, `email` |  **HTTP 200**, *"user succesfully recorded"* + a session cookie; <br> **HTTP 200**, *"pseudo already use"*	|
| Check user id	|	GET /sign_in	|	`user`,`password` |	**HTTP 200**, *"connection OK"* + session cookie; <br> **HTTP 200**, *"user doesn't exist"* ;<br> **HTTP 200**, *"incorrect password"*	|
| Send new password	|	GET /forgotten_password	|`user`, `email`|**HTTP 200** *"email send"* ; <br>**HTTP 200**, *"user doesn't exist"*; <br>**HTTP 200**, *"invalid email"*;	|
| Remove user from database| GET /remove_user|`user`,`password`|**HTTP 200**, "user succesfully removed"; <br> **HTTP 200**, *"incorrect password"*;<br> **HTTP 200**, *"user does not exist";*|
| Store points in the database |POST /store_data |`JSON` (see below) |**HTTP 400**, *"cookie required"*; <br>**HTTP 400**, *"cookie badly set"*;<br> **HTTP 400**, *"bad Calendar format"*; <br>**HTTP 200**
## Json format
The Json that is provide in the body of the POST request can be described as : 
```sh
{"UserInfo": {
  "UserID": "Albert",
  "Data": {
    "Point" : 
        [{
            "Date":"2018-11-05",
            "Time":"11:00:00",
            "Latitude":"50.5851403",
            "Longitude":"5.5577415"
        }
        {  
            "Date":"2018-11-05",
            "Time":"11:02:00",
            "Latitude":"50.5851459",
            "Longitude":"5.5577499"
        }
    ]
    }
  }
}
```
This Json file represents a user which the user id *Albert* which as send two points at 2 minutes of interval.

