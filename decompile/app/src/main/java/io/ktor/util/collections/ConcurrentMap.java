package io.ktor.util.collections;

import androidx.lifecycle.SavedStateHandle;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConcurrentMapJvm.kt */
@Metadata(m7104d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\b\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u000f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0017\u001a\u00020\u0018H\u0016J!\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u001a\u001a\u00028\u00002\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c¢\u0006\u0002\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 J\u0015\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010 J\u0013\u0010#\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\u0018\u0010&\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0005H\u0016J\b\u0010)\u001a\u00020\u001fH\u0016J\u001f\u0010*\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010+J\u001e\u0010,\u001a\u00020\u00182\u0014\u0010-\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010.H\u0016J\u0017\u0010/\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010'J\u001d\u0010/\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\"\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00100J\b\u00101\u001a\u000202H\u0016R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b0\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u00063"}, m7105d2 = {"Lio/ktor/util/collections/ConcurrentMap;", "Key", "Value", "", "initialCapacity", "", "(I)V", "delegate", "Ljava/util/concurrent/ConcurrentHashMap;", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "size", "getSize", "()I", SavedStateHandle.VALUES, "", "getValues", "()Ljava/util/Collection;", "clear", "", "computeIfAbsent", "key", "block", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "containsKey", "", "(Ljava/lang/Object;)Z", "containsValue", "value", "equals", "other", "", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "isEmpty", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "from", "", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "toString", "", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class ConcurrentMap<Key, Value> implements Map<Key, Value>, KMutableMap {

    @NotNull
    public final ConcurrentHashMap<Key, Value> delegate;

    public ConcurrentMap() {
        this(0, 1, null);
    }

    public ConcurrentMap(int i) {
        this.delegate = new ConcurrentHashMap<>(i);
    }

    public /* synthetic */ ConcurrentMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 32 : i);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<Key, Value>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Key> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Value> values() {
        return getValues();
    }

    public static final Object computeIfAbsent$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return tmp0.invoke(obj);
    }

    public final Value computeIfAbsent(Key key, @NotNull final Function0<? extends Value> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ConcurrentHashMap<Key, Value> concurrentHashMap = this.delegate;
        final Function1<Key, Value> function1 = new Function1<Key, Value>() { // from class: io.ktor.util.collections.ConcurrentMap.computeIfAbsent.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Value invoke(Key key2) {
                return block.invoke();
            }
        };
        return concurrentHashMap.computeIfAbsent(key, new Function() { // from class: io.ktor.util.collections.ConcurrentMap$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ConcurrentMap.computeIfAbsent$lambda$0(function1, obj);
            }
        });
    }

    public int getSize() {
        return this.delegate.size();
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return this.delegate.containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return this.delegate.containsValue(value);
    }

    @Override // java.util.Map
    @Nullable
    public Value get(Object key) {
        return this.delegate.get(key);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @NotNull
    public Set<Map.Entry<Key, Value>> getEntries() {
        Set<Map.Entry<Key, Value>> setEntrySet = this.delegate.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "delegate.entries");
        return setEntrySet;
    }

    @NotNull
    public Set<Key> getKeys() {
        Set<Key> setKeySet = this.delegate.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "delegate.keys");
        return setKeySet;
    }

    @NotNull
    public Collection<Value> getValues() {
        Collection<Value> collectionValues = this.delegate.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "delegate.values");
        return collectionValues;
    }

    @Override // java.util.Map
    public void clear() {
        this.delegate.clear();
    }

    @Override // java.util.Map
    @Nullable
    public Value put(Key key, Value value) {
        return this.delegate.put(key, value);
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends Key, ? extends Value> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.delegate.putAll(from);
    }

    @Override // java.util.Map
    @Nullable
    public Value remove(Object key) {
        return this.delegate.remove(key);
    }

    @Override // java.util.Map
    public boolean remove(Object key, Object value) {
        return this.delegate.remove(key, value);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.delegate.hashCode();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object other) {
        if (other instanceof Map) {
            return Intrinsics.areEqual(other, this.delegate);
        }
        return false;
    }

    @NotNull
    public String toString() {
        return "ConcurrentMapJvm by " + this.delegate;
    }
}
