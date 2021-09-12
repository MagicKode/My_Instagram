package adminka.servlets.user;

import adminka.entity.User;
import adminka.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/deleteUser")
public class DeleteUserServlet extends HttpServlet {

    private final UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        User userByLogin = userService.getUserByLogin(login);
        req.setAttribute("user", userByLogin);
        getServletContext().getRequestDispatcher("/pages/user/deleteUser.jsp").forward(req,resp);
    }
}
