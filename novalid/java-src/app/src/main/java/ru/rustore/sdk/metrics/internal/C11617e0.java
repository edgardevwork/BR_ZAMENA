package ru.rustore.sdk.metrics.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: ru.rustore.sdk.metrics.internal.e0 */
/* loaded from: classes8.dex */
public final class C11617e0 {

    /* renamed from: a */
    public final Context f10672a;

    /* renamed from: b */
    public final Lazy f10673b;

    /* renamed from: ru.rustore.sdk.metrics.internal.e0$a */
    /* loaded from: classes5.dex */
    public static final class a extends Lambda implements Function0<C11615d0> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C11615d0 invoke() {
            Object objM15699constructorimpl;
            String value;
            C11617e0 c11617e0 = C11617e0.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                PackageManager packageManager = c11617e0.f10672a.getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
                String packageName = c11617e0.f10672a.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
                value = C11619f0.m7497a(packageManager, packageName).versionName;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
            }
            if (value == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Intrinsics.checkNotNullExpressionValue(value, "requireNotNull(context.p…packageName).versionName)");
            Intrinsics.checkNotNullParameter(value, "value");
            objM15699constructorimpl = Result.m15699constructorimpl(new C11615d0(value));
            if (Result.m15705isFailureimpl(objM15699constructorimpl)) {
                objM15699constructorimpl = null;
            }
            C11615d0 c11615d0 = (C11615d0) objM15699constructorimpl;
            String str = c11615d0 != null ? c11615d0.f10671a : null;
            if (str != null) {
                return new C11615d0(str);
            }
            return null;
        }
    }

    public C11617e0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10672a = context;
        this.f10673b = LazyKt__LazyJVMKt.lazy(new a());
    }
}
