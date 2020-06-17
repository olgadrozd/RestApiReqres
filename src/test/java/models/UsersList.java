package models;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sun.tools.xjc.reader.xmlschema.bindinfo.BIConversion;
import lombok.Data;
import java.util.List;

@Data
public class UsersList {
    @Expose
    int page;
    @SerializedName("per_page")
    @Expose
    int perPage;
    @Expose
    int total;
    @SerializedName("total_pages")
    @Expose
    int totalPages;
    List<BIConversion.User> data;
}