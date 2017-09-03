/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccifactorial;

import java.util.ArrayList;

public class Numero {
    //Declaración de variables
    private int num;
    private int resultado;
    ArrayList<Integer> fibo = new ArrayList<Integer>();
   
    //Obtiene el numero ingresado
    public int getNum() {
        return this.num;
    }
    //Guarda el numero ingresado
    public void setNum(int num) {
        this.num = num;
    }
    //Metodo para obtener el factorial de un numero ingresadol
    public int Factorial(int num) {
        this.resultado = 0;

        for (int i = num; i > 1; i--) {

            if (this.resultado == 0) {
                this.resultado = this.resultado + (i * (i - 1));
            } else {
                this.resultado = (this.resultado * (i - 1));
            }
        }
        return this.resultado;
    }
    //Metodo que regresa un arraylist con los numeros de la serie de fibonnacci.
    public ArrayList fibonacci(int n) {

        this.fibo.removeAll(this.fibo);
        int fibo1 = 0;
        int fibo2 = 1;
        int aux;
        this.fibo.add(0);

       while (fibo2 + fibo1 <= n) {
      
            aux = fibo1;
            fibo1 = fibo2;
            fibo2 = aux + fibo1;
                 
            this.fibo.add(fibo2);
       }

        return this.fibo;
    }

}
