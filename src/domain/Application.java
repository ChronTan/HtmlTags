package domain;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class Application {

    public static void main(String[] args) throws IOException {

        Application app=new Application();
        File file1 = new File("htmlFile.txt");
        File file2 = new File("simpleFile.txt");
        PrintWriter pw=new PrintWriter(file2);
        BufferedReader br=new BufferedReader(new FileReader(file1));
        String s="";
        while((s=br.readLine())!=null){
            pw.println(app.oper(s));
        }
        br.close();
        pw.close();

    }

    public String oper(String name){
        String[] command={"<html>","</html>","<body>","</body>","<head>","</head>",
                "<title>","</title>","<!DOCTYPE html>","<h1>","</h1>","<p>","</p>","<meta charset=\"utf-8>"};
        StringBuffer sb=new StringBuffer(name);
        String oldTag="";
        String tag="";
        int count=0;
        int elFirst=-1;
        int elLast=-1;
        for(int j=0;j<sb.length();j++){
            if(sb.charAt(j)=='"'){
                for(int m=j;m<sb.length();m++){
                    if(sb.charAt(m)=='"')
                        count=m;
                }
                j=count;
            }
            if(sb.charAt(j)=='<'){
                elFirst=j;
            }
            if(sb.charAt(j)=='>' && elFirst!=-1){
                elLast=j;

            }
            if(elFirst!=-1){
                tag=tag+sb.charAt(j);
            }
            if(elFirst!=-1 && elLast!=-1){
                for(String s:command){
                    if(s.equals(tag)){
                        sb.delete(elFirst,elLast+1);
                        elFirst=-1;
                        elLast=-1;
                        j=0;
//                        oldTag=oldStr(tag);
                        tag="";
                    }
                }
                elFirst=-1;
                elLast=-1;
//                oldTag=oldStr(tag);
                tag="";
            }
        }
        return sb.toString();
    }

    public String oldStr(String str){
        StringBuffer sBuf=new StringBuffer(str);
        for(int l=0;l<sBuf.length();l++){
            if(sBuf.charAt(l)=='<' && sBuf.charAt(l+1)!='/'){
                sBuf.insert(l+1,'/');
            }
        }
        String st=new String(sBuf);
        return st;
    }
}
