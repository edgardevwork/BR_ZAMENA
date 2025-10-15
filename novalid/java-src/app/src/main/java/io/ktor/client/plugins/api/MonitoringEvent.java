package io.ktor.client.plugins.api;

import io.ktor.client.HttpClient;
import io.ktor.events.EventDefinition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CommonHooks.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00010\u00042\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00070\u00060\u0005B\r\u0012\u0006\u0010\b\u001a\u00028\u0001¢\u0006\u0002\u0010\tJ$\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0010\u0010\b\u001a\u00028\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u000f"}, m7105d2 = {"Lio/ktor/client/plugins/api/MonitoringEvent;", "Param", "", "Event", "Lio/ktor/events/EventDefinition;", "Lio/ktor/client/plugins/api/ClientHook;", "Lkotlin/Function1;", "", "event", "(Lio/ktor/events/EventDefinition;)V", "Lio/ktor/events/EventDefinition;", "install", "client", "Lio/ktor/client/HttpClient;", "handler", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class MonitoringEvent<Param, Event extends EventDefinition<Param>> implements ClientHook<Function1<? super Param, ? extends Unit>> {

    @NotNull
    public final Event event;

    public MonitoringEvent(@NotNull Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.event = event;
    }

    @Override // io.ktor.client.plugins.api.ClientHook
    public void install(@NotNull HttpClient client, @NotNull final Function1<? super Param, Unit> handler) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(handler, "handler");
        client.getMonitor().subscribe(this.event, new Function1<Param, Unit>() { // from class: io.ktor.client.plugins.api.MonitoringEvent.install.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2((C101511) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Param it) {
                Intrinsics.checkNotNullParameter(it, "it");
                handler.invoke(it);
            }
        });
    }
}
