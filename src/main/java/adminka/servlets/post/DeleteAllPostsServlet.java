package adminka.servlets.post;

import adminka.service.PostService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/deleteAllPosts")
public class DeleteAllPostsServlet extends HttpServlet {

    private PostService postService = new PostService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        postService.deleteAllPosts();
        resp.sendRedirect("/");
    }
}
