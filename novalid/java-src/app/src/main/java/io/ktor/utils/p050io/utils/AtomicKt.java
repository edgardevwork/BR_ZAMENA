package io.ktor.utils.p050io.utils;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty1;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Atomic.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u000b0\nH\u0080\b¨\u0006\f"}, m7105d2 = {"getIOIntProperty", "", "name", "", "default", "longUpdater", "Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;", "Owner", "", "p", "Lkotlin/reflect/KProperty1;", "", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class AtomicKt {
    public static final /* synthetic */ <Owner> AtomicLongFieldUpdater<Owner> longUpdater(KProperty1<Owner, Long> p) {
        Intrinsics.checkNotNullParameter(p, "p");
        Intrinsics.reifiedOperationMarker(4, "Owner");
        AtomicLongFieldUpdater<Owner> atomicLongFieldUpdaterNewUpdater = AtomicLongFieldUpdater.newUpdater(Object.class, p.getName());
        Intrinsics.checkNotNullExpressionValue(atomicLongFieldUpdaterNewUpdater, "newUpdater(Owner::class.java, p.name)");
        return atomicLongFieldUpdaterNewUpdater;
    }

    public static final int getIOIntProperty(@NotNull String name, int i) {
        String property;
        Integer intOrNull;
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            property = System.getProperty("io.ktor.utils.io." + name);
        } catch (SecurityException unused) {
            property = null;
        }
        return (property == null || (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(property)) == null) ? i : intOrNull.intValue();
    }
}
