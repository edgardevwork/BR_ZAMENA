package ru.rustore.sdk.remoteconfig.internal;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.C0 */
/* loaded from: classes5.dex */
public final class C11670C0 {

    /* renamed from: c */
    public static final Object f10729c = new Object();

    /* renamed from: a */
    public final C11674E0 f10730a;

    /* renamed from: b */
    public final C11668B0 f10731b;

    public C11670C0(C11674E0 sentShortSegmentsRepository, C11668B0 sendShortSegmentsRepository) {
        Intrinsics.checkNotNullParameter(sentShortSegmentsRepository, "sentShortSegmentsRepository");
        Intrinsics.checkNotNullParameter(sendShortSegmentsRepository, "sendShortSegmentsRepository");
        this.f10730a = sentShortSegmentsRepository;
        this.f10731b = sendShortSegmentsRepository;
    }

    /* renamed from: a */
    public final void m7507a(String shortSegments) {
        Intrinsics.checkNotNullParameter(shortSegments, "shortSegments");
        synchronized (f10729c) {
            try {
                String str = this.f10730a.f10745a.f10733a;
                if (!(str == null ? false : Intrinsics.areEqual(shortSegments, str))) {
                    C11668B0 c11668b0 = this.f10731b;
                    c11668b0.getClass();
                    Intrinsics.checkNotNullParameter(shortSegments, "shortSegments");
                    C11666A0 c11666a0 = c11668b0.f10726a;
                    c11668b0.f10727b.getClass();
                    Intrinsics.checkNotNullParameter(shortSegments, "shortSegments");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("short_segments", shortSegments);
                    String string = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "JSONObject().apply {\n   …ids)\n        }.toString()");
                    c11666a0.m7506a(string);
                    C11674E0 c11674e0 = this.f10730a;
                    c11674e0.getClass();
                    Intrinsics.checkNotNullParameter(shortSegments, "shortSegments");
                    C11672D0 c11672d0 = c11674e0.f10745a;
                    c11672d0.getClass();
                    Intrinsics.checkNotNullParameter(shortSegments, "shortSegments");
                    c11672d0.f10733a = shortSegments;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
