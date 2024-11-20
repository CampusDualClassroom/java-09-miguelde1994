package com.campusdual.classroom;

public class Exercise09 {

    public static void main(String[] args) {
        doWhileLoop(5);
    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle do-while, que para cada interacción muestre el siguiente mensaje:
    // Entra con valor: X, sale con valor: X+1
    // Entra con valor: X+1, sale con valor: X+2;
    // etc.
    public static void doWhileLoop(int num) {
        //El método doWhileLoop() recibe un número entero por parámetro. Dentro del método,
        // utilizando un bucle do-while, se llevarán a cabo comprobaciones cíclicas partiendo de cero ("X").
        // Mientras que "X" sea menor que el parámetro recibido, se mostrará primero un mensaje que indique con
        // qué valor entra al bucle. Luego se aumentará "X" en una unidad y se mostrará otro mensaje que indique con
        // qué valor saldrá "X" del bucle.
        int i = 0;
        do{
            System.out.println("Entra con valor: "+i+", sale con valor: "+(i+1));
            i++;
        }while(i<num);

    }
}