package coil.util;

import android.util.Log;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DebugLogger.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J,\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004¨\u0006\u0012"}, m7105d2 = {"Lcoil/util/DebugLogger;", "Lcoil/util/Logger;", "level", "", "(I)V", "value", "getLevel", "()I", "setLevel", "assertValidLevel", "", "log", "tag", "", "priority", ThrowableDeserializer.PROP_NAME_MESSAGE, "throwable", "", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDebugLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugLogger.kt\ncoil/util/DebugLogger\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
/* loaded from: classes.dex */
public final class DebugLogger implements Logger {
    public int level;

    @JvmOverloads
    public DebugLogger() {
        this(0, 1, null);
    }

    @JvmOverloads
    public DebugLogger(int i) {
        this.level = i;
        assertValidLevel(i);
    }

    public /* synthetic */ DebugLogger(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 3 : i);
    }

    @Override // coil.util.Logger
    public int getLevel() {
        return this.level;
    }

    @Override // coil.util.Logger
    public void setLevel(int i) {
        assertValidLevel(i);
        this.level = i;
    }

    @Override // coil.util.Logger
    public void log(@NotNull String tag, int priority, @Nullable String message, @Nullable Throwable throwable) {
        if (message != null) {
            Log.println(priority, tag, message);
        }
        if (throwable != null) {
            StringWriter stringWriter = new StringWriter();
            throwable.printStackTrace(new PrintWriter(stringWriter));
            Log.println(priority, tag, stringWriter.toString());
        }
    }

    public final void assertValidLevel(int value) {
        if (2 > value || value >= 8) {
            throw new IllegalArgumentException(("Invalid log level: " + value).toString());
        }
    }
}
