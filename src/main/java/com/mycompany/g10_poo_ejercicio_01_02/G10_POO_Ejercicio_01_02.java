/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g10_poo_ejercicio_01_02;

/**
 *
 * @author Adrian
 */
public class G10_POO_Ejercicio_01_02
{
    public static void main(String[] args)
    {
        int limite1 = 0;
        int limite2 = 0;
        int limite3 = 0;
        int anioActual = 2022;
        int maximoHorasTrabajadas = 150;
        var empleado1 = new empleado();
        empleado1.anioIngreso=2003;
        empleado1.costoHora=11.5;
        empleado1.horasTrabajadas=160;
        empleado1.nombre="Juan";
        
        System.out.println("Trabajador " + empleado1.nombre);
        System.out.println("Horas trabajadas: " + empleado1.horasTrabajadas);
        System.out.println("Costo hora: " + empleado1.costoHora);
        System.out.println("Año ingresado: " + empleado1.anioIngreso);
        System.out.println("Año actual: 2022 ");
        
        System.out.println("Ingresos: " + empleado1.calcularIngreso(anioActual));
        System.out.println("Bono por horas extra: " + empleado1.calcularBonoHorasExtra(maximoHorasTrabajadas));
        System.out.println("Limite 1: " + limite1);
        System.out.println("Limite 2: " + limite2);
        System.out.println("Limite 3: " + limite3);
        System.out.println("Impuestos: " + empleado1.calcularImpuesto(limite1, limite2, limite3));
        System.out.println("Total a pagar: " + empleado1.calcularAPagar());

        System.out.println("_____________");
        var empleado2 = new empleado();
        empleado2.anioIngreso=2010;
        empleado2.costoHora=9;
        empleado2.horasTrabajadas=100;
        empleado2.nombre="Carlos";
        
        System.out.println("Trabajador " + empleado2.nombre);
        System.out.println("Horas trabajadas: " + empleado2.horasTrabajadas);
        System.out.println("Costo hora: " + empleado2.costoHora);
        System.out.println("Año ingresado: " + empleado2.anioIngreso);
        System.out.println("Año actual: 2022 ");
        
        System.out.println("Ingresos: " + empleado2.calcularIngreso(anioActual));
        System.out.println("Bono horas extra: " + empleado2.calcularBonoHorasExtra(maximoHorasTrabajadas));
        System.out.println("Limite 1: " + limite1);
        System.out.println("Limite 2: " + limite2);
        System.out.println("Limite 3: " + limite3);
        System.out.println("Impuestos: " + empleado2.calcularImpuesto(limite1, limite2, limite3));
        System.out.println("Total a pagar: " + empleado2.calcularAPagar());
        
        System.out.println("_____________");
        var empleado3 = new empleado();
        empleado3.anioIngreso=2010;
        empleado3.costoHora=9;
        empleado3.horasTrabajadas=100;
        empleado3.nombre="Carlos";
        
        System.out.println("Trabajador " + empleado3.nombre);
        System.out.println("Horas trabajadas: " + empleado3.horasTrabajadas);
        System.out.println("Costo hora: " + empleado3.costoHora);
        System.out.println("Año ingresado: " + empleado3.anioIngreso);
        System.out.println("Año actual: 2022 ");
        System.out.println("Limite 1: " + limite1);
        System.out.println("Limite 2: " + limite2);
        System.out.println("Limite 3: " + limite3);
        System.out.println("Impuestos: " + empleado3.calcularImpuesto(limite1, limite2, limite3));
        System.out.println("Total a pagar: " + empleado3.calcularAPagar());
        
        System.out.println("Ingresos: " + empleado3.calcularIngreso(anioActual));
        System.out.println("Bono horas extra: " + empleado3.calcularBonoHorasExtra(maximoHorasTrabajadas));
    }
        
    
}
