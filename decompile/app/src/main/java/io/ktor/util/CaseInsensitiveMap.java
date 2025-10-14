package io.ktor.util;

import androidx.lifecycle.SavedStateHandle;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CaseInsensitiveMap.kt */
@Metadata(m7104d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0004H\u0016J\u0015\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0018\u0010!\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001b\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\u0010H\u0016J\b\u0010$\u001a\u00020\u001aH\u0016J\u001f\u0010%\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010&J\u001e\u0010'\u001a\u00020\u00182\u0014\u0010(\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000)H\u0016J\u0017\u0010*\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\"R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\n0\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006+"}, m7105d2 = {"Lio/ktor/util/CaseInsensitiveMap;", "Value", "", "", "", "()V", "delegate", "Lio/ktor/util/CaseInsensitiveString;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "size", "", "getSize", "()I", SavedStateHandle.VALUES, "", "getValues", "()Ljava/util/Collection;", "clear", "", "containsKey", "", "key", "containsValue", "value", "(Ljava/lang/Object;)Z", "equals", "other", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "hashCode", "isEmpty", "put", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "", "remove", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCaseInsensitiveMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaseInsensitiveMap.kt\nio/ktor/util/CaseInsensitiveMap\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,78:1\n215#2,2:79\n*S KotlinDebug\n*F\n+ 1 CaseInsensitiveMap.kt\nio/ktor/util/CaseInsensitiveMap\n*L\n30#1:79,2\n*E\n"})
/* loaded from: classes5.dex */
public final class CaseInsensitiveMap<Value> implements Map<String, Value>, KMutableMap {

    @NotNull
    public final Map<CaseInsensitiveString, Value> delegate = new LinkedHashMap();

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Value>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ Value get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(String str, Object obj) {
        return put2(str, (String) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Value remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Value> values() {
        return getValues();
    }

    public int getSize() {
        return this.delegate.size();
    }

    public boolean containsKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.delegate.containsKey(new CaseInsensitiveString(key));
    }

    @Override // java.util.Map
    public boolean containsValue(@Nullable Object value) {
        if (value == null) {
            return false;
        }
        return this.delegate.containsValue(value);
    }

    @Nullable
    public Value get(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.delegate.get(TextKt.caseInsensitive(key));
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override // java.util.Map
    public void clear() {
        this.delegate.clear();
    }

    @Nullable
    /* renamed from: put, reason: avoid collision after fix types in other method */
    public Value put2(@NotNull String key, @NotNull Value value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.delegate.put(TextKt.caseInsensitive(key), value);
    }

    @Nullable
    public Value remove(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.delegate.remove(TextKt.caseInsensitive(key));
    }

    @NotNull
    public Set<String> getKeys() {
        return new DelegatingMutableSet(this.delegate.keySet(), new Function1<CaseInsensitiveString, String>() { // from class: io.ktor.util.CaseInsensitiveMap$keys$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final String invoke(@NotNull CaseInsensitiveString $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                return $receiver.getContent();
            }
        }, new Function1<String, CaseInsensitiveString>() { // from class: io.ktor.util.CaseInsensitiveMap$keys$2
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CaseInsensitiveString invoke(@NotNull String $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                return TextKt.caseInsensitive($receiver);
            }
        });
    }

    @NotNull
    public Set<Map.Entry<String, Value>> getEntries() {
        return new DelegatingMutableSet(this.delegate.entrySet(), new Function1<Map.Entry<CaseInsensitiveString, Value>, Map.Entry<String, Value>>() { // from class: io.ktor.util.CaseInsensitiveMap$entries$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Map.Entry<String, Value> invoke(@NotNull Map.Entry<CaseInsensitiveString, Value> $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                return new Entry($receiver.getKey().getContent(), $receiver.getValue());
            }
        }, new Function1<Map.Entry<String, Value>, Map.Entry<CaseInsensitiveString, Value>>() { // from class: io.ktor.util.CaseInsensitiveMap$entries$2
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Map.Entry<CaseInsensitiveString, Value> invoke(@NotNull Map.Entry<String, Value> $receiver) {
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                return new Entry(TextKt.caseInsensitive($receiver.getKey()), $receiver.getValue());
            }
        });
    }

    @NotNull
    public Collection<Value> getValues() {
        return this.delegate.values();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object other) {
        if (other == null || !(other instanceof CaseInsensitiveMap)) {
            return false;
        }
        return Intrinsics.areEqual(((CaseInsensitiveMap) other).delegate, this.delegate);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.delegate.hashCode();
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends String, ? extends Value> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry<? extends String, ? extends Value> entry : from.entrySet()) {
            put2(entry.getKey(), (String) entry.getValue());
        }
    }
}
