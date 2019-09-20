//package domain;
//
//public class Test {
//
//    public static void main(String[] args) {
////        regionmatches
//        String name="<body>as <as>dfg</body>";
//        String[] command={"<body>","<html>","</body>"};
//        System.out.println("first String:"+ name);
//        StringBuffer sb=new StringBuffer(name);
//        String vr="";
//        int elFirst=-1;
//        int elLast=-1;
//        for(int j=0;j<sb.length();j++){
//            if(sb.charAt(j)=='<'){
//                elFirst=j;
//            }
//            if(sb.charAt(j)=='>' && elFirst!=-1){
//                elLast=j;
//
//            }
//            if(elFirst!=-1){
//                vr=vr+sb.charAt(j);
//            }
//            if(elFirst!=-1 && elLast!=-1){
//                for(String s:command){
//                    if(s.equals(vr)){
//                        sb.delete(elFirst,elLast+1);
//                        elFirst=-1;
//                        elLast=-1;
//                        j=0;
//                        vr="";
//                    }
//                }
//                elFirst=-1;
//                elLast=-1;
//                vr="";
//            }
//        }
//        System.out.println("Second String: "+ sb.toString());
//    }
//}
