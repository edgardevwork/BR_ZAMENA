package okhttp3.internal.platform.android;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.Metadata;

/* compiled from: AndroidLog.kt */
@Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m7105d2 = {"androidLevel", "", "Ljava/util/logging/LogRecord;", "getAndroidLevel", "(Ljava/util/logging/LogRecord;)I", "okhttp"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class AndroidLogKt {
    public static final int getAndroidLevel(LogRecord logRecord) {
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
    }
}
