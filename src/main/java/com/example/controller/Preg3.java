/**
 * Created by
 *
 * @author Franco Iturrizaga
 * @date 27/05/16 01:58 AM Copyright (C) 2016 All rights reserved.
 */

package com.example.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Preg3 {

  /**
   * 主方法.
   *
   * @param args
   *          参数
   */
  public static void main(String[] args) {
//    TreeMap<Integer, Integer> mapa = new TreeMap<Integer, Integer>();
    Preg3 preg = new Preg3();
    System.out.println(preg.getNumMasPopular(5, new int[] { 3, 4, 3, 5, 1, 3, 4, 5, 5, 5, 5, 5 }));

    List<String> list = new ArrayList<String>();
    System.out.println(list.get(0));
//    String[] array = new String[] {};
//    System.out.println(array[3]);
  }

  /**
   * 算法测试.
   *
   * @param tamanio
   *          整数
   * @param lista
   *          整数
   * @return 整数
   */
  public int getNumMasPopular(final int tamanio, final int... lista) {

    TreeMap<Integer, Integer> contador = new TreeMap<Integer, Integer>();

    for (int valor : lista) {
      int cantidad = contador.get(valor) != null ? contador.get(valor) : 0;
      contador.put(valor, ++cantidad);
    }

    int result = 0;

    SortedSet<Map.Entry<Integer, Integer>> sortedEntries = new TreeSet<Map.Entry<Integer, Integer>>(

        new Comparator<Map.Entry<Integer, Integer>>() {

          public int compare(final Map.Entry<Integer, Integer> o1,
              final Map.Entry<Integer, Integer> o2) {
            int res = o2.getValue().compareTo(o1.getValue());

            return res != 0 ? res : 1;
          }
        });

    sortedEntries.addAll(contador.entrySet());

    System.out.println("sortedEntries -> " + sortedEntries);

    return sortedEntries.iterator().next().getKey();

  }

}
