package com.emergentes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Libro {

    private int id;
    private String isbn;
    private String titulo;
    private String categoria;
    
    public Libro()
    {   
    }

    public Libro(int id, String isbn, String titulo, String categoria) {
        this.id = id;
        this.isbn = isbn;
        this.titulo = titulo;
        this.categoria = categoria;
    }
    
    public Libro(String isbn, String titulo, String categoria) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.categoria = categoria;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void insertar() {
        ConexionDB canal = new ConexionDB();
        String consultaSQL = "insert into libros (isbn,titulo,categoria) values ";
        consultaSQL += "('" + isbn + "','" + titulo + "','" + categoria + "')";
        canal.modificarRegistro(consultaSQL);
    }

    public static List<Libro> getAll() {
        String consultaSQL = "select * from libros";
        ConexionDB canal = new ConexionDB();
        ResultSet rs = canal.seleccionarRegistros(consultaSQL);
        ArrayList<Libro> lista = new ArrayList<Libro>();
        try {
            while (rs.next()) {
                lista.add(new Libro(Integer.parseInt(rs.getString("id")), 
                        rs.getString("isbn"), rs.getString("titulo"), rs.getString("categoria")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

    public void Eliminar(String id) {
        ConexionDB canal = new ConexionDB();
        String consultaSQL = "delete from libros where id = " + id;
        canal.modificarRegistro(consultaSQL);
    }
}
