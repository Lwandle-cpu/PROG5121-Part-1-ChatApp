package za.ac.iie.chatapppart01;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Login {
 
//Declare variables that are going to be used by the user
    
 String username;
 String password;
 String phoneNumber;
 
// Username validation
public boolean checkUserName(String username) {
    return username != null && username.contains("_") && username.length() <= 5;
}
 
    
 //Password validation   
public boolean checkPasswordComplexity(String password)  {
    if (password == null || password.length() < 8) {
        return false;
    }

    boolean hasCapital = false;
    boolean hasNumber = false;
    boolean hasSpecial = false;

    for (int i = 0; i < password.length(); i++) {
        char c = password.charAt(i);

        if (Character.isUpperCase(c)) {
            hasCapital = true;
        } else if (Character.isDigit(c)) {
            hasNumber = true;
        } else if (!Character.isLetterOrDigit(c)) {
            hasSpecial = true;
        }
    }

    return hasCapital && hasNumber && hasSpecial;
}
 
//Cellphone validation should contain not more than 12 character
public boolean checkCellPhoneNumber (String phone) {
    return phone != null && phone.startsWith("+27") && phone.length() <= 12;
}

//register validation
public String registerUser(String username , String password , String phoneNumber){
    
    if(!checkUserName(username)){
        return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
    }
    
    if(!checkPasswordComplexity(password)){
        return"Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number,and a special character.";
    }
    
    if(!checkCellPhoneNumber(phoneNumber)){
        return"Cell phone number incorrectly formatted or does not contain international code.";
    }
    
    this.username = username;
    this.password = password;
    this.phoneNumber = phoneNumber;
    
    return"User registered successfully";
}
 public String registerUser(String username, String password) {
        if (!checkUserName(username)) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }

        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }

        this.username = username;
        this.password = password;

        return "User registered successfully";
    }
 
 public boolean loginUser(String username, String password) {
        if (this.username == null || this.password == null) {
            return false;
        }
        return this.username.equals(username) && this.password.equals(password);
    }
 
 public String returnloginStatus(boolean success) {
     if (success){
         return "Welcome " + username +" it is great to see you again.";
     }else {
         return "Username or password incorrect, please try again.";
     }
 }

    String returnLoginStatus(boolean loggedIn) {
        if (loggedIn) {
            return "Welcome " + username + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}


