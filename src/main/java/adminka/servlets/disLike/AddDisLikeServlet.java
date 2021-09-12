package adminka.servlets.disLike;

import adminka.entity.DisLike;
import adminka.entity.Post;
import adminka.entity.User;
import adminka.service.DisLikeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/addDisLike")
public class AddDisLikeServlet extends HttpServlet {

    private final DisLikeService disLikeService = new DisLikeService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/disLike/addDisLike.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        Post post = (Post) req.getSession().getAttribute("post");
        disLikeService.AddDisLike(new DisLike(0,"user","post"));
    }
}
