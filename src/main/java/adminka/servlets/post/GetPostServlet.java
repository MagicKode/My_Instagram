package adminka.servlets.post;

import adminka.entity.Post;
import adminka.service.PostService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/getPost")
public class GetPostServlet extends HttpServlet {

    private final PostService postService = new PostService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        Post postByUser = postService.getPostByUser(title);
        req.setAttribute("post", postByUser);
        getServletContext().getRequestDispatcher("/pages/post/getPost.jsp").forward(req, resp);
    }
}
