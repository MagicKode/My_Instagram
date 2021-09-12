package adminka.servlets.user;

import adminka.entity.User;
import adminka.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegistrationServlet", urlPatterns = "/reg")
public class RegistrationServlet extends HttpServlet {

    private final UserService userService = new UserService();
   // private final InMemoryUserStorage inMemoryUserStorage = new InMemoryUserStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/user/reg.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        String sex = req.getParameter("sex");
        String country = req.getParameter("country");
        String age = req.getParameter("age");
        String email = req.getParameter("email");

        boolean save = userService.save(new User(name, login, password, sex, country, age, email)); //?
        if (save) {
            resp.sendRedirect("/auth");
        } else {
            req.setAttribute("message", "User is exist!");
            getServletContext().getRequestDispatcher("/servlet/reg.jsp").forward(req, resp);
        }

//
//       /* //Счётчик посещений
//        HttpSession session = req.getSession();
//        Integer visitCount = (Integer) session.getAttribute("visiCounter");
//        if (visitCount == null){
//            visitCount = 1;
//        }else {
//            visitCount++;
//            System.out.println(visitCount);
//        }
//        session.setAttribute("visitCounter", visitCount);
//        //String login = req.getParameter("login");
//        resp.setContentType("text/html");
//        PrintWriter printWriter = resp.getWriter();
//        if (login == null){
//            printWriter.write("Hello, Anonymous" + "<br>");
//        }else {
//            printWriter.write("Hello, "+ visitCount + "times");
//            printWriter.close();
//        }*/
//    }
    }
}
