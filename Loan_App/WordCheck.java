package pl.pjatk;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCheck {
    public boolean StringIsValid(String txt){

        Pattern special= Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Pattern number = Pattern.compile("[0-9]", Pattern.CASE_INSENSITIVE);
        Matcher matcherSpecial = special.matcher(txt);
        Matcher matcherNumber = number.matcher(txt);

        boolean constainsSymbols = matcherSpecial.find();
        boolean containsNumber = matcherNumber.find();

        if(constainsSymbols == true){
            return false;
        }
        else if(containsNumber == true){
            return false;
        }
        else{
            return true;
        }
    }

    public boolean PeselIsValid(String txt){

        if(txt.matches("[0-9]+")) {
            if(txt.length() == 11) return true;
            else {
                System.out.println("Please enter 11 digits.");
                return false;
            }
        }
        else {
            System.out.println("Please use only digits!");
            return false;
        }
    }
}
