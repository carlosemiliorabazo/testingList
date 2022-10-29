package com.ufv.lists;

import java.util.ArrayList;

public class Lists {

    private ArrayList<String> list = new ArrayList<String>();

    public Lists() {
        initializeList();
    }

    private void initializeList () {
        this.list.add("Uno");
        this.list.add("Dos");
        this.list.add("Tres");
    }

    public void addElement(String elem) {
        this.list.add(elem);
    }

    // uso de filtro de predicado. Borra el objeto n del ArrayList si
    // dicho objeto n es igual a 'elem'
    public void removeElem(String elem) {
        this.list.removeIf(n -> elem == n);
    }

    // Anotacion de sobreescritura. forzar al compilador a comprobar en tiempo de
    // compilación que estás sobrescribiendo correctamente un método, y de este
    // modo evitar errores en tiempo de ejecución, los cuales serían mucho más
    // difíciles de detectar.
    @Override
    public String toString() {
        return "" + list + "";
    }
}
