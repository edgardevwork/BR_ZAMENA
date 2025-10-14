package io.appmetrica.analytics.impl;

import android.location.Location;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.MapsKt___MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.Dj */
/* loaded from: classes8.dex */
public final class C8855Dj implements InterfaceC8798Bc, InterfaceC9762ol, AskForPermissionStrategyModuleProvider {

    /* renamed from: a */
    public final String f6491a = "rp";

    /* renamed from: b */
    public final CopyOnWriteArrayList f6492b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public volatile AskForPermissionStrategyModuleProvider f6493c = new C8818C7();

    @Override // io.appmetrica.analytics.impl.InterfaceC9762ol
    /* renamed from: a */
    public final void mo5082a(@NotNull C9637jl c9637jl) {
        SdkIdentifiers sdkIdentifiers = new SdkIdentifiers(c9637jl.m6317e(), c9637jl.m6313a(), c9637jl.m6314b());
        C9457cg c9457cg = new C9457cg(c9637jl.m6315c(), c9637jl.m6316d());
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.f6492b) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
            if (remoteConfigExtensionConfiguration != null) {
                remoteConfigExtensionConfiguration.getRemoteConfigUpdateListener().onRemoteConfigUpdated(new C8830Cj(sdkIdentifiers, c9457cg, c9637jl.f8450B.get(moduleServiceEntryPoint.getIdentifier())));
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8798Bc
    @NotNull
    /* renamed from: b */
    public final Map<String, C8996Jc> mo4990b() {
        CopyOnWriteArrayList<ModuleServiceEntryPoint> copyOnWriteArrayList = this.f6492b;
        ArrayList arrayList = new ArrayList();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : copyOnWriteArrayList) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = moduleServiceEntryPoint.getRemoteConfigExtensionConfiguration();
            Pair pairM7112to = remoteConfigExtensionConfiguration != null ? TuplesKt.m7112to(moduleServiceEntryPoint.getIdentifier(), new C8996Jc(remoteConfigExtensionConfiguration)) : null;
            if (pairM7112to != null) {
                arrayList.add(pairM7112to);
            }
        }
        return MapsKt__MapsKt.toMap(arrayList);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8798Bc
    @NotNull
    /* renamed from: c */
    public final Map<String, Integer> mo4991c() {
        List listEmptyList;
        Map<String, Integer> blocks;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6492b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = ((ModuleServiceEntryPoint) it.next()).getRemoteConfigExtensionConfiguration();
            if (remoteConfigExtensionConfiguration == null || (blocks = remoteConfigExtensionConfiguration.getBlocks()) == null || (listEmptyList = MapsKt___MapsKt.toList(blocks)) == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, listEmptyList);
        }
        return MapsKt__MapsKt.toMap(arrayList);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8798Bc
    @NotNull
    /* renamed from: d */
    public final List<Consumer<Location>> mo4992d() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6492b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            LocationServiceExtension locationServiceExtension = ((ModuleServiceEntryPoint) it.next()).getLocationServiceExtension();
            Consumer<Location> locationConsumer = locationServiceExtension != null ? locationServiceExtension.getLocationConsumer() : null;
            if (locationConsumer != null) {
                arrayList.add(locationConsumer);
            }
        }
        return arrayList;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8798Bc
    @Nullable
    /* renamed from: e */
    public final ModuleLocationSourcesServiceController mo4993e() {
        ModuleLocationSourcesServiceController locationSourcesController;
        Iterator it = this.f6492b.iterator();
        do {
            locationSourcesController = null;
            if (!it.hasNext()) {
                break;
            }
            LocationServiceExtension locationServiceExtension = ((ModuleServiceEntryPoint) it.next()).getLocationServiceExtension();
            if (locationServiceExtension != null) {
                locationSourcesController = locationServiceExtension.getLocationSourcesController();
            }
        } while (locationSourcesController == null);
        return locationSourcesController;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8798Bc
    @Nullable
    /* renamed from: f */
    public final Toggle mo4994f() {
        Toggle locationControllerAppStateToggle;
        Iterator it = this.f6492b.iterator();
        do {
            locationControllerAppStateToggle = null;
            if (!it.hasNext()) {
                break;
            }
            LocationServiceExtension locationServiceExtension = ((ModuleServiceEntryPoint) it.next()).getLocationServiceExtension();
            if (locationServiceExtension != null) {
                locationControllerAppStateToggle = locationServiceExtension.getLocationControllerAppStateToggle();
            }
        } while (locationControllerAppStateToggle == null);
        return locationControllerAppStateToggle;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8798Bc
    @NotNull
    /* renamed from: g */
    public final List<String> mo4995g() {
        List<String> listEmptyList;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6492b;
        ArrayList arrayList = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            RemoteConfigExtensionConfiguration remoteConfigExtensionConfiguration = ((ModuleServiceEntryPoint) it.next()).getRemoteConfigExtensionConfiguration();
            if (remoteConfigExtensionConfiguration == null || (listEmptyList = remoteConfigExtensionConfiguration.getFeatures()) == null) {
                listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, listEmptyList);
        }
        return arrayList;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    @NotNull
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.f6493c.getAskForPermissionStrategy();
    }

    @NotNull
    /* renamed from: h */
    public final Bundle m5085h() {
        Bundle bundle = new Bundle();
        for (ModuleServiceEntryPoint moduleServiceEntryPoint : this.f6492b) {
            ClientConfigProvider clientConfigProvider = moduleServiceEntryPoint.getClientConfigProvider();
            Bundle configBundleForClient = clientConfigProvider != null ? clientConfigProvider.getConfigBundleForClient() : null;
            if (configBundleForClient != null) {
                bundle.putBundle(moduleServiceEntryPoint.getIdentifier(), configBundleForClient);
            }
        }
        return bundle;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8798Bc
    @NotNull
    /* renamed from: a */
    public final List<ModuleServicesDatabase> mo4989a() {
        Object objValueOf;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6492b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                ModuleServicesDatabase moduleServicesDatabase = moduleServiceEntryPoint.getModuleServicesDatabase();
                objValueOf = moduleServicesDatabase != null ? Boolean.valueOf(arrayList.add(moduleServicesDatabase)) : null;
            } catch (Throwable th) {
                hashSet.add(moduleServiceEntryPoint);
                String identifier = moduleServiceEntryPoint.getIdentifier();
                C9610ij c9610ij = AbstractC8954Hi.f6726a;
                Map mapMapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m7112to(identifier, MapsKt__MapsJVMKt.mapOf(TuplesKt.m7112to("db", ExceptionsKt__ExceptionsKt.stackTraceToString(th)))));
                c9610ij.getClass();
                c9610ij.m6292a(new C9585hj("service_module_errors", mapMapOf));
                objValueOf = Unit.INSTANCE;
            }
            if (objValueOf != null) {
                arrayList2.add(objValueOf);
            }
        }
        this.f6492b.removeAll(hashSet);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void m5083a(@NotNull ModuleServiceEntryPoint<Object> moduleServiceEntryPoint) {
        this.f6492b.add(moduleServiceEntryPoint);
        if (Intrinsics.areEqual(this.f6491a, moduleServiceEntryPoint.getIdentifier()) && (moduleServiceEntryPoint instanceof AskForPermissionStrategyModuleProvider)) {
            this.f6493c = (AskForPermissionStrategyModuleProvider) moduleServiceEntryPoint;
        }
    }

    /* renamed from: a */
    public final void m5084a(@NotNull ServiceContext serviceContext, @NotNull C9637jl c9637jl) {
        HashSet hashSet = new HashSet();
        Iterator it = this.f6492b.iterator();
        while (it.hasNext()) {
            ModuleServiceEntryPoint moduleServiceEntryPoint = (ModuleServiceEntryPoint) it.next();
            try {
                moduleServiceEntryPoint.initServiceSide(serviceContext, new C8830Cj(new SdkIdentifiers(c9637jl.f8455d, c9637jl.f8452a, c9637jl.f8453b), new C9457cg(c9637jl.f8473v, c9637jl.f8472u), c9637jl.f8450B.get(moduleServiceEntryPoint.getIdentifier())));
                ModuleEventServiceHandlerFactory moduleEventServiceHandlerFactory = moduleServiceEntryPoint.getModuleEventServiceHandlerFactory();
                if (moduleEventServiceHandlerFactory != null) {
                    C8898Fc c8898Fc = C9676la.f8552C.f8574t;
                    String identifier = moduleServiceEntryPoint.getIdentifier();
                    synchronized (c8898Fc) {
                        c8898Fc.f6587a.put(identifier, moduleEventServiceHandlerFactory);
                    }
                } else {
                    continue;
                }
            } catch (Throwable th) {
                String identifier2 = moduleServiceEntryPoint.getIdentifier();
                C9610ij c9610ij = AbstractC8954Hi.f6726a;
                Map mapMapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m7112to(identifier2, MapsKt__MapsJVMKt.mapOf(TuplesKt.m7112to("init", ExceptionsKt__ExceptionsKt.stackTraceToString(th)))));
                c9610ij.getClass();
                c9610ij.m6292a(new C9585hj("service_module_errors", mapMapOf));
                hashSet.add(moduleServiceEntryPoint);
            }
        }
        this.f6492b.removeAll(hashSet);
    }
}
