package org.example;

public class StringCalculator {
    public static int add(String o) {
        if(o==null || "".equals(o)) {
            return 0;
        }
         String[] snums =  o.split(",");
        int sum = 0;
        for(String snum: snums)
        {
            //Для того что бы убрать пробелы в стринге в начале и в конце (Trim())
            sum+=Integer.parseInt(snum.trim());
            sum+=Integer.parseInt(snum);
        }
        return sum;

    }
}
