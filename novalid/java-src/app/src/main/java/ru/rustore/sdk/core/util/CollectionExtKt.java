package ru.rustore.sdk.core.util;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CollectionExt.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a$\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u001a\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002\u001a\u0012\u0010\b\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002\u001a$\u0010\t\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\n"}, m7105d2 = {"findActivityComponentName", "Landroid/content/ComponentName;", "", "Landroid/content/pm/ResolveInfo;", "releasePackage", "", "debugPackage", "findRuStoreActivityComponentName", "findRuStoreServiceComponentName", "findServiceComponentName", "sdk-public-core_release"}, m7106k = 2, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class CollectionExtKt {
    @Nullable
    public static final ComponentName findRuStoreServiceComponentName(@NotNull List<? extends ResolveInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return findServiceComponentName(list, "ru.vk.store", "ru.vk.store.qa");
    }

    @Nullable
    public static final ComponentName findRuStoreActivityComponentName(@NotNull List<? extends ResolveInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return findActivityComponentName(list, "ru.vk.store", "ru.vk.store.qa");
    }

    @SuppressLint({})
    @Nullable
    public static final ComponentName findServiceComponentName(@NotNull List<? extends ResolveInfo> list, @NotNull String releasePackage, @NotNull String debugPackage) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(releasePackage, "releasePackage");
        Intrinsics.checkNotNullParameter(debugPackage, "debugPackage");
        List<? extends ResolveInfo> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10)), 16));
        for (ResolveInfo resolveInfo : list2) {
            Pair pairM7112to = TuplesKt.m7112to(resolveInfo.serviceInfo.packageName, resolveInfo);
            linkedHashMap.put(pairM7112to.getFirst(), pairM7112to.getSecond());
        }
        ResolveInfo resolveInfo2 = (ResolveInfo) linkedHashMap.get(debugPackage);
        if (resolveInfo2 == null) {
            resolveInfo2 = (ResolveInfo) linkedHashMap.get(releasePackage);
        }
        if (resolveInfo2 == null) {
            return null;
        }
        ServiceInfo serviceInfo = resolveInfo2.serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    @SuppressLint({})
    @Nullable
    public static final ComponentName findActivityComponentName(@NotNull List<? extends ResolveInfo> list, @NotNull String releasePackage, @NotNull String debugPackage) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(releasePackage, "releasePackage");
        Intrinsics.checkNotNullParameter(debugPackage, "debugPackage");
        List<? extends ResolveInfo> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10)), 16));
        for (ResolveInfo resolveInfo : list2) {
            Pair pairM7112to = TuplesKt.m7112to(resolveInfo.activityInfo.packageName, resolveInfo);
            linkedHashMap.put(pairM7112to.getFirst(), pairM7112to.getSecond());
        }
        ResolveInfo resolveInfo2 = (ResolveInfo) linkedHashMap.get(debugPackage);
        if (resolveInfo2 == null) {
            resolveInfo2 = (ResolveInfo) linkedHashMap.get(releasePackage);
        }
        if (resolveInfo2 == null) {
            return null;
        }
        ActivityInfo activityInfo = resolveInfo2.activityInfo;
        return new ComponentName(activityInfo.packageName, activityInfo.name);
    }
}
