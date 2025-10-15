package ru.rustore.sdk.appupdate;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.rustore.sdk.appupdate.i0 */
/* loaded from: classes6.dex */
public final class C11383i0 {

    /* renamed from: b */
    @NotNull
    public static final Locale f10124b = new Locale("ru", "RU");

    /* renamed from: c */
    @NotNull
    public static final TimeZone f10125c;

    /* renamed from: a */
    public final Calendar f10126a = Calendar.getInstance();

    static {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(\"UTC\")");
        f10125c = timeZone;
    }
}
