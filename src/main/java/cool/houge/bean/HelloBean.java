package cool.houge.bean;

import io.avaje.jsonb.Json;

/**
 * @author ZY (kzou227@qq.com)
 */
@Json(naming = Json.Naming.LowerUnderscore)
public record HelloBean(String name, Person person) {

}
