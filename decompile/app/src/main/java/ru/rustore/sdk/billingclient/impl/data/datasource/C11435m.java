package ru.rustore.sdk.billingclient.impl.data.datasource;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.user.profile.UserProfileProvider;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.datasource.m */
/* loaded from: classes5.dex */
public final class C11435m {

    /* renamed from: a */
    public final UserProfileProvider f10227a;

    /* renamed from: b */
    public final String f10228b;

    public C11435m(UserProfileProvider userProfileProvider, String packageName) {
        Intrinsics.checkNotNullParameter(userProfileProvider, "userProfileProvider");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.f10227a = userProfileProvider;
        this.f10228b = packageName;
    }
}
