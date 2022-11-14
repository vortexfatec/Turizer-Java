/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelagem;

import Controle.Conexao;
import java.sql.ResultSet;

/**
 *
 * @author MMRibeir
 */
public class Trilhas {
    
    Conexao conTrilha = new Conexao();
    
    public ResultSet consultar()
    {
        ResultSet tabela;
        tabela = null;
        
        String sql= "Select * from Trilhas";
        tabela = conTrilha.RetornarResultset(sql);
        return tabela;
    }
    
}
