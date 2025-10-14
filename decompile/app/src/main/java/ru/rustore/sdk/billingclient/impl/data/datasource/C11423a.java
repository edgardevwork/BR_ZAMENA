package ru.rustore.sdk.billingclient.impl.data.datasource;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.datasource.a */
/* loaded from: classes5.dex */
public final class C11423a {

    /* renamed from: a */
    public final Context f10204a;

    /* renamed from: b */
    public final Lazy f10205b;

    /* renamed from: ru.rustore.sdk.billingclient.impl.data.datasource.a$a */
    /* loaded from: classes8.dex */
    public static final class a extends Lambda implements Function0<String> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            Object objM15699constructorimpl;
            C11423a c11423a = C11423a.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                PackageManager packageManager = c11423a.f10204a.getPackageManager();
                Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
                String packageName = c11423a.f10204a.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
                objM15699constructorimpl = Result.m15699constructorimpl(C11423a.m7443a(c11423a, packageManager, packageName).versionName);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM15699constructorimpl = Result.m15699constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m15705isFailureimpl(objM15699constructorimpl)) {
                objM15699constructorimpl = null;
            }
            return (String) objM15699constructorimpl;
        }
    }

    public C11423a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f10204a = context;
        this.f10205b = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* renamed from: a */
    public static final PackageInfo m7443a(C11423a c11423a, PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        String str2;
        if (Build.VERSION.SDK_INT >= 33) {
            packageInfo = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
            str2 = "{\n            getPackage…nfoFlags.of(0))\n        }";
        } else {
            packageInfo = packageManager.getPackageInfo(str, 0);
            str2 = "{\n            getPackage…packageName, 0)\n        }";
        }
        Intrinsics.checkNotNullExpressionValue(packageInfo, str2);
        return packageInfo;
    }
}
