/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelagem;

import Controle.Conexao;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author MMRibeir
 */
public class Guia {
    
    private String nome;
    private String sobrenome;
    private String email;
    private String senha;
    private int id;
    
    Conexao conGuia = new Conexao();

    public Guia() {
        this("","","","");
    }

    public Guia(String nome, String sobrenome, String email, String senha) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    
    public void gravar()
    {
        String sql;
        sql = "Insert into Guia(Nome,Sobrenome,Email,Senha) values" + 
                "('"+ this.getNome()+"','"+this.getSobrenome()+"','"+this.getEmail()+"','"+this.getSenha()+"' )";
        conGuia.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro gravado com sucesso...");
    }
    
    public ResultSet consultar()
    {
        ResultSet tabela;
        tabela = null;
        
        String sql = "Select * from Guia";
        tabela = conGuia.RetornarResultset(sql);
        return tabela;
    }
    
    public void excluir()
    {
        String sql;
        sql = "delete from Guia where Id=" + "'" + this.getId()+ "'";
        conGuia.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!");
    }
    
    public void alterar()
    {
        String sql;
        sql = "update Guia set nome='" + this.getNome() +"' , sobrenome='" + this.getSobrenome() + "' , " + "email='" 
                + this.getEmail() + "' , " + "senha='" + this.getSenha() + "' where Id='" + this.getId()+ "'";
        conGuia.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!"); 
    }
}
