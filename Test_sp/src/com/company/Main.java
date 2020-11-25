package com.company;

public class Main {

    public static void main(String[] args) {
	Comanda comanda=new Comanda();
	Produse produse1=new Produse(2,"Pui ",100);
	Produse produse2=new Produse(1 ," Friptura de porc la tava ", 13);
	Produse produse3=new Produse(1,"Snitel vienez ",100);
	Produse produse4=new Produse(2 ,"Cartofi Wedges ",  6 );
	comanda.AddElement(produse1);
	comanda.AddElement(produse2);
	comanda.AddElement(produse3);
	comanda.AddElement(produse4);
	comanda.print();

    }
}
