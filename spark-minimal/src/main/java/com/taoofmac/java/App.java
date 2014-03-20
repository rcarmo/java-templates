package com.taoofmac.java;

import static spark.Spark.*;

import spark.*;

public class App {

   public static void main(String[] args) {

      setPort(8888);
      get(new Route("/hello") {
         @Override
         public Object handle(Request request, Response response) {
            return "Hello World!";
         }
      });

   }

}
