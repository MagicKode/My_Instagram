package adminka.servlets.subscription;

import adminka.entity.Subscription;
import adminka.service.SubscriptionService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/getSubscription")
public class getSubscriptionServlet extends HttpServlet {

    private final SubscriptionService subscriptionService = new SubscriptionService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        Subscription subscriptionByName = subscriptionService.getSubscription(name);
        req.setAttribute("subscription",subscriptionByName);
        getServletContext().getRequestDispatcher("/pages/subscription/getSubscription.jsp");
    }
}
