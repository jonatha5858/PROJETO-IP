/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

/**
 *
 * @author mas8
 */
// exeção produto já cadastrado

public class PJCException extends Exception {
    public PJCException() {
        super("Esse codigo ja esta em uso");
    }    
}
