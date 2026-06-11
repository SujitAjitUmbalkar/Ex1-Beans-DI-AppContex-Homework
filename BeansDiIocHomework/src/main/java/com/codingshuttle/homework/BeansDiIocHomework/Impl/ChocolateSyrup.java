package com.codingshuttle.homework.BeansDiIocHomework.Impl;

import com.codingshuttle.homework.BeansDiIocHomework.Frosting;
import com.codingshuttle.homework.BeansDiIocHomework.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@Qualifier("chocoSyrup")
@ConditionalOnProperty(name = "syrup.type",havingValue = "chocolate")
public class ChocolateSyrup implements Syrup
{
    @Override
    public String getSyrupType()
    {
        return "ChocolateSyrup";
    }
}
