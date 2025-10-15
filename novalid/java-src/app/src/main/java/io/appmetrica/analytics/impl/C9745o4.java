package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.client.ServiceConfigUpdateListener;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.o4 */
/* loaded from: classes7.dex */
public final class C9745o4 {

    /* renamed from: a */
    public final C9720n4 f8800a = new C9720n4();

    /* renamed from: b */
    public final CopyOnWriteArrayList f8801b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public InterfaceC9061M5 f8802c;

    /* renamed from: a */
    public static void m6569a(String str, String str2, Throwable th) {
        C9610ij c9610ij = AbstractC8954Hi.f6726a;
        Map mapMapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m7112to(str, MapsKt__MapsJVMKt.mapOf(TuplesKt.m7112to(str2, ExceptionsKt__ExceptionsKt.stackTraceToString(th)))));
        c9610ij.getClass();
        c9610ij.m6292a(new C9585hj("client_module_errors", mapMapOf));
    }

    /* renamed from: b */
    public final void m6574b() {
        Iterator it = this.f8801b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.onActivated();
            } catch (Throwable th) {
                m6569a(moduleClientEntryPoint.getIdentifier(), "onActivated", th);
            }
        }
    }

    /* renamed from: a */
    public final void m6573a(@NotNull ModuleClientEntryPoint<Object> moduleClientEntryPoint) {
        this.f8801b.add(moduleClientEntryPoint);
    }

    /* renamed from: a */
    public final void m6572a(@NotNull InterfaceC9061M5 interfaceC9061M5) {
        this.f8802c = interfaceC9061M5;
        HashSet hashSet = new HashSet();
        Iterator it = this.f8801b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                moduleClientEntryPoint.initClientSide(interfaceC9061M5);
            } catch (Throwable th) {
                m6569a(moduleClientEntryPoint.getIdentifier(), "initClientSide", th);
                hashSet.add(moduleClientEntryPoint);
            }
        }
        this.f8801b.removeAll(hashSet);
    }

    @Nullable
    /* renamed from: a */
    public final ModuleAdRevenueProcessor m6570a() {
        C9133P5 c9133p5;
        InterfaceC9061M5 interfaceC9061M5 = this.f8802c;
        if (interfaceC9061M5 == null || (c9133p5 = ((C9395a4) interfaceC9061M5).f7666b) == null) {
            return null;
        }
        return c9133p5.f7083b;
    }

    /* renamed from: a */
    public final void m6571a(@Nullable Bundle bundle, @NotNull SdkIdentifiers sdkIdentifiers) {
        if (bundle == null) {
            return;
        }
        Iterator it = this.f8801b.iterator();
        while (it.hasNext()) {
            ModuleClientEntryPoint moduleClientEntryPoint = (ModuleClientEntryPoint) it.next();
            try {
                ServiceConfigExtensionConfiguration serviceConfigExtensionConfiguration = moduleClientEntryPoint.getServiceConfigExtensionConfiguration();
                if (serviceConfigExtensionConfiguration != null) {
                    ServiceConfigUpdateListener serviceConfigUpdateListener = serviceConfigExtensionConfiguration.getServiceConfigUpdateListener();
                    C9720n4 c9720n4 = this.f8800a;
                    String identifier = moduleClientEntryPoint.getIdentifier();
                    c9720n4.getClass();
                    Bundle bundle2 = bundle.getBundle(identifier);
                    C9695m4 c9695m4 = bundle2 != null ? new C9695m4(sdkIdentifiers, serviceConfigExtensionConfiguration.getBundleConverter().fromBundle(bundle2)) : null;
                    if (c9695m4 != null) {
                        serviceConfigUpdateListener.onServiceConfigUpdated(c9695m4);
                    }
                }
            } catch (Throwable th) {
                m6569a(moduleClientEntryPoint.getIdentifier(), "notifyModulesWithConfig", th);
            }
        }
    }
}
