package ru.rustore.sdk.billingclient.impl.data.datasource;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.datasource.c */
/* loaded from: classes5.dex */
public final class C11425c {

    /* renamed from: a */
    public final Context f10207a;

    /* renamed from: b */
    public final a f10208b;

    /* renamed from: ru.rustore.sdk.billingclient.impl.data.datasource.c$a */
    public static final class a {

        /* renamed from: a */
        public final String f10209a;

        /* renamed from: b */
        public final String f10210b;

        /* renamed from: c */
        public final String f10211c;

        /* renamed from: d */
        public final String f10212d;

        public a(String manufacturer, String model, String hardware, String device) {
            Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
            Intrinsics.checkNotNullParameter(model, "model");
            Intrinsics.checkNotNullParameter(hardware, "hardware");
            Intrinsics.checkNotNullParameter(device, "device");
            this.f10209a = manufacturer;
            this.f10210b = model;
            this.f10211c = hardware;
            this.f10212d = device;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f10209a, aVar.f10209a) && Intrinsics.areEqual(this.f10210b, aVar.f10210b) && Intrinsics.areEqual(this.f10211c, aVar.f10211c) && Intrinsics.areEqual(this.f10212d, aVar.f10212d);
        }

        public final int hashCode() {
            return this.f10212d.hashCode() + C8031b.m1429a(this.f10211c, C8031b.m1429a(this.f10210b, this.f10209a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DeviceIdData(manufacturer=");
            sb.append(this.f10209a);
            sb.append(", model=");
            sb.append(this.f10210b);
            sb.append(", hardware=");
            sb.append(this.f10211c);
            sb.append(", device=");
            return C8032c.m1430a(sb, this.f10212d, ')');
        }
    }

    public C11425c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10207a = context;
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String HARDWARE = Build.HARDWARE;
        Intrinsics.checkNotNullExpressionValue(HARDWARE, "HARDWARE");
        String DEVICE = Build.DEVICE;
        Intrinsics.checkNotNullExpressionValue(DEVICE, "DEVICE");
        this.f10208b = new a(MANUFACTURER, MODEL, HARDWARE, DEVICE);
    }

    /* renamed from: a */
    public final String m7444a() {
        Object objM15699constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(Settings.Secure.getString(this.f10207a.getContentResolver(), "android_id"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m15702exceptionOrNullimpl(objM15699constructorimpl) != null) {
            objM15699constructorimpl = "";
        }
        String value = ((String) objM15699constructorimpl) + '-' + this.f10208b.hashCode();
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }
}
