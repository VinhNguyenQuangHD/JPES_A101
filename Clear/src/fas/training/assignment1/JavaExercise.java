package fas.training.assignment1;

import java.util.ArrayList;
import java.util.List;

public class JavaExercise {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        String test = "Java";
        String new_text = "";
        //Sample 1
        for (int i = 0; i < test.length();i++){
            if (String.valueOf(test.charAt(i)) != "v" ){
                new_text = new_text + String.valueOf(test.charAt(i)) + " ";
            }else
            {
                new_text = new_text + String.valueOf(test.charAt(i)) + " v ";
            }
        }
        list.add(new_text);
        System.out.print(list.get(0));


    }
}
