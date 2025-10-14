package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class HttpException extends RuntimeException {
    public final int code;
    public final String message;
    public final transient Response<?> response;

    public static String getMessage(Response<?> response) {
        Objects.requireNonNull(response, "response == null");
        return "HTTP " + response.code() + " " + response.message();
    }

    public HttpException(Response<?> response) {
        super(getMessage(response));
        this.code = response.code();
        this.message = response.message();
        this.response = response;
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    @Nullable
    public Response<?> response() {
        return this.response;
    }
}
