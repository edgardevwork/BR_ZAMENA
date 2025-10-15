package ru.rustore.sdk.metrics.internal;

import java.net.URL;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__IndentKt;

/* renamed from: ru.rustore.sdk.metrics.internal.q */
/* loaded from: classes5.dex */
public final class C11635q extends Lambda implements Function0<String> {

    /* renamed from: a */
    public final /* synthetic */ URL f10702a;

    /* renamed from: b */
    public final /* synthetic */ int f10703b;

    /* renamed from: c */
    public final /* synthetic */ String f10704c;

    /* renamed from: d */
    public final /* synthetic */ String f10705d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11635q(URL url, int i, String str, String str2) {
        super(0);
        this.f10702a = url;
        this.f10703b = i;
        this.f10704c = str;
        this.f10705d = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return StringsKt__IndentKt.trimIndent("\n                    HTTP REQUEST\n                    URL: " + this.f10702a + "\n                    CODE: " + this.f10703b + "\n                    BODY: " + this.f10704c + "\n                    HEADER X-Metrics-Request-Time: " + this.f10705d + "\n                ");
    }
}
