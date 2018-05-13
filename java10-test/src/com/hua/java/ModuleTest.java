package com.hua.java;


import com.hua.bean.Person;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

public class ModuleTest {

    private static final Logger LOGGER = Logger.getLogger("hua");


    public static void main(String[] args) {
        Person person = new Person("Hua", 30);
        System.out.println(person);

        //User user = new User("Hua", 30);
    }


    @Test
    public void test(){
        System.out.println("Hello Hua");
    }


    @Test
    public void test1(){
        try {
            URL url = new URL("http://www.google.com");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
