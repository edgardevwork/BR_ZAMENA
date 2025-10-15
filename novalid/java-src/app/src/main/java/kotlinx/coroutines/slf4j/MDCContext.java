package kotlinx.coroutines.slf4j;

import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.ThreadContextElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.MDC;

/* compiled from: MDCContext.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u00040\u00012\u00020\u0005:\u0001\u0011B!\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u0004¢\u0006\u0002\u0010\u0007J*\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u0004H\u0016J\"\u0010\u000f\u001a\u00020\u000b2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u0004H\u0002J\"\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u00042\u0006\u0010\f\u001a\u00020\rH\u0016R#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, m7105d2 = {"Lkotlinx/coroutines/slf4j/MDCContext;", "Lkotlinx/coroutines/ThreadContextElement;", "", "", "Lkotlinx/coroutines/slf4j/MDCContextMap;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "contextMap", "(Ljava/util/Map;)V", "getContextMap", "()Ljava/util/Map;", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "setCurrent", "updateThreadContext", "Key", "kotlinx-coroutines-slf4j"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class MDCContext extends AbstractCoroutineContextElement implements ThreadContextElement<Map<String, ? extends String>> {

    /* renamed from: Key, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    public final Map<String, String> contextMap;

    public MDCContext() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public /* bridge */ /* synthetic */ void restoreThreadContext(CoroutineContext coroutineContext, Map<String, ? extends String> map) {
        restoreThreadContext2(coroutineContext, (Map<String, String>) map);
    }

    public /* synthetic */ MDCContext(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MDC.getCopyOfContextMap() : map);
    }

    @Nullable
    public final Map<String, String> getContextMap() {
        return this.contextMap;
    }

    public MDCContext(@Nullable Map<String, String> map) {
        super(INSTANCE);
        this.contextMap = map;
    }

    /* compiled from: MDCContext.kt */
    @Metadata(m7104d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m7105d2 = {"Lkotlinx/coroutines/slf4j/MDCContext$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/slf4j/MDCContext;", "()V", "kotlinx-coroutines-slf4j"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: kotlinx.coroutines.slf4j.MDCContext$Key, reason: from kotlin metadata */
    /* loaded from: classes5.dex */
    public static final class Companion implements CoroutineContext.Key<MDCContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    @Nullable
    public Map<String, ? extends String> updateThreadContext(@NotNull CoroutineContext context) {
        Map<String, String> copyOfContextMap = MDC.getCopyOfContextMap();
        setCurrent(this.contextMap);
        return copyOfContextMap;
    }

    /* renamed from: restoreThreadContext, reason: avoid collision after fix types in other method */
    public void restoreThreadContext2(@NotNull CoroutineContext context, @Nullable Map<String, String> oldState) {
        setCurrent(oldState);
    }

    public final void setCurrent(Map<String, String> contextMap) {
        if (contextMap == null) {
            MDC.clear();
        } else {
            MDC.setContextMap(contextMap);
        }
    }
}
