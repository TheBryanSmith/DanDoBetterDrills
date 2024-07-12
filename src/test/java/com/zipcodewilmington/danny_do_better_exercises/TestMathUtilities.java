package com.zipcodewilmington.danny_do_better_exercises;

import com.zipcodewilmington.danny_do_better_exercises.mathutilities.TestAddition;
import com.zipcodewilmington.danny_do_better_exercises.mathutilities.TestDivision;
import com.zipcodewilmington.danny_do_better_exercises.mathutilities.TestMultiplication;
import com.zipcodewilmington.danny_do_better_exercises.mathutilities.TestSubtraction;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.*;
/**
 * Modified by kristofer 3/4/2024.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestAddition.class,
        TestSubtraction.class,
        TestDivision.class,
        TestMultiplication.class
})
public class TestMathUtilities {

//    @Test
//    public void testAdd(){
//        MathUtilities mathUtilities = new MathUtilities();
//
//        Integer expected = 4;
//        Integer actual = mathUtilities.add(2,2);
//
//        Assert.assertEquals(actual,expected);
//    }
//
//    @Test
//    public void testLongAddMethod(){
//
//    }
//
//    @Test
//    public void testShortAddMethod(){
//
//    }
//
//    @Test
//    public void testByteAddMethod(){
//
//    }
//
//    @Test
//    public void testFloatAddMethod(){
//
//    }
//
//    @Test
//    public void testDoubleAddMethod(){
//
//    }


}