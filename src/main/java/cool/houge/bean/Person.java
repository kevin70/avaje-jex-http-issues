package cool.houge.bean;

/**
 * @author ZY (kzou227@qq.com)
 */
public record Person(String firstName, String lastName) {

    @Override
    public String firstName() {
        throw new IllegalArgumentException("simulation error");
    }
}
