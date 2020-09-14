import java.util.ArrayList;
import java.util.List;

/**
 * @author wangleai
 * @date 2018/3/1
 */
public class ParameterInfo {
    /**
     * 名称
     */
    private String name;

    /**
     * 值，仅基本类型会被填入
     */
    private String value;

    /**
     * 类型，类型未空时表示自己定义的complexType
     */
    private String type;

    /**
     * 子类型，用于识别array类型下的type，应该是不用担心array嵌套array的，目前我测试的java
     * webservice框架无法自动生成对应的wsdl文档
     */
    private String childType;

    /**
     * 子结点
     */
    private List<ParameterInfo> children = new ArrayList();

    /**
     * 我个人建议是加上这个父结点，方便以后回溯用，但本例中上我并未使用到
     */
    private ParameterInfo parentParam;

    public ParameterInfo() {
    }

    public ParameterInfo(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public ParameterInfo(String name, String value, String type, String childType, List<ParameterInfo> children) {
        this.name = name;
        this.value = value;
        this.type = type;
        this.childType = childType;
        this.children = children;
        this.parentParam = null;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ParameterInfo> getChildren() {
        return this.children;
    }

    public void setChildren(List<ParameterInfo> children) {
        this.children = children;
    }

    public String getChildType() {
        return this.childType;
    }

    public void setChildType(String childType) {
        this.childType = childType;
    }

    public void addChild(ParameterInfo param) {
        this.children.add(param);
    }

    public ParameterInfo getParentParam() {
        return parentParam;
    }

    public void setParentParam(ParameterInfo parentParam) {
        this.parentParam = parentParam;
    }
}
