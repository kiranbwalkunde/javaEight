/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Set;
import java.util.HashSet;
/**
 *
 * @author kiran
 */
public class CollectionStreams {
    
    public static void main(String args[]){
        System.out.println("Hi there");
        setCollection();
    }
    
    public static void listCollection(){
            List<String> lists = new ArrayList<String>();
        lists.add("First");
        lists.add("Second");
        lists.add("Third");
        lists.add("Fourth");
        System.out.println("The lists is "+lists);
        Stream<String> stream = lists.stream();
        stream.forEach(x -> {System.out.println(x);});
    }
    
    public static void setCollection(){
        Set<String> sets = new HashSet<>();
        sets.add("First Set");
        sets.add("Second SEt");
        sets.add("Third Set");
        sets.add("Fourth Set");
        sets.add("Fifth Set");
        sets.stream().forEach(x -> {System.out.println(x);});
    }
}
