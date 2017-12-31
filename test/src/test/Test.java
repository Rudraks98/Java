/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;
import java.util.*;


/**
 *
 * @author RH SHUKLA
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int ac=0,ec=0,ic=0,oc=0,uc=0;
        
        String a="hi";
        System.out.println("enter string");
         a=s.nextLine();
        while(!a.equals("quit"))
        {
           
            
            char [] p=a.toCharArray();
            
            for(char d:p)
            {
                switch(d)
                {
                    case 'A':
                    case 'a':
                        ac++;
                        break;
                    case 'E':
                    case 'e':
                        ec++;
                        break;
                    case 'i':
                    case 'I':
                        ic++;
                        break;
                    case 'o':
                    case 'O':
                        oc++;
                        break;
                    case 'u':
                    case 'U':
                        uc++;
                        break;
                }
            }
                
                System.out.println("av is"+ac);
                 System.out.println(ec);
                  System.out.println(ic);
                   System.out.println(oc);
                    System.out.println(uc);
                    System.out.println("enter string");
            a=s.nextLine();
        
        }
    }
}
          
          
              
      
        
        
        
        
         
       
        
       
            
         
               
              
                  
                  
                  
                  
                  
                  
                  
                  
          
       
   
       
        
       
    
    

