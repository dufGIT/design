package learn.design.patterns.demo.facade;

/**
 * @Author df
 * @Description: 门面模式,相当于把用户要用的进行聚合。
 * @Date 2024/2/17 16:21
 */
public class ValidateRule {
    private DateValidateRule dateValidateRule=new DateValidateRule();
    private FunctionValidateRule functionValidateRule=new FunctionValidateRule();

    public boolean dateGreaterValidate(){
        return  dateValidateRule.dateValidateGreaterThan();
        // 都为true则为true，否则false
    }

    public boolean dateLessValidate(){
        return dateValidateRule.dateValidateLessThan();
    }

    public boolean  isContentNull(){
       return functionValidateRule.isContentNull();
    }

}
