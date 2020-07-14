package com.quimicrush.game.Models;

public class ElementModelAbstract
{
    private int numAtomic;
    private float massa;

    public void setNumAtomic(int numAtomic)
    {
        this.numAtomic = numAtomic;
    }

    public void setMass(int massa)
    {
        this.massa = massa;
    }

    public int getNumAtomic()
    {
        return numAtomic;
    }

    public float getMassa()
    {
        return massa;
    }
}
