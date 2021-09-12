package adminka.servlets.subscription;

import adminka.entity.Subscription;
import adminka.entity.User;
import adminka.service.SubscriptionService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/addSubscription")
public class AddNewSubscriptionServlet extends HttpServlet {

    private final SubscriptionService subscriptionService = new SubscriptionService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/subscription/addSubscription.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = (User) req.getSession().getAttribute("user");
        subscriptionService.addNewSubscription(new Subscription(0,user));
        resp.sendRedirect("/");
    }
}

