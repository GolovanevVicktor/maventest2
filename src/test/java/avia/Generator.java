/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
/**
 *
 * @author user
 */
public class Generator {
    String nameMale="src/test/data/namesM.txt";
    String nameFemale="src/test/data/namesW.txt";
    String midnameMale="src/test/data/midnamesM.txt";
    String midnameFemale="src/test/data/midnamesW.txt";
    String lastnameMale="src/test/data/lastnamesM.txt";
    String lastnameFemale="src/test/data/lastnamesW.txt";
    private Map getInfo(String file){
        String[]buf;
        Map info=new HashMap<String,String>();
        int i=0;
    try{
   BufferedReader input=new BufferedReader(new FileReader(file));
   String line=input.readLine();
   while(line!=null){
   buf=line.split("\\s++");
   for(int j=0;j<buf.length;j++){
       info.put(Integer.toString(i),buf[j]);
       i++;
    }
   line=input.readLine();
}
    }
   catch(IOException e1){}
    return info;
    }
    
    private String RandomChoose(Map info){
    int i=info.size();
    Random r=new Random();
    i=r.nextInt(i);
    return (String) info.get(Integer.toString(i));}
    
    public String getMaleName(){
    Map names =getInfo(nameMale);
    return RandomChoose(names);}
    
    public String getFemaleName(){
    Map names =getInfo(nameFemale);
    return RandomChoose(names);}
    
    public String getFemaleLastname(){
    Map names =getInfo(midnameFemale);
    return RandomChoose(names);}
    
    public String getFemaleMidname(){
    Map names =getInfo(lastnameFemale);
    return RandomChoose(names);}
    
    public String getMaleLastname(){
    Map names =getInfo(midnameMale);
    return RandomChoose(names);}
    
    public String getMaleMidname(){
    Map names =getInfo(lastnameMale);
    return RandomChoose(names);}
}
