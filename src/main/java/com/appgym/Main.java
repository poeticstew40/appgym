package com.appgym;

import com.appgym.igu.Principal;


public class Main {
    public static void main(String[] args) {
        
        //Crea la pantalla principal del IGU, la llama y la hace visble
        Principal princ = new Principal();  
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }
}