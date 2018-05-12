package com.hua.java;


import com.hua.bean.Person;
import org.junit.Test;

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
}
