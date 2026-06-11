package com.codingshuttle.homework.BeansDiIocHomework.Impl;

import com.codingshuttle.homework.BeansDiIocHomework.Frosting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("strawberryFrost")
public class StrawberryFrosting implements Frosting
{
    @Override
    public String getFrostingType()
    {
        return "StrawberryFrosting";
    }
}
