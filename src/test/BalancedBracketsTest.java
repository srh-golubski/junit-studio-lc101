package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import main.BalancedBrackets;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //Test 1: str = "[][][][][]" returns true
    @Test
    public void testBalancedBracket1() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][][]"));
    }

    //Test 2: string with no brackets returns true
    @Test
    public void testBalancedBracket2() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Cat Dog"));
    }

    //Test 3: empty string returns true
    @Test
    public void testBalancedBracket3() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    //Test 4: string with two left, then two right (nested pair) brackets returns true
    @Test
    public void testBalancedBracket4() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[LaunchCode]]"));
    }

    //Test 5: string with "[" as first character and "]" as last character returns true
    @Test
    public void testBalancedBracket5() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    //Test 6: string with left and right brackets (in order) in middle of string returns true
    @Test
    public void testBalancedBracket6() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    //Test 7: string that starts with left and right bracket (in order) returns true
    @Test
    public void testBalancedBracket7() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    //Test 8: single bracket with no characters returns false
    @Test
    public void testBalancedBracket8() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    //Test 9: string with a single bracket returns false
    @Test
    public void testBalancedBracket9() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Andie]"));
    }

    //Test 10: string with two left brackets and three right brackets returns false
    @Test
    public void testBalancedBracket10() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[a[b]c]d]"));
    }

    //Test 11: string ending with left bracket returns false
    @Test
    public void testBalancedBracket11() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]abcd]["));
    }

    //Test 12: string starting with right bracket returns false
    @Test
    public void testBalancedBracket12() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][abcd[]"));
    }
}
