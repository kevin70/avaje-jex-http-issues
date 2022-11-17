package cool.houge;

import cool.houge.bean.HelloBean;
import cool.houge.bean.Person;
import io.avaje.http.api.Controller;
import io.avaje.http.api.Get;
import io.avaje.http.api.Path;

/**
 * @author ZY (kzou227@qq.com)
 */
@Path("/hello")
@Controller
public class HelloController {

    @Get
    public HelloBean hello() {
        var bean = new HelloBean("Hello", new Person("a", "b"));
        return bean;
    }

    @Get("/ex")
    public HelloBean ex() {
        throw new IllegalArgumentException();
    }

}
