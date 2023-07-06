package test;
import datastructures.Stack;
import org.junit.*;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class StackTest {



    Stack<Card> cards = new Stack<>();

    public void setup(){
        String[] speciales = {"Jack", "Reina", "Rey"};
        for (int i = 1; i <=10 ; i++) {
            if(i<=3){
                cards.push(new Card("Picas", speciales[i-1]));
                cards.push(new Card("Treboles",speciales[i-1]));
                cards.push(new Card("Corazones", speciales[i-1]));
                cards.push(new Card("Diamantes", speciales[i-1]));
            }
            cards.push(new Card("Picas", i+""));
            cards.push(new Card("Treboles",i+""));
            cards.push(new Card("Corazones", i+""));
            cards.push(new Card("Diamantes", i+""));
        }
    }


    @Test
    public void pushTest(){
        cards.push(new Card("Picas", "10"));
        String result = cards.top.type;
        String result2 = cards.top.draw;
        assertEquals("Picas", result);
        assertEquals("10", result2);
    }

    @Test
    public void pushTestTwoElements(){
        cards.push(new Card("Picas", "10"));
        cards.push(new Card("Corazones", "4"));
        String result = cards.top.type;
        String result2 = cards.top.draw;
        assertEquals("Corazones", result);
        assertEquals("4", result2);
    }
    @Test
    public void peekTestFullStack(){
        setup();
        String result = cards.peek().type;
        String result2 = cards.peek().draw;
        assertEquals("Diamantes", result);
        assertEquals("10", result2);
        assertNotNull(cards.pop());
    }

    @Test
    public void peekTest(){
        cards.push(new Card("Picas", "10"));
        String result = cards.top.type;
        String result2 = cards.top.draw;
        assertEquals("Picas", result);
        assertEquals("10", result2);
        assertNotNull(cards.pop());
    }

    @Test
    public void peekTestTwoElements(){
        cards.push(new Card("Picas", "10"));
        cards.push(new Card("Corazones", "4"));
        String result = cards.peek().type;
        String result2 = cards.peek().draw;
        assertEquals("Corazones", result);
        assertEquals("4", result2);
        assertNotNull(cards.pop());
    }
    @Test
    public void pushTestFullStack(){
        setup();
        String result = cards.top.type;
        String result2 = cards.top.draw;
        assertEquals("Diamantes", result);
        assertEquals("10", result2);
    }

    @Test
    public void popTest(){
        Card expected = new Card("Picas", "10");
        cards.push(expected);
        Card result = cards.pop();
        assertEquals(expected, result);
    }

    @Test
    public void popTestTwoElements(){
        Card expected = new Card("Picas", "10");
        Card expected1 = new Card("Corazones", "4");
        cards.push(expected);
        cards.push(expected1);
        Card result = cards.pop();
        Card result1 = cards.pop();
        assertEquals(expected1, result);
        assertEquals(expected, result1);
    }

    @Test
    public void popTestTooManyElements(){
        setup();
        String expected = "Diamantes";
        String expNum = "10";
        String expected1 = "Corazones";
        String expNum1 = "10";
        String expected2 = "Treboles";
        String expNum2 = "10";
        String expected3 = "Picas";
        String expNum3 = "10";
        String expected4 = "Diamantes";
        String expNum4 = "9";
        String expected5 = "Corazones";
        String expNum5 = "9";
        String expected6 = "Treboles";
        String expNum6 = "9";
        String expected7 = "Picas";
        String expNum7 = "9";
        String expected8 = "Diamantes";
        String expNum8 = "8";
        String expected9 = "Corazones";
        String expNum9 = "8";
        String expected10 = "Treboles";
        String expNum10 = "8";
        String expected11 = "Picas";
        String expNum11 = "8";
        String expected12 = "Diamantes";
        String expNum12 = "7";
        String expected13 = "Corazones";
        String expNum13 = "7";
        String expected14 = "Treboles";
        String expNum14 = "7";
        String expected15 = "Picas";
        String expNum15 = "7";
        String expected16 = "Diamantes";
        String expNum16 = "6";
        String expected17 = "Corazones";
        String expNum17 = "6";
        String expected18 = "Treboles";
        String expNum18 = "6";
        String expected19 = "Picas";
        String expNum19 = "6";
        String expected20 = "Diamantes";
        String expNum20 = "5";
        String expected21 = "Corazones";
        String expNum21 = "5";
        String expected22 = "Treboles";
        String expNum22 = "5";
        String expected23 = "Picas";
        String expNum23 = "5";
        String expected24 = "Diamantes";
        String expNum24 = "4";
        String expected25 = "Corazones";
        String expNum25 = "4";
        String expected26 = "Treboles";
        String expNum26 = "4";
        String expected27 = "Picas";
        String expNum27 = "4";
        String expected28 = "Diamantes";
        String expNum28 = "3";
        String expected29 = "Corazones";
        String expNum29 = "3";
        String expected30 = "Treboles";
        String expNum30 = "3";
        String expected31 = "Picas";
        String expNum31 = "3";
        String expected32 = "Diamantes";
        String expNum32 = "Rey";
        String expected33 = "Corazones";
        String expNum33 = "Rey";
        String expected34 = "Treboles";
        String expNum34 = "Rey";
        String expected35 = "Picas";
        String expNum35 = "Rey";
        String expected36 = "Diamantes";
        String expNum36 = "2";
        String expected37 = "Corazones";
        String expNum37 = "2";
        String expected38 = "Treboles";
        String expNum38 = "2";
        String expected39 = "Picas";
        String expNum39 = "2";
        String expected40 = "Diamantes";
        String expNum40 = "Reina";
        String expected41 = "Corazones";
        String expNum41 = "Reina";
        String expected42 = "Treboles";
        String expNum42 = "Reina";
        String expected43 = "Picas";
        String expNum43 = "Reina";
        String expected46 = "Diamantes";
        String expNum46 = "1";
        String expected47 = "Corazones";
        String expNum47 = "1";
        String expected48 = "Treboles";
        String expNum48 = "1";
        String expected49 = "Picas";
        String expNum49 = "1";
        String expected50 = "Diamantes";
        String expNum50 = "Jack";
        String expected51 = "Corazones";
        String expNum51 = "Jack";
        String expected52 = "Treboles";
        String expNum52 = "Jack";
        String expected53 = "Picas";
        String expNum53 = "Jack";
        Card current = cards.pop();
        assertEquals(expected, current.type);
        assertEquals(expNum, current.draw);
        current = cards.pop();
        assertEquals(expected1, current.type);
        assertEquals(expNum1, current.draw);
        current = cards.pop();
        assertEquals(expected2, current.type);
        assertEquals(expNum2, current.draw);
        current = cards.pop();
        assertEquals(expected3, current.type);
        assertEquals(expNum3, current.draw);
        current = cards.pop();
        assertEquals(expected4, current.type);
        assertEquals(expNum4, current.draw);
        current = cards.pop();
        assertEquals(expected5, current.type);
        assertEquals(expNum5, current.draw);
        current = cards.pop();
        assertEquals(expected6, current.type);
        assertEquals(expNum6, current.draw);
        current = cards.pop();
        assertEquals(expected7, current.type);
        assertEquals(expNum7, current.draw);
        current = cards.pop();
        assertEquals(expected8, current.type);
        assertEquals(expNum8, current.draw);
        current = cards.pop();
        assertEquals(expected9, current.type);
        assertEquals(expNum9, current.draw);
        current = cards.pop();
        assertEquals(expected10, current.type);
        assertEquals(expNum10, current.draw);
        current = cards.pop();
        assertEquals(expected11, current.type);
        assertEquals(expNum11, current.draw);
        current = cards.pop();
        assertEquals(expected12, current.type);
        assertEquals(expNum12, current.draw);
        current = cards.pop();
        assertEquals(expected13, current.type);
        assertEquals(expNum13, current.draw);
        current = cards.pop();
        assertEquals(expected14, current.type);
        assertEquals(expNum14, current.draw);
        current = cards.pop();
        assertEquals(expected15, current.type);
        assertEquals(expNum15, current.draw);
        current = cards.pop();
        assertEquals(expected16, current.type);
        assertEquals(expNum16, current.draw);
        current = cards.pop();
        assertEquals(expected17, current.type);
        assertEquals(expNum17, current.draw);
        current = cards.pop();
        assertEquals(expected18, current.type);
        assertEquals(expNum18, current.draw);
        current = cards.pop();
        assertEquals(expected19, current.type);
        assertEquals(expNum19, current.draw);
        current = cards.pop();
        assertEquals(expected20, current.type);
        assertEquals(expNum20, current.draw);
        current = cards.pop();
        assertEquals(expected21, current.type);
        assertEquals(expNum21, current.draw);
        current = cards.pop();
        assertEquals(expected22, current.type);
        assertEquals(expNum22, current.draw);
        current = cards.pop();
        assertEquals(expected23, current.type);
        assertEquals(expNum23, current.draw);
        current = cards.pop();
        assertEquals(expected24, current.type);
        assertEquals(expNum24, current.draw);
        current = cards.pop();
        assertEquals(expected25, current.type);
        assertEquals(expNum25, current.draw);
        current = cards.pop();
        assertEquals(expected26, current.type);
        assertEquals(expNum26, current.draw);
        current = cards.pop();
        assertEquals(expected27, current.type);
        assertEquals(expNum27, current.draw);
        current = cards.pop();
        assertEquals(expected28, current.type);
        assertEquals(expNum28, current.draw);
        current = cards.pop();
        assertEquals(expected29, current.type);
        assertEquals(expNum29, current.draw);
        current = cards.pop();
        assertEquals(expected30, current.type);
        assertEquals(expNum30, current.draw);
        current = cards.pop();
        assertEquals(expected31, current.type);
        assertEquals(expNum31, current.draw);
        current = cards.pop();
        assertEquals(expected32, current.type);
        assertEquals(expNum32, current.draw);
        current = cards.pop();
        assertEquals(expected33, current.type);
        assertEquals(expNum33, current.draw);
        current = cards.pop();
        assertEquals(expected34, current.type);
        assertEquals(expNum34, current.draw);
        current = cards.pop();
        assertEquals(expected35, current.type);
        assertEquals(expNum35, current.draw);
        current = cards.pop();
        assertEquals(expected36, current.type);
        assertEquals(expNum36, current.draw);
        current = cards.pop();
        assertEquals(expected37, current.type);
        assertEquals(expNum37, current.draw);
        current = cards.pop();
        assertEquals(expected38, current.type);
        assertEquals(expNum38, current.draw);
        current = cards.pop();
        assertEquals(expected39, current.type);
        assertEquals(expNum39, current.draw);
        current = cards.pop();
        assertEquals(expected40, current.type);
        assertEquals(expNum40, current.draw);
        current = cards.pop();
        assertEquals(expected41, current.type);
        assertEquals(expNum41, current.draw);
        current = cards.pop();
        assertEquals(expected42, current.type);
        assertEquals(expNum42, current.draw);
        current = cards.pop();
        assertEquals(expected43, current.type);
        assertEquals(expNum43, current.draw);
        current = cards.pop();
        assertEquals(expected46, current.type);
        assertEquals(expNum46, current.draw);
        current = cards.pop();
        assertEquals(expected47, current.type);
        assertEquals(expNum47, current.draw);
        current = cards.pop();
        assertEquals(expected48, current.type);
        assertEquals(expNum48, current.draw);
        current = cards.pop();
        assertEquals(expected49, current.type);
        assertEquals(expNum49, current.draw);
        current = cards.pop();
        assertEquals(expected50, current.type);
        assertEquals(expNum50, current.draw);
        current = cards.pop();
        assertEquals(expected51, current.type);
        assertEquals(expNum51, current.draw);
        current = cards.pop();
        assertEquals(expected52, current.type);
        assertEquals(expNum52, current.draw);
        current = cards.pop();
        assertEquals(expected53, current.type);
        assertEquals(expNum53, current.draw);
        assertNull(cards.top);
    }

    @Test
    public void clearTest(){
        cards.push(new Card("Picas", "10"));
        cards.clear();
        assertNull(cards.pop());
        assertNull(cards.top);
        assertNull(cards.list);
    }
    @Test
    public void clearTwoElementsTest(){
        cards.push(new Card("Picas", "10"));
        cards.push(new Card("Corazones", "4"));
        cards.clear();
        assertNull(cards.pop());
        assertNull(cards.top);
        assertNull(cards.list);
    }
    @Test
    public void clearTooManyElementsTest(){
        cards.push(new Card("Picas", "10"));
        cards.push(new Card("Corazones", "4"));
        cards.clear();
        assertNull(cards.pop());
        assertNull(cards.top);
        assertNull(cards.list);
    }

    static class Card{
        public Card(String type, String number) {
            this.type = type;
            this.draw = number;
        }
        String type;
        String draw;

    }

}
