package com.company;

import java.util.ArrayList;

public class Produse implements Element {
    private int cantite;
    private String nume;
    private int pret;
    private ArrayList<Element>content= new ArrayList<Element>();

    public Produse(int ca, String num, int pr) {
        this.cantite = ca;
        this.nume = num;
        this.pret = pr;
    }
    public  int AddElement(Element element){
        content.add(element );
        return content.indexOf(element);
    }
    public void remove(Element element){
        content.remove(element);
    }
    public Element getElement(int index){
        return content.get(index);

    }

    public void print() {
        System.out.println(this.cantite + "X" + this.nume + "x" + this.pret +" lei");
        for (Element element : content) {
            element.print();
        }

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}




