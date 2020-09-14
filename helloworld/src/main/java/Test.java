import javax.wsdl.WSDLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangleai on 2018/3/1.
 */
public class Test {
    public static void main(String[] args) throws WSDLException {
        String wsdluri = "C:\\Users\\38359\\Desktop\\helloworld\\src\\main\\resources\\test.wsdl";
        List<String> operations = new ArrayList<>();
        WAWsdlUtil.getOperationList(wsdluri, operations);
        for (String operationName : operations) {
            System.out.println("-----------------operation----------------");
            System.out.println(operationName);
            List<ParameterInfo> parameterInfos = WAWsdlUtil.getMethodParams(wsdluri, operationName);
            printParams(parameterInfos, "");
        }
    }

    private static void printParams(List<ParameterInfo> parameterInfos, String parentName) {
        if (parameterInfos != null) {
            for (ParameterInfo parameterInfo : parameterInfos) {
                System.out.println("parentname : " + parentName + " ; name : " + parameterInfo.getName() + " ; type :" +
                        " " + parameterInfo.getType() + " ;" +
                        " childtype : " + parameterInfo.getChildType());
                printParams(parameterInfo.getChildren(), parameterInfo.getName());
            }
        }
    }
}
