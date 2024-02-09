package ds.project1task2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "submit", urlPatterns = {"/submit"})
public class ClickerServlet extends HttpServlet {
    private Map<String, Integer> results = new HashMap<>();
    private final String[] options = {"A", "B", "C", "D"};
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String answer = request.getParameter("answer");
        System.out.println("Your answer is" + request.getParameter("answer"));
        if (answer != null && !answer.isEmpty()) {
            results.put(answer, results.getOrDefault(answer, 0) + 1);
//            request.setAttribute("answer", answer);
        }
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getServletPath().equals("/getResults")) {

            request.setAttribute("results", results);
            request.setAttribute("options", options);
            request.getRequestDispatcher("/results.jsp").forward(request, response);
            results.clear(); // Clear the stored results
        } else {

            response.getWriter().println("Your \"" + request.getParameter("answer") +"\"has been registered");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }
}
