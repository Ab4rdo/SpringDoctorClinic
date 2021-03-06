package springdoctorclinic.doc.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")
@RequestMapping("/")
public class RootRestController
{
    
    @RequestMapping(value = "/")
    public void redirectToSwagger(HttpServletResponse response) throws IOException
    {
        response.sendRedirect("/doctorclinic/swagger-ui.html");
    }
}
