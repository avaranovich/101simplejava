package org.softlang.company.features;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.LinkedList;

import org.softlang.company.model.Company;

public class Parsing {

    public static Company deserializeCompany(String filename) {
        Object o = null;
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fis);
            o = in.readObject();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (Company) o;
    }

    /*
     * A helper for sanity checking de-/serialization.
     * We test two objects to be structurally equal by means of reflection.
     */
    private static boolean structurallyEqual(Object o1, Object o2) {
        try {
            if (o1.getClass().getName().equals(o2.getClass().getName())) {
                for (Class<?> obj = o1.getClass(); !obj.equals(Object.class); obj = obj
                        .getSuperclass()) {

                    Field[] f1 = obj.getDeclaredFields();
                    Field[] f2 = obj.getDeclaredFields();

                    for (int i = 0; i < f1.length; i++) {

                        f1[i].setAccessible(true);
                        f2[i].setAccessible(true);

                        // check if fields are primitive types and compare
                        if ((f1[i].getType().isPrimitive() && f2[i].getType()
                                .isPrimitive())) {
                            if (!(f1[i].getName().equals(f2[i].getName())))
                                return false;
                            else {
                                if (!(f1[i].get(o1).equals(f2[i].get(o2)))) {
                                    return false;
                                }
                            }
                            // otherwise, they must be objects
                        } else {
                            // to be equal, both can not be null
                            if (f1[i].get(o1) != null && f2[i].get(o2) != null) {
                                // check, if they are of the same class
                                if (f1[i]
                                        .get(o1)
                                        .getClass()
                                        .getName()
                                        .equals(f2[i].get(o2).getClass()
                                                .getName())) {
                                    // check if the class is Double,Integer or
                                    // String
                                    if (Parsing.check(f1[i].get(o1).getClass()
                                            .getName())) {
                                        // compare values
                                        if (!(f1[i].get(o1).equals(f2[i]
                                                .get(o2)))) {
                                            return false;
                                        }
                                    } else {
                                        // special case, if the object is an
                                        // linked
                                        // list
                                        if (f1[i].get(o1).getClass().getName()
                                                .equals("java.util.LinkedList")) {
                                            if (!(Parsing.handleLinkedList(f1[i],
                                                    o1, f2[i], o2))) {
                                                return false;
                                            }
                                        } else {
                                            // otherwise, compare the objects
                                            structurallyEqual(f1[i].get(o1),
                                                    f2[i].get(o2));
                                        }
                                    }
                                } else {
                                    return false;
                                }
                            } else {
                                // if one of them is null, the objects can not
                                // be
                                // equal
                                if (f1[i].get(o1) == null
                                        && f2[i].get(o2) != null) {
                                    return false;
                                }
                                if (f1[i].get(o1) != null
                                        && f2[i].get(o2) == null) {
                                    return false;
                                }
                            }

                        }
                    }
                }
            } else {
                return false;
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return true;
    }

    private static boolean check(String s) {
        return (s.equals("java.lang.String") || s.equals("java.lang.Integer")
                || s.equals("java.lang.Double") || s.equals("java.lang.Float"));

    }

    private static boolean handleLinkedList(Field f1, Object o1, Field f2, Object o2) {
        try {
            LinkedList<?> l1 = (LinkedList<?>) f1.get(o1);
            LinkedList<?> l2 = (LinkedList<?>) f2.get(o2);
            int length = l1.size();
            for (int i = 0; i < length; i++) {
                if (!(org.softlang.company.features.Parsing.structurallyEqual(l1.get(i), l2.get(i)))) {
                    return false;
                }
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return true;
    }

}