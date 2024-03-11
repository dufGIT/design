package learn.design.patterns.demo.template.enums;

/**
 * @Author df
 * @Description: 码类型枚举
 * @Date 2024/3/8 10:27
 */
public enum CodeTypeEnum {
    GOODS_NO("goods_no", "商品编号"),
    ORDER_NO("order_no", "序号");

    private String code;
    private String name;

    private CodeTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
