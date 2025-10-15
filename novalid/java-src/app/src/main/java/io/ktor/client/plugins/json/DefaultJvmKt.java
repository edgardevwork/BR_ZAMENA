package io.ktor.client.plugins.json;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: DefaultJvm.kt */
@Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"}, m7105d2 = {"defaultSerializer", "Lio/ktor/client/plugins/json/JsonSerializer;", "ktor-client-json"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nDefaultJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultJvm.kt\nio/ktor/client/plugins/json/DefaultJvmKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,25:1\n1963#2,14:26\n*S KotlinDebug\n*F\n+ 1 DefaultJvm.kt\nio/ktor/client/plugins/json/DefaultJvmKt\n*L\n23#1:26,14\n*E\n"})
/* loaded from: classes4.dex */
public final class DefaultJvmKt {
    @NotNull
    public static final JsonSerializer defaultSerializer() {
        Object obj;
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(JsonSerializer.class);
        Intrinsics.checkNotNullExpressionValue(serviceLoaderLoad, "load(JsonSerializer::class.java)");
        List list = CollectionsKt___CollectionsKt.toList(serviceLoaderLoad);
        if (list.isEmpty()) {
            throw new IllegalStateException("Fail to find serializer. Consider to add one of the following dependencies: \n - ktor-client-gson\n - ktor-client-json\n - ktor-client-serialization".toString());
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                do {
                    Object next2 = it.next();
                    if ("javaClass".compareTo("javaClass") < 0) {
                        next = next2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Intrinsics.checkNotNull(obj);
        return (JsonSerializer) obj;
    }
}
