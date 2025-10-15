package io.ktor.util.debug.plugins;

import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PluginName.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m7105d2 = {"Lio/ktor/util/debug/plugins/PluginName;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "pluginName", "", "(Ljava/lang/String;)V", "getPluginName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Key", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PluginName extends AbstractCoroutineContextElement {

    /* renamed from: Key, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public final String pluginName;

    public static /* synthetic */ PluginName copy$default(PluginName pluginName, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pluginName.pluginName;
        }
        return pluginName.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPluginName() {
        return this.pluginName;
    }

    @NotNull
    public final PluginName copy(@NotNull String pluginName) {
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        return new PluginName(pluginName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PluginName) && Intrinsics.areEqual(this.pluginName, ((PluginName) other).pluginName);
    }

    public int hashCode() {
        return this.pluginName.hashCode();
    }

    @NotNull
    public final String getPluginName() {
        return this.pluginName;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginName(@NotNull String pluginName) {
        super(INSTANCE);
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        this.pluginName = pluginName;
    }

    /* compiled from: PluginName.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m7105d2 = {"Lio/ktor/util/debug/plugins/PluginName$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lio/ktor/util/debug/plugins/PluginName;", "()V", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.util.debug.plugins.PluginName$Key, reason: from kotlin metadata */
    /* loaded from: classes7.dex */
    public static final class Companion implements CoroutineContext.Key<PluginName> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @NotNull
    public String toString() {
        return "PluginName(" + this.pluginName + ')';
    }
}
