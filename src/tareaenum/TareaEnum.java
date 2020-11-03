/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaenum;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author SebastianR
 */
public class TareaEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
  //Declaro las variables a usar.
    String name = "" , surname = "", mail = "", birthdate = "", rol;
   
    user userEmpty = new user();
    
    
  //Pide los datos del nuevo usuario y los valida.
    do{
     name=JOptionPane.showInputDialog(null,"Ingrese su nombre: ","Nombre",JOptionPane.QUESTION_MESSAGE);
      }while(!userEmpty.validateStr(name));   
      
    do{
     surname=JOptionPane.showInputDialog(null,"Ingrese su apellido: ","Appelido",JOptionPane.QUESTION_MESSAGE);
       }while(!userEmpty.validateStr(surname));    
   
    do{
     mail=JOptionPane.showInputDialog(null,"Ingrese su mail: ","Mail",JOptionPane.QUESTION_MESSAGE);
       }while(!userEmpty.validateMail(mail));
   
    do{
     birthdate=JOptionPane.showInputDialog(null,"Ingrese su fecha de nacimiento con el siguiente formato(DD/MM/AAAA): ",
             "Fecha de nacimiento",JOptionPane.QUESTION_MESSAGE);
     }while(!userEmpty.validateDate(birthdate));
   
    rol = String.valueOf(JOptionPane.showInputDialog(null,"Seleccione el rol del usuario",
                                                        "Roles",JOptionPane.QUESTION_MESSAGE,
                                                        null,roles.values(),0));
    
      user userone = new user(name, surname, mail, birthdate);
   
  //Llamada al metodo para saber la edad.
      userone.birthday(birthdate);
   
 //Muestra en pantalla los datos del nuevo usuario.
      JOptionPane.showMessageDialog(null, "Datos del nuevo usuario: \n" 
            + "\nNombre: " + userone.getName() 
            + "\nApellido: " + userone.getSurname() 
            + "\nMail: " + userone.getMail()
            + "\nFecha de nacimiento: " + userone.getBirthdate()
            + "\nEdad: " + userone.getAge()
            + "\nRol: " + rol
            , "Datos del usuario", JOptionPane.INFORMATION_MESSAGE);
       }
     }

 
         


