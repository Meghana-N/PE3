import java.util.ArrayList;
import java.util.List;

public class VowelRemoval {
    public List<String> removeVowel(String[] countries) {
        List<String> country = new ArrayList<>();
        for (int i=0;i<countries.length;i++) {
            String name="";
            for(char c:countries[i].toCharArray()) {
                if(Character.isLetter(c)) {
                    if(!(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')) {
                        name = name+c;
                    }
                }
                else {
                    name = name +c;
                }
            }
            country.add(name);
        }
        return country;
    }
}