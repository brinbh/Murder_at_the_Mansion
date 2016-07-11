/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.murderAtTheMansion.exceptions;

/**
 *
 * @author Sara
 */
public class puzzleControlException extends Exception{

    public puzzleControlException() {
    }

    public puzzleControlException(String message) {
        super(message);
    }

    public puzzleControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public puzzleControlException(Throwable cause) {
        super(cause);
    }

    public puzzleControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
