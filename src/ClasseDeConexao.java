import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ClasseDeConexao {
  public static void main(String[] args) throws SQLException {
    String protocolo = "jdbc:mysql://";
    String servidor = "localhost";
    String BD = "bdacademico";
    String usuario = "uacademico";
    String senha = "#Uacad10";

    Connection conexao;
    conexao = DriverManager.getConnection(protocolo+servidor+"/"+BD, usuario, senha);

    System.out.println("Conectado");

    conexao.close();
  }
}