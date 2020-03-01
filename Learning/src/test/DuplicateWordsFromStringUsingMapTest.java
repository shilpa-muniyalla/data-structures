package test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.shil.DuplicateWordsFromStringUsingMap;

public class DuplicateWordsFromStringUsingMapTest {
	
	DuplicateWordsFromStringUsingMap duplicateWords = new DuplicateWordsFromStringUsingMap();
	
	@Test
     public void testDuplicateWordsFromStringUsingMap() {
    	Map<String,Integer> map=duplicateWords.findDuplicateWordsFromStringUsingMap("my java java");
        Assert.assertEquals(new Integer(2),map.get("java"));
     
     }
	
	@Test
	public void testNODuplicateWordsFromStringUsingMap() {
		Map<String,Integer> map=duplicateWords.findDuplicateWordsFromStringUsingMap("my java java");
		Assert.assertEquals(null, map.get("my"));
	}
	
	@Test
	public void testZeroDuplicateWordsFromStringUsingMap() {
		Map<String,Integer> map=duplicateWords.findDuplicateWordsFromStringUsingMap(null);
		Assert.assertEquals(0, map.size());
	}
}
