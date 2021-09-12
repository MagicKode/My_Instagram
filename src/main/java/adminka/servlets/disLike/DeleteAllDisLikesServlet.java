package adminka.servlets.disLike;

import adminka.service.DisLikeService;
import adminka.service.LikeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/deleteAllDisLikes")
public class DeleteAllDisLikesServlet extends HttpServlet {

    private final DisLikeService disLikeService = new DisLikeService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        disLikeService.deleteAllDisLikes();
    }
}
