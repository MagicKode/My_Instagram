package adminka.servlets.comment;

import adminka.service.CommentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/deleteAllComments")
public class DeleteAllCommentsServlet extends HttpServlet {

    private final CommentService commentService = new CommentService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/post/deleteAllComments.jsp").forward(req, resp);
    }
}
