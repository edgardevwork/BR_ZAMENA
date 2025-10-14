package io.appmetrica.analytics.logger.common;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.logger.common.impl.C10069a;
import io.appmetrica.analytics.logger.common.impl.C10070b;
import io.appmetrica.analytics.logger.common.impl.C10071c;
import io.appmetrica.analytics.logger.common.impl.C10072d;
import java.util.Iterator;
import org.apache.commons.lang3.StringUtils;

/* loaded from: classes8.dex */
public abstract class BaseReleaseLogger {

    /* renamed from: d */
    private static volatile String f9489d = "";

    /* renamed from: a */
    private final String f9490a;

    /* renamed from: b */
    private volatile boolean f9491b = false;

    /* renamed from: c */
    private final C10071c f9492c;

    public BaseReleaseLogger(@NonNull String str, @NonNull String str2) {
        this.f9492c = new C10071c(new C10072d(str), new C10069a(), new C10070b());
        this.f9490a = str2;
    }

    public static void init(@NonNull Context context) {
        f9489d = "[" + context.getPackageName() + "] : ";
    }

    public void error(@Nullable String str, @Nullable Object... objArr) {
        if (this.f9491b) {
            C10071c c10071c = this.f9492c;
            String prefix = getPrefix();
            c10071c.f9495b.getClass();
            Iterator it = c10071c.f9496c.m7049a(C10069a.m7048a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = c10071c.f9494a.f9497a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }

    @NonNull
    public String getPrefix() {
        return f9489d + this.f9490a;
    }

    public void info(@Nullable String str, @Nullable Object... objArr) {
        if (this.f9491b) {
            C10071c c10071c = this.f9492c;
            String prefix = getPrefix();
            c10071c.f9495b.getClass();
            Iterator it = c10071c.f9496c.m7049a(C10069a.m7048a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = c10071c.f9494a.f9497a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(4, str3, str2);
            }
        }
    }

    public void setEnabled(boolean z) {
        this.f9491b = z;
    }

    public void warning(@Nullable String str, @Nullable Object... objArr) {
        if (this.f9491b) {
            C10071c c10071c = this.f9492c;
            String prefix = getPrefix();
            c10071c.f9495b.getClass();
            Iterator it = c10071c.f9496c.m7049a(C10069a.m7048a(prefix, str, objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = c10071c.f9494a.f9497a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(5, str3, str2);
            }
        }
    }

    public void error(@Nullable Throwable th, @Nullable String str, @Nullable Object... objArr) {
        if (this.f9491b) {
            C10071c c10071c = this.f9492c;
            String prefix = getPrefix();
            c10071c.f9495b.getClass();
            StringBuilder sb = new StringBuilder();
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append(StringUtils.f9903LF);
            sb.append(Log.getStackTraceString(th));
            Iterator it = c10071c.f9496c.m7049a(C10069a.m7048a(prefix, sb.toString(), objArr)).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                String str3 = c10071c.f9494a.f9497a;
                if (str2 == null) {
                    str2 = "";
                }
                Log.println(6, str3, str2);
            }
        }
    }
}
