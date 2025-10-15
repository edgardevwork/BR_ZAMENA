package io.ktor.client.plugins.logging;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: LoggerJvm.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0001¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0011\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082\u0010R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m7105d2 = {"Lio/ktor/client/plugins/logging/MessageLengthLimitingLogger;", "Lio/ktor/client/plugins/logging/Logger;", "maxLength", "", "minLength", "delegate", "(IILio/ktor/client/plugins/logging/Logger;)V", "log", "", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "logLong", "ktor-client-logging"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class MessageLengthLimitingLogger implements Logger {

    @NotNull
    public final Logger delegate;
    public final int maxLength;
    public final int minLength;

    public MessageLengthLimitingLogger() {
        this(0, 0, null, 7, null);
    }

    public MessageLengthLimitingLogger(int i, int i2, @NotNull Logger delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.maxLength = i;
        this.minLength = i2;
        this.delegate = delegate;
    }

    public /* synthetic */ MessageLengthLimitingLogger(int i, int i2, Logger logger, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 4000 : i, (i3 & 2) != 0 ? 3000 : i2, (i3 & 4) != 0 ? LoggerJvmKt.getDEFAULT(Logger.INSTANCE) : logger);
    }

    @Override // io.ktor.client.plugins.logging.Logger
    public void log(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        logLong(message);
    }

    public final void logLong(String message) {
        while (true) {
            int length = message.length();
            int i = this.maxLength;
            if (length > i) {
                String strSubstring = message.substring(0, i);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                int i2 = this.maxLength;
                int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) strSubstring, '\n', 0, false, 6, (Object) null);
                if (iLastIndexOf$default >= this.minLength) {
                    strSubstring = strSubstring.substring(0, iLastIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    i2 = iLastIndexOf$default + 1;
                }
                this.delegate.log(strSubstring);
                message = message.substring(i2);
                Intrinsics.checkNotNullExpressionValue(message, "this as java.lang.String).substring(startIndex)");
            } else {
                this.delegate.log(message);
                return;
            }
        }
    }
}
