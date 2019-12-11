/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheets;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Kalvakuri,Lakshmi Seshu
 */
public class Map03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        HashMap<String,Integer> textMap = new HashMap<>();
        Scanner myScanner = new Scanner(new File("words.txt"));
        while(myScanner.hasNext())
		{
			String word = myScanner.next();
			Integer count = textMap.get(word);
			if(count == null)
			{
				textMap.put(word, 1);
			}
			else
			{
				textMap.put(word, count + 1);
			}
		}
		System.out.println(textMap);
		
		System.out.println("Number of distinct words: " + textMap.size());
		
		int maxCount = 0;
		String maxWord = null;
		for(String word: textMap.keySet())
		{
			if(textMap.get(word) > maxCount)
			{
				maxCount = textMap.get(word);
				maxWord = word;
			}
		}
		System.out.println("Most frequently occurring word: " + maxWord);
      
    
    }
}
