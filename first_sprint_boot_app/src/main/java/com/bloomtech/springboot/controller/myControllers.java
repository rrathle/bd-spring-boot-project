package com.bloomtech.springboot.controller;

import com.bloomtech.springboot.model.theDataForRequest;
import org.springframework.web.bind.annotation.*;

//Data may be sent with an HTTP request:
//GET or DELETE request data is in a URL query parameter(?name=value) @RequestParam

//POST or PUT request data is int the request body @RequestBody
        //https reques typically has Json formatted data in the request body
//       jave uses objects

// in Postman you must put any data fror a post in the request data
// the serer automatically converts json to/from objects

// this class will hold controllers for our server
@RestController // tell the server that there are REST controller methods in this class
public class myControllers {
    //Define a method to handle HTTP GET requst for the root url path
    @GetMapping(value = "/") // the method that follows will handle the HTTP GETS for "/"

    public String rootPathMethod() { // the method name can be anything that you want
        System.out.println("methodfor GET path '/ was executed");
        return "Root path method was called";

    }

    //DEfine a mthid that handles HHTp GEt rewust for the url path "/Startrek"
    //      with query parameter of "character=value'
    //TP access data in a query parameter use @RequestParam annotation in the method parameter list

    // @REQUESTPARAM data-type name-of-query-parameter

    @GetMapping(value = "/startrek")
    public String starTrek(@RequestParam String whoTheyAre) {
        System.out.println("controller method for GET with 'startrek was run");
        return "star Trek method was called with the parameter value: " + whoTheyAre;
    }
    
    @GetMapping(value = "/startrek/spock")
    public String aanynameYouwant() {
        System.out.println("controller method for GET with 'startrek/Spok' was run");
        return "Live long and prosper";
    }
//@Requestbody
    @PostMapping(value = "/")
    public String wilberPost(@RequestBody theDataForRequest dataPassedIn) {
        System.out.println("controller method for Post with '/' was run");
        System.out.println("the data sent with the request was: " + dataPassedIn);
        return "Mr.ed was a talking horse on TV 1960's";
    }


}
