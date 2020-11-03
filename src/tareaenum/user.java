/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaenum;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author SebastianR
 */
public class user {
  
    //Declaro las varables a usar.
    
    private String name, surname, mail, birthdate;  
    private int age;
    private roles rol;
       
    //Inicializo constructor. 
    
    public user() {
      }

    public user(String name, String surname, String mail, String birthdate) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.birthdate = birthdate;
    }

    //Seters y Geters
    private void setName(String name) {
        this.name = name;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    private void setMail(String mail) {
        this.mail = mail;
    }

    private void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    private void setAge(int age) {
        this.age = age;
    }

        
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMail() {
        return mail;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public int getAge() {
        return age;
    }
    
  //Los distintos metodos utilizados en el programa para validar los datos
    public boolean validateStr(String wordValid){
    
    boolean validate= true;
    
    if (wordValid.isEmpty()){
        validate = false;
      }        
    return validate;
         }
    
    
    public boolean validateMail(String wordValid){
    
   
      int num=wordValid.indexOf("@", 0);
      int num2=wordValid.indexOf(".", 0);
    
       if (num <0 ){
        return false;
          }    
       if (num2 <0 ){
        return false;
          }        
       if(wordValid.isEmpty()){
        return false;
          }
        return true;
          }
    
    public boolean validateDate(String wordValid){
    
      if (wordValid.length()<8){
       return false;
          }
      if(wordValid.isEmpty()){
        return false;
          }        
        return true;
          }


  //Metodo para calcular la edad apartir de la fecha de nacimiento ingresada por el usuario.
    public void birthday (String birthdate) {
    
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
             setAge(years);  
              
            }  
    
       }
    
    
