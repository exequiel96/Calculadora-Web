package mx.com.web;

import java.io.IOException;
import java.io.Serializable;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.com.domain.Calculadora;
import mx.com.operaciones.OperacionesImpl;

@WebServlet("/miServlet")

public class Servlet extends HttpServlet implements Serializable {

    public static final long SerialVersionUID = 1L;

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        OperacionesImpl operacion = new OperacionesImpl();
        Calculadora calculadora1 = new Calculadora();
        double numero1 = Double.parseDouble(request.getParameter("numero1"));
        double numero2 = Double.parseDouble(request.getParameter("numero2"));
        request.setAttribute("numero1", numero1);
        request.setAttribute("numero2", numero2);
        double resultadoSuma = operacion.suma(numero1, numero2);
        double resultadoResta = operacion.resta(numero1, numero2);
        double resultadoMultiplicacion = operacion.multiplicacion(numero1, numero2);
        double resultadoDivision = operacion.division(numero1, numero2);
        //String error = "Falto introducir un numero";

        String opcion = "";
        opcion = request.getParameter("operacion");

        switch (opcion) {
            case "suma":
                calculadora1.setResultado(resultadoSuma);
                request.setAttribute("calculadora1", calculadora1.getResultado());
                break;
            case "resta":
                calculadora1.setResultado(resultadoResta);
                request.setAttribute("calculadora1", calculadora1.getResultado());
                break;
            case "multiplicacion":
                calculadora1.setResultado(resultadoMultiplicacion);
                request.setAttribute("calculadora1", calculadora1.getResultado());
                break;
            case "division":
                calculadora1.setResultado(resultadoDivision);
                request.setAttribute("calculadora1", calculadora1.getResultado());
                break;
            default:
                break;
        }

        RequestDispatcher respuesta = request.getRequestDispatcher("/index.jsp");

        respuesta.forward(request, response);
    }
}
