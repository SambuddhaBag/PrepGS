package com.dsprep.two;
import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */
@FunctionalInterface
interface AnagramsGrouging{
Set<Set<String>> grouping(List<String> words);
}

class Anagram{
	
  public static void main(String[] args) {
    List<String> words= new ArrayList<>();
    words.add("god");
    words.add("dog");
    words.add("eat");
    words.add("ate");
    words.add("tea");
    words.add("act");
    words.add("tac");
    
    //output:{[god,dog],[eat,ate,tea],[act,tac]}
    
    AnagramsGrouging groupWords=(names)->{
      Map<String,Set<String>> map= new HashMap<>();
      for(String name:names){
        char[] keyCh= name.toCharArray();
        Arrays.sort(keyCh);
        String key= new String(keyCh);
        if(!map.containsKey(key)){
           Set<String> set= new HashSet<>();
          set.add(name);
          map.put(key,set);
        }else{
          Set<String> set=map.get(key);
          set.add(name);
          map.put(key,set);
        }
        
      }
      Collection<Set<String>> collectionAnagrams= map.values();
      HashSet<Set<String>> hashSets= new HashSet<Set<String>>();
      hashSets.addAll(collectionAnagrams);
      
      return hashSets;
    };
    
   Set<Set<String>> sets= groupWords.grouping(words);
    System.out.println(sets);
  }
}