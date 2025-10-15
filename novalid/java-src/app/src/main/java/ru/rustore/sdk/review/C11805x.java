package ru.rustore.sdk.review;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.core.exception.RuStoreNotInstalledException;
import ru.rustore.sdk.core.exception.RuStoreOutdatedException;
import ru.rustore.sdk.core.util.CollectionExtKt;
import ru.rustore.sdk.core.util.RuStoreUtils;

/* renamed from: ru.rustore.sdk.review.x */
/* loaded from: classes5.dex */
public final class C11805x {

    /* renamed from: a */
    public final Context f11042a;

    /* renamed from: b */
    public final String f11043b;

    public C11805x(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f11042a = context;
        this.f11043b = context.getPackageName();
    }

    /* renamed from: a */
    public static final void m7559a(C11805x c11805x, Context context, Function1 function1, ServiceConnection serviceConnection) {
        Throwable ruStoreOutdatedException;
        if (RuStoreUtils.INSTANCE.isRuStoreInstalled(context)) {
            Intent intent = new Intent("ru.vk.store.provider.review.RemoteReviewFlowProvider");
            List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentServices, "packageManager.queryIntentServices(intent, 0)");
            ComponentName componentNameFindRuStoreServiceComponentName = CollectionExtKt.findRuStoreServiceComponentName(listQueryIntentServices);
            if (componentNameFindRuStoreServiceComponentName != null) {
                intent.setComponent(componentNameFindRuStoreServiceComponentName);
                context.bindService(intent, serviceConnection, 1);
                return;
            }
            ruStoreOutdatedException = new RuStoreOutdatedException();
        } else {
            ruStoreOutdatedException = new RuStoreNotInstalledException();
        }
        function1.invoke(ruStoreOutdatedException);
    }
}
