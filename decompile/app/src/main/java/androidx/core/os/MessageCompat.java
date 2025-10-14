package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Message;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class MessageCompat {
    public static boolean sTryIsAsynchronous = true;
    public static boolean sTrySetAsynchronous = true;

    @SuppressLint({"NewApi"})
    public static void setAsynchronous(@NonNull Message message, boolean z) {
        Api22Impl.setAsynchronous(message, z);
    }

    @SuppressLint({"NewApi"})
    public static boolean isAsynchronous(@NonNull Message message) {
        return Api22Impl.isAsynchronous(message);
    }

    @RequiresApi(22)
    public static class Api22Impl {
        @DoNotInline
        public static boolean isAsynchronous(Message message) {
            return message.isAsynchronous();
        }

        @DoNotInline
        public static void setAsynchronous(Message message, boolean z) {
            message.setAsynchronous(z);
        }
    }
}
