package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Produtos;

@WebServlet(urlPatterns = "/Cadastro")
public class CadastroServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String descricao = request.getParameter("descricao");
        String categoria = request.getParameter("categoria");
        String precoStr = request.getParameter("preco").replace(",", ".");
        Double preco = Double.parseDouble(precoStr);
        
        Produtos produto = new Produtos();
        produto.setDescricao(descricao);
        produto.setCategoria(categoria);
        produto.setPreco(preco);
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String html = "<html>" 
        + "<head><title>Cadastro Realizado</title>"
        + "<link rel='stylesheet' href='style.css'></head>"
        + "<body>"
        + "<ul>"
        + "<li>Descrição: " + produto.getDescricao() + "</li>"
        + "<li>Categoria: " + produto.getCategoria() + "</li>"
        + "<li>Preço: " + produto.getPreco() + "</li>"
        + "</ul>"
        + "<p>Cadastro realizado com sucesso!</p>"
        + "<a href='index.html'>Voltar</a>"
        + "</body>"
        + "</html>";
        out.write(html);
    }
}