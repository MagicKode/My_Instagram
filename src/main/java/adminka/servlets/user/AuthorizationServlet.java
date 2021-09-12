package adminka.servlets.user;

import adminka.entity.User;
import adminka.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AuthorizationServlet", urlPatterns = "/auth")
public class AuthorizationServlet extends HttpServlet {
    private final UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/user/auth.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        User getUserByLogin = userService.getUserByLogin(login);
        if (getUserByLogin != null && getUserByLogin.getLogin().equals(password)){
            req.getSession().setAttribute("user", getUserByLogin);
            resp.sendRedirect(req.getContextPath()+"/profile");
        }else if(getUserByLogin == null || !getUserByLogin.getLogin().equals(password) || !getUserByLogin.getLogin().equals(login)){
            PrintWriter printWriter = resp.getWriter();
            printWriter.write("Please, enter the right login/pass!");
            resp.sendRedirect(req.getContextPath()+"/reg"); // редирект обратно к регистрации, если не находит зарегестрированного профиля

        }
    }
}
