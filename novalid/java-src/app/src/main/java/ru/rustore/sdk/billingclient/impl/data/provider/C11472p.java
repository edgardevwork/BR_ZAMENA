package ru.rustore.sdk.billingclient.impl.data.provider;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import ru.rustore.sdk.billingclient.impl.data.connection.ServiceConnectionC11420b;
import ru.rustore.sdk.core.exception.RuStoreNotInstalledException;
import ru.rustore.sdk.core.exception.RuStoreOutdatedException;
import ru.rustore.sdk.core.util.CollectionExtKt;
import ru.rustore.sdk.core.util.RuStoreUtils;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.provider.p */
/* loaded from: classes5.dex */
public final class C11472p {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, android.content.ServiceConnection, ru.rustore.sdk.billingclient.impl.data.connection.b] */
    /* renamed from: a */
    public static final void m7453a(C11472p c11472p, Context context, String str, boolean z, C11470n c11470n, C11471o c11471o) {
        if (!RuStoreUtils.INSTANCE.isRuStoreInstalled(context)) {
            throw new RuStoreNotInstalledException();
        }
        Intent intent = new Intent("ru.vk.store.provider.RemotePayTokenProvider");
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentServices, "packageManager.queryIntentServices(this, 0)");
        ComponentName componentNameFindRuStoreServiceComponentName = CollectionExtKt.findRuStoreServiceComponentName(listQueryIntentServices);
        if (componentNameFindRuStoreServiceComponentName == null) {
            throw new RuStoreOutdatedException();
        }
        intent.setComponent(componentNameFindRuStoreServiceComponentName);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? serviceConnectionC11420b = new ServiceConnectionC11420b(z, str, new C11468l(c11470n, context, objectRef), new C11469m(c11471o, context, objectRef));
        objectRef.element = serviceConnectionC11420b;
        context.bindService(intent, (ServiceConnection) serviceConnectionC11420b, 1);
    }
}
