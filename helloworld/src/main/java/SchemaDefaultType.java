/**
 * @author wangleai
 * @date 2018/3/1
 * 在这里，你可以根据官网xml schema文档提供的类型随意添加类型，用以支持更多内容，我这边只添加java相关的基本类型
 */
public enum SchemaDefaultType {
    type_string("string"),
    type_decimal("decimal"),
    type_integer("integer"),
    type_int("int"),
    type_float("float"),
    type_long("long"),
    type_boolean("boolean"),
    type_time("time"),
    type_date("date"),
    type_datetime("datetime"),
    type_array("array"),
    type_anyType("anyType");

    private String type;

    private SchemaDefaultType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
