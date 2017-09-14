package io.hasura.myblog;
import com.google.gson.annotations.SerializedName;
public class ErrorResponse {
    @SerializedName("error")
    String error;
    public String getError() {
        return error;
    }
}
