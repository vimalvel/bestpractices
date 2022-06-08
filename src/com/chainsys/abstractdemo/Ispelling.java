package com.chainsys.bestPractices.abstractdemo;

public interface Ispelling {
    
    void spellCheck(String word); // must be implemented by all languages
    void checkGrammar(String sentence); // must be implemented by all languages
    int wordCount(String sentence); // the logic is the same for all language
    
}
abstract class Language implements Ispelling{
@Override
public int wordCount(String sentence) {
 String [] words= sentence.split(" ");
 return words.length;
}
}
class EnglishLanguage extends Language implements Ispelling
{

@Override
public void spellCheck(String word) {
 System.out.println("English spellchecker");
}

@Override
public void checkGrammar(String sentence) {
 System.out.println("English checkGrammar");
}



}
class TamilLanguage extends Language implements Ispelling
{

@Override
public void spellCheck(String word) {
 System.out.println("Tamil spellchecker");
}

@Override
public void checkGrammar(String sentence) {
 System.out.println("Tamil checkGrammar");
}

}
class FrenchLanguage extends Language implements Ispelling
{

@Override
public void spellCheck(String word) {
 System.out.println("French spellchecker");
}

@Override
public void checkGrammar(String sentence) {
 System.out.println("French checkGrammar");
}

}