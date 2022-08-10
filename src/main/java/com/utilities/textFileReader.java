package com.utilities;
import java.io.*;

//Text File Reader "reads the text file" where the locators are mentioned
public class textFileReader {

 public textFileReader(){


 }

//    public static void main(String args[]) throws IOException {
//        String s=locatorfinder("skip")[2];
//        System.out.println("Hurray" + s);
//
//    }

 public static String[] locatorfinder(String elementname) throws IOException {
     String s[] = new String[0];
     String projectpath = System.getProperty("user.dir");
     File file = new File("./src/test/resources/DigiBoxPageObject/DigiboxPageObjects.txt");
     BufferedReader in=new BufferedReader(new FileReader(file));
     String st;
     Boolean settrue=false;
     while ((st=in.readLine())!=null){
         //System.out.println(st);
         s = st.split(";");
         //System.out.println(s[0]);
         if(s[0].toLowerCase().matches(elementname)){
             //System.out.println(s[1]);
             //System.out.println(s[2]);
            settrue=true;
            break;
         }
     }

     in.close();


    if (settrue=true){
        return s;

    }else {
        return null;
    }


 }
}
