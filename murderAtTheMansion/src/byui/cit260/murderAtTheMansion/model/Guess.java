/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Sara
 */
public class Guess implements Serializable{
    private double guessNum;
    private String guessIsWrong;
    private String guessIsRight;
    private String guess;

    public Guess() {
    }
    
    

    public double getGuessNum() {
        return guessNum;
    }

    public void setGuessNum(double guessNum) {
        this.guessNum = guessNum;
    }

    public String getGuessIsWrong() {
        return guessIsWrong;
    }

    public void setGuessIsWrong(String guessIsWrong) {
        this.guessIsWrong = guessIsWrong;
    }

    public String getGuessIsRight() {
        return guessIsRight;
    }

    public void setGuessIsRight(String guessIsRight) {
        this.guessIsRight = guessIsRight;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.guessNum) ^ (Double.doubleToLongBits(this.guessNum) >>> 32));
        hash = 41 * hash + Objects.hashCode(this.guessIsWrong);
        hash = 41 * hash + Objects.hashCode(this.guessIsRight);
        hash = 41 * hash + Objects.hashCode(this.guess);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Guess other = (Guess) obj;
        if (Double.doubleToLongBits(this.guessNum) != Double.doubleToLongBits(other.guessNum)) {
            return false;
        }
        if (!Objects.equals(this.guessIsWrong, other.guessIsWrong)) {
            return false;
        }
        if (!Objects.equals(this.guessIsRight, other.guessIsRight)) {
            return false;
        }
        if (!Objects.equals(this.guess, other.guess)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Guess{" + "guessNum=" + guessNum + ", guessIsWrong=" + guessIsWrong + ", guessIsRight=" + guessIsRight + ", guess=" + guess + '}';
    }
    
    
    
}
