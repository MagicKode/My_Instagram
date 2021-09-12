package adminka.servlets.user;

import adminka.entity.User;
import adminka.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/updateName")
public class UpdateNameServlet extends HttpServlet {

    private final UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/user/updateName.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = ((User) req.getSession().getAttribute("user"));
        int id = user.getId();
        String name = req.getParameter("name");
        userService.updateUserName(id, name);
        resp.sendRedirect(req.getContextPath()+"/profile");
    }
}
