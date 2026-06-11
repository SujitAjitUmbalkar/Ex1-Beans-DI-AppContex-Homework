package com.codingshuttle.homework.BeansDiIocHomework.Impl;

import com.codingshuttle.homework.BeansDiIocHomework.Frosting;
import com.codingshuttle.homework.BeansDiIocHomework.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("chocoSyrup")
public class ChocolateSyrup implements Syrup
{
    @Override
    public String getSyrupType()
    {
        return "ChocolateSyrup";
    }
}
