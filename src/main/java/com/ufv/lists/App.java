package com.ufv.lists;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        Lists list = new Lists();
        System.out.println(list);
        list.addElement("Objeto string de prueba 1");
        list.addElement("Objeto string de prueba 2");
        list.addElement("Objeto string de prueba 3");
        list.removeElem("Objeto string de prueba 2");
        System.out.println(list);
    }
}
