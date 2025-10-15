package ru.rustore.sdk.billingclient.impl.data.provider;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import ru.p068vk.store.sdk.lib.payment.info.aidl.C11823a;
import ru.rustore.sdk.billingclient.impl.data.connection.ServiceConnectionC11419a;
import ru.rustore.sdk.core.exception.RuStoreNotInstalledException;
import ru.rustore.sdk.core.exception.RuStoreOutdatedException;
import ru.rustore.sdk.core.util.CollectionExtKt;
import ru.rustore.sdk.core.util.RuStoreUtils;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.provider.k */
/* loaded from: classes5.dex */
public final class C11467k {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, android.content.ServiceConnection, ru.rustore.sdk.billingclient.impl.data.connection.a] */
    /* renamed from: a */
    public static final void m7452a(C11467k c11467k, Context context, String str, boolean z, C11465i c11465i, C11466j c11466j) {
        if (!RuStoreUtils.INSTANCE.isRuStoreInstalled(context)) {
            throw new RuStoreNotInstalledException();
        }
        Intent intent = new Intent("ru.vk.store.provider.PayInfoProvider");
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentServices, "packageManager.queryIntentServices(this, 0)");
        ComponentName componentNameFindRuStoreServiceComponentName = CollectionExtKt.findRuStoreServiceComponentName(listQueryIntentServices);
        if (componentNameFindRuStoreServiceComponentName == null) {
            throw new RuStoreOutdatedException();
        }
        intent.setComponent(componentNameFindRuStoreServiceComponentName);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? serviceConnectionC11419a = new ServiceConnectionC11419a(z, str, new C11823a(), new C11463g(c11465i, context, objectRef), new C11464h(c11466j, context, objectRef));
        objectRef.element = serviceConnectionC11419a;
        context.bindService(intent, (ServiceConnection) serviceConnectionC11419a, 1);
    }
}
