package io.ktor.util.debug.plugins;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PluginsTrace.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, m7105d2 = {"Lio/ktor/util/debug/plugins/PluginTraceElement;", "", "pluginName", "", "handler", "event", "Lio/ktor/util/debug/plugins/PluginTraceElement$PluginEvent;", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/util/debug/plugins/PluginTraceElement$PluginEvent;)V", "getEvent", "()Lio/ktor/util/debug/plugins/PluginTraceElement$PluginEvent;", "getHandler", "()Ljava/lang/String;", "getPluginName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PluginEvent", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PluginTraceElement {

    @NotNull
    public final PluginEvent event;

    @NotNull
    public final String handler;

    @NotNull
    public final String pluginName;

    /* compiled from: PluginsTrace.kt */
    @Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m7105d2 = {"Lio/ktor/util/debug/plugins/PluginTraceElement$PluginEvent;", "", "(Ljava/lang/String;I)V", "STARTED", "FINISHED", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public enum PluginEvent {
        STARTED,
        FINISHED
    }

    public static /* synthetic */ PluginTraceElement copy$default(PluginTraceElement pluginTraceElement, String str, String str2, PluginEvent pluginEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pluginTraceElement.pluginName;
        }
        if ((i & 2) != 0) {
            str2 = pluginTraceElement.handler;
        }
        if ((i & 4) != 0) {
            pluginEvent = pluginTraceElement.event;
        }
        return pluginTraceElement.copy(str, str2, pluginEvent);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPluginName() {
        return this.pluginName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getHandler() {
        return this.handler;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PluginEvent getEvent() {
        return this.event;
    }

    @NotNull
    public final PluginTraceElement copy(@NotNull String pluginName, @NotNull String handler, @NotNull PluginEvent event) {
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(event, "event");
        return new PluginTraceElement(pluginName, handler, event);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PluginTraceElement)) {
            return false;
        }
        PluginTraceElement pluginTraceElement = (PluginTraceElement) other;
        return Intrinsics.areEqual(this.pluginName, pluginTraceElement.pluginName) && Intrinsics.areEqual(this.handler, pluginTraceElement.handler) && this.event == pluginTraceElement.event;
    }

    public int hashCode() {
        return (((this.pluginName.hashCode() * 31) + this.handler.hashCode()) * 31) + this.event.hashCode();
    }

    @NotNull
    public String toString() {
        return "PluginTraceElement(pluginName=" + this.pluginName + ", handler=" + this.handler + ", event=" + this.event + ')';
    }

    public PluginTraceElement(@NotNull String pluginName, @NotNull String handler, @NotNull PluginEvent event) {
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(event, "event");
        this.pluginName = pluginName;
        this.handler = handler;
        this.event = event;
    }

    @NotNull
    public final PluginEvent getEvent() {
        return this.event;
    }

    @NotNull
    public final String getHandler() {
        return this.handler;
    }

    @NotNull
    public final String getPluginName() {
        return this.pluginName;
    }
}
