package com.techelevator;

import java.util.Locale;

public class CaseInsensitiveSearcher {

    public boolean caseInsensitiveSearcher(String line, String word) {
        boolean result = false;
        String allLowerCase = word.toLowerCase();
        String firstLetterCap = word.substring(0, 1).toUpperCase() + allLowerCase.substring(1);
        if(line.contains(allLowerCase) || line.contains(firstLetterCap)) {
            result = true;
        }
        return result;
    }
}
