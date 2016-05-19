
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ujjwal
 */
public class DataExtract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        BufferedReader reader = new BufferedReader(new FileReader("/home/ujjwal/random.txt"));
        String line = "";
        List<String> collect = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            if (line != null) {
                
                String co = line.replaceAll("\\W", " ");
                collect.add(co);

            }
        }
        int sum = 0;
                for (String i : collect) {
                    String j = i.replaceAll("\\s+", " ").trim();
                    String[] arr = j.split(" ");
                    for(int k = 0; k<arr.length; k++){
                        System.out.println(arr[k]);
                        if(k == 2){
                            sum = sum + Integer.parseInt(arr[2]);
                        }
                    }
                }
        System.out.println("The total sum of his salary is"+ sum);
            

        }
    }

