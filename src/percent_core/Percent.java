/*
 * Copyright (C) 2018 Pineapple Soft
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package percent_core;

import java.text.DecimalFormat;

/**
 * @version 1.0.0
 * @author David Ward
 */
public class Percent {
    
    /**
     * Rounds given number to 2 d.p.
     * 
     * @param aDouble
     * @return aDouble to 2 d.p.
     */
    public static double makeDecimal(double aDouble) 
    {
        DecimalFormat d = new DecimalFormat("0.00");
        return Double.valueOf(d.format(aDouble));
    }
    
    /**
     * Provide two numbers, returns a percentage of the lowest against the highest.
     * 
     * @param firstNumber
     * @param secondNumber
     * @return percentage of one number in terms of another.
     */
    public static double xOutOfY(double firstNumber, double secondNumber)
    {
        if(firstNumber < secondNumber)
        {
            return (firstNumber / secondNumber) * 100;            
        }
        
        return (secondNumber / firstNumber) * 100;
    }
    
    /**
     * Adds the given percentage to the given number
     * 
     * @param aNumber
     * @param aPercent
     * @return number + percent
     */
    public static double addPercentage(double aNumber, double aPercent)
    {
        return aNumber * (1 + (aPercent / 100));
    }
    
    /**
     * Subtracts the given percentage from the given number.
     * 
     * @param aNumber
     * @param aPercent
     * @return number - percent
     */
    public static double subtractPercentage(double aNumber, double aPercent)
    {
        return aNumber * (1 - (aPercent / 100));
    }
    
    /**
     * Calculates the percentage of inputNumber returned as a number.
     * @param aNumber
     * @param aPercent
     * @return Percentage of inputNumber.
     */
    public static double xPercentOfNumberIs(double aNumber, double aPercent)
    {
        return (aNumber / 100) * aPercent;
    }
    
    /**
     * Finds original number after percentage subtraction.
     * 
     * @param aNumber
     * @param aPercent
     * @return Returns original number after percentage subtraction.
     */
    public static double findOriginalNumber(double aNumber, double aPercent) 
    {
        return ( 100 * (aNumber / (100 - aPercent)));
    }
    
     /** 
     * Finds original number after percentage addition.
     * 
     * @param aNumber
     * @param aPercent
     * @return Returns original number after percentage addition.
     */
    public static double findOriginalNumberAfterAdd(double aNumber, double aPercent) 
    {
        return ((aNumber / (100 + aPercent)) * 100);
    }

    
}
