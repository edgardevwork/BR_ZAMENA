package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.remoteconfig.RemoteConfigException;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.A */
/* loaded from: classes6.dex */
public final class C11665A extends Lambda implements Function1<C11765u, C11765u> {

    /* renamed from: a */
    public static final C11665A f10723a = new C11665A();

    public C11665A() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C11765u invoke(C11765u c11765u) throws RemoteConfigException.FailedToReceiveRemoteConfig {
        C11765u c11765u2 = c11765u;
        if (c11765u2 != null) {
            return c11765u2;
        }
        throw new RemoteConfigException.FailedToReceiveRemoteConfig("Remote configuration not received yet", null, 2, 0 == true ? 1 : 0);
    }
}
