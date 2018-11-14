package week10;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class Task1 {
    public List<String> getAllFunctions(File path){
        List<String > list=new ArrayList();
        try (Scanner sc =new Scanner(path)){
            while(sc.hasNext())
            {
                String st= sc.nextLine();
                if(st.indexOf('=')==-1 && st.indexOf("static")!=-1){
                    if(st.endsWith(")")||st.endsWith("{")){

                        int dauNgoac=1;
                        while(dauNgoac!=0){
                            String s= sc.nextLine();
                            st=st+"\n"+s;
                            if(s.indexOf('{')!=-1)
                                dauNgoac++;
                            if(s.indexOf('}')!=-1)
                                dauNgoac--;
                        }
                        list.add(st);
                    }

                }

            }
        } catch (Exception e) {
        }
        return list;
    }
    public String findFunctionByName(String name){
        List<String> list= new ArrayList<String>();
        File path= new File("C:\\Users\\HieuM\\Desktop\\oop2018-master\\src\\week9\\Utils.java");
        list=new Task1().getAllFunctions(path);
        String nameFunction= name.substring(0,name.indexOf('('));
        String[] listParameter= name.substring(name.indexOf('(')+1, name.indexOf(')')).split(",");
        for(String l:list){
            if(l.contains(nameFunction)){

                boolean ok=true;
                String[] parameter=l.substring(l.indexOf('(')+1,l.indexOf(')')).split(",");
                for(int i=0;i<parameter.length;i++){
                    parameter[i]=parameter[i].trim();
                    if(parameter[i].indexOf(' ')!=-1)
                        parameter[i]=parameter[i].substring(0,parameter[i].indexOf(' '));

                }

                if(parameter.length==listParameter.length){
                    for(int j=0;j<parameter.length;j++){
                        if(!parameter[j].equals(listParameter[j]))
                            ok=false;
                    }

                }
                else
                    ok=false;
                if(ok==true)
                    return "l";


            }
        }
        return null;
    }

}
