package org.autotest;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0601");
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
        boolean boolean34 = stackAr12.isEmpty();
        boolean boolean35 = stackAr12.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0602");
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
        java.lang.Class<?> wildcardClass12 = stackAr0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0603");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        java.lang.String str5 = stackAr1.toString();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        boolean boolean12 = stackAr6.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) 'a');
        boolean boolean16 = stackAr14.equals((java.lang.Object) (-1.0f));
        boolean boolean18 = stackAr14.equals((java.lang.Object) "");
        boolean boolean19 = stackAr6.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean22 = stackAr21.isEmpty();
        boolean boolean23 = stackAr21.isEmpty();
        stackAr6.push((java.lang.Object) stackAr21);
        boolean boolean25 = stackAr21.isFull();
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
        boolean boolean27 = stackAr26.isFull();
        boolean boolean29 = stackAr26.equals((java.lang.Object) (byte) -1);
        java.lang.String str30 = stackAr26.toString();
        int int31 = stackAr26.size();
        boolean boolean32 = stackAr21.equals((java.lang.Object) stackAr26);
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
        boolean boolean34 = stackAr33.isFull();
        boolean boolean36 = stackAr33.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) '4');
        boolean boolean39 = stackAr33.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) 'a');
        boolean boolean43 = stackAr41.equals((java.lang.Object) (-1.0f));
        boolean boolean45 = stackAr41.equals((java.lang.Object) "");
        boolean boolean46 = stackAr33.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean49 = stackAr48.isEmpty();
        boolean boolean50 = stackAr48.isEmpty();
        stackAr33.push((java.lang.Object) stackAr48);
        boolean boolean52 = stackAr48.isFull();
        org.autotest.StackAr stackAr53 = new org.autotest.StackAr();
        boolean boolean54 = stackAr53.isFull();
        boolean boolean56 = stackAr53.equals((java.lang.Object) (byte) -1);
        java.lang.String str57 = stackAr53.toString();
        int int58 = stackAr53.size();
        boolean boolean59 = stackAr48.equals((java.lang.Object) stackAr53);
        stackAr26.push((java.lang.Object) stackAr53);
        stackAr1.push((java.lang.Object) stackAr26);
        org.autotest.StackAr stackAr63 = new org.autotest.StackAr((int) '4');
        int int64 = stackAr63.size();
        boolean boolean65 = stackAr63.isEmpty();
        stackAr63.push((java.lang.Object) (byte) 0);
        java.lang.String str68 = stackAr63.toString();
        org.autotest.StackAr stackAr70 = new org.autotest.StackAr((int) '4');
        int int71 = stackAr70.size();
        int int72 = stackAr70.size();
        boolean boolean73 = stackAr70.isFull();
        org.autotest.StackAr stackAr74 = new org.autotest.StackAr();
        boolean boolean75 = stackAr74.isFull();
        boolean boolean77 = stackAr74.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr79 = new org.autotest.StackAr((int) '4');
        boolean boolean80 = stackAr74.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr82 = new org.autotest.StackAr((int) 'a');
        boolean boolean84 = stackAr82.equals((java.lang.Object) (-1.0f));
        boolean boolean86 = stackAr82.equals((java.lang.Object) "");
        boolean boolean87 = stackAr74.equals((java.lang.Object) "");
        boolean boolean88 = stackAr74.isFull();
        stackAr70.push((java.lang.Object) stackAr74);
        org.autotest.StackAr stackAr90 = new org.autotest.StackAr();
        int int91 = stackAr90.size();
        int int92 = stackAr90.size();
        stackAr74.push((java.lang.Object) int92);
        boolean boolean94 = stackAr74.isFull();
        stackAr63.push((java.lang.Object) stackAr74);
        boolean boolean96 = stackAr26.equals((java.lang.Object) stackAr74);
        java.lang.Class<?> wildcardClass97 = stackAr26.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[]" + "'", str57, "[]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "[0]" + "'", str68, "[0]");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0604");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        stackAr1.push((java.lang.Object) 'a');
        boolean boolean4 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0605");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        boolean boolean3 = stackAr1.isEmpty();
        int int4 = stackAr1.size();
        java.lang.String str5 = stackAr1.toString();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr();
        boolean boolean7 = stackAr6.isFull();
        boolean boolean9 = stackAr6.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        boolean boolean12 = stackAr6.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) 'a');
        boolean boolean16 = stackAr14.equals((java.lang.Object) (-1.0f));
        boolean boolean18 = stackAr14.equals((java.lang.Object) "");
        boolean boolean19 = stackAr6.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean22 = stackAr21.isEmpty();
        boolean boolean23 = stackAr21.isEmpty();
        stackAr6.push((java.lang.Object) stackAr21);
        boolean boolean25 = stackAr21.isFull();
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr();
        boolean boolean27 = stackAr26.isFull();
        boolean boolean29 = stackAr26.equals((java.lang.Object) (byte) -1);
        java.lang.String str30 = stackAr26.toString();
        int int31 = stackAr26.size();
        boolean boolean32 = stackAr21.equals((java.lang.Object) stackAr26);
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
        boolean boolean34 = stackAr33.isFull();
        boolean boolean36 = stackAr33.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr38 = new org.autotest.StackAr((int) '4');
        boolean boolean39 = stackAr33.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) 'a');
        boolean boolean43 = stackAr41.equals((java.lang.Object) (-1.0f));
        boolean boolean45 = stackAr41.equals((java.lang.Object) "");
        boolean boolean46 = stackAr33.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr48 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean49 = stackAr48.isEmpty();
        boolean boolean50 = stackAr48.isEmpty();
        stackAr33.push((java.lang.Object) stackAr48);
        boolean boolean52 = stackAr48.isFull();
        org.autotest.StackAr stackAr53 = new org.autotest.StackAr();
        boolean boolean54 = stackAr53.isFull();
        boolean boolean56 = stackAr53.equals((java.lang.Object) (byte) -1);
        java.lang.String str57 = stackAr53.toString();
        int int58 = stackAr53.size();
        boolean boolean59 = stackAr48.equals((java.lang.Object) stackAr53);
        stackAr26.push((java.lang.Object) stackAr53);
        stackAr1.push((java.lang.Object) stackAr26);
        org.autotest.StackAr stackAr63 = new org.autotest.StackAr((int) '4');
        int int64 = stackAr63.size();
        java.lang.String str65 = stackAr63.toString();
        int int66 = stackAr63.size();
        org.autotest.StackAr stackAr67 = new org.autotest.StackAr();
        boolean boolean68 = stackAr67.isFull();
        boolean boolean70 = stackAr67.equals((java.lang.Object) (byte) -1);
        boolean boolean71 = stackAr63.equals((java.lang.Object) (byte) -1);
        java.lang.String str72 = stackAr63.toString();
        boolean boolean73 = stackAr63.isFull();
        stackAr26.push((java.lang.Object) stackAr63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[]" + "'", str57, "[]");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "[]" + "'", str65, "[]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "[]" + "'", str72, "[]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0606");
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
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) '4');
        int int29 = stackAr28.size();
        java.lang.String str30 = stackAr28.toString();
        int int31 = stackAr28.size();
        boolean boolean32 = stackAr28.isEmpty();
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean35 = stackAr34.isFull();
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean38 = stackAr37.isFull();
        boolean boolean39 = stackAr34.equals((java.lang.Object) stackAr37);
        java.lang.Class<?> wildcardClass40 = stackAr37.getClass();
        boolean boolean41 = stackAr28.equals((java.lang.Object) wildcardClass40);
        boolean boolean42 = stackAr0.equals((java.lang.Object) wildcardClass40);
        java.lang.Object obj43 = stackAr0.top();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 0 + "'", obj43, 0);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0607");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean7 = stackAr6.isFull();
        boolean boolean8 = stackAr6.isEmpty();
        stackAr1.push((java.lang.Object) boolean8);
        org.autotest.StackAr stackAr11 = new org.autotest.StackAr((int) '4');
        int int12 = stackAr11.size();
        java.lang.String str13 = stackAr11.toString();
        int int14 = stackAr11.size();
        boolean boolean15 = stackAr11.isEmpty();
        java.lang.String str16 = stackAr11.toString();
        boolean boolean17 = stackAr11.isFull();
        boolean boolean18 = stackAr1.equals((java.lang.Object) boolean17);
        java.lang.Object obj19 = stackAr1.top();
        java.lang.Object obj20 = stackAr1.top();
        boolean boolean21 = stackAr1.isFull();
        java.lang.Object obj22 = stackAr1.top();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + true + "'", obj19, true);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + true + "'", obj20, true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + true + "'", obj22, true);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0608");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        java.lang.String str1 = stackAr0.toString();
        java.lang.String str2 = stackAr0.toString();
        int int3 = stackAr0.size();
        int int4 = stackAr0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = stackAr0.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0609");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (byte) 10);
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
        java.lang.Class<?> wildcardClass26 = stackAr3.getClass();
        boolean boolean27 = stackAr1.equals((java.lang.Object) stackAr3);
        int int28 = stackAr1.size();
        int int29 = stackAr1.size();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0610");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        java.lang.String str1 = stackAr0.toString();
        boolean boolean2 = stackAr0.isEmpty();
        int int3 = stackAr0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr0.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0611");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr6);
        boolean boolean9 = stackAr1.isFull();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0612");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
        boolean boolean3 = stackAr2.isFull();
        boolean boolean5 = stackAr2.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) '4');
        boolean boolean8 = stackAr2.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) 'a');
        boolean boolean12 = stackAr10.equals((java.lang.Object) (-1.0f));
        boolean boolean14 = stackAr10.equals((java.lang.Object) "");
        boolean boolean15 = stackAr2.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean18 = stackAr17.isEmpty();
        boolean boolean19 = stackAr17.isEmpty();
        stackAr2.push((java.lang.Object) stackAr17);
        boolean boolean21 = stackAr17.isFull();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr();
        boolean boolean23 = stackAr22.isFull();
        boolean boolean25 = stackAr22.equals((java.lang.Object) (byte) -1);
        java.lang.String str26 = stackAr22.toString();
        int int27 = stackAr22.size();
        boolean boolean28 = stackAr17.equals((java.lang.Object) stackAr22);
        org.autotest.StackAr stackAr30 = new org.autotest.StackAr((int) 'a');
        boolean boolean32 = stackAr30.equals((java.lang.Object) (-1.0f));
        int int33 = stackAr30.size();
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr();
        boolean boolean35 = stackAr34.isFull();
        int int36 = stackAr34.size();
        boolean boolean37 = stackAr34.isEmpty();
        org.autotest.StackAr stackAr39 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean40 = stackAr39.isFull();
        java.lang.Class<?> wildcardClass41 = stackAr39.getClass();
        stackAr34.push((java.lang.Object) wildcardClass41);
        boolean boolean43 = stackAr30.equals((java.lang.Object) stackAr34);
        boolean boolean44 = stackAr22.equals((java.lang.Object) stackAr34);
        java.lang.Object obj45 = null;
        stackAr34.push(obj45);
        java.lang.Object obj47 = stackAr34.top();
        stackAr1.push(obj47);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[]" + "'", str26, "[]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0613");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 100);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) 'a');
        java.lang.String str6 = stackAr5.toString();
        stackAr5.push((java.lang.Object) (short) 10);
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj10 = stackAr1.top();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "[10]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "[10]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "[10]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0614");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean8 = stackAr7.isFull();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean11 = stackAr10.isFull();
        boolean boolean12 = stackAr7.equals((java.lang.Object) stackAr10);
        java.lang.Class<?> wildcardClass13 = stackAr10.getClass();
        boolean boolean14 = stackAr1.equals((java.lang.Object) wildcardClass13);
        boolean boolean15 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '4');
        int int18 = stackAr17.size();
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr((int) 'a');
        stackAr20.push((java.lang.Object) 'a');
        java.lang.Object obj23 = stackAr20.top();
        boolean boolean24 = stackAr20.isEmpty();
        java.lang.Object obj25 = stackAr20.top();
        stackAr17.push(obj25);
        stackAr1.push((java.lang.Object) stackAr17);
        boolean boolean28 = stackAr1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 'a' + "'", obj23, 'a');
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 'a' + "'", obj25, 'a');
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0615");
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
        org.autotest.StackAr stackAr31 = new org.autotest.StackAr();
        boolean boolean32 = stackAr31.isFull();
        stackAr26.push((java.lang.Object) stackAr31);
        java.lang.String str34 = stackAr31.toString();
        java.lang.Class<?> wildcardClass35 = stackAr31.getClass();
        stackAr14.push((java.lang.Object) stackAr31);
        boolean boolean38 = stackAr31.equals((java.lang.Object) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0616");
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
        java.lang.String str35 = stackAr25.toString();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "[]" + "'", str35, "[]");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0617");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        boolean boolean8 = stackAr5.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        boolean boolean11 = stackAr5.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) 'a');
        boolean boolean15 = stackAr13.equals((java.lang.Object) (-1.0f));
        boolean boolean17 = stackAr13.equals((java.lang.Object) "");
        boolean boolean18 = stackAr5.equals((java.lang.Object) "");
        boolean boolean19 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) stackAr5);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr(0);
        boolean boolean23 = stackAr1.equals((java.lang.Object) stackAr22);
        org.autotest.StackAr stackAr25 = new org.autotest.StackAr((int) '4');
        int int26 = stackAr25.size();
        boolean boolean27 = stackAr25.isEmpty();
        stackAr25.push((java.lang.Object) (byte) 0);
        java.lang.Object obj30 = new java.lang.Object();
        boolean boolean31 = stackAr25.equals(obj30);
        java.lang.String str32 = stackAr25.toString();
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr();
        boolean boolean34 = stackAr33.isFull();
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean37 = stackAr36.isEmpty();
        boolean boolean38 = stackAr36.isFull();
        boolean boolean39 = stackAr33.equals((java.lang.Object) boolean38);
        boolean boolean40 = stackAr33.isFull();
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr();
        boolean boolean42 = stackAr41.isFull();
        boolean boolean44 = stackAr41.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr46 = new org.autotest.StackAr((int) '4');
        boolean boolean47 = stackAr41.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) 'a');
        boolean boolean51 = stackAr49.equals((java.lang.Object) (-1.0f));
        boolean boolean53 = stackAr49.equals((java.lang.Object) "");
        boolean boolean54 = stackAr41.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr56 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean57 = stackAr56.isEmpty();
        boolean boolean58 = stackAr56.isEmpty();
        stackAr41.push((java.lang.Object) stackAr56);
        stackAr41.push((java.lang.Object) 1.0f);
        boolean boolean62 = stackAr33.equals((java.lang.Object) stackAr41);
        stackAr25.push((java.lang.Object) stackAr41);
        boolean boolean64 = stackAr1.equals((java.lang.Object) stackAr25);
        boolean boolean65 = stackAr25.isFull();
        org.autotest.StackAr stackAr67 = new org.autotest.StackAr((int) '4');
        org.autotest.StackAr stackAr69 = new org.autotest.StackAr((int) (short) 1);
        stackAr67.push((java.lang.Object) (short) 1);
        org.autotest.StackAr stackAr72 = new org.autotest.StackAr((int) '4');
        stackAr72.push((java.lang.Object) (-1L));
        stackAr67.push((java.lang.Object) (-1L));
        boolean boolean76 = stackAr25.equals((java.lang.Object) (-1L));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[0]" + "'", str32, "[0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0618");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        boolean boolean8 = stackAr5.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        boolean boolean11 = stackAr5.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) 'a');
        boolean boolean15 = stackAr13.equals((java.lang.Object) (-1.0f));
        boolean boolean17 = stackAr13.equals((java.lang.Object) "");
        boolean boolean18 = stackAr5.equals((java.lang.Object) "");
        boolean boolean19 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.String str21 = stackAr5.toString();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr((int) '4');
        java.lang.String str24 = stackAr23.toString();
        boolean boolean25 = stackAr23.isEmpty();
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) 'a');
        java.lang.String str28 = stackAr27.toString();
        stackAr27.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr((int) '4');
        java.lang.String str33 = stackAr32.toString();
        boolean boolean34 = stackAr27.equals((java.lang.Object) stackAr32);
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) 'a');
        boolean boolean38 = stackAr36.equals((java.lang.Object) (-1.0f));
        boolean boolean40 = stackAr36.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr();
        boolean boolean42 = stackAr41.isFull();
        stackAr36.push((java.lang.Object) stackAr41);
        boolean boolean44 = stackAr32.equals((java.lang.Object) stackAr36);
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr();
        boolean boolean46 = stackAr45.isFull();
        boolean boolean48 = stackAr45.equals((java.lang.Object) (byte) -1);
        java.lang.String str49 = stackAr45.toString();
        boolean boolean51 = stackAr45.equals((java.lang.Object) 10L);
        java.lang.String str52 = stackAr45.toString();
        java.lang.Class<?> wildcardClass53 = stackAr45.getClass();
        boolean boolean54 = stackAr32.equals((java.lang.Object) wildcardClass53);
        org.autotest.StackAr stackAr55 = new org.autotest.StackAr();
        boolean boolean56 = stackAr55.isFull();
        boolean boolean58 = stackAr55.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr60 = new org.autotest.StackAr((int) '4');
        boolean boolean61 = stackAr55.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr63 = new org.autotest.StackAr((int) 'a');
        boolean boolean65 = stackAr63.equals((java.lang.Object) (-1.0f));
        boolean boolean67 = stackAr63.equals((java.lang.Object) "");
        boolean boolean68 = stackAr55.equals((java.lang.Object) "");
        stackAr55.push((java.lang.Object) (byte) 0);
        boolean boolean71 = stackAr32.equals((java.lang.Object) (byte) 0);
        boolean boolean72 = stackAr23.equals((java.lang.Object) stackAr32);
        int int73 = stackAr32.size();
        int int74 = stackAr32.size();
        boolean boolean75 = stackAr32.isEmpty();
        boolean boolean76 = stackAr5.equals((java.lang.Object) boolean75);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[]" + "'", str21, "[]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[]" + "'", str24, "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[]" + "'", str28, "[]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "[]" + "'", str33, "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "[]" + "'", str49, "[]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "[]" + "'", str52, "[]");
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0619");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = stackAr5.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0620");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 100);
        boolean boolean2 = stackAr1.isFull();
        java.lang.String str3 = stackAr1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0621");
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
        java.lang.Object obj34 = stackAr1.top();
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) 'a');
        boolean boolean38 = stackAr36.equals((java.lang.Object) (-1.0f));
        boolean boolean40 = stackAr36.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr();
        boolean boolean42 = stackAr41.isFull();
        stackAr36.push((java.lang.Object) stackAr41);
        java.lang.String str44 = stackAr41.toString();
        boolean boolean45 = stackAr1.equals((java.lang.Object) stackAr41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = stackAr41.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "[0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "[0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "[0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[]" + "'", str44, "[]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0622");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) 'a');
        boolean boolean5 = stackAr3.equals((java.lang.Object) (-1.0f));
        boolean boolean7 = stackAr3.equals((java.lang.Object) "");
        stackAr3.push((java.lang.Object) (-1.0d));
        stackAr1.push((java.lang.Object) (-1.0d));
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean13 = stackAr12.isFull();
        int int14 = stackAr12.size();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) 'a');
        java.lang.String str17 = stackAr16.toString();
        stackAr16.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr((int) '4');
        java.lang.String str22 = stackAr21.toString();
        boolean boolean23 = stackAr16.equals((java.lang.Object) stackAr21);
        stackAr21.push((java.lang.Object) 1.0f);
        boolean boolean26 = stackAr12.equals((java.lang.Object) stackAr21);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) 'a');
        java.lang.String str29 = stackAr28.toString();
        stackAr28.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr((int) '4');
        java.lang.String str34 = stackAr33.toString();
        boolean boolean35 = stackAr28.equals((java.lang.Object) stackAr33);
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr((int) 'a');
        boolean boolean39 = stackAr37.equals((java.lang.Object) (-1.0f));
        boolean boolean41 = stackAr37.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr();
        boolean boolean43 = stackAr42.isFull();
        stackAr37.push((java.lang.Object) stackAr42);
        boolean boolean45 = stackAr33.equals((java.lang.Object) stackAr37);
        boolean boolean46 = stackAr21.equals((java.lang.Object) stackAr33);
        int int47 = stackAr33.size();
        stackAr1.push((java.lang.Object) stackAr33);
        boolean boolean49 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[]" + "'", str22, "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0623");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.String str4 = stackAr1.toString();
        boolean boolean5 = stackAr1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0624");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        org.autotest.StackAr stackAr2 = new org.autotest.StackAr();
        boolean boolean3 = stackAr2.isFull();
        int int4 = stackAr2.size();
        boolean boolean5 = stackAr2.isEmpty();
        stackAr1.push((java.lang.Object) stackAr2);
        boolean boolean7 = stackAr2.isFull();
        int int8 = stackAr2.size();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        int int11 = stackAr10.size();
        java.lang.String str12 = stackAr10.toString();
        int int13 = stackAr10.size();
        boolean boolean14 = stackAr10.isEmpty();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr((int) '4');
        int int17 = stackAr16.size();
        boolean boolean18 = stackAr16.isEmpty();
        stackAr16.push((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = new java.lang.Object();
        boolean boolean22 = stackAr16.equals(obj21);
        java.lang.String str23 = stackAr16.toString();
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr();
        boolean boolean25 = stackAr24.isFull();
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean28 = stackAr27.isEmpty();
        boolean boolean29 = stackAr27.isFull();
        boolean boolean30 = stackAr24.equals((java.lang.Object) boolean29);
        boolean boolean31 = stackAr24.isFull();
        org.autotest.StackAr stackAr32 = new org.autotest.StackAr();
        boolean boolean33 = stackAr32.isFull();
        boolean boolean35 = stackAr32.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr((int) '4');
        boolean boolean38 = stackAr32.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr40 = new org.autotest.StackAr((int) 'a');
        boolean boolean42 = stackAr40.equals((java.lang.Object) (-1.0f));
        boolean boolean44 = stackAr40.equals((java.lang.Object) "");
        boolean boolean45 = stackAr32.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr47 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean48 = stackAr47.isEmpty();
        boolean boolean49 = stackAr47.isEmpty();
        stackAr32.push((java.lang.Object) stackAr47);
        stackAr32.push((java.lang.Object) 1.0f);
        boolean boolean53 = stackAr24.equals((java.lang.Object) stackAr32);
        stackAr16.push((java.lang.Object) stackAr32);
        boolean boolean55 = stackAr10.equals((java.lang.Object) stackAr16);
        boolean boolean56 = stackAr2.equals((java.lang.Object) stackAr16);
        java.lang.String str57 = stackAr2.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[0]" + "'", str23, "[0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "[]" + "'", str57, "[]");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0625");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        stackAr1.push((java.lang.Object) (-1.0d));
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        boolean boolean11 = stackAr8.equals((java.lang.Object) (byte) -1);
        java.lang.String str12 = stackAr8.toString();
        boolean boolean14 = stackAr8.equals((java.lang.Object) 10L);
        java.lang.String str15 = stackAr8.toString();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '4');
        stackAr17.push((java.lang.Object) (-1L));
        boolean boolean20 = stackAr17.isEmpty();
        boolean boolean21 = stackAr8.equals((java.lang.Object) stackAr17);
        boolean boolean22 = stackAr1.equals((java.lang.Object) stackAr8);
        int int23 = stackAr1.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0626");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) (short) 100);
        boolean boolean7 = stackAr1.equals((java.lang.Object) stackAr6);
        boolean boolean8 = stackAr6.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = stackAr6.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0627");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        boolean boolean3 = stackAr0.equals((java.lang.Object) (byte) -1);
        java.lang.String str4 = stackAr0.toString();
        boolean boolean6 = stackAr0.equals((java.lang.Object) 10L);
        boolean boolean7 = stackAr0.isEmpty();
        boolean boolean8 = stackAr0.isEmpty();
        java.lang.String str9 = stackAr0.toString();
        int int10 = stackAr0.size();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        int int13 = stackAr12.size();
        int int14 = stackAr12.size();
        boolean boolean15 = stackAr12.isFull();
        java.lang.Object obj16 = null;
        stackAr12.push(obj16);
        boolean boolean18 = stackAr0.equals((java.lang.Object) stackAr12);
        java.lang.Class<?> wildcardClass19 = stackAr12.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0628");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 100);
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr((int) 'a');
        java.lang.String str6 = stackAr5.toString();
        stackAr5.push((java.lang.Object) (short) 10);
        stackAr1.push((java.lang.Object) stackAr5);
        java.lang.Object obj10 = stackAr1.top();
        int int11 = stackAr1.size();
        boolean boolean12 = stackAr1.isFull();
        java.lang.String str13 = stackAr1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "[10]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "[10]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "[10]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[[10]]" + "'", str13, "[[10]]");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0629");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) ' ');
        stackAr1.push((java.lang.Object) ' ');
        java.lang.Object obj8 = stackAr1.top();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        boolean boolean10 = stackAr9.isFull();
        int int11 = stackAr9.size();
        boolean boolean12 = stackAr9.isEmpty();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean15 = stackAr14.isFull();
        java.lang.Class<?> wildcardClass16 = stackAr14.getClass();
        stackAr9.push((java.lang.Object) wildcardClass16);
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean20 = stackAr19.isEmpty();
        java.lang.Class<?> wildcardClass21 = stackAr19.getClass();
        boolean boolean22 = stackAr9.equals((java.lang.Object) wildcardClass21);
        boolean boolean23 = stackAr9.isFull();
        boolean boolean24 = stackAr9.isEmpty();
        org.autotest.StackAr stackAr26 = new org.autotest.StackAr(0);
        java.lang.Class<?> wildcardClass27 = stackAr26.getClass();
        boolean boolean28 = stackAr9.equals((java.lang.Object) wildcardClass27);
        java.lang.Class<?> wildcardClass29 = stackAr9.getClass();
        boolean boolean30 = stackAr1.equals((java.lang.Object) stackAr9);
        boolean boolean31 = stackAr9.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + ' ' + "'", obj8, ' ');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0630");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        org.autotest.StackAr stackAr3 = new org.autotest.StackAr((int) (short) 100);
        java.lang.String str4 = stackAr3.toString();
        boolean boolean5 = stackAr3.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            stackAr1.push((java.lang.Object) stackAr3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0631");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0632");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) 'a');
        stackAr4.push((java.lang.Object) 'a');
        java.lang.Object obj7 = stackAr4.top();
        boolean boolean8 = stackAr4.isEmpty();
        java.lang.Object obj9 = stackAr4.top();
        stackAr1.push(obj9);
        boolean boolean11 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr();
        boolean boolean13 = stackAr12.isFull();
        boolean boolean15 = stackAr12.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr();
        boolean boolean17 = stackAr16.isFull();
        boolean boolean19 = stackAr16.equals((java.lang.Object) (byte) -1);
        stackAr12.push((java.lang.Object) boolean19);
        stackAr1.push((java.lang.Object) stackAr12);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr();
        boolean boolean23 = stackAr22.isFull();
        int int24 = stackAr22.size();
        boolean boolean25 = stackAr22.isFull();
        stackAr22.push((java.lang.Object) 10L);
        java.lang.String str28 = stackAr22.toString();
        org.autotest.StackAr stackAr29 = new org.autotest.StackAr();
        boolean boolean30 = stackAr29.isFull();
        int int31 = stackAr29.size();
        boolean boolean32 = stackAr29.isEmpty();
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean35 = stackAr34.isEmpty();
        int int36 = stackAr34.size();
        boolean boolean37 = stackAr34.isFull();
        boolean boolean38 = stackAr29.equals((java.lang.Object) stackAr34);
        java.lang.String str39 = stackAr34.toString();
        boolean boolean40 = stackAr22.equals((java.lang.Object) stackAr34);
        boolean boolean41 = stackAr12.equals((java.lang.Object) stackAr34);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = stackAr34.top();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "[10]" + "'", str28, "[10]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "[]" + "'", str39, "[]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0633");
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
        java.lang.Class<?> wildcardClass30 = stackAr6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0634");
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
        int int12 = stackAr4.size();
        java.lang.String str13 = stackAr4.toString();
        org.autotest.StackAr stackAr15 = new org.autotest.StackAr((int) '4');
        boolean boolean16 = stackAr15.isEmpty();
        boolean boolean17 = stackAr4.equals((java.lang.Object) stackAr15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0635");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr(1);
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isFull();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr();
        boolean boolean5 = stackAr4.isFull();
        int int6 = stackAr4.size();
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr((int) (short) 0);
        stackAr4.push((java.lang.Object) (short) 0);
        boolean boolean10 = stackAr4.isEmpty();
        org.autotest.StackAr stackAr12 = new org.autotest.StackAr((int) '4');
        int int13 = stackAr12.size();
        java.lang.String str14 = stackAr12.toString();
        int int15 = stackAr12.size();
        org.autotest.StackAr stackAr16 = new org.autotest.StackAr();
        boolean boolean17 = stackAr16.isFull();
        boolean boolean19 = stackAr16.equals((java.lang.Object) (byte) -1);
        boolean boolean20 = stackAr12.equals((java.lang.Object) (byte) -1);
        stackAr4.push((java.lang.Object) boolean20);
        stackAr1.push((java.lang.Object) boolean20);
        org.autotest.StackAr stackAr24 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean25 = stackAr24.isFull();
        int int26 = stackAr24.size();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) 'a');
        java.lang.String str29 = stackAr28.toString();
        stackAr28.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr33 = new org.autotest.StackAr((int) '4');
        java.lang.String str34 = stackAr33.toString();
        boolean boolean35 = stackAr28.equals((java.lang.Object) stackAr33);
        stackAr33.push((java.lang.Object) 1.0f);
        boolean boolean38 = stackAr24.equals((java.lang.Object) stackAr33);
        org.autotest.StackAr stackAr40 = new org.autotest.StackAr((int) 'a');
        java.lang.String str41 = stackAr40.toString();
        stackAr40.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr45 = new org.autotest.StackAr((int) '4');
        java.lang.String str46 = stackAr45.toString();
        boolean boolean47 = stackAr40.equals((java.lang.Object) stackAr45);
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr((int) 'a');
        boolean boolean51 = stackAr49.equals((java.lang.Object) (-1.0f));
        boolean boolean53 = stackAr49.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr54 = new org.autotest.StackAr();
        boolean boolean55 = stackAr54.isFull();
        stackAr49.push((java.lang.Object) stackAr54);
        boolean boolean57 = stackAr45.equals((java.lang.Object) stackAr49);
        boolean boolean58 = stackAr33.equals((java.lang.Object) stackAr45);
        org.autotest.StackAr stackAr59 = new org.autotest.StackAr();
        boolean boolean60 = stackAr59.isFull();
        int int61 = stackAr59.size();
        boolean boolean62 = stackAr59.isEmpty();
        org.autotest.StackAr stackAr64 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean65 = stackAr64.isFull();
        java.lang.Class<?> wildcardClass66 = stackAr64.getClass();
        stackAr59.push((java.lang.Object) wildcardClass66);
        org.autotest.StackAr stackAr69 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean70 = stackAr69.isEmpty();
        java.lang.Class<?> wildcardClass71 = stackAr69.getClass();
        boolean boolean72 = stackAr59.equals((java.lang.Object) wildcardClass71);
        boolean boolean73 = stackAr59.isFull();
        boolean boolean74 = stackAr59.isEmpty();
        org.autotest.StackAr stackAr75 = new org.autotest.StackAr();
        boolean boolean76 = stackAr75.isFull();
        boolean boolean78 = stackAr75.equals((java.lang.Object) (byte) -1);
        java.lang.String str79 = stackAr75.toString();
        boolean boolean81 = stackAr75.equals((java.lang.Object) 10L);
        boolean boolean82 = stackAr75.isEmpty();
        boolean boolean83 = stackAr75.isEmpty();
        java.lang.String str84 = stackAr75.toString();
        boolean boolean85 = stackAr59.equals((java.lang.Object) str84);
        stackAr45.push((java.lang.Object) boolean85);
        java.lang.String str87 = stackAr45.toString();
        java.lang.String str88 = stackAr45.toString();
        boolean boolean89 = stackAr1.equals((java.lang.Object) str88);
        boolean boolean90 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[]" + "'", str41, "[]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "[]" + "'", str46, "[]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(wildcardClass71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "[]" + "'", str79, "[]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "[]" + "'", str84, "[]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "[false]" + "'", str87, "[false]");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "[false]" + "'", str88, "[false]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0636");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        java.lang.String str2 = stackAr1.toString();
        stackAr1.push((java.lang.Object) 0.0f);
        org.autotest.StackAr stackAr6 = new org.autotest.StackAr((int) '4');
        java.lang.String str7 = stackAr6.toString();
        boolean boolean8 = stackAr1.equals((java.lang.Object) stackAr6);
        java.lang.String str9 = stackAr6.toString();
        stackAr6.push((java.lang.Object) 10);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) '4');
        java.lang.String str14 = stackAr13.toString();
        int int15 = stackAr13.size();
        boolean boolean16 = stackAr13.isEmpty();
        stackAr6.push((java.lang.Object) stackAr13);
        java.lang.Class<?> wildcardClass18 = stackAr13.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0637");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean7 = stackAr1.equals((java.lang.Object) ' ');
        boolean boolean8 = stackAr1.isEmpty();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0638");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) 'a');
        boolean boolean3 = stackAr1.equals((java.lang.Object) (-1.0f));
        boolean boolean5 = stackAr1.equals((java.lang.Object) "");
        stackAr1.push((java.lang.Object) (-1.0d));
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        boolean boolean9 = stackAr8.isFull();
        boolean boolean11 = stackAr8.equals((java.lang.Object) (byte) -1);
        java.lang.String str12 = stackAr8.toString();
        boolean boolean14 = stackAr8.equals((java.lang.Object) 10L);
        java.lang.String str15 = stackAr8.toString();
        org.autotest.StackAr stackAr17 = new org.autotest.StackAr((int) '4');
        stackAr17.push((java.lang.Object) (-1L));
        boolean boolean20 = stackAr17.isEmpty();
        boolean boolean21 = stackAr8.equals((java.lang.Object) stackAr17);
        boolean boolean22 = stackAr1.equals((java.lang.Object) stackAr8);
        boolean boolean23 = stackAr1.isFull();
        java.lang.String str24 = stackAr1.toString();
        java.lang.Class<?> wildcardClass25 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[-1.0]" + "'", str24, "[-1.0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0639");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean2 = stackAr1.isFull();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean5 = stackAr4.isFull();
        boolean boolean6 = stackAr1.equals((java.lang.Object) stackAr4);
        boolean boolean7 = stackAr4.isEmpty();
        int int8 = stackAr4.size();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) 'a');
        boolean boolean12 = stackAr10.equals((java.lang.Object) (-1.0f));
        boolean boolean14 = stackAr10.equals((java.lang.Object) "");
        stackAr10.push((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = stackAr10.top();
        org.autotest.StackAr stackAr19 = new org.autotest.StackAr((int) 'a');
        boolean boolean21 = stackAr19.equals((java.lang.Object) (-1.0f));
        int int22 = stackAr19.size();
        org.autotest.StackAr stackAr23 = new org.autotest.StackAr();
        boolean boolean24 = stackAr23.isFull();
        int int25 = stackAr23.size();
        boolean boolean26 = stackAr23.isEmpty();
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean29 = stackAr28.isFull();
        java.lang.Class<?> wildcardClass30 = stackAr28.getClass();
        stackAr23.push((java.lang.Object) wildcardClass30);
        boolean boolean32 = stackAr19.equals((java.lang.Object) stackAr23);
        stackAr10.push((java.lang.Object) stackAr23);
        org.autotest.StackAr stackAr35 = new org.autotest.StackAr((int) ' ');
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr();
        boolean boolean38 = stackAr37.isFull();
        int int39 = stackAr37.size();
        boolean boolean40 = stackAr37.isEmpty();
        org.autotest.StackAr stackAr42 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean43 = stackAr42.isFull();
        java.lang.Class<?> wildcardClass44 = stackAr42.getClass();
        stackAr37.push((java.lang.Object) wildcardClass44);
        boolean boolean46 = stackAr36.equals((java.lang.Object) stackAr37);
        java.lang.Class<?> wildcardClass47 = stackAr36.getClass();
        stackAr35.push((java.lang.Object) stackAr36);
        boolean boolean49 = stackAr35.isEmpty();
        org.autotest.StackAr stackAr50 = new org.autotest.StackAr();
        boolean boolean51 = stackAr50.isFull();
        boolean boolean53 = stackAr50.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr55 = new org.autotest.StackAr((int) '4');
        boolean boolean56 = stackAr50.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr58 = new org.autotest.StackAr((int) 'a');
        boolean boolean60 = stackAr58.equals((java.lang.Object) (-1.0f));
        boolean boolean62 = stackAr58.equals((java.lang.Object) "");
        boolean boolean63 = stackAr50.equals((java.lang.Object) "");
        org.autotest.StackAr stackAr65 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean66 = stackAr65.isEmpty();
        boolean boolean67 = stackAr65.isEmpty();
        stackAr50.push((java.lang.Object) stackAr65);
        boolean boolean69 = stackAr35.equals((java.lang.Object) stackAr65);
        stackAr10.push((java.lang.Object) boolean69);
        boolean boolean71 = stackAr4.equals((java.lang.Object) stackAr10);
        boolean boolean72 = stackAr10.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + (-1.0d) + "'", obj17, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0640");
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
        java.lang.String str19 = stackAr10.toString();
        java.lang.Object obj20 = stackAr10.top();
        org.autotest.StackAr stackAr21 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr();
        boolean boolean23 = stackAr22.isFull();
        int int24 = stackAr22.size();
        boolean boolean25 = stackAr22.isEmpty();
        org.autotest.StackAr stackAr27 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean28 = stackAr27.isFull();
        java.lang.Class<?> wildcardClass29 = stackAr27.getClass();
        stackAr22.push((java.lang.Object) wildcardClass29);
        boolean boolean31 = stackAr21.equals((java.lang.Object) stackAr22);
        int int32 = stackAr21.size();
        org.autotest.StackAr stackAr34 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean35 = stackAr34.isEmpty();
        boolean boolean36 = stackAr34.isFull();
        org.autotest.StackAr stackAr37 = new org.autotest.StackAr();
        boolean boolean38 = stackAr37.isFull();
        org.autotest.StackAr stackAr40 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean41 = stackAr40.isEmpty();
        boolean boolean42 = stackAr40.isFull();
        boolean boolean43 = stackAr37.equals((java.lang.Object) boolean42);
        boolean boolean44 = stackAr34.equals((java.lang.Object) stackAr37);
        boolean boolean45 = stackAr21.equals((java.lang.Object) boolean44);
        stackAr10.push((java.lang.Object) boolean44);
        java.lang.String str47 = stackAr10.toString();
        org.autotest.StackAr stackAr49 = new org.autotest.StackAr(0);
        boolean boolean50 = stackAr49.isEmpty();
        stackAr10.push((java.lang.Object) stackAr49);
        org.autotest.StackAr stackAr53 = new org.autotest.StackAr((int) '4');
        java.lang.String str54 = stackAr53.toString();
        boolean boolean55 = stackAr53.isEmpty();
        boolean boolean56 = stackAr53.isFull();
        boolean boolean57 = stackAr53.isFull();
        boolean boolean58 = stackAr53.isFull();
        stackAr10.push((java.lang.Object) stackAr53);
        java.lang.Class<?> wildcardClass60 = stackAr53.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[[]]" + "'", str19, "[[]]");
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "[]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "[[],false]" + "'", str47, "[[],false]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[]" + "'", str54, "[]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0641");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr7 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean8 = stackAr7.isFull();
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) (short) 1);
        boolean boolean11 = stackAr10.isFull();
        boolean boolean12 = stackAr7.equals((java.lang.Object) stackAr10);
        java.lang.Class<?> wildcardClass13 = stackAr10.getClass();
        boolean boolean14 = stackAr1.equals((java.lang.Object) wildcardClass13);
        boolean boolean15 = stackAr1.isEmpty();
        boolean boolean16 = stackAr1.isEmpty();
        boolean boolean17 = stackAr1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0642");
        org.autotest.StackAr stackAr0 = new org.autotest.StackAr();
        boolean boolean1 = stackAr0.isFull();
        int int2 = stackAr0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = stackAr0.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0643");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '#');
        boolean boolean2 = stackAr1.isEmpty();
        boolean boolean3 = stackAr1.isFull();
        java.lang.Class<?> wildcardClass4 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0644");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        boolean boolean3 = stackAr1.isEmpty();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        int int7 = stackAr5.size();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr((int) (short) 0);
        stackAr5.push((java.lang.Object) (short) 0);
        stackAr1.push((java.lang.Object) (short) 0);
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) 'a');
        stackAr13.push((java.lang.Object) 'a');
        java.lang.Object obj16 = stackAr13.top();
        boolean boolean17 = stackAr13.isEmpty();
        int int18 = stackAr13.size();
        boolean boolean19 = stackAr13.isFull();
        org.autotest.StackAr stackAr20 = new org.autotest.StackAr();
        boolean boolean21 = stackAr20.isFull();
        int int22 = stackAr20.size();
        boolean boolean23 = stackAr20.isEmpty();
        boolean boolean24 = stackAr20.isFull();
        boolean boolean25 = stackAr13.equals((java.lang.Object) boolean24);
        stackAr1.push((java.lang.Object) boolean24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0645");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        java.lang.String str2 = stackAr1.toString();
        java.lang.String str3 = stackAr1.toString();
        int int4 = stackAr1.size();
        boolean boolean5 = stackAr1.isFull();
        boolean boolean7 = stackAr1.equals((java.lang.Object) ' ');
        org.autotest.StackAr stackAr8 = new org.autotest.StackAr();
        org.autotest.StackAr stackAr9 = new org.autotest.StackAr();
        boolean boolean10 = stackAr9.isFull();
        int int11 = stackAr9.size();
        boolean boolean12 = stackAr9.isEmpty();
        org.autotest.StackAr stackAr14 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean15 = stackAr14.isFull();
        java.lang.Class<?> wildcardClass16 = stackAr14.getClass();
        stackAr9.push((java.lang.Object) wildcardClass16);
        boolean boolean18 = stackAr8.equals((java.lang.Object) stackAr9);
        int int19 = stackAr8.size();
        stackAr1.push((java.lang.Object) stackAr8);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr((int) (byte) 10);
        boolean boolean24 = stackAr22.equals((java.lang.Object) 0.0d);
        boolean boolean25 = stackAr22.isEmpty();
        stackAr1.push((java.lang.Object) boolean25);
        org.autotest.StackAr stackAr28 = new org.autotest.StackAr((int) '4');
        java.lang.String str29 = stackAr28.toString();
        java.lang.String str30 = stackAr28.toString();
        int int31 = stackAr28.size();
        boolean boolean32 = stackAr28.isFull();
        boolean boolean34 = stackAr28.equals((java.lang.Object) ' ');
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        stackAr28.push((java.lang.Object) wildcardClass36);
        java.lang.Class<?> wildcardClass38 = stackAr28.getClass();
        boolean boolean39 = stackAr1.equals((java.lang.Object) stackAr28);
        org.autotest.StackAr stackAr41 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean42 = stackAr41.isEmpty();
        boolean boolean43 = stackAr41.isFull();
        org.autotest.StackAr stackAr44 = new org.autotest.StackAr();
        boolean boolean45 = stackAr44.isFull();
        org.autotest.StackAr stackAr47 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean48 = stackAr47.isEmpty();
        boolean boolean49 = stackAr47.isFull();
        boolean boolean50 = stackAr44.equals((java.lang.Object) boolean49);
        boolean boolean51 = stackAr41.equals((java.lang.Object) stackAr44);
        int int52 = stackAr44.size();
        boolean boolean53 = stackAr28.equals((java.lang.Object) stackAr44);
        java.lang.Class<?> wildcardClass54 = stackAr44.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "[]" + "'", str29, "[]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "[]" + "'", str30, "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0646");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isFull();
        boolean boolean3 = stackAr1.isEmpty();
        java.lang.String str4 = stackAr1.toString();
        java.lang.String str5 = stackAr1.toString();
        int int6 = stackAr1.size();
        int int7 = stackAr1.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = stackAr1.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0647");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) ' ');
        boolean boolean2 = stackAr1.isEmpty();
        org.autotest.StackAr stackAr4 = new org.autotest.StackAr((int) '4');
        java.lang.String str5 = stackAr4.toString();
        boolean boolean6 = stackAr4.isEmpty();
        boolean boolean7 = stackAr4.isFull();
        boolean boolean8 = stackAr4.isFull();
        boolean boolean9 = stackAr1.equals((java.lang.Object) stackAr4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = stackAr4.pop();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0648");
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
        java.lang.Object obj34 = stackAr1.top();
        org.autotest.StackAr stackAr36 = new org.autotest.StackAr((int) '4');
        int int37 = stackAr36.size();
        boolean boolean38 = stackAr36.isEmpty();
        stackAr36.push((java.lang.Object) (byte) 0);
        java.lang.String str41 = stackAr36.toString();
        org.autotest.StackAr stackAr43 = new org.autotest.StackAr((int) '4');
        int int44 = stackAr43.size();
        int int45 = stackAr43.size();
        boolean boolean46 = stackAr43.isFull();
        org.autotest.StackAr stackAr47 = new org.autotest.StackAr();
        boolean boolean48 = stackAr47.isFull();
        boolean boolean50 = stackAr47.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr52 = new org.autotest.StackAr((int) '4');
        boolean boolean53 = stackAr47.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr55 = new org.autotest.StackAr((int) 'a');
        boolean boolean57 = stackAr55.equals((java.lang.Object) (-1.0f));
        boolean boolean59 = stackAr55.equals((java.lang.Object) "");
        boolean boolean60 = stackAr47.equals((java.lang.Object) "");
        boolean boolean61 = stackAr47.isFull();
        stackAr43.push((java.lang.Object) stackAr47);
        org.autotest.StackAr stackAr63 = new org.autotest.StackAr();
        int int64 = stackAr63.size();
        int int65 = stackAr63.size();
        stackAr47.push((java.lang.Object) int65);
        boolean boolean67 = stackAr47.isFull();
        stackAr36.push((java.lang.Object) stackAr47);
        java.lang.String str69 = stackAr36.toString();
        java.lang.Class<?> wildcardClass70 = stackAr36.getClass();
        boolean boolean71 = stackAr1.equals((java.lang.Object) wildcardClass70);
        int int72 = stackAr1.size();
        java.lang.Object obj73 = null;
        boolean boolean74 = stackAr1.equals(obj73);
        boolean boolean75 = stackAr1.isFull();
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
        org.junit.Assert.assertNotNull(obj34);
        org.junit.Assert.assertEquals(obj34.toString(), "[0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj34), "[0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj34), "[0]");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "[0]" + "'", str41, "[0]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "[0,[0]]" + "'", str69, "[0,[0]]");
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2 + "'", int72 == 2);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0649");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) (short) 0);
        boolean boolean2 = stackAr1.isEmpty();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isEmpty();
        boolean boolean5 = stackAr1.isEmpty();
        java.lang.String str6 = stackAr1.toString();
        boolean boolean7 = stackAr1.isFull();
        boolean boolean8 = stackAr1.isEmpty();
        boolean boolean9 = stackAr1.isFull();
        boolean boolean10 = stackAr1.isEmpty();
        java.lang.Class<?> wildcardClass11 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test0650");
        org.autotest.StackAr stackAr1 = new org.autotest.StackAr((int) '4');
        int int2 = stackAr1.size();
        int int3 = stackAr1.size();
        boolean boolean4 = stackAr1.isFull();
        org.autotest.StackAr stackAr5 = new org.autotest.StackAr();
        boolean boolean6 = stackAr5.isFull();
        boolean boolean8 = stackAr5.equals((java.lang.Object) (byte) -1);
        org.autotest.StackAr stackAr10 = new org.autotest.StackAr((int) '4');
        boolean boolean11 = stackAr5.equals((java.lang.Object) '4');
        org.autotest.StackAr stackAr13 = new org.autotest.StackAr((int) 'a');
        boolean boolean15 = stackAr13.equals((java.lang.Object) (-1.0f));
        boolean boolean17 = stackAr13.equals((java.lang.Object) "");
        boolean boolean18 = stackAr5.equals((java.lang.Object) "");
        boolean boolean19 = stackAr5.isFull();
        stackAr1.push((java.lang.Object) stackAr5);
        org.autotest.StackAr stackAr22 = new org.autotest.StackAr(0);
        boolean boolean23 = stackAr1.equals((java.lang.Object) stackAr22);
        java.lang.Class<?> wildcardClass24 = stackAr1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }
}

