package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;
import io.appmetrica.analytics.coreutils.internal.network.UserAgent;
import io.appmetrica.analytics.networktasks.internal.AESRSARequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* renamed from: io.appmetrica.analytics.impl.rd */
/* loaded from: classes7.dex */
public final class C9829rd {

    /* renamed from: a */
    public static final C9829rd f8994a = new C9829rd();

    /* renamed from: b */
    public static final LinkedHashMap f8995b = new LinkedHashMap();

    /* renamed from: c */
    public static final String f8996c = UserAgent.getFor(BuildConfig.LIBRARY_PACKAGE_NAME, "7.3.0", "50119713");

    /* renamed from: a */
    public final synchronized ExponentialBackoffDataHolder m6755a(EnumC9779pd enumC9779pd) {
        Object exponentialBackoffDataHolder;
        try {
            LinkedHashMap linkedHashMap = f8995b;
            exponentialBackoffDataHolder = linkedHashMap.get(enumC9779pd);
            if (exponentialBackoffDataHolder == null) {
                exponentialBackoffDataHolder = new ExponentialBackoffDataHolder(new C9901ua(C9676la.f8552C.m6386w(), enumC9779pd));
                linkedHashMap.put(enumC9779pd, exponentialBackoffDataHolder);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ExponentialBackoffDataHolder) exponentialBackoffDataHolder;
    }

    /* renamed from: a */
    public static final NetworkTask m6754a(C9571h5 c9571h5) {
        AESRSARequestBodyEncrypter aESRSARequestBodyEncrypter = new AESRSARequestBodyEncrypter();
        C9907ug c9907ug = new C9907ug(aESRSARequestBodyEncrypter);
        C9877tb c9877tb = new C9877tb(c9571h5);
        return new NetworkTask(new BlockingExecutor(), new C9925v9(c9571h5.f8228a), new AllHostsExponentialBackoffPolicy(f8994a.m6755a(EnumC9779pd.REPORT)), new C9144Pg(c9571h5, c9907ug, c9877tb, new FullUrlFormer(c9907ug, c9877tb), new RequestDataHolder(), new ResponseDataHolder(new DefaultResponseValidityChecker()), c9571h5.m6211h(), c9571h5.m6218o(), c9571h5.m6224u(), aESRSARequestBodyEncrypter), CollectionsKt__CollectionsJVMKt.listOf(new C9639jn()), f8996c);
    }
}
