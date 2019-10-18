/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodelistas;

import java.util.Scanner;

/**
 *
 * @author Cruzp
 */
public class ProyectodeListas {


 
 public static int leerEntero(String linea){
  Scanner leer = new Scanner(System.in);
  System.out.println(linea);
  
  int dato = leer.nextInt();
  return dato;
   
 }
 
 public static void main(String[] args) {
  Lista coleccion = new Lista();
  int opcion;
   
  do{
   System.out.println("***Menu de opciones***");
   System.out.println("1.- Ingresar datos a la lista");
   System.out.println("2.- Imprimir Lista");
   System.out.println("3.- Eliminar datos que se pasan de un limite.");
   System.out.println("4.- Salir-");
   opcion = leerEntero("Ingrese la opcion que desea:");
    
   switch(opcion){
   case 1:{
    int nuevo = leerEntero("Ingrese el dato que desea añadir a lista:");
    coleccion.agregarFin(nuevo);
    break;
   }
   case 2:{
    System.out.println("La lista es:");
    coleccion.imprimir();
    break;
   }
   case 3:{
    int valor = leerEntero("Ingrese el valor limite que tendra la lista:");
    coleccion.eliminar(valor);
    break;
   }
   case 4:{
    break;
   }
   }
  }while(opcion!=4);
   
 
 }
 
}