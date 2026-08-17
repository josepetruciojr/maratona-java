package br.com.josepetruciojr.javacore.Wnio;

import java.io.IOException;
import java.nio.file.*;

public class PathTeste02 {
    public static void main(String[] args) throws IOException {
        //o metodo createDirectories não lança exceção se a pasta ja existir ele ignora e continua
        //somente o metodo createDirectory lança a exceção se a pasta ja existir
        Path pastaPath = Paths.get("pasta");

        //aqui eu testo se o arquivo não existe com o notExists, caso ele exista o programa continua, caso nao ele cria file ou diretorio
        //se eu testar com o o exist ele me retorna uma exceção caso exista a pasta
        if(Files.notExists(pastaPath)) {
            Path pathDiretorio = Files.createDirectory(pastaPath);
        }

        //aqui eu crio diversas pastas/subpastas utilizando o createDirectories se eu tentar no createDirectory eu lançaria uma exceção
        Path pathPastas = Paths.get("pasta/subpasta/subsubpasta");
        Path pathDiretorios = Files.createDirectories(pathPastas);

        //aqui eu crio um arquivo, usando um varargs pasando um path para toString e pasando o arquivo para o diretorio
        Path filePath = Paths.get(pathPastas.toString(), "fileDentroDaPasta.txt");

        //aqui para nao retornar uma exceção caso o arquivo exista eu testo com o notExists
        if(Files.notExists(filePath)) {
            Files.createFile(filePath);
        }

        //aqui eu copio um o conteudo do arquivo e jogo em um arquivo renomeado
        Path origem = Paths.get(filePath.getParent().toString(), "fileDentroDaPasta.txt");
//        desta forma aqui eu retorno uma exceção pois ele não encontra o arquivo e tenta buscar o arquivo ja renomeado
//        Path destino = Paths.get(filePath.toString(), "fileDentroDaPastaRenomeado.txt");
        //ele me traz um arquivo novo dentro da pasta com o conteudo da origem
        Path destino = Paths.get(filePath.getParent().toString(), "fileDentroDaPastaRenomeado.txt");

        //aqui para nao retornar uma exceção caso o arquivo ja exista, o metodo estatico StandardCopyOption ele copia e substitui o texto dentro do arquivo
        //aqui esse metodo copy é sobrecarregado, chama a interface Copy para checar os metodos
        Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);

    }
}
