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
    String name , surname, mail, birthdate, rol;
   
    //Pide los datos del nuevo usuario y los valida.
   do{
    name=JOptionPane.showInputDialog(null,"Ingrese su nombre: ","Nombre",JOptionPane.QUESTION_MESSAGE);
     }while(!validateStr(name));    
   do{
    surname=JOptionPane.showInputDialog(null,"Ingrese su apellido: ","Appelido",JOptionPane.QUESTION_MESSAGE);
      }while(!validateStr(surname));    
   do{
    mail=JOptionPane.showInputDialog(null,"Ingrese su mail: ","Mail",JOptionPane.QUESTION_MESSAGE);
      }while(!validateMail(mail));
   do{
    birthdate=JOptionPane.showInputDialog(null,"Ingrese su fecha de nacimiento con el siguiente formato(DD/MM/AAAA): ",
            "Fecha de nacimiento",JOptionPane.QUESTION_MESSAGE);
    }while(!validateDate(birthdate));
   
   rol = String.valueOf(JOptionPane.showInputDialog(null,"Seleccione el rol del usuario",
                                                        "Roles",JOptionPane.QUESTION_MESSAGE,
                                                        null,roles.values(),0));
      
   
   
    user userone = new user(name, surname, mail, birthdate);
    
    //Llamada a la funcion para saber la edad.
    int age = birthday (birthdate);
   
    //Muestra en pantalla los datos del nuevo usuario.
    JOptionPane.showMessageDialog(null, "Datos del nuevo usuario: \n" 
            + "\nNombre: " + userone.getName() 
            + "\nApellido: " + userone.getSurname() 
            + "\nMail: " + userone.getMail()
            + "\nFecha de nacimiento: " + userone.getBirthdate()
            + "\nEdad: " + age
            + "\nRol: " + rol
            , "Datos del usuario", JOptionPane.INFORMATION_MESSAGE);
     
     }
    
    //Los distintos metodos utilizados en el programa para validar los datos
    public static boolean validateStr(String wordValid){
    
    boolean validate= true;
    
    if (wordValid.isEmpty()){
        validate = false;
      }        
    return validate;
         }
    
    
 private static boolean validateMail(String wordValid){
    
   
    int num=wordValid.indexOf("@", 0);
    
   if (num <0 ){
        return false;
      }        
   if(wordValid.isEmpty()){
    return false;
      }
   return true;
      }
    
private static boolean validateDate(String wordValid){
    
   if (wordValid.length()<8){
       return false;
       }
   if(wordValid.isEmpty()){
        return false;
      }        
    return true;
         }


    //Metodo para calcular la edad apartir de la fecha de nacimiento ingresada por el usuario.
 private static int birthday (String birthdate) {
    
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate today = LocalDate.now(); 
        String creationDate = today.format(myFormat);
    
        
        String [] Birth = birthdate.split("/");
        int dayBirth = Integer.parseInt(Birth[0]);
        int monthBirth = Integer.parseInt(Birth[1]);
        int yearBirth = Integer.parseInt(Birth[2]);
        
        String [] Now = creationDate.split("/");
        int dayNow = Integer.parseInt(Now[0]);
        int monthNow = Integer.parseInt(Now[1]);
        int yearNow = Integer.parseInt(Now[2]);
                  
        int years = yearNow - yearBirth;
        
        if(monthNow<monthBirth){ 
             years = years-1;              
           }
        if((monthNow==monthBirth) && (dayNow<dayBirth)){
            years = years-1;            
           }
             return years;  
              
            }
 
         }


