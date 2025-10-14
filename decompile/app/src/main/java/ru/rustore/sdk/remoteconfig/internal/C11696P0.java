package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.remoteconfig.RemoteConfigException;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.P0 */
/* loaded from: classes6.dex */
public final class C11696P0 extends Lambda implements Function1<C11686K0, C11686K0> {

    /* renamed from: a */
    public static final C11696P0 f10842a = new C11696P0();

    public C11696P0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C11686K0 invoke(C11686K0 c11686k0) throws RemoteConfigException.FailedToReceiveRemoteConfig {
        C11686K0 c11686k02 = c11686k0;
        if (c11686k02 != null) {
            return c11686k02;
        }
        throw new RemoteConfigException.FailedToReceiveRemoteConfig("Remote configuration not received yet", null, 2, 0 == true ? 1 : 0);
    }
}
