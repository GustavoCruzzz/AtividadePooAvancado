import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashMap<Artigo, Usuarios> ListaArtigos = new HashMap<>();


       Artigo ArtigoTeste = new Artigo();
        Usuarios eu = new Usuarios();
        eu.setSenha("fdgsgdf");
        eu.setLogin("Yuri");
        ArtigoTeste.setAutor(eu);
        ArtigoTeste.setTitulo("Artigo1sobreanimais");
        ListaArtigos.put(ArtigoTeste, eu);


        System.out.println("1. Login");
        System.out.println("2. Listar Conteúdos");
        System.out.println("3. Sair");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();




        switch(a){
            case 1:
                System.out.println("Digite o login e a senha do usuário");
                Scanner b = new Scanner(System.in);
                Scanner c = new Scanner(System.in);
                String login = b.nextLine();
                String senha = c.nextLine();
                Usuarios usuario = new Usuarios();
                usuario.setLogin(login);
                usuario.setSenha(senha);

                System.out.println("Bem vindo " + usuario.getLogin() + " Escolha uma das opções a seguir: ");
                System.out.println("1. Criar Conteúdo");
                System.out.println("2. Listar Conteúdo");
                System.out.println("3. Atualizar Conteúdo");
                System.out.println("4. Excluir Conteúdo");
                System.out.println("5. Logout");

                break;

            case 2: ListaArtigos.forEach((Artigo, Usuarios) -> System.out.println(Artigo.getTitulo() + " " + Artigo.autor.getLogin()));
                System.exit(0);
            break;

            case 3: System.exit(0);
            break;

        }






    }



public static class Usuarios{

private String login;
private String senha;

public String getLogin() {return login;}
public void setLogin(String login) {this.login = login;}

public String getSenha() {return senha;}
public void setSenha(String senha) {this.senha = senha;}






public void AdicionarConteúdo(HashMap<Artigo, Usuarios> listaArtigo, String NovoTitulo, String NovoConteudo, Usuarios autor){

Artigo novoartigo = new Artigo();
novoartigo.setTitulo(NovoTitulo);
novoartigo.setConteudo(NovoConteudo);
novoartigo.setAutor(autor);
listaArtigo.put(novoartigo, autor);

}

public void AtualizarConteúdo(){

}

public void ExcluirConteúdo(){

}

}

public static class Artigo{

private Usuarios autor;
private String titulo;
private String conteudo;

public String getTitulo() {return titulo;}
public void setTitulo(String titulo) {this.titulo = titulo;}

public String getConteudo() {return conteudo;}
public void setConteudo(String conteudo) {this.conteudo = conteudo;}

public Usuarios getAutor() {return autor;}
public void setAutor(Usuarios autor) {this.autor = autor;}
}
}