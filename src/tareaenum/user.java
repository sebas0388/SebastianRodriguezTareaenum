/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaenum;

/**
 *
 * @author SebastianR
 */
public class user {
  
    //Declaro las varables a usar.
    
    private String name, surname, mail, birthdate;  
    private roles rol;
       
    //Inicializo constructor.    
    public user(String name, String surname, String mail, String birthdate) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.birthdate = birthdate;
      }

    //Seters y Geters
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
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
    
       
    
      }
    
    
