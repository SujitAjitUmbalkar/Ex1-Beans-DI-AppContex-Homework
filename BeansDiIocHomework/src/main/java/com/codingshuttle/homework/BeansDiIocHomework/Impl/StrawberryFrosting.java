package com.codingshuttle.homework.BeansDiIocHomework.Impl;

import com.codingshuttle.homework.BeansDiIocHomework.Frosting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@Qualifier("strawberryFrost")
@ConditionalOnProperty(name = "frosting.type",havingValue = "strawberry")
public class StrawberryFrosting implements Frosting
{
    @Override
    public String getFrostingType()
    {
        return "StrawberryFrosting";
    }
}
