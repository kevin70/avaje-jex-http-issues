package cool.houge;

import io.avaje.inject.BeanScope;
import io.avaje.jex.Jex;

import java.util.Map;

/**
 * @author ZY (kzou227@qq.com)
 */
public class Main {

    public static void main(String[] args) {
        var beanScope = BeanScope.builder().build();
        Jex.create()
            .configureWith(beanScope)
            .exception(Exception.class, (exception, ctx) -> {
                var error = Map.of("error", "An error response");
                ctx.status(500).json(error);
            })
            .start();
    }
}