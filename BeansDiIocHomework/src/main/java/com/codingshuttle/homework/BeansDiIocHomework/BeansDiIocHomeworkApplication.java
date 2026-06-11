package com.codingshuttle.homework.BeansDiIocHomework;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeansDiIocHomeworkApplication implements CommandLineRunner
{
    private final CakeBaker cakeBaker;

    public BeansDiIocHomeworkApplication(CakeBaker cakeBaker) {
        this.cakeBaker = cakeBaker;
    }

    public static void main(String[] args)
    {
        SpringApplication.run(BeansDiIocHomeworkApplication.class, args);
    }

    @Override
    public void run(String... args)
    {
        cakeBaker.bakeCake();
    }
}