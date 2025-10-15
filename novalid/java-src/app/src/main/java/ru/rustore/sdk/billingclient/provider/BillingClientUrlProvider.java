package ru.rustore.sdk.billingclient.provider;

import android.content.Context;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.Metadata;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.rustore.sdk.billingclient.impl.data.repository.C11488p;
import ru.rustore.sdk.billingclient.impl.data.repository.C11496x;
import ru.rustore.sdk.billingclient.impl.p067di.C11497a;
import ru.rustore.sdk.core.util.RuStoreUtils;

@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m7105d2 = {"Lru/rustore/sdk/billingclient/provider/BillingClientUrlProvider;", "", SegmentConstantPool.INITSTRING, "()V", "", "provide", "()Ljava/lang/String;", "Lru/rustore/sdk/billingclient/impl/data/repository/p;", "getRustoreAuthorizationInfoRepository", "()Lru/rustore/sdk/billingclient/impl/data/repository/p;", "rustoreAuthorizationInfoRepository", "Lru/rustore/sdk/billingclient/impl/data/repository/x;", "getWebAuthorizationInfoRepository", "()Lru/rustore/sdk/billingclient/impl/data/repository/x;", "webAuthorizationInfoRepository", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Companion", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0})
/* loaded from: classes7.dex */
public final class BillingClientUrlProvider {

    @Deprecated
    public static final String RELEASE_TYPE = "release";

    public final Context getContext() {
        Lazy<C11497a> lazy = C11497a.f10328u0;
        WeakReference<Context> weakReference = C11497a.C11965b.m7463a().f10371i;
        Context context = weakReference != null ? weakReference.get() : null;
        if (context != null) {
            return context;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final C11488p getRustoreAuthorizationInfoRepository() {
        Lazy<C11497a> lazy = C11497a.f10328u0;
        return (C11488p) C11497a.C11965b.m7463a().f10393t.getValue();
    }

    public final C11496x getWebAuthorizationInfoRepository() {
        Lazy<C11497a> lazy = C11497a.f10328u0;
        return (C11496x) C11497a.C11965b.m7463a().f10338J.getValue();
    }

    public final String provide() {
        RuStoreUtils.INSTANCE.isRuStoreInstalled(getContext());
        return null;
    }
}
