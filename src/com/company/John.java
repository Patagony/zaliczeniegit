package com.company;

public class John extends Osoba implements Dzialanie
{
    @Override
    public void greetings()
    {
        System.out.println("Czesc, mam na imie John");
    }

    @Override
    public void krok()
    {
        System.out.println("John kroczy");
    }

    @Override
    public void unik()
    {
        System.out.println("John robi unik");
    }

    @Override
    public void skok()
    {
        System.out.println("John skacze");
    }

    @Override
    public void uklon()
    {
        System.out.println("John sie klania");
    }
}
