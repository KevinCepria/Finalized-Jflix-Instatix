// 
// Decompiled by Procyon v0.5.30
// 

package src.cpeprog;

import java.util.Random;

public class PassCode
{
    private String first;
    private String second;
    private String third;
    private String fourth;
    private String fifth;
    private String sixth;
    private String CODE;
    
    private String RNG() {
        String temp = null;
        final Random Rangen = new Random();
        final int RanNum = Rangen.nextInt(37);
        switch (RanNum) {
            case 0: {
                temp = "0";
                break;
            }
            case 1: {
                temp = "0";
                break;
            }
            case 2: {
                temp = "1";
                break;
            }
            case 3: {
                temp = "1";
                break;
            }
            case 4: {
                temp = "2";
                break;
            }
            case 5: {
                temp = "2";
                break;
            }
            case 6: {
                temp = "3";
                break;
            }
            case 7: {
                temp = "3";
                break;
            }
            case 8: {
                temp = "4";
                break;
            }
            case 9: {
                temp = "4";
                break;
            }
            case 10: {
                temp = "5";
                break;
            }
            case 11: {
                temp = "5";
                break;
            }
            case 12: {
                temp = "6";
                break;
            }
            case 13: {
                temp = "6";
                break;
            }
            case 14: {
                temp = "7";
                break;
            }
            case 15: {
                temp = "7";
                break;
            }
            case 16: {
                temp = "8";
                break;
            }
            case 17: {
                temp = "8";
                break;
            }
            case 18: {
                temp = "9";
                break;
            }
            case 19: {
                temp = "9";
                break;
            }
            case 20: {
                temp = "0";
                break;
            }
            case 21: {
                temp = "0";
                break;
            }
            case 22: {
                temp = "A";
                break;
            }
            case 23: {
                temp = "B";
                break;
            }
            case 24: {
                temp = "C";
                break;
            }
            case 25: {
                temp = "D";
                break;
            }
            case 26: {
                temp = "E";
                break;
            }
            case 27: {
                temp = "F";
                break;
            }
            case 28: {
                temp = "G";
                break;
            }
            case 29: {
                temp = "H";
                break;
            }
            case 30: {
                temp = "I";
                break;
            }
            case 31: {
                temp = "J";
                break;
            }
            case 32: {
                temp = "K";
                break;
            }
            case 33: {
                temp = "L";
                break;
            }
            case 34: {
                temp = "M";
                break;
            }
            case 35: {
                temp = "N";
                break;
            }
            case 36: {
                temp = "O";
                break;
            }
            case 37: {
                temp = "P";
                break;
            }
            case 38: {
                temp = "Q";
                break;
            }
            case 39: {
                temp = "R";
                break;
            }
            case 40: {
                temp = "S";
                break;
            }
            case 41: {
                temp = "T";
                break;
            }
            case 42: {
                temp = "U";
                break;
            }
            case 43: {
                temp = "V";
                break;
            }
            case 44: {
                temp = "W";
                break;
            }
            case 45: {
                temp = "X";
                break;
            }
            case 46: {
                temp = "Y";
                break;
            }
            case 47: {
                temp = "Z";
                break;
            }
        }
        return temp;
    }
    
    public PassCode() {
        this.first = this.RNG();
        this.second = this.RNG();
        this.third = this.RNG();
        this.fourth = this.RNG();
        this.fifth = this.RNG();
        this.sixth = this.RNG();
        this.CODE = String.valueOf(this.first) + this.second + this.third + this.fourth + this.fifth + this.sixth;
    }
    
    public String getCode() {
        return this.CODE;
    }
}
