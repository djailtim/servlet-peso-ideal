import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/*
Criar uma classe chamada PesoIdelServlet que na sua execução recebe o sexo (com as opções
“M” ou “F” para Masculino ou Feminino), a altura da pessoa e retorna na saída o peso ideal para a pessoa.
a.	Os cálculos para peso ideal de homem e mulher são os seguintes:
i.	Para homens = ( 72.7 * altura) - 58;
ii.	Para mulheres = ( 62.1 * altura) - 44.7;
 */

@WebServlet(name = "PesoIdealServlet", urlPatterns = "/pesoIdeal")

public class PesoIdealServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sexo = req.getParameter("sexo");
        String altura = req.getParameter("altura");
        double pesoIdeal;

        if (sexo.equalsIgnoreCase("M")) pesoIdeal = (72.7 * Double.parseDouble(altura)) - 58;
        else pesoIdeal = (62.1 * Double.parseDouble(altura)) - 44.7;

        req.setAttribute("pesoIdeal", String.format("%.2f Kg", pesoIdeal));
        resp.setHeader("pesoIdeal", String.format("%.2f Kg", pesoIdeal));
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
