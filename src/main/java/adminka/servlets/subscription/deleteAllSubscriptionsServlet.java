package adminka.servlets.subscription;

import adminka.service.SubscriptionService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/deleteAllSubscriptions")
public class deleteAllSubscriptionsServlet extends HttpServlet {

    private final SubscriptionService subscriptionService = new SubscriptionService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        subscriptionService.getAllSubscriptions();
        resp.sendRedirect("/");
    }
}
