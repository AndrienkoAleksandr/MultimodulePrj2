package org.eclipse.che.examples;

import java.util.List;
import org.eclipse.che.examples.ClassUtils;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetingController implements Controller {

   @Override
   public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception
   {
      String userName = request.getParameter("user");
      String result = "";
      if (userName != null)
      {
        result = "Hello, " + userName + "!";
      }     
      List<Long> fibonacci = ClassUtils.solveFibonacciSequence(0, 5);

      ModelAndView view = new ModelAndView("hello_view");
      
      String seq = "";
      for (Long elem: fibonacci) {
          seq += elem + ",";
      }
      String smartPhrase = "Do you know that sequense Fibonacci from 0 to 5 is " + seq;
      
      
      view.addObject("greeting", result + " " + smartPhrase);
      return view;
   }
}
