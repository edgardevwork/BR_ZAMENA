package io.ktor.client.plugins.kotlinx.serializer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: KotlinxSerializer.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a\u001c\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\b"}, m7105d2 = {"buildSerializer", "Lkotlinx/serialization/KSerializer;", "", "value", "module", "Lkotlinx/serialization/modules/SerializersModule;", "elementSerializer", "", "ktor-client-serialization"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nKotlinxSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinxSerializer.kt\nio/ktor/client/plugins/kotlinx/serializer/KotlinxSerializerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n1#2:103\n1549#3:104\n1620#3,3:105\n1655#3,8:108\n1549#3:116\n1620#3,3:117\n1747#3,3:120\n*S KotlinDebug\n*F\n+ 1 KotlinxSerializer.kt\nio/ktor/client/plugins/kotlinx/serializer/KotlinxSerializerKt\n*L\n78#1:104\n78#1:105,3\n78#1:108,8\n83#1:116\n83#1:117,3\n96#1:120,3\n*E\n"})
/* loaded from: classes4.dex */
public final class KotlinxSerializerKt {
    public static final KSerializer<Object> buildSerializer(Object obj, SerializersModule serializersModule) {
        KSerializer<Object> kSerializerSerializer;
        if (obj instanceof JsonElement) {
            kSerializerSerializer = JsonElement.INSTANCE.serializer();
        } else if (obj instanceof List) {
            kSerializerSerializer = BuiltinSerializersKt.ListSerializer(elementSerializer((Collection) obj, serializersModule));
        } else if (obj instanceof Object[]) {
            Object objFirstOrNull = ArraysKt___ArraysKt.firstOrNull((Object[]) obj);
            if (objFirstOrNull == null || (kSerializerSerializer = buildSerializer(objFirstOrNull, serializersModule)) == null) {
                kSerializerSerializer = BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE));
            }
        } else if (obj instanceof Set) {
            kSerializerSerializer = BuiltinSerializersKt.SetSerializer(elementSerializer((Collection) obj, serializersModule));
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            kSerializerSerializer = BuiltinSerializersKt.MapSerializer(elementSerializer(map.keySet(), serializersModule), elementSerializer(map.values(), serializersModule));
        } else {
            KSerializer<Object> contextual$default = SerializersModule.getContextual$default(serializersModule, Reflection.getOrCreateKotlinClass(obj.getClass()), null, 2, null);
            kSerializerSerializer = contextual$default == null ? SerializersKt.serializer(Reflection.getOrCreateKotlinClass(obj.getClass())) : contextual$default;
        }
        Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return kSerializerSerializer;
    }

    public static final KSerializer<?> elementSerializer(Collection<?> collection, SerializersModule serializersModule) {
        Collection<?> collection2 = collection;
        List listFilterNotNull = CollectionsKt___CollectionsKt.filterNotNull(collection2);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFilterNotNull, 10));
        Iterator it = listFilterNotNull.iterator();
        while (it.hasNext()) {
            arrayList.add(buildSerializer(it.next(), serializersModule));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((KSerializer) obj).getDescriptor().getSerialName())) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.size() > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((KSerializer) it2.next()).getDescriptor().getSerialName());
            }
            sb.append(arrayList3);
            throw new IllegalStateException(sb.toString().toString());
        }
        KSerializer<String> kSerializerSerializer = (KSerializer) CollectionsKt___CollectionsKt.singleOrNull((List) arrayList2);
        if (kSerializerSerializer == null) {
            kSerializerSerializer = BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE);
        }
        if (kSerializerSerializer.getDescriptor().isNullable()) {
            return kSerializerSerializer;
        }
        Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
            Iterator<T> it3 = collection2.iterator();
            while (it3.hasNext()) {
                if (it3.next() == null) {
                    return BuiltinSerializersKt.getNullable(kSerializerSerializer);
                }
            }
        }
        return kSerializerSerializer;
    }
}
