/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatchprogram;
import javax.swing.JOptionPane; //La clase JOptionPane que sirve para los cuadros de lialogo y texto
/**
 *
 * @author Tony
 */
public class TryCatchProgram {
    String mensaje; //varibale que usaremos mas adelnate.
    
    public TryCatchProgram(){
        String valorCadena=JOptionPane.showInputDialog(null,"Escribe un entero");//pide un entero al usuario 
        try{
        /* 
        crear un metodo parseInt() de la clase integer de la libreria lag para comvertir 
        un string en un int
        */
        int valorNumero=Integer.parseInt(valorCadena);
        //JOptionPane.showMessageDialog(null, "El valor es : " + valorCadena);
        mensaje="gracias";
        }
        catch(NumberFormatException ex){//indica un error capturado si es que lo existe
            mensaje="No escribio un entero";
        }
        JOptionPane.showMessageDialog(null, mensaje);//mandar mensaje segun sea el caso
    }
    
  

    public static void main(String[] args) {
        new TryCatchProgram();
        
     
        // TODO code application logic here
    }
    
}
