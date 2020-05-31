package com.unaj.lescano.BD;

import java.sql.*;
import java.util.Arrays;
import java.util.List;

import com.unaj.lescano.collection.Libro;

public class Init {

	public static void main(String[] args) throws Exception {
		List<Libro> listaLibros = Arrays.asList(new Libro("Nicolas", "Java anavzado", 100), new Libro("Cristian", "Java desde cero", 50),
				new Libro("Damian", "Git desde cero", 25));

		Statement statement = null;
		Connection connection = null;
		ResultSet rs = null;
		try {
			connection = ConexionBD.mysqlConexion();
			statement = connection.createStatement();
			insertLibros(connection, listaLibros);

			rs = statement.executeQuery("SELECT * FROM test.libro");
			
			verLibros(rs);

		} catch (Exception e) {
			System.out.print("Excepcion: " + e);
		} finally {
			rs.close();
			statement.close();
			connection.close();

		}
	}

	private static void insertLibros(Connection connection, List<Libro> listaLibros) {
		listaLibros.forEach(libro -> {
			PreparedStatement preparedStatement;
			try {
				preparedStatement = connection.prepareStatement("insert into test.libro (autor ,titulo , valor) values(?, ?, ?)");
				preparedStatement.setString(1, libro.getAutor());
				preparedStatement.setString(2, libro.getTitulo());
				preparedStatement.setInt(3, libro.getValor());

				preparedStatement.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			}

		});
	}

	private static void verLibros(ResultSet rs) {

		try {
			while (rs.next()) {
				System.out.println(String.join(" ", "Autor:", rs.getString("autor"), "Titulo:", rs.getString("titulo")));
			}
		} catch (Exception e) {
		}

	}
}
