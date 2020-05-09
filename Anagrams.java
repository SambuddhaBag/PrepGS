package com.dsprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Anagrams {
	
	
    String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
    List<String> inputList = Arrays.asList(input);
    List<List<String>> res = new ArrayList<>();
    Map<String,List<String>> resmap = inputList.stream().
            collect(Collectors.groupingBy(s -> {char[] c = s.toCharArray();
                                                 Arrays.sort(c);
                                                 return new String(c);}  ,
                    Collectors.mapping(Function.identity(),Collectors.toList())));
	
}
