package HashingSession2;

import java.util.*;
import java.lang.*;
import java.io.*;
public class CommonChars{
public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String[] words=new String[]{"bella","label","roller"};
		String str=words[0];
        Map<Character,Integer>hmap=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            hmap.put(c,hmap.getOrDefault(c,0)+1);    
        }
        for(int i=1;i<words.length;i++){
            String newstr=words[i];
            Map<Character,Integer>freqmap=new HashMap<>();
            for(int j=0;j<newstr.length();j++){
                char c=newstr.charAt(j);
                freqmap.put(c,freqmap.getOrDefault(c,0)+1);
            }
            for(Character key:hmap.keySet()){
                if(freqmap.containsKey(key)){
                    hmap.put(key,Math.min(hmap.get(key),freqmap.get(key)));
                }
                else{
                    hmap.put(key,0);
                }
            }
        }
        List<String> list=new ArrayList<>();
        for(Character key:hmap.keySet()){
            if(hmap.get(key)>0){
                for(int i=0;i<hmap.get(key);i++){
                    list.add(key+"");
                }
            }
        }
        System.out.println(list);
	}
}