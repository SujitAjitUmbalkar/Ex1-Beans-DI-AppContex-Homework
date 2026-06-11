package com.codingshuttle.homework.BeansDiIocHomework.Impl;

import com.codingshuttle.homework.BeansDiIocHomework.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("strawberrySyrup")
public class StrawberrySyrup implements Syrup
{
    @Override
    public String getSyrupType()
    {
        return "Strawberry Syrup";
    }
}
