package adminka.servlets.like;

import adminka.entity.Like;
import adminka.entity.Post;
import adminka.entity.User;
import adminka.service.LikeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/addLike")
public class AddLikeServlet extends HttpServlet {

    private final LikeService likeService = new LikeService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/like/addLike.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        Post post = (Post) req.getSession().getAttribute("post");
        likeService.addNewLike(new Like(0,"user","post"));
    }
}
