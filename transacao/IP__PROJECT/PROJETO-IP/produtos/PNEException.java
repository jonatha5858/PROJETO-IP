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
public class PNEException extends Exception{
    public PNEException(){
        super("Produto não encontrado");
    }
}
