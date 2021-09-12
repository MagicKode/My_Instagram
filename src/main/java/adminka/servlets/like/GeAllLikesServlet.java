package adminka.servlets.like;

import adminka.service.LikeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/getAllLikes")
public class GeAllLikesServlet extends HttpServlet {

    private final LikeService likeService = new LikeService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/like/getAllLikes.jsp").forward(req, resp);
    }
}
