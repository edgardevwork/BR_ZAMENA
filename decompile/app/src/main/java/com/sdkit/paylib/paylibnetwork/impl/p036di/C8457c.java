package com.sdkit.paylib.paylibnetwork.impl.p036di;

import android.content.Context;
import com.sdkit.paylib.payliblogging.api.logging.PaylibLoggerFactory;
import com.sdkit.paylib.paylibnetwork.api.domain.WebViewCertificateVerifier;
import com.sdkit.paylib.paylibnetwork.impl.domain.C8479e;
import com.sdkit.paylib.paylibnetwork.impl.domain.C8480f;
import com.sdkit.paylib.paylibnetwork.impl.domain.C8482h;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.C11403R;

/* renamed from: com.sdkit.paylib.paylibnetwork.impl.di.c */
/* loaded from: classes6.dex */
public final class C8457c {

    /* renamed from: a */
    public static final C8457c f4130a = new C8457c();

    /* renamed from: a */
    public final WebViewCertificateVerifier m3802a(Context context, PaylibLoggerFactory loggerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loggerFactory, "loggerFactory");
        return new C8482h(context, loggerFactory);
    }

    /* renamed from: a */
    public final C8479e m3803a(C8480f sslProviderFactory) {
        Intrinsics.checkNotNullParameter(sslProviderFactory, "sslProviderFactory");
        return C8480f.m3852a(sslProviderFactory, CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(C11403R.raw.paylib_network_globalsign_gcc_r3_dv_tls_ca_2020), Integer.valueOf(C11403R.raw.paylib_network_sbol_ca_root_ext), Integer.valueOf(C11403R.raw.paylib_network_ministry_of_digital_dev), Integer.valueOf(C11403R.raw.paylib_network_ministry_of_digital_root), Integer.valueOf(C11403R.raw.paylib_network_ministry_of_digital_new)}), false, 2, null);
    }
}
