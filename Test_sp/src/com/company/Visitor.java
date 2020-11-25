package com.company;

import javax.swing.*;

public interface Visitor {
    void visit( Comanda comanda);
    void visit(Produse produse);

}