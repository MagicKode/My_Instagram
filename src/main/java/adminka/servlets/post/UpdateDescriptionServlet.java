package adminka.servlets.post;

import adminka.entity.Post;
import adminka.service.PostService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/updateDescription")
public class UpdateDescriptionServlet extends HttpServlet {

    private final PostService postService = new PostService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/post/updateDescription.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Post post = ((Post) req.getSession().getAttribute("post"));
        String title = req.getParameter("title");
        String description = req.getParameter("description");
        postService.updateDescription(title,description);
        resp.sendRedirect(req.getContextPath()+"/profile");
    }
}
