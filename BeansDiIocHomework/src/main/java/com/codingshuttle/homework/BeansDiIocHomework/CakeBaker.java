package com.codingshuttle.homework.BeansDiIocHomework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker
{
//    @Autowired              // through autowired
//    @Qualifier("strawberryFrost")
//    private Frosting frosting;
//    private final Syrup syrup;
//    public CakeBaker(@Qualifier("strawberrySyrup") Syrup syrup) {this.syrup = syrup;}

    @Autowired
    private Frosting frosting;

    private final Syrup syrup;
    public CakeBaker( Syrup syrup) {this.syrup = syrup;}

    public void bakeCake()
    {
        System.out.println("Cake is baking in CakeBaker by Frosting "
                + frosting.getFrostingType()
                + " &" + " Syrup of "+ syrup.getSyrupType());
    }
}


