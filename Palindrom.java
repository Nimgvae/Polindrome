package Egorov_1602;

import java.util.*;

/*
      Метод, который генерит слова заглавными буквами,
      используя 5 букв
      Написать метод который добавляет в лист 1000 слов
      Написать метод который принимает Лист и проверяет каждое слово
      на палиндром
      Вывод на экран СЛОВО : Палиндром/НЕ Палиндром
**/
public class Palindrom {
    public static final int wordlen = 5;
    public static final int wordsnumb=1000;

    public static void main(String[] args) {
        ArrayList<String> list = wordsGenerator();
        checkPolindrome(list);


    }
    public static ArrayList<String> wordsGenerator(){
        int llimit = 97; // letter 'a'
        int rlimit = 122; // letter 'z'
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<wordsnumb;i++){
            String generatorword = random.ints(llimit, rlimit+1).limit(wordlen).
                    collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString().toUpperCase();
            list.add(generatorword);
        }
        return list;
    }
    public static void checkPolindrome(ArrayList<String> list){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<wordsnumb;i++){
            StringBuilder temp = new StringBuilder(list.get(i));
            temp =temp.reverse();
            if(list.get(i).equals(String.valueOf(temp))){
                System.out.println("Слово "+ list.get(i)+" >>>>> полиндромно<<<<<");
                continue;
            }
            else System.out.println("Слово " + list.get(i)+" не полимдрон");
        }

    }
}
