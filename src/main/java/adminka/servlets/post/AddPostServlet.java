package adminka.servlets.post;

import adminka.entity.Post;
import adminka.entity.User;
import adminka.service.PostService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/addPost")
public class AddPostServlet extends HttpServlet {
    private PostService postService = new PostService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/post/addPost.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        User user = (User) req.getSession().getAttribute("user");
        String image = req.getParameter("image");
        String description = req.getParameter("description");
        postService.save(new Post(0, title, user, image, description));
        resp.sendRedirect("/");
    }
}
