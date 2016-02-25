/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.ExtendedClasses;

import java.util.Random;

/**
 *
 * @author Abhishek
 */
public class RandonNumberGenerator {
    
    
    public int randomGenerator()
    {
        Random randomGenerator = new Random();
        int i = randomGenerator.nextInt(100);
        return i;
    }
    
}
