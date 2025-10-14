package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestPipeline;
import io.ktor.util.AttributeKey;
import io.ktor.util.KtorDsl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;

/* compiled from: UserAgent.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0002\u0007\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m7105d2 = {"Lio/ktor/client/plugins/UserAgent;", "", "agent", "", "(Ljava/lang/String;)V", "getAgent", "()Ljava/lang/String;", "Config", "Plugin", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class UserAgent {

    /* renamed from: Plugin, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final AttributeKey<UserAgent> key = new AttributeKey<>("UserAgent");

    @NotNull
    public final String agent;

    public /* synthetic */ UserAgent(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public UserAgent(String str) {
        this.agent = str;
    }

    @NotNull
    public final String getAgent() {
        return this.agent;
    }

    /* compiled from: UserAgent.kt */
    @KtorDsl
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m7105d2 = {"Lio/ktor/client/plugins/UserAgent$Config;", "", "agent", "", "(Ljava/lang/String;)V", "getAgent", "()Ljava/lang/String;", "setAgent", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Config {

        @NotNull
        public String agent;

        public Config() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Config(@NotNull String agent) {
            Intrinsics.checkNotNullParameter(agent, "agent");
            this.agent = agent;
        }

        public /* synthetic */ Config(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "Ktor http-client" : str);
        }

        @NotNull
        public final String getAgent() {
            return this.agent;
        }

        public final void setAgent(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.agent = str;
        }
    }

    /* compiled from: UserAgent.kt */
    @Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J!\u0010\u000e\u001a\u00020\u00032\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0002\b\u0011H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m7105d2 = {"Lio/ktor/client/plugins/UserAgent$Plugin;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/client/plugins/UserAgent$Config;", "Lio/ktor/client/plugins/UserAgent;", "()V", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "install", "", "plugin", PomReader.SCOPE, "Lio/ktor/client/HttpClient;", "prepare", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: io.ktor.client.plugins.UserAgent$Plugin, reason: from kotlin metadata */
    /* loaded from: classes7.dex */
    public static final class Companion implements HttpClientPlugin<Config, UserAgent> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        @NotNull
        public AttributeKey<UserAgent> getKey() {
            return UserAgent.key;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.ktor.client.plugins.HttpClientPlugin
        @NotNull
        public UserAgent prepare(@NotNull Function1<? super Config, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Config config = new Config(null, 1, 0 == true ? 1 : 0);
            block.invoke(config);
            return new UserAgent(config.getAgent(), 0 == true ? 1 : 0);
        }

        @Override // io.ktor.client.plugins.HttpClientPlugin
        public void install(@NotNull UserAgent plugin, @NotNull HttpClient scope) {
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.getRequestPipeline().intercept(HttpRequestPipeline.INSTANCE.getState(), new UserAgent$Plugin$install$1(plugin, null));
        }
    }
}
