/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.tp_mod_02_1302210022_ibrahim_mulyo_tsabit;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TP_MOD_02_1302210022_Ibrahim_Mulyo_TsabitTest {

    @Test
    public void testFuncfpb() {
        // Test cases for the funcfpb method
        assertEquals(1, TP_MOD_02_1302210022_Ibrahim_Mulyo_Tsabit.funcfpb(1, 1));
        assertEquals(2, TP_MOD_02_1302210022_Ibrahim_Mulyo_Tsabit.funcfpb(2, 4));
        assertEquals(3, TP_MOD_02_1302210022_Ibrahim_Mulyo_Tsabit.funcfpb(9, 6));
        assertEquals(5, TP_MOD_02_1302210022_Ibrahim_Mulyo_Tsabit.funcfpb(10, 15));
        assertEquals(7, TP_MOD_02_1302210022_Ibrahim_Mulyo_Tsabit.funcfpb(14, 21));
        assertEquals(10, TP_MOD_02_1302210022_Ibrahim_Mulyo_Tsabit.funcfpb(8, 12));
    }
}
