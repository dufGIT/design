package learn.design.patterns.demo.facade;

/**
 * @Author df
 * @Description: TODO
 * @Date 2024/2/17 16:20
 */
public class Test {

    public void before(){
        new DateValidateRule();
        new FunctionValidateRule();
    }


    public void after(){
        ValidateRule validateRule=   new ValidateRule();
        validateRule.dateGreaterValidate();
        validateRule.isContentNull();

    }

    public static void main(String[] args) {

    }
}
