/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.exceptions;

/**
 *
 * @author mellissah.
 */
public class ShoppingControlException extends Exception {

    public ShoppingControlException() {
    }

    public ShoppingControlException(String message) {
        super(message);
    }

    public ShoppingControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShoppingControlException(Throwable cause) {
        super(cause);
    }

    public ShoppingControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
