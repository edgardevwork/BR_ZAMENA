package io.appmetrica.analytics;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.impl.C9952wb;
import io.appmetrica.analytics.impl.C9966x0;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes8.dex */
public class AppMetricaLibraryAdapter {

    /* renamed from: a */
    private static C9966x0 f5959a = new C9966x0();

    public static void activate(@NonNull Context context) {
        f5959a.m6948a(context);
    }

    public static void reportEvent(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        C9966x0 c9966x0 = f5959a;
        C9952wb c9952wb = c9966x0.f9289b;
        if (!c9952wb.f9256b.mo5086a((Void) null).f8908a || !c9952wb.f9257c.mo5086a(str).f8908a || !c9952wb.f9258d.mo5086a(str2).f8908a || !c9952wb.f9259e.mo5086a(str3).f8908a) {
            String str4 = "Failed report event from sender: " + str + " with name = " + str2 + " and payload = " + str3;
            PublicLogger.INSTANCE.getAnonymousInstance().warning("[AppMetricaLibraryAdapterProxy]" + str4, new Object[0]);
            return;
        }
        c9966x0.f9290c.getClass();
        c9966x0.f9291d.getClass();
        ModuleEvent.Builder builderWithName = ModuleEvent.newBuilder(4).withName("appmetrica_system_event_42");
        if (str == null) {
            str = "null";
        }
        Pair pairM7112to = TuplesKt.m7112to(NotificationCompat.MessagingStyle.Message.KEY_SENDER, str);
        if (str2 == null) {
            str2 = "null";
        }
        Pair pairM7112to2 = TuplesKt.m7112to("event", str2);
        if (str3 == null) {
            str3 = "null";
        }
        ModulesFacade.reportEvent(builderWithName.withAttributes(MapsKt__MapsKt.mapOf(pairM7112to, pairM7112to2, TuplesKt.m7112to("payload", str3))).build());
    }

    @VisibleForTesting
    public static void setProxy(@NonNull C9966x0 c9966x0) {
        f5959a = c9966x0;
    }
}
