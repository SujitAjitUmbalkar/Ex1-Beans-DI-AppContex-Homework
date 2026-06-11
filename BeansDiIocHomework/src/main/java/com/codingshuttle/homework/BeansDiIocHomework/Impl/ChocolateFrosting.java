package com.codingshuttle.homework.BeansDiIocHomework.Impl;

import com.codingshuttle.homework.BeansDiIocHomework.Frosting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("chocoFrost")
public class ChocolateFrosting implements Frosting
{
    @Override
    public String getFrostingType()
    {
        return "ChocolateFrosting";
    }
}
