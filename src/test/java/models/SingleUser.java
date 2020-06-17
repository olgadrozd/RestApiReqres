package models;
import com.google.gson.annotations.Expose;
import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion;
import lombok.Data;

@Data
public class SingleUser {
    //@Expose
    BIConversion.User data;
}
