package com.company;

import com.company.Element;
import com.company.Visitor;

import java.util.ArrayList;

public class Comanda implements Element{
    protected ArrayList<Element> elements = new ArrayList<>();
    public Comanda(){
    }
    public void AddElement(Element elm){
        elements.add(elm);
    }
    public void print(){
        for(Element i : elements){
            i.print();
        }
    }
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}