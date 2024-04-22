package src.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;

import src.exceptions.UncorrectDataException;

/**
 * Validator class is used to validate data input.
 * It includes methods to check if the name is in Cyrillic and if the date of birth is in a correct format and valid.
 */
public class Validator {

    /**
     * Method to validate the input data.
     * It checks if the name is in Cyrillic and date of birth is in a correct format and valid.
     *
     * @param data the array of data to be validated
     * @throws UncorrectDataException if the input data is incorrect
     */
    public void validate(String[] data){

        StringBuilder stringBuilder = new StringBuilder();
        boolean flag = true;
        for(int i = 0; i < data.length; i++){
            try{

                if(i == 0){
                    checkValidName(data[i]);
                }if(i == 1){
                    checkValidDate(data[i]);
                }

            }catch(UncorrectDataException ex){

                stringBuilder.append("\n");
                stringBuilder.append(ex.getMessage());
                flag = false;
            }

            if(flag == false){
                throw new UncorrectDataException(stringBuilder.toString());
            }
        }

    }

    /**
     * Method to check if the name is in Cyrillic.
     *
     * @param name the name to be checked
     * @return true if the name is in Cyrillic
     * @throws UncorrectDataException if the name contains non-Cyrillic characters
     */
    private boolean checkValidName(String name){

        for(int i = 0; i < name.length(); i++){
            if (! Character.UnicodeBlock.of(name.charAt(i)).equals(Character.UnicodeBlock.CYRILLIC)) {
                throw new UncorrectDataException(String.format("некорректно задано имя, допустимы только буквы кириллицы"));
            }
        }

        return true;

    }

    /**
     * Method to check if the date of birth is in correct format and valid.
     *
     * @param dateOfBirth the date of birth to be checked
     * @return true if the date of birth is in correct format and valid
     * @throws UncorrectDataException if the date of birth is in incorrect format or not valid
     */
    private boolean checkValidDate(String dateOfBirth){


        LocalDate date;
        Integer [] month_30 = {4, 6, 9, 11};
        int day;
        
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            date = LocalDate.parse(dateOfBirth, formatter);
            day = date.getDayOfMonth();

        } catch (DateTimeParseException e) {
            throw new UncorrectDataException("некорректный формат даты");
        }
        
        if ((Arrays.asList(month_30).contains(date.getMonthValue()) && day > 30) ||
                (date.isLeapYear() && date.getMonthValue() == 2 && day > 29) ||
                (!date.isLeapYear() && date.getMonthValue() == 2 && day > 28)) {
            
            throw new UncorrectDataException("введена некорректная дата рождения");
            
        } else 
            return true;
    }
}
