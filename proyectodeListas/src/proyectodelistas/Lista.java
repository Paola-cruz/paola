/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodelistas;





/**
 *
 * @author Cruzp
 */
class Lista {
   private Nodo inicio;
private Nodo fin;
  
  
 public Lista(){
  inicio=fin=null;
 }
 //metodo que agrega un nuevo nodo en la poscion final
 public void agregarFin(int info){
   
  Nodo nuevo = new Nodo(info, null);
  
  if(inicio==null){
   inicio=fin=nuevo;
  }else{
   fin.setSiguiente(nuevo);
   fin = nuevo;
  }
  
 }
 //Metodo que recorre e imprime
 public void imprimir(){
  Nodo aux=inicio;
   
  while(aux!=null){
   System.out.println(aux.getDato());
   aux = aux.getSiguiente();
  }
   
 }
  
 //En este metodo vamos a recorrer la lista buscando los datos mayores a el limite
 public void eliminar(int valor){
   
  Nodo anterior=inicio;
  Nodo aux= inicio.getSiguiente();
  Nodo temp;
  while(aux!=null){
   //algoritmo de eliminacion de nodos
   if(aux.getDato() > valor){
    temp=aux.getSiguiente();   
    anterior.setSiguiente(aux.getSiguiente()); 
    aux = temp;
     
   }else{
    anterior=anterior.getSiguiente();
    aux=aux.getSiguiente();
   }
    
  }
 }

    void eliminarLista(int exp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
  
  
}