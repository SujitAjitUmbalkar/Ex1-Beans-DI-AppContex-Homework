package com.codingshuttle.homework.BeansDiIocHomework.Impl;

import com.codingshuttle.homework.BeansDiIocHomework.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@Qualifier("strawberrySyrup")
@ConditionalOnProperty(name = "syrup.type",havingValue = "strawberry")
public class StrawberrySyrup implements Syrup
{
    @Override
    public String getSyrupType()
    {
        return "Strawberry Syrup";
    }
}
