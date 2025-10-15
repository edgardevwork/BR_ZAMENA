package ru.rustore.sdk.remoteconfig;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import ru.rustore.sdk.core.tasks.Task;
import ru.rustore.sdk.remoteconfig.RemoteConfigException;
import ru.rustore.sdk.remoteconfig.internal.C11676F0;
import ru.rustore.sdk.remoteconfig.internal.InterfaceC11766u0;

@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0004\b\u000b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\u000e"}, m7105d2 = {"Lru/rustore/sdk/remoteconfig/RemoteConfigClient;", "", "Lru/rustore/sdk/remoteconfig/internal/u0;", "remoteConfigController", SegmentConstantPool.INITSTRING, "(Lru/rustore/sdk/remoteconfig/internal/u0;)V", "Lru/rustore/sdk/core/tasks/Task;", "", "init", "()Lru/rustore/sdk/core/tasks/Task;", "Lru/rustore/sdk/remoteconfig/RemoteConfig;", "getRemoteConfig", "Lru/rustore/sdk/remoteconfig/internal/u0;", "Companion", "sdk-public-remoteconfig_release"}, m7106k = 1, m7107mv = {1, 7, 0})
/* loaded from: classes5.dex */
public final class RemoteConfigClient {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public final InterfaceC11766u0 remoteConfigController;

    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Lru/rustore/sdk/remoteconfig/RemoteConfigClient$Companion;", "", "()V", "instance", "Lru/rustore/sdk/remoteconfig/RemoteConfigClient;", "getInstance", "()Lru/rustore/sdk/remoteconfig/RemoteConfigClient;", "sdk-public-remoteconfig_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public final RemoteConfigClient getInstance() throws RemoteConfigException.RemoteConfigClientNotCreated {
            C11676F0 c11676f0 = C11676F0.f10747Q;
            if (c11676f0 != null) {
                return (RemoteConfigClient) c11676f0.f10774h.getValue();
            }
            throw new RemoteConfigException.RemoteConfigClientNotCreated("To get an instance of the RemoteConfigClient, you must first call\n                   RemoteConfigClientBuilder(appId, context).build()", null, 2, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RemoteConfigClient(InterfaceC11766u0 remoteConfigController) {
        Intrinsics.checkNotNullParameter(remoteConfigController, "remoteConfigController");
        this.remoteConfigController = remoteConfigController;
    }

    public final Task<RemoteConfig> getRemoteConfig() {
        return this.remoteConfigController.mo7510a();
    }

    public final Task<Unit> init() {
        return this.remoteConfigController.mo7511b();
    }
}
