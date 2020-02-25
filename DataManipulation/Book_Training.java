package DataManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class Book_Training {
    public static void main(String[] args) throws IOException {
        System.out.println(Math.floor(3.22));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String oldDate = reader.readLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Calendar c = Calendar.getInstance();
        try {
            c.setTime(simpleDateFormat.parse(oldDate));
        }catch (ParseException pa){
            pa.getCause();
        }
        c.add(Calendar.DAY_OF_MONTH, 999);
        String newDate = simpleDateFormat.format(c.getTime());
        System.out.println(newDate);
    }


}

