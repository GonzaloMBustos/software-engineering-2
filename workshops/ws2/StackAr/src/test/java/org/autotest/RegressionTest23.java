package org.autotest;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

    public static boolean debug = false;

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1151");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
        boolean boolean4 = stackAr3.isFull();
        boolean boolean6 = stackAr3.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        boolean boolean9 = stackAr3.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) 'a');
        boolean boolean13 = stackAr11.equals((java.lang.Object) (-1.0f));
        boolean boolean15 = stackAr11.equals((java.lang.Object) "");
        boolean boolean16 = stackAr3.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean19 = stackAr18.isEmpty();
        boolean boolean20 = stackAr18.isEmpty();
        stackAr3.push((java.lang.Object) stackAr18);
        boolean boolean22 = stackAr18.isFull();
        stackAr1.push((java.lang.Object) stackAr18);
        java.lang.Object obj24 = stackAr1.top();
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr();
        boolean boolean26 = stackAr25.isFull();
        boolean boolean27 = stackAr1.equals((java.lang.Object) stackAr25);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr();
        boolean boolean29 = stackAr28.isFull();
        int int30 = stackAr28.size();
        boolean boolean31 = stackAr28.isEmpty();
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean34 = stackAr33.isFull();
        java.lang.Class<?> wildcardClass35 = stackAr33.getClass();
        stackAr28.push((java.lang.Object) wildcardClass35);
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr();
        int int38 = stackAr37.size();
        java.lang.String str39 = stackAr37.toString();
        stackAr28.push((java.lang.Object) stackAr37);
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) '4');
        stackAr42.push((java.lang.Object) (-1L));
        boolean boolean45 = stackAr42.isEmpty();
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr();
        boolean boolean47 = stackAr46.isFull();
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean50 = stackAr49.isEmpty();
        boolean boolean51 = stackAr49.isFull();
        boolean boolean52 = stackAr46.equals((java.lang.Object) boolean51);
        boolean boolean53 = stackAr46.isFull();
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr();
        boolean boolean55 = stackAr54.isFull();
        boolean boolean57 = stackAr54.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr59 = new org.autotest.StackAr((int) '4');
        boolean boolean60 = stackAr54.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr62 = new org.autotest.StackAr((int) 'a');
        boolean boolean64 = stackAr62.equals((java.lang.Object) (-1.0f));
        boolean boolean66 = stackAr62.equals((java.lang.Object) "");
        boolean boolean67 = stackAr54.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr69 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean70 = stackAr69.isEmpty();
        boolean boolean71 = stackAr69.isEmpty();
        stackAr54.push((java.lang.Object) stackAr69);
        stackAr54.push((java.lang.Object) 1.0f);
        boolean boolean75 = stackAr46.equals((java.lang.Object) stackAr54);
        boolean boolean76 = stackAr46.isEmpty();
        stackAr42.push((java.lang.Object) stackAr46);
        stackAr37.push((java.lang.Object) stackAr46);
        java.lang.String str79 = stackAr37.toString();
        stackAr25.push((java.lang.Object) str79);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "[[]]" + "'", str79, "[[]]");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1152");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        int int7 = stackAr5.size();
        boolean boolean8 = stackAr5.isEmpty();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean11 = stackAr10.isFull();
        java.lang.Class<?> wildcardClass12 = stackAr10.getClass();
        stackAr5.push((java.lang.Object) wildcardClass12);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean16 = stackAr15.isEmpty();
        boolean boolean17 = stackAr15.isEmpty();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass19 = stackAr18.getClass();
        boolean boolean20 = stackAr15.equals((java.lang.Object) stackAr18);
        java.lang.Class<?> wildcardClass21 = stackAr18.getClass();
        stackAr5.push((java.lang.Object) wildcardClass21);
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj24 = stackAr5.top();
        java.lang.String str25 = stackAr5.toString();
        boolean boolean26 = stackAr5.isFull();
        java.lang.String str27 = stackAr5.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[class org.autotest.StackAr,class org.autotest.StackAr]" + "'", str25, "[class org.autotest.StackAr,class org.autotest.StackAr]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[class org.autotest.StackAr,class org.autotest.StackAr]" + "'", str27, "[class org.autotest.StackAr,class org.autotest.StackAr]");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1153");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        int int5 = stackAr0.size();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        int int10 = stackAr6.size();
        boolean boolean11 = stackAr0.equals((java.lang.Object) int10);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) 'a');
        stackAr13.push((java.lang.Object) 'a');
        java.lang.Object obj16 = stackAr13.top();
        boolean boolean17 = stackAr13.isEmpty();
        java.lang.String str18 = stackAr13.toString();
        boolean boolean19 = stackAr13.isFull();
        java.lang.Class<?> wildcardClass20 = stackAr13.getClass();
        stackAr0.push((java.lang.Object) wildcardClass20);
        java.lang.Object obj22 = null;
        stackAr0.push(obj22);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[a]" + "'", str18, "[a]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1154");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.String str6 = stackAr1.toString();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        int int9 = stackAr8.size();
        int int10 = stackAr8.size();
        boolean boolean11 = stackAr8.isFull();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
        boolean boolean13 = stackAr12.isFull();
        boolean boolean15 = stackAr12.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '4');
        boolean boolean18 = stackAr12.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) 'a');
        boolean boolean22 = stackAr20.equals((java.lang.Object) (-1.0f));
        boolean boolean24 = stackAr20.equals((java.lang.Object) "");
        boolean boolean25 = stackAr12.equals((java.lang.Object) "");
        boolean boolean26 = stackAr12.isFull();
        stackAr8.push((java.lang.Object) stackAr12);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr();
        int int29 = stackAr28.size();
        int int30 = stackAr28.size();
        stackAr12.push((java.lang.Object) int30);
        boolean boolean32 = stackAr12.isFull();
        stackAr1.push((java.lang.Object) stackAr12);
        java.lang.String str34 = stackAr1.toString();
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr();
        boolean boolean36 = stackAr35.isFull();
        boolean boolean38 = stackAr35.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr40 = new org.autotest.StackAr((int) '4');
        boolean boolean41 = stackAr35.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) 'a');
        boolean boolean45 = stackAr43.equals((java.lang.Object) (-1.0f));
        boolean boolean47 = stackAr43.equals((java.lang.Object) "");
        boolean boolean48 = stackAr35.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr50 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean51 = stackAr50.isEmpty();
        boolean boolean52 = stackAr50.isEmpty();
        stackAr35.push((java.lang.Object) stackAr50);
        boolean boolean54 = stackAr50.isFull();
        org.autotest.StackAr stackAr56 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean57 = stackAr56.isEmpty();
        boolean boolean58 = stackAr56.isFull();
        org.autotest.StackAr stackAr59 = new org.autotest.StackAr();
        boolean boolean60 = stackAr59.isFull();
        org.autotest.StackAr stackAr62 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean63 = stackAr62.isEmpty();
        boolean boolean64 = stackAr62.isFull();
        boolean boolean65 = stackAr59.equals((java.lang.Object) boolean64);
        boolean boolean66 = stackAr56.equals((java.lang.Object) stackAr59);
        java.lang.String str67 = stackAr59.toString();
        boolean boolean68 = stackAr50.equals((java.lang.Object) stackAr59);
        boolean boolean69 = stackAr1.equals((java.lang.Object) stackAr50);
        java.lang.Class<?> wildcardClass70 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0]" + "'", str6, "[0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[0,[0]]" + "'", str34, "[0,[0]]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "[]" + "'", str67, "[]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1155");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((java.lang.Object) "");
        boolean boolean13 = stackAr0.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean16 = stackAr15.isEmpty();
        boolean boolean17 = stackAr15.isEmpty();
        stackAr0.push((java.lang.Object) stackAr15);
        boolean boolean19 = stackAr0.isFull();
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) 'a');
        boolean boolean23 = stackAr21.equals((java.lang.Object) (-1.0f));
        java.lang.String str24 = stackAr21.toString();
        int int25 = stackAr21.size();
        stackAr0.push((java.lang.Object) int25);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) ' ');
        boolean boolean29 = stackAr0.equals((java.lang.Object) ' ');
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr();
        boolean boolean31 = stackAr30.isFull();
        int int32 = stackAr30.size();
        boolean boolean33 = stackAr30.isEmpty();
        boolean boolean34 = stackAr30.isFull();
        boolean boolean35 = stackAr30.isFull();
        boolean boolean37 = stackAr30.equals((java.lang.Object) "[0.0,true]");
        stackAr0.push((java.lang.Object) stackAr30);
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr40 = new org.autotest.StackAr();
        boolean boolean41 = stackAr40.isFull();
        int int42 = stackAr40.size();
        boolean boolean43 = stackAr40.isEmpty();
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean46 = stackAr45.isFull();
        java.lang.Class<?> wildcardClass47 = stackAr45.getClass();
        stackAr40.push((java.lang.Object) wildcardClass47);
        boolean boolean49 = stackAr39.equals((java.lang.Object) stackAr40);
        org.autotest.StackAr stackAr51 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean52 = stackAr51.isEmpty();
        boolean boolean53 = stackAr51.isEmpty();
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass55 = stackAr54.getClass();
        boolean boolean56 = stackAr51.equals((java.lang.Object) stackAr54);
        java.lang.Class<?> wildcardClass57 = stackAr54.getClass();
        stackAr39.push((java.lang.Object) wildcardClass57);
        org.autotest.StackAr stackAr59 = new org.autotest.StackAr();
        boolean boolean60 = stackAr59.isFull();
        int int61 = stackAr59.size();
        boolean boolean62 = stackAr59.isFull();
        stackAr59.push((java.lang.Object) 10L);
        stackAr59.push((java.lang.Object) ' ');
        boolean boolean67 = stackAr39.equals((java.lang.Object) stackAr59);
        org.autotest.StackAr stackAr68 = new org.autotest.StackAr();
        boolean boolean69 = stackAr68.isFull();
        org.autotest.StackAr stackAr71 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean72 = stackAr71.isEmpty();
        boolean boolean73 = stackAr71.isFull();
        boolean boolean74 = stackAr68.equals((java.lang.Object) boolean73);
        boolean boolean75 = stackAr68.isFull();
        stackAr39.push((java.lang.Object) boolean75);
        boolean boolean77 = stackAr30.equals((java.lang.Object) boolean75);
        org.autotest.StackAr stackAr79 = new org.autotest.StackAr((int) 'a');
        boolean boolean81 = stackAr79.equals((java.lang.Object) (-1.0f));
        boolean boolean83 = stackAr79.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr84 = new org.autotest.StackAr();
        boolean boolean85 = stackAr84.isFull();
        stackAr79.push((java.lang.Object) stackAr84);
        java.lang.String str87 = stackAr84.toString();
        java.lang.Class<?> wildcardClass88 = stackAr84.getClass();
        stackAr30.push((java.lang.Object) stackAr84);
        boolean boolean90 = stackAr84.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "[]" + "'", str87, "[]");
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1156");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((java.lang.Object) "");
        boolean boolean13 = stackAr0.equals((java.lang.Object) "");
        boolean boolean14 = stackAr0.isFull();
        boolean boolean16 = stackAr0.equals((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass17 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1157");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr6);
        java.lang.String str9 = stackAr6.toString();
        boolean boolean10 = stackAr6.isEmpty();
        java.lang.String str11 = stackAr6.toString();
        boolean boolean12 = stackAr6.isFull();
        boolean boolean13 = stackAr6.isFull();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1158");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        int int5 = stackAr1.size();
        java.lang.String str6 = stackAr1.toString();
        java.lang.String str7 = stackAr1.toString();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        int int10 = stackAr8.size();
        boolean boolean11 = stackAr8.isEmpty();
        boolean boolean12 = stackAr8.isFull();
        boolean boolean13 = stackAr8.isFull();
        boolean boolean14 = stackAr8.isFull();
        boolean boolean15 = stackAr8.isFull();
        boolean boolean16 = stackAr8.isEmpty();
        java.lang.String str17 = stackAr8.toString();
        boolean boolean18 = stackAr8.isFull();
        stackAr1.push((java.lang.Object) stackAr8);
        boolean boolean20 = stackAr8.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1159");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((java.lang.Object) "");
        boolean boolean13 = stackAr0.equals((java.lang.Object) "");
        java.lang.String str14 = stackAr0.toString();
        java.lang.String str15 = stackAr0.toString();
        int int16 = stackAr0.size();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
        boolean boolean18 = stackAr17.isFull();
        int int19 = stackAr17.size();
        boolean boolean20 = stackAr17.isEmpty();
        boolean boolean21 = stackAr17.isFull();
        boolean boolean22 = stackAr17.isFull();
        boolean boolean23 = stackAr0.equals((java.lang.Object) stackAr17);
        java.lang.Class<?> wildcardClass24 = stackAr17.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1160");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((java.lang.Object) "");
        boolean boolean13 = stackAr0.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean16 = stackAr15.isEmpty();
        boolean boolean17 = stackAr15.isEmpty();
        stackAr0.push((java.lang.Object) stackAr15);
        boolean boolean19 = stackAr15.isFull();
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
        boolean boolean21 = stackAr20.isFull();
        boolean boolean23 = stackAr20.equals((java.lang.Object) (byte) -1);
        java.lang.String str24 = stackAr20.toString();
        int int25 = stackAr20.size();
        boolean boolean26 = stackAr15.equals((java.lang.Object) stackAr20);
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr();
        boolean boolean28 = stackAr27.isFull();
        boolean boolean30 = stackAr27.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) '4');
        boolean boolean33 = stackAr27.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int) 'a');
        boolean boolean37 = stackAr35.equals((java.lang.Object) (-1.0f));
        boolean boolean39 = stackAr35.equals((java.lang.Object) "");
        boolean boolean40 = stackAr27.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean43 = stackAr42.isEmpty();
        boolean boolean44 = stackAr42.isEmpty();
        stackAr27.push((java.lang.Object) stackAr42);
        boolean boolean46 = stackAr42.isFull();
        org.autotest.StackAr stackAr47 = new org.autotest.StackAr();
        boolean boolean48 = stackAr47.isFull();
        boolean boolean50 = stackAr47.equals((java.lang.Object) (byte) -1);
        java.lang.String str51 = stackAr47.toString();
        int int52 = stackAr47.size();
        boolean boolean53 = stackAr42.equals((java.lang.Object) stackAr47);
        stackAr20.push((java.lang.Object) stackAr47);
        boolean boolean55 = stackAr47.isFull();
        boolean boolean56 = stackAr47.isFull();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[]" + "'", str51, "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1161");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        int int4 = stackAr0.size();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        int int7 = stackAr6.size();
        java.lang.Class<?> wildcardClass8 = stackAr6.getClass();
        boolean boolean9 = stackAr0.equals((java.lang.Object) stackAr6);
        java.lang.Class<?> wildcardClass10 = stackAr6.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1162");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
        boolean boolean4 = stackAr3.isFull();
        boolean boolean6 = stackAr3.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        boolean boolean9 = stackAr3.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) 'a');
        boolean boolean13 = stackAr11.equals((java.lang.Object) (-1.0f));
        boolean boolean15 = stackAr11.equals((java.lang.Object) "");
        boolean boolean16 = stackAr3.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean19 = stackAr18.isEmpty();
        boolean boolean20 = stackAr18.isEmpty();
        stackAr3.push((java.lang.Object) stackAr18);
        boolean boolean22 = stackAr18.isFull();
        stackAr1.push((java.lang.Object) stackAr18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = stackAr18.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1163");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr();
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean7 = stackAr6.isFull();
        java.lang.Class<?> wildcardClass8 = stackAr6.getClass();
        stackAr1.push((java.lang.Object) wildcardClass8);
        boolean boolean10 = stackAr0.equals((java.lang.Object) stackAr1);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean13 = stackAr12.isEmpty();
        boolean boolean14 = stackAr12.isEmpty();
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass16 = stackAr15.getClass();
        boolean boolean17 = stackAr12.equals((java.lang.Object) stackAr15);
        java.lang.Class<?> wildcardClass18 = stackAr15.getClass();
        stackAr0.push((java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = stackAr0.top();
        boolean boolean21 = stackAr0.isEmpty();
        java.lang.Object obj22 = stackAr0.top();
        java.lang.Object obj23 = stackAr0.top();
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean26 = stackAr25.isEmpty();
        int int27 = stackAr25.size();
        java.lang.String str28 = stackAr25.toString();
        boolean boolean29 = stackAr25.isEmpty();
        int int30 = stackAr25.size();
        boolean boolean31 = stackAr25.isEmpty();
        boolean boolean32 = stackAr25.isFull();
        int int33 = stackAr25.size();
        boolean boolean34 = stackAr0.equals((java.lang.Object) stackAr25);
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) '4');
        int int37 = stackAr36.size();
        int int38 = stackAr36.size();
        boolean boolean39 = stackAr36.isFull();
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) ' ');
        stackAr36.push((java.lang.Object) ' ');
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr();
        boolean boolean44 = stackAr43.isFull();
        int int45 = stackAr43.size();
        boolean boolean46 = stackAr43.isEmpty();
        boolean boolean47 = stackAr43.isFull();
        boolean boolean48 = stackAr43.isFull();
        boolean boolean49 = stackAr43.isFull();
        boolean boolean50 = stackAr36.equals((java.lang.Object) boolean49);
        java.lang.String str51 = stackAr36.toString();
        java.lang.Object obj52 = null;
        boolean boolean53 = stackAr36.equals(obj52);
        // The following exception was thrown during execution in test generation
        try {
            stackAr25.push(obj52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class org.autotest.StackAr");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "class org.autotest.StackAr");
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "class org.autotest.StackAr");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "[ ]" + "'", str51, "[ ]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1164");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) 'a');
        boolean boolean12 = stackAr10.equals((java.lang.Object) (-1.0f));
        boolean boolean14 = stackAr10.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        boolean boolean16 = stackAr15.isFull();
        stackAr10.push((java.lang.Object) stackAr15);
        boolean boolean18 = stackAr6.equals((java.lang.Object) stackAr10);
        java.lang.Object obj19 = stackAr10.top();
        java.lang.Object obj20 = stackAr10.top();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "[]");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "[]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1165");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.String str6 = stackAr1.toString();
        java.lang.String str7 = stackAr1.toString();
        java.lang.String str8 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackAr1.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1166");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean2 = stackAr1.isFull();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean5 = stackAr4.isFull();
        boolean boolean6 = stackAr1.equals((java.lang.Object) stackAr4);
        boolean boolean7 = stackAr1.isFull();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        stackAr9.push((java.lang.Object) (-1L));
        boolean boolean12 = stackAr9.isEmpty();
        java.lang.String str13 = stackAr9.toString();
        boolean boolean14 = stackAr1.equals((java.lang.Object) stackAr9);
        boolean boolean15 = stackAr9.isEmpty();
        java.lang.Object obj16 = stackAr9.top();
        java.lang.Object obj17 = null;
        stackAr9.push(obj17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[-1]" + "'", str13, "[-1]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1L) + "'", obj16, (-1L));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1167");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        java.lang.String str7 = stackAr0.toString();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        stackAr9.push((java.lang.Object) (-1L));
        boolean boolean12 = stackAr9.isEmpty();
        boolean boolean13 = stackAr0.equals((java.lang.Object) stackAr9);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) '4');
        int int16 = stackAr15.size();
        boolean boolean17 = stackAr15.isEmpty();
        stackAr15.push((java.lang.Object) (byte) 0);
        java.lang.Object obj20 = new java.lang.Object();
        boolean boolean21 = stackAr15.equals(obj20);
        boolean boolean22 = stackAr15.isEmpty();
        boolean boolean23 = stackAr15.isEmpty();
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '4');
        int int26 = stackAr25.size();
        boolean boolean27 = stackAr25.isEmpty();
        stackAr25.push((java.lang.Object) (byte) 0);
        java.lang.Object obj30 = new java.lang.Object();
        boolean boolean31 = stackAr25.equals(obj30);
        boolean boolean32 = stackAr25.isEmpty();
        boolean boolean33 = stackAr25.isEmpty();
        java.lang.String str34 = stackAr25.toString();
        stackAr15.push((java.lang.Object) str34);
        java.lang.String str36 = stackAr15.toString();
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) '4');
        int int39 = stackAr38.size();
        java.lang.String str40 = stackAr38.toString();
        int int41 = stackAr38.size();
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr();
        boolean boolean43 = stackAr42.isFull();
        boolean boolean45 = stackAr42.equals((java.lang.Object) (byte) -1);
        boolean boolean46 = stackAr38.equals((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = null;
        stackAr38.push(obj47);
        int int49 = stackAr38.size();
        stackAr15.push((java.lang.Object) int49);
        boolean boolean51 = stackAr9.equals((java.lang.Object) int49);
        int int52 = stackAr9.size();
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr((int) '4');
        int int55 = stackAr54.size();
        int int56 = stackAr54.size();
        boolean boolean57 = stackAr54.isFull();
        int int58 = stackAr54.size();
        org.autotest.StackAr stackAr60 = new org.autotest.StackAr((int) '4');
        int int61 = stackAr60.size();
        int int62 = stackAr60.size();
        boolean boolean63 = stackAr60.isFull();
        org.autotest.StackAr stackAr64 = new org.autotest.StackAr();
        boolean boolean65 = stackAr64.isFull();
        boolean boolean67 = stackAr64.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr69 = new org.autotest.StackAr((int) '4');
        boolean boolean70 = stackAr64.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr72 = new org.autotest.StackAr((int) 'a');
        boolean boolean74 = stackAr72.equals((java.lang.Object) (-1.0f));
        boolean boolean76 = stackAr72.equals((java.lang.Object) "");
        boolean boolean77 = stackAr64.equals((java.lang.Object) "");
        boolean boolean78 = stackAr64.isFull();
        stackAr60.push((java.lang.Object) stackAr64);
        org.autotest.StackAr stackAr81 = new org.autotest.StackAr(0);
        boolean boolean82 = stackAr60.equals((java.lang.Object) stackAr81);
        stackAr54.push((java.lang.Object) stackAr81);
        stackAr9.push((java.lang.Object) stackAr81);
        java.lang.Object obj85 = null;
        boolean boolean86 = stackAr9.equals(obj85);
        int int87 = stackAr9.size();
        boolean boolean88 = stackAr9.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[0]" + "'", str34, "[0]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[0,[0]]" + "'", str36, "[0,[0]]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2 + "'", int87 == 2);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1168");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        java.lang.String str7 = stackAr0.toString();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        stackAr9.push((java.lang.Object) (-1L));
        boolean boolean12 = stackAr9.isEmpty();
        boolean boolean13 = stackAr0.equals((java.lang.Object) stackAr9);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) '4');
        int int16 = stackAr15.size();
        boolean boolean17 = stackAr15.isEmpty();
        stackAr15.push((java.lang.Object) (byte) 0);
        java.lang.Object obj20 = new java.lang.Object();
        boolean boolean21 = stackAr15.equals(obj20);
        boolean boolean22 = stackAr15.isEmpty();
        boolean boolean23 = stackAr15.isEmpty();
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '4');
        int int26 = stackAr25.size();
        boolean boolean27 = stackAr25.isEmpty();
        stackAr25.push((java.lang.Object) (byte) 0);
        java.lang.Object obj30 = new java.lang.Object();
        boolean boolean31 = stackAr25.equals(obj30);
        boolean boolean32 = stackAr25.isEmpty();
        boolean boolean33 = stackAr25.isEmpty();
        java.lang.String str34 = stackAr25.toString();
        stackAr15.push((java.lang.Object) str34);
        java.lang.String str36 = stackAr15.toString();
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) '4');
        int int39 = stackAr38.size();
        java.lang.String str40 = stackAr38.toString();
        int int41 = stackAr38.size();
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr();
        boolean boolean43 = stackAr42.isFull();
        boolean boolean45 = stackAr42.equals((java.lang.Object) (byte) -1);
        boolean boolean46 = stackAr38.equals((java.lang.Object) (byte) -1);
        java.lang.Object obj47 = null;
        stackAr38.push(obj47);
        int int49 = stackAr38.size();
        stackAr15.push((java.lang.Object) int49);
        boolean boolean51 = stackAr9.equals((java.lang.Object) int49);
        org.autotest.StackAr stackAr52 = new org.autotest.StackAr();
        boolean boolean53 = stackAr52.isFull();
        boolean boolean55 = stackAr52.equals((java.lang.Object) (byte) -1);
        int int56 = stackAr52.size();
        org.autotest.StackAr stackAr58 = new org.autotest.StackAr((int) '4');
        int int59 = stackAr58.size();
        java.lang.Class<?> wildcardClass60 = stackAr58.getClass();
        boolean boolean61 = stackAr52.equals((java.lang.Object) stackAr58);
        java.lang.String str62 = stackAr52.toString();
        org.autotest.StackAr stackAr64 = new org.autotest.StackAr((int) 'a');
        java.lang.String str65 = stackAr64.toString();
        stackAr64.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr69 = new org.autotest.StackAr((int) '4');
        java.lang.String str70 = stackAr69.toString();
        boolean boolean71 = stackAr64.equals((java.lang.Object) stackAr69);
        java.lang.String str72 = stackAr69.toString();
        boolean boolean73 = stackAr69.isEmpty();
        boolean boolean74 = stackAr52.equals((java.lang.Object) boolean73);
        stackAr9.push((java.lang.Object) stackAr52);
        java.lang.String str76 = stackAr52.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[0]" + "'", str34, "[0]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[0,[0]]" + "'", str36, "[0,[0]]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "[]" + "'", str62, "[]");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[]" + "'", str65, "[]");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "[]" + "'", str70, "[]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "[]" + "'", str72, "[]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "[]" + "'", str76, "[]");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1169");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        stackAr1.push((java.lang.Object) stackAr6);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) 'a');
        java.lang.String str11 = stackAr10.toString();
        stackAr10.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) '4');
        java.lang.String str16 = stackAr15.toString();
        boolean boolean17 = stackAr10.equals((java.lang.Object) stackAr15);
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) 'a');
        boolean boolean21 = stackAr19.equals((java.lang.Object) (-1.0f));
        boolean boolean23 = stackAr19.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
        boolean boolean25 = stackAr24.isFull();
        stackAr19.push((java.lang.Object) stackAr24);
        boolean boolean27 = stackAr15.equals((java.lang.Object) stackAr19);
        boolean boolean28 = stackAr6.equals((java.lang.Object) stackAr15);
        int int29 = stackAr6.size();
        boolean boolean30 = stackAr6.isEmpty();
        int int31 = stackAr6.size();
        boolean boolean32 = stackAr6.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj33 = stackAr6.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1170");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr();
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean7 = stackAr6.isFull();
        java.lang.Class<?> wildcardClass8 = stackAr6.getClass();
        stackAr1.push((java.lang.Object) wildcardClass8);
        boolean boolean10 = stackAr0.equals((java.lang.Object) stackAr1);
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean13 = stackAr12.isEmpty();
        boolean boolean14 = stackAr12.isEmpty();
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass16 = stackAr15.getClass();
        boolean boolean17 = stackAr12.equals((java.lang.Object) stackAr15);
        java.lang.Class<?> wildcardClass18 = stackAr15.getClass();
        stackAr0.push((java.lang.Object) wildcardClass18);
        boolean boolean20 = stackAr0.isEmpty();
        java.lang.Class<?> wildcardClass21 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1171");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(1);
        boolean boolean2 = stackAr1.isFull();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) 'a');
        java.lang.String str5 = stackAr4.toString();
        stackAr4.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        java.lang.String str10 = stackAr9.toString();
        boolean boolean11 = stackAr4.equals((java.lang.Object) stackAr9);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) 'a');
        boolean boolean15 = stackAr13.equals((java.lang.Object) (-1.0f));
        boolean boolean17 = stackAr13.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr();
        boolean boolean19 = stackAr18.isFull();
        stackAr13.push((java.lang.Object) stackAr18);
        boolean boolean21 = stackAr9.equals((java.lang.Object) stackAr13);
        java.lang.Object obj22 = stackAr13.top();
        boolean boolean23 = stackAr13.isEmpty();
        java.lang.Object obj24 = stackAr13.top();
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) '4');
        int int27 = stackAr26.size();
        java.lang.String str28 = stackAr26.toString();
        int int29 = stackAr26.size();
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr();
        boolean boolean31 = stackAr30.isFull();
        boolean boolean33 = stackAr30.equals((java.lang.Object) (byte) -1);
        boolean boolean34 = stackAr26.equals((java.lang.Object) (byte) -1);
        java.lang.String str35 = stackAr26.toString();
        int int36 = stackAr26.size();
        stackAr13.push((java.lang.Object) stackAr26);
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr();
        boolean boolean39 = stackAr38.isFull();
        boolean boolean41 = stackAr38.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) '4');
        boolean boolean44 = stackAr38.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr((int) 'a');
        boolean boolean48 = stackAr46.equals((java.lang.Object) (-1.0f));
        boolean boolean50 = stackAr46.equals((java.lang.Object) "");
        boolean boolean51 = stackAr38.equals((java.lang.Object) "");
        boolean boolean52 = stackAr38.isEmpty();
        java.lang.String str53 = stackAr38.toString();
        boolean boolean54 = stackAr38.isFull();
        stackAr26.push((java.lang.Object) boolean54);
        stackAr1.push((java.lang.Object) boolean54);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[]" + "'", str53, "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1172");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) (short) 1);
        stackAr1.push((java.lang.Object) (short) 1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        int int7 = stackAr5.size();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) (short) 0);
        stackAr5.push((java.lang.Object) (short) 0);
        java.lang.String str11 = stackAr5.toString();
        boolean boolean12 = stackAr1.equals((java.lang.Object) stackAr5);
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) 'a');
        java.lang.String str15 = stackAr14.toString();
        stackAr14.push((java.lang.Object) 0.0f);
        boolean boolean18 = stackAr14.isFull();
        java.lang.Object obj19 = stackAr14.top();
        boolean boolean20 = stackAr14.isFull();
        java.lang.String str21 = stackAr14.toString();
        boolean boolean22 = stackAr1.equals((java.lang.Object) stackAr14);
        boolean boolean23 = stackAr14.isEmpty();
        java.lang.Object obj24 = stackAr14.top();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[0]" + "'", str11, "[0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 0.0f + "'", obj19, 0.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[0.0]" + "'", str21, "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 0.0f + "'", obj24, 0.0f);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1173");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass6 = stackAr1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1174");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((java.lang.Object) "");
        boolean boolean13 = stackAr0.equals((java.lang.Object) "");
        stackAr0.push((java.lang.Object) (byte) 0);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) 'a');
        java.lang.String str18 = stackAr17.toString();
        stackAr17.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) 'a');
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) 'a');
        boolean boolean26 = stackAr24.equals((java.lang.Object) (-1.0f));
        boolean boolean28 = stackAr24.equals((java.lang.Object) "");
        stackAr24.push((java.lang.Object) (-1.0d));
        stackAr22.push((java.lang.Object) (-1.0d));
        boolean boolean32 = stackAr17.equals((java.lang.Object) (-1.0d));
        stackAr0.push((java.lang.Object) (-1.0d));
        java.lang.String str34 = stackAr0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[0,-1.0]" + "'", str34, "[0,-1.0]");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1175");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
        boolean boolean4 = stackAr3.isFull();
        boolean boolean6 = stackAr3.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) '4');
        boolean boolean9 = stackAr3.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) 'a');
        boolean boolean13 = stackAr11.equals((java.lang.Object) (-1.0f));
        boolean boolean15 = stackAr11.equals((java.lang.Object) "");
        boolean boolean16 = stackAr3.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean19 = stackAr18.isEmpty();
        boolean boolean20 = stackAr18.isEmpty();
        stackAr3.push((java.lang.Object) stackAr18);
        boolean boolean22 = stackAr18.isFull();
        stackAr1.push((java.lang.Object) stackAr18);
        java.lang.Object obj24 = stackAr1.top();
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr();
        boolean boolean26 = stackAr25.isFull();
        boolean boolean27 = stackAr1.equals((java.lang.Object) stackAr25);
        java.lang.Class<?> wildcardClass28 = stackAr25.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1176");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr6);
        stackAr6.push((java.lang.Object) 1.0f);
        java.lang.Object obj11 = stackAr6.top();
        java.lang.Object obj12 = stackAr6.top();
        int int13 = stackAr6.size();
        java.lang.Class<?> wildcardClass14 = stackAr6.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 1.0f + "'", obj11, 1.0f);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 1.0f + "'", obj12, 1.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1177");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean6 = stackAr5.isFull();
        java.lang.Class<?> wildcardClass7 = stackAr5.getClass();
        stackAr0.push((java.lang.Object) wildcardClass7);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean11 = stackAr10.isEmpty();
        java.lang.Class<?> wildcardClass12 = stackAr10.getClass();
        boolean boolean13 = stackAr0.equals((java.lang.Object) wildcardClass12);
        boolean boolean14 = stackAr0.isFull();
        boolean boolean15 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr(0);
        java.lang.Class<?> wildcardClass18 = stackAr17.getClass();
        boolean boolean19 = stackAr0.equals((java.lang.Object) wildcardClass18);
        java.lang.Object obj20 = stackAr0.top();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '4');
        int int23 = stackAr22.size();
        java.lang.String str24 = stackAr22.toString();
        java.lang.String str25 = stackAr22.toString();
        boolean boolean26 = stackAr22.isFull();
        stackAr0.push((java.lang.Object) boolean26);
        java.lang.Object obj28 = stackAr0.top();
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) 'a');
        java.lang.String str31 = stackAr30.toString();
        stackAr30.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int) '4');
        java.lang.String str36 = stackAr35.toString();
        boolean boolean37 = stackAr30.equals((java.lang.Object) stackAr35);
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) 'a');
        boolean boolean41 = stackAr39.equals((java.lang.Object) (-1.0f));
        boolean boolean43 = stackAr39.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr();
        boolean boolean45 = stackAr44.isFull();
        stackAr39.push((java.lang.Object) stackAr44);
        boolean boolean47 = stackAr35.equals((java.lang.Object) stackAr39);
        java.lang.Object obj48 = stackAr39.top();
        java.lang.String str49 = stackAr39.toString();
        boolean boolean50 = stackAr0.equals((java.lang.Object) stackAr39);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "class org.autotest.StackAr");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[]" + "'", str25, "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + false + "'", obj28, false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "[]" + "'", str31, "[]");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "[]" + "'", str36, "[]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(obj48);
        org.junit.Assert.assertEquals(obj48.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj48), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj48), "[]");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[[]]" + "'", str49, "[[]]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1178");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isFull();
        int int3 = stackAr1.size();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) 'a');
        java.lang.String str6 = stackAr5.toString();
        stackAr5.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        java.lang.String str11 = stackAr10.toString();
        boolean boolean12 = stackAr5.equals((java.lang.Object) stackAr10);
        stackAr10.push((java.lang.Object) 1.0f);
        boolean boolean15 = stackAr1.equals((java.lang.Object) stackAr10);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) 'a');
        java.lang.String str18 = stackAr17.toString();
        stackAr17.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) '4');
        java.lang.String str23 = stackAr22.toString();
        boolean boolean24 = stackAr17.equals((java.lang.Object) stackAr22);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) 'a');
        boolean boolean28 = stackAr26.equals((java.lang.Object) (-1.0f));
        boolean boolean30 = stackAr26.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
        boolean boolean32 = stackAr31.isFull();
        stackAr26.push((java.lang.Object) stackAr31);
        boolean boolean34 = stackAr22.equals((java.lang.Object) stackAr26);
        boolean boolean35 = stackAr10.equals((java.lang.Object) stackAr22);
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr((int) '4');
        int int38 = stackAr37.size();
        boolean boolean39 = stackAr37.isEmpty();
        stackAr37.push((java.lang.Object) (byte) 0);
        java.lang.String str42 = stackAr37.toString();
        boolean boolean43 = stackAr37.isEmpty();
        java.lang.Object obj44 = null;
        stackAr37.push(obj44);
        stackAr10.push((java.lang.Object) stackAr37);
        java.lang.Class<?> wildcardClass47 = stackAr37.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[]" + "'", str23, "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "[0]" + "'", str42, "[0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1179");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) 'a');
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        int int7 = stackAr5.size();
        boolean boolean8 = stackAr5.isEmpty();
        stackAr4.push((java.lang.Object) stackAr5);
        boolean boolean10 = stackAr1.equals((java.lang.Object) stackAr5);
        int int11 = stackAr5.size();
        boolean boolean12 = stackAr5.isEmpty();
        java.lang.Class<?> wildcardClass13 = stackAr5.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1180");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.String str6 = stackAr1.toString();
        int int7 = stackAr1.size();
        boolean boolean8 = stackAr1.isFull();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        boolean boolean10 = stackAr9.isFull();
        int int11 = stackAr9.size();
        boolean boolean12 = stackAr9.isFull();
        stackAr9.push((java.lang.Object) 10L);
        stackAr9.push((java.lang.Object) ' ');
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr();
        java.lang.String str18 = stackAr17.toString();
        stackAr9.push((java.lang.Object) str18);
        java.lang.Object obj20 = stackAr9.top();
        boolean boolean21 = stackAr9.isFull();
        java.lang.String str22 = stackAr9.toString();
        boolean boolean23 = stackAr9.isEmpty();
        boolean boolean24 = stackAr1.equals((java.lang.Object) stackAr9);
        java.lang.Object obj25 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[0]" + "'", str6, "[0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "[]" + "'", obj20, "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[10, ,[]]" + "'", str22, "[10, ,[]]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + (byte) 0 + "'", obj25, (byte) 0);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1181");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean4 = stackAr3.isEmpty();
        boolean boolean5 = stackAr3.isFull();
        boolean boolean6 = stackAr0.equals((java.lang.Object) boolean5);
        boolean boolean7 = stackAr0.isFull();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        boolean boolean11 = stackAr8.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        boolean boolean14 = stackAr8.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (-1.0f));
        boolean boolean20 = stackAr16.equals((java.lang.Object) "");
        boolean boolean21 = stackAr8.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean24 = stackAr23.isEmpty();
        boolean boolean25 = stackAr23.isEmpty();
        stackAr8.push((java.lang.Object) stackAr23);
        stackAr8.push((java.lang.Object) 1.0f);
        boolean boolean29 = stackAr0.equals((java.lang.Object) stackAr8);
        boolean boolean30 = stackAr0.isEmpty();
        boolean boolean31 = stackAr0.isFull();
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr();
        boolean boolean33 = stackAr32.isFull();
        int int34 = stackAr32.size();
        boolean boolean35 = stackAr32.isEmpty();
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean38 = stackAr37.isFull();
        java.lang.Class<?> wildcardClass39 = stackAr37.getClass();
        stackAr32.push((java.lang.Object) wildcardClass39);
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr();
        int int42 = stackAr41.size();
        java.lang.String str43 = stackAr41.toString();
        stackAr32.push((java.lang.Object) stackAr41);
        java.lang.Object obj45 = stackAr32.top();
        boolean boolean46 = stackAr0.equals(obj45);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "[]" + "'", str43, "[]");
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertEquals(obj45.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj45), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj45), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1182");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) (short) 10);
        java.lang.Object obj5 = stackAr1.top();
        boolean boolean6 = stackAr1.isEmpty();
        int int7 = stackAr1.size();
        java.lang.Class<?> wildcardClass8 = stackAr1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (short) 10 + "'", obj5, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1183");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean4 = stackAr3.isEmpty();
        boolean boolean5 = stackAr3.isFull();
        boolean boolean6 = stackAr0.equals((java.lang.Object) boolean5);
        boolean boolean7 = stackAr0.isFull();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        boolean boolean11 = stackAr8.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        boolean boolean14 = stackAr8.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (-1.0f));
        boolean boolean20 = stackAr16.equals((java.lang.Object) "");
        boolean boolean21 = stackAr8.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean24 = stackAr23.isEmpty();
        boolean boolean25 = stackAr23.isEmpty();
        stackAr8.push((java.lang.Object) stackAr23);
        stackAr8.push((java.lang.Object) 1.0f);
        boolean boolean29 = stackAr0.equals((java.lang.Object) stackAr8);
        boolean boolean30 = stackAr0.isFull();
        int int31 = stackAr0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1184");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        int int4 = stackAr1.size();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        int int7 = stackAr5.size();
        boolean boolean8 = stackAr5.isEmpty();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean11 = stackAr10.isFull();
        java.lang.Class<?> wildcardClass12 = stackAr10.getClass();
        stackAr5.push((java.lang.Object) wildcardClass12);
        boolean boolean14 = stackAr1.equals((java.lang.Object) stackAr5);
        boolean boolean15 = stackAr1.isFull();
        java.lang.String str16 = stackAr1.toString();
        java.lang.Object obj17 = null;
        stackAr1.push(obj17);
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) '4');
        int int21 = stackAr20.size();
        boolean boolean22 = stackAr20.isEmpty();
        stackAr20.push((java.lang.Object) (byte) 0);
        int int25 = stackAr20.size();
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) ' ');
        boolean boolean28 = stackAr27.isEmpty();
        boolean boolean29 = stackAr27.isEmpty();
        stackAr20.push((java.lang.Object) stackAr27);
        stackAr1.push((java.lang.Object) stackAr20);
        boolean boolean32 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1185");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean4 = stackAr3.isEmpty();
        boolean boolean5 = stackAr3.isFull();
        boolean boolean6 = stackAr0.equals((java.lang.Object) boolean5);
        boolean boolean7 = stackAr0.isFull();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        boolean boolean11 = stackAr8.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        boolean boolean14 = stackAr8.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (-1.0f));
        boolean boolean20 = stackAr16.equals((java.lang.Object) "");
        boolean boolean21 = stackAr8.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean24 = stackAr23.isEmpty();
        boolean boolean25 = stackAr23.isEmpty();
        stackAr8.push((java.lang.Object) stackAr23);
        stackAr8.push((java.lang.Object) 1.0f);
        boolean boolean29 = stackAr0.equals((java.lang.Object) stackAr8);
        boolean boolean30 = stackAr0.isEmpty();
        boolean boolean31 = stackAr0.isEmpty();
        java.lang.String str32 = stackAr0.toString();
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
        boolean boolean34 = stackAr33.isFull();
        int int35 = stackAr33.size();
        boolean boolean36 = stackAr33.isEmpty();
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean39 = stackAr38.isFull();
        java.lang.Class<?> wildcardClass40 = stackAr38.getClass();
        stackAr33.push((java.lang.Object) wildcardClass40);
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean44 = stackAr43.isEmpty();
        java.lang.Class<?> wildcardClass45 = stackAr43.getClass();
        boolean boolean46 = stackAr33.equals((java.lang.Object) wildcardClass45);
        boolean boolean47 = stackAr33.isFull();
        boolean boolean48 = stackAr33.isEmpty();
        org.autotest.StackAr stackAr50 = new org.autotest.StackAr(0);
        java.lang.Class<?> wildcardClass51 = stackAr50.getClass();
        boolean boolean52 = stackAr33.equals((java.lang.Object) wildcardClass51);
        boolean boolean53 = stackAr0.equals((java.lang.Object) stackAr33);
        org.autotest.StackAr stackAr55 = new org.autotest.StackAr((int) 'a');
        java.lang.String str56 = stackAr55.toString();
        stackAr55.push((java.lang.Object) 0.0f);
        boolean boolean60 = stackAr55.equals((java.lang.Object) (byte) -1);
        boolean boolean61 = stackAr55.isEmpty();
        boolean boolean62 = stackAr33.equals((java.lang.Object) stackAr55);
        java.lang.Class<?> wildcardClass63 = stackAr55.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[]" + "'", str56, "[]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1186");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((java.lang.Object) "");
        boolean boolean13 = stackAr0.equals((java.lang.Object) "");
        stackAr0.push((java.lang.Object) (byte) 0);
        int int16 = stackAr0.size();
        org.autotest.StackAr stackAr18 = new org.autotest.StackAr((int) '4');
        int int19 = stackAr18.size();
        int int20 = stackAr18.size();
        boolean boolean21 = stackAr18.isFull();
        stackAr0.push((java.lang.Object) stackAr18);
        java.lang.Object obj23 = stackAr0.top();
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '4');
        int int26 = stackAr25.size();
        java.lang.String str27 = stackAr25.toString();
        int int28 = stackAr25.size();
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr();
        boolean boolean30 = stackAr29.isFull();
        boolean boolean32 = stackAr29.equals((java.lang.Object) (byte) -1);
        boolean boolean33 = stackAr25.equals((java.lang.Object) (byte) -1);
        java.lang.Object obj34 = null;
        stackAr25.push(obj34);
        int int36 = stackAr25.size();
        java.lang.Class<?> wildcardClass37 = stackAr25.getClass();
        boolean boolean38 = stackAr0.equals((java.lang.Object) wildcardClass37);
        java.lang.Object obj39 = stackAr0.top();
        java.lang.String str40 = stackAr0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "[]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "[]" + "'", str27, "[]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertEquals(obj39.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj39), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj39), "[]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[0,[]]" + "'", str40, "[0,[]]");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1187");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
        boolean boolean4 = stackAr3.isFull();
        boolean boolean6 = stackAr3.equals((java.lang.Object) (byte) -1);
        java.lang.String str7 = stackAr3.toString();
        boolean boolean9 = stackAr3.equals((java.lang.Object) 10L);
        java.lang.String str10 = stackAr3.toString();
        java.lang.Class<?> wildcardClass11 = stackAr3.getClass();
        boolean boolean12 = stackAr0.equals((java.lang.Object) wildcardClass11);
        boolean boolean14 = stackAr0.equals((java.lang.Object) "[0.0,true]");
        boolean boolean15 = stackAr0.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1188");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        stackAr1.push((java.lang.Object) (-1.0d));
        java.lang.Object obj8 = stackAr1.top();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) 'a');
        boolean boolean12 = stackAr10.equals((java.lang.Object) (-1.0f));
        int int13 = stackAr10.size();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr();
        boolean boolean15 = stackAr14.isFull();
        int int16 = stackAr14.size();
        boolean boolean17 = stackAr14.isEmpty();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean20 = stackAr19.isFull();
        java.lang.Class<?> wildcardClass21 = stackAr19.getClass();
        stackAr14.push((java.lang.Object) wildcardClass21);
        boolean boolean23 = stackAr10.equals((java.lang.Object) stackAr14);
        stackAr1.push((java.lang.Object) stackAr14);
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr((int) 'a');
        boolean boolean28 = stackAr26.equals((java.lang.Object) (-1.0f));
        boolean boolean30 = stackAr26.equals((java.lang.Object) "");
        stackAr26.push((java.lang.Object) (-1.0d));
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
        boolean boolean34 = stackAr33.isFull();
        boolean boolean36 = stackAr33.equals((java.lang.Object) (byte) -1);
        java.lang.String str37 = stackAr33.toString();
        boolean boolean39 = stackAr33.equals((java.lang.Object) 10L);
        java.lang.String str40 = stackAr33.toString();
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) '4');
        stackAr42.push((java.lang.Object) (-1L));
        boolean boolean45 = stackAr42.isEmpty();
        boolean boolean46 = stackAr33.equals((java.lang.Object) stackAr42);
        boolean boolean47 = stackAr26.equals((java.lang.Object) stackAr33);
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) (byte) 10);
        boolean boolean50 = stackAr49.isEmpty();
        stackAr33.push((java.lang.Object) stackAr49);
        boolean boolean52 = stackAr1.equals((java.lang.Object) stackAr33);
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr((int) '4');
        int int55 = stackAr54.size();
        boolean boolean56 = stackAr54.isEmpty();
        stackAr54.push((java.lang.Object) (byte) 0);
        java.lang.Object obj59 = new java.lang.Object();
        boolean boolean60 = stackAr54.equals(obj59);
        boolean boolean61 = stackAr54.isEmpty();
        boolean boolean62 = stackAr54.isEmpty();
        org.autotest.StackAr stackAr64 = new org.autotest.StackAr((int) '4');
        int int65 = stackAr64.size();
        boolean boolean66 = stackAr64.isEmpty();
        stackAr64.push((java.lang.Object) (byte) 0);
        java.lang.Object obj69 = new java.lang.Object();
        boolean boolean70 = stackAr64.equals(obj69);
        boolean boolean71 = stackAr64.isEmpty();
        boolean boolean72 = stackAr64.isEmpty();
        java.lang.String str73 = stackAr64.toString();
        stackAr54.push((java.lang.Object) str73);
        java.lang.String str75 = stackAr54.toString();
        org.autotest.StackAr stackAr77 = new org.autotest.StackAr((int) '4');
        int int78 = stackAr77.size();
        java.lang.String str79 = stackAr77.toString();
        int int80 = stackAr77.size();
        org.autotest.StackAr stackAr81 = new org.autotest.StackAr();
        boolean boolean82 = stackAr81.isFull();
        boolean boolean84 = stackAr81.equals((java.lang.Object) (byte) -1);
        boolean boolean85 = stackAr77.equals((java.lang.Object) (byte) -1);
        java.lang.Object obj86 = null;
        stackAr77.push(obj86);
        int int88 = stackAr77.size();
        stackAr54.push((java.lang.Object) int88);
        java.lang.Object obj90 = stackAr54.top();
        boolean boolean91 = stackAr33.equals((java.lang.Object) stackAr54);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1.0d) + "'", obj8, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "[]" + "'", str40, "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "[0]" + "'", str73, "[0]");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "[0,[0]]" + "'", str75, "[0,[0]]");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "[]" + "'", str79, "[]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertEquals("'" + obj90 + "' != '" + 1 + "'", obj90, 1);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1189");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean6 = stackAr5.isFull();
        java.lang.Class<?> wildcardClass7 = stackAr5.getClass();
        stackAr0.push((java.lang.Object) wildcardClass7);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean11 = stackAr10.isEmpty();
        java.lang.Class<?> wildcardClass12 = stackAr10.getClass();
        boolean boolean13 = stackAr0.equals((java.lang.Object) wildcardClass12);
        boolean boolean14 = stackAr0.isFull();
        boolean boolean15 = stackAr0.isEmpty();
        java.lang.Object obj16 = stackAr0.top();
        java.lang.Object obj17 = stackAr0.top();
        java.lang.Class<?> wildcardClass18 = obj17.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "class org.autotest.StackAr");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "class org.autotest.StackAr");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1190");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
        boolean boolean5 = stackAr4.isFull();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean8 = stackAr7.isEmpty();
        boolean boolean9 = stackAr7.isFull();
        boolean boolean10 = stackAr4.equals((java.lang.Object) boolean9);
        boolean boolean11 = stackAr1.equals((java.lang.Object) stackAr4);
        java.lang.String str12 = stackAr4.toString();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) (short) 1);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr16.equals((java.lang.Object) (-1.0f));
        boolean boolean19 = stackAr16.isFull();
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
        boolean boolean21 = stackAr20.isFull();
        int int22 = stackAr20.size();
        boolean boolean23 = stackAr20.isEmpty();
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean26 = stackAr25.isFull();
        java.lang.Class<?> wildcardClass27 = stackAr25.getClass();
        stackAr20.push((java.lang.Object) wildcardClass27);
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean31 = stackAr30.isEmpty();
        boolean boolean32 = stackAr30.isEmpty();
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass34 = stackAr33.getClass();
        boolean boolean35 = stackAr30.equals((java.lang.Object) stackAr33);
        java.lang.Class<?> wildcardClass36 = stackAr33.getClass();
        stackAr20.push((java.lang.Object) wildcardClass36);
        stackAr16.push((java.lang.Object) stackAr20);
        stackAr14.push((java.lang.Object) stackAr20);
        boolean boolean40 = stackAr20.isFull();
        java.lang.Object obj41 = stackAr20.top();
        stackAr4.push(obj41);
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr((int) '4');
        int int45 = stackAr44.size();
        int int46 = stackAr44.size();
        boolean boolean47 = stackAr44.isFull();
        java.lang.String str48 = stackAr44.toString();
        org.autotest.StackAr stackAr50 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean51 = stackAr50.isEmpty();
        boolean boolean52 = stackAr50.isFull();
        org.autotest.StackAr stackAr53 = new org.autotest.StackAr();
        boolean boolean54 = stackAr53.isFull();
        org.autotest.StackAr stackAr56 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean57 = stackAr56.isEmpty();
        boolean boolean58 = stackAr56.isFull();
        boolean boolean59 = stackAr53.equals((java.lang.Object) boolean58);
        boolean boolean60 = stackAr50.equals((java.lang.Object) stackAr53);
        stackAr44.push((java.lang.Object) stackAr50);
        stackAr4.push((java.lang.Object) stackAr50);
        org.autotest.StackAr stackAr64 = new org.autotest.StackAr((int) '4');
        java.lang.String str65 = stackAr64.toString();
        java.lang.String str66 = stackAr64.toString();
        int int67 = stackAr64.size();
        org.autotest.StackAr stackAr68 = new org.autotest.StackAr();
        java.lang.String str69 = stackAr68.toString();
        boolean boolean70 = stackAr68.isEmpty();
        boolean boolean71 = stackAr64.equals((java.lang.Object) stackAr68);
        org.autotest.StackAr stackAr72 = new org.autotest.StackAr();
        boolean boolean73 = stackAr72.isFull();
        int int74 = stackAr72.size();
        boolean boolean75 = stackAr72.isEmpty();
        org.autotest.StackAr stackAr77 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean78 = stackAr77.isFull();
        java.lang.Class<?> wildcardClass79 = stackAr77.getClass();
        stackAr72.push((java.lang.Object) wildcardClass79);
        org.autotest.StackAr stackAr81 = new org.autotest.StackAr();
        int int82 = stackAr81.size();
        java.lang.String str83 = stackAr81.toString();
        stackAr72.push((java.lang.Object) stackAr81);
        java.lang.Object obj85 = stackAr72.top();
        java.lang.Object obj86 = stackAr72.top();
        stackAr64.push(obj86);
        org.autotest.StackAr stackAr89 = new org.autotest.StackAr((int) 'a');
        stackAr89.push((java.lang.Object) 'a');
        java.lang.Object obj92 = stackAr89.top();
        boolean boolean93 = stackAr89.isEmpty();
        int int94 = stackAr89.size();
        java.lang.Object obj95 = stackAr89.top();
        boolean boolean96 = stackAr64.equals((java.lang.Object) stackAr89);
        boolean boolean97 = stackAr50.equals((java.lang.Object) stackAr89);
        java.lang.Object obj98 = stackAr89.top();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "class org.autotest.StackAr");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "class org.autotest.StackAr");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[]" + "'", str65, "[]");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "[]" + "'", str66, "[]");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "[]" + "'", str69, "[]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "[]" + "'", str83, "[]");
        org.junit.Assert.assertNotNull(obj85);
        org.junit.Assert.assertEquals(obj85.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj85), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj85), "[]");
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertEquals(obj86.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj86), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj86), "[]");
        org.junit.Assert.assertEquals("'" + obj92 + "' != '" + 'a' + "'", obj92, 'a');
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
        org.junit.Assert.assertEquals("'" + obj95 + "' != '" + 'a' + "'", obj95, 'a');
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertEquals("'" + obj98 + "' != '" + 'a' + "'", obj98, 'a');
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1191");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) '4');
        boolean boolean6 = stackAr0.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) 'a');
        boolean boolean10 = stackAr8.equals((java.lang.Object) (-1.0f));
        boolean boolean12 = stackAr8.equals((java.lang.Object) "");
        boolean boolean13 = stackAr0.equals((java.lang.Object) "");
        java.lang.String str14 = stackAr0.toString();
        boolean boolean15 = stackAr0.isEmpty();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) 'a');
        boolean boolean18 = stackAr17.isFull();
        boolean boolean19 = stackAr17.isFull();
        int int20 = stackAr17.size();
        boolean boolean21 = stackAr17.isFull();
        stackAr0.push((java.lang.Object) boolean21);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1192");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) ' ');
        org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr();
        boolean boolean4 = stackAr3.isFull();
        int int5 = stackAr3.size();
        boolean boolean6 = stackAr3.isEmpty();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean9 = stackAr8.isFull();
        java.lang.Class<?> wildcardClass10 = stackAr8.getClass();
        stackAr3.push((java.lang.Object) wildcardClass10);
        boolean boolean12 = stackAr2.equals((java.lang.Object) stackAr3);
        java.lang.Class<?> wildcardClass13 = stackAr2.getClass();
        stackAr1.push((java.lang.Object) stackAr2);
        boolean boolean15 = stackAr1.isEmpty();
        java.lang.Object obj16 = stackAr1.top();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertEquals(obj16.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "[]");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1193");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) 'a');
        boolean boolean5 = stackAr3.equals((java.lang.Object) (-1.0f));
        boolean boolean6 = stackAr3.isFull();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr();
        boolean boolean8 = stackAr7.isFull();
        int int9 = stackAr7.size();
        boolean boolean10 = stackAr7.isEmpty();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean13 = stackAr12.isFull();
        java.lang.Class<?> wildcardClass14 = stackAr12.getClass();
        stackAr7.push((java.lang.Object) wildcardClass14);
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean18 = stackAr17.isEmpty();
        boolean boolean19 = stackAr17.isEmpty();
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass21 = stackAr20.getClass();
        boolean boolean22 = stackAr17.equals((java.lang.Object) stackAr20);
        java.lang.Class<?> wildcardClass23 = stackAr20.getClass();
        stackAr7.push((java.lang.Object) wildcardClass23);
        stackAr3.push((java.lang.Object) stackAr7);
        stackAr1.push((java.lang.Object) stackAr7);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) 'a');
        boolean boolean29 = stackAr28.isFull();
        java.lang.Class<?> wildcardClass30 = stackAr28.getClass();
        boolean boolean31 = stackAr1.equals((java.lang.Object) wildcardClass30);
        java.lang.Object obj32 = stackAr1.top();
        java.lang.Object obj33 = stackAr1.top();
        boolean boolean34 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr();
        boolean boolean37 = stackAr36.isFull();
        int int38 = stackAr36.size();
        boolean boolean39 = stackAr36.isEmpty();
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean42 = stackAr41.isFull();
        java.lang.Class<?> wildcardClass43 = stackAr41.getClass();
        stackAr36.push((java.lang.Object) wildcardClass43);
        boolean boolean45 = stackAr35.equals((java.lang.Object) stackAr36);
        java.lang.String str46 = stackAr35.toString();
        java.lang.String str47 = stackAr35.toString();
        java.lang.String str48 = stackAr35.toString();
        boolean boolean49 = stackAr1.equals((java.lang.Object) stackAr35);
        boolean boolean50 = stackAr35.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "[class org.autotest.StackAr,class org.autotest.StackAr]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "[class org.autotest.StackAr,class org.autotest.StackAr]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "[class org.autotest.StackAr,class org.autotest.StackAr]");
        org.junit.Assert.assertNotNull(obj33);
        org.junit.Assert.assertEquals(obj33.toString(), "[class org.autotest.StackAr,class org.autotest.StackAr]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj33), "[class org.autotest.StackAr,class org.autotest.StackAr]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj33), "[class org.autotest.StackAr,class org.autotest.StackAr]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "[]" + "'", str46, "[]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[]" + "'", str47, "[]");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "[]" + "'", str48, "[]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1194");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
        java.lang.Class<?> wildcardClass5 = stackAr4.getClass();
        boolean boolean6 = stackAr1.equals((java.lang.Object) stackAr4);
        boolean boolean7 = stackAr1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1195");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) (short) 1);
        stackAr7.push((java.lang.Object) (short) 1);
        int int11 = stackAr7.size();
        int int12 = stackAr7.size();
        stackAr1.push((java.lang.Object) stackAr7);
        java.lang.Object obj14 = stackAr7.top();
        java.lang.Object obj15 = stackAr7.top();
        java.lang.Class<?> wildcardClass16 = obj15.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (short) 1 + "'", obj14, (short) 1);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + (short) 1 + "'", obj15, (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1196");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        int int4 = stackAr1.size();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        int int7 = stackAr5.size();
        boolean boolean8 = stackAr5.isEmpty();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean11 = stackAr10.isFull();
        java.lang.Class<?> wildcardClass12 = stackAr10.getClass();
        stackAr5.push((java.lang.Object) wildcardClass12);
        boolean boolean14 = stackAr1.equals((java.lang.Object) stackAr5);
        boolean boolean15 = stackAr1.isFull();
        java.lang.String str16 = stackAr1.toString();
        java.lang.Object obj17 = null;
        stackAr1.push(obj17);
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) '4');
        int int21 = stackAr20.size();
        boolean boolean22 = stackAr20.isEmpty();
        stackAr20.push((java.lang.Object) (byte) 0);
        int int25 = stackAr20.size();
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) ' ');
        boolean boolean28 = stackAr27.isEmpty();
        boolean boolean29 = stackAr27.isEmpty();
        stackAr20.push((java.lang.Object) stackAr27);
        stackAr1.push((java.lang.Object) stackAr20);
        java.lang.Class<?> wildcardClass32 = stackAr20.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1197");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        int int1 = stackAr0.size();
        int int2 = stackAr0.size();
        boolean boolean3 = stackAr0.isFull();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
        boolean boolean5 = stackAr4.isFull();
        boolean boolean7 = stackAr4.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) '4');
        boolean boolean10 = stackAr4.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) 'a');
        boolean boolean14 = stackAr12.equals((java.lang.Object) (-1.0f));
        boolean boolean16 = stackAr12.equals((java.lang.Object) "");
        boolean boolean17 = stackAr4.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean20 = stackAr19.isEmpty();
        boolean boolean21 = stackAr19.isEmpty();
        stackAr4.push((java.lang.Object) stackAr19);
        java.lang.Object obj23 = stackAr4.top();
        int int24 = stackAr4.size();
        java.lang.String str25 = stackAr4.toString();
        boolean boolean26 = stackAr4.isEmpty();
        stackAr0.push((java.lang.Object) boolean26);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr();
        boolean boolean29 = stackAr28.isFull();
        int int30 = stackAr28.size();
        boolean boolean31 = stackAr28.isEmpty();
        boolean boolean32 = stackAr28.isFull();
        boolean boolean33 = stackAr28.isFull();
        boolean boolean34 = stackAr28.isFull();
        boolean boolean35 = stackAr28.isFull();
        boolean boolean36 = stackAr28.isEmpty();
        int int37 = stackAr28.size();
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) (byte) 0);
        boolean boolean40 = stackAr28.equals((java.lang.Object) stackAr39);
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) 'a');
        boolean boolean44 = stackAr42.equals((java.lang.Object) (-1.0f));
        boolean boolean46 = stackAr42.equals((java.lang.Object) "");
        stackAr42.push((java.lang.Object) (-1.0d));
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr();
        boolean boolean50 = stackAr49.isFull();
        boolean boolean52 = stackAr49.equals((java.lang.Object) (byte) -1);
        java.lang.String str53 = stackAr49.toString();
        boolean boolean55 = stackAr49.equals((java.lang.Object) 10L);
        java.lang.String str56 = stackAr49.toString();
        org.autotest.StackAr stackAr58 = new org.autotest.StackAr((int) '4');
        stackAr58.push((java.lang.Object) (-1L));
        boolean boolean61 = stackAr58.isEmpty();
        boolean boolean62 = stackAr49.equals((java.lang.Object) stackAr58);
        boolean boolean63 = stackAr42.equals((java.lang.Object) stackAr49);
        org.autotest.StackAr stackAr65 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean66 = stackAr65.isEmpty();
        int int67 = stackAr65.size();
        java.lang.String str68 = stackAr65.toString();
        boolean boolean69 = stackAr65.isEmpty();
        org.autotest.StackAr stackAr71 = new org.autotest.StackAr((int) 'a');
        java.lang.String str72 = stackAr71.toString();
        stackAr71.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr76 = new org.autotest.StackAr((int) '4');
        java.lang.String str77 = stackAr76.toString();
        boolean boolean78 = stackAr71.equals((java.lang.Object) stackAr76);
        org.autotest.StackAr stackAr80 = new org.autotest.StackAr((int) '4');
        int int81 = stackAr80.size();
        java.lang.Class<?> wildcardClass82 = stackAr80.getClass();
        stackAr76.push((java.lang.Object) stackAr80);
        int int84 = stackAr76.size();
        boolean boolean85 = stackAr65.equals((java.lang.Object) stackAr76);
        int int86 = stackAr65.size();
        stackAr49.push((java.lang.Object) stackAr65);
        boolean boolean88 = stackAr39.equals((java.lang.Object) stackAr49);
        stackAr0.push((java.lang.Object) stackAr39);
        java.lang.Class<?> wildcardClass90 = stackAr39.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertEquals(obj23.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "[]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "[[]]" + "'", str25, "[[]]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "[]" + "'", str53, "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "[]" + "'", str56, "[]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[]" + "'", str68, "[]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "[]" + "'", str72, "[]");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "[]" + "'", str77, "[]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(wildcardClass82);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1198");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        stackAr1.push((java.lang.Object) (byte) 0);
        java.lang.Object obj6 = new java.lang.Object();
        boolean boolean7 = stackAr1.equals(obj6);
        java.lang.String str8 = stackAr1.toString();
        java.lang.Object obj9 = stackAr1.top();
        java.lang.Object obj10 = stackAr1.top();
        int int11 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[0]" + "'", str8, "[0]");
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + (byte) 0 + "'", obj9, (byte) 0);
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + (byte) 0 + "'", obj10, (byte) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1199");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        java.lang.String str1 = stackAr0.toString();
        int int2 = stackAr0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test1200");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
        boolean boolean5 = stackAr4.isFull();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean8 = stackAr7.isEmpty();
        boolean boolean9 = stackAr7.isFull();
        boolean boolean10 = stackAr4.equals((java.lang.Object) boolean9);
        boolean boolean11 = stackAr1.equals((java.lang.Object) stackAr4);
        java.lang.Class<?> wildcardClass12 = stackAr4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
}

