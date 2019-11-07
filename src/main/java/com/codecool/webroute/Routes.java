package com.codecool.webroute;

public class Routes {

    @WebRoute("/test")
    public String test(){ return "This is the response string";}

    @WebRoute("/test1")
    public String test1(){ return "This is test1";}

    @WebRoute("/test2")
    public String test2(){ return "This is test2";}

}
