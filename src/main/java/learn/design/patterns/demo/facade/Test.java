package learn.design.patterns.demo.facade;

/**
 * @Author df
 * @Description:
 * @Date 2024/2/17 16:20
 */
public class Test {

    //如果不加门面模式
    public void before(){
        new DateValidateRule();
        new FunctionValidateRule();
    }

    // 如果加门面模式
    public void after(){
        ValidateRule validateRule=   new ValidateRule();
        validateRule.dateGreaterValidate();
        validateRule.isContentNull();

    }
}
