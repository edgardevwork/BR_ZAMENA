package io.ktor.util;

import androidx.exifinterface.media.ExifInterface;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: Attributes.kt */
@Metadata(m7104d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002*J\b\u0007\u0010\u0004\u001a\u0004\b\u0000\u0010\u0005\"\b\u0012\u0004\u0012\u0002H\u00050\u00062\b\u0012\u0004\u0012\u0002H\u00050\u0006B*\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u001c\b\n\u0012\u0018\b\u000bB\u0014\b\u000b\u0012\u0006\b\f\u0012\u0002\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e¨\u0006\u000f"}, m7105d2 = {"putAll", "", "Lio/ktor/util/Attributes;", "other", "EquatableAttributeKey", ExifInterface.GPS_DIRECTION_TRUE, "Lio/ktor/util/AttributeKey;", "Lkotlin/Deprecated;", ThrowableDeserializer.PROP_NAME_MESSAGE, "Please use `AttributeKey` class instead", "replaceWith", "Lkotlin/ReplaceWith;", "imports", "expression", "AttributeKey", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Attributes.kt\nio/ktor/util/AttributesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n1855#2,2:115\n*S KotlinDebug\n*F\n+ 1 Attributes.kt\nio/ktor/util/AttributesKt\n*L\n109#1:115,2\n*E\n"})
/* loaded from: classes7.dex */
public final class AttributesKt {
    @Deprecated(message = "Please use `AttributeKey` class instead", replaceWith = @ReplaceWith(expression = "AttributeKey", imports = {}))
    public static /* synthetic */ void EquatableAttributeKey$annotations() {
    }

    public static final void putAll(@NotNull Attributes attributes, @NotNull Attributes other) {
        Intrinsics.checkNotNullParameter(attributes, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator<T> it = other.getAllKeys().iterator();
        while (it.hasNext()) {
            AttributeKey attributeKey = (AttributeKey) it.next();
            Intrinsics.checkNotNull(attributeKey, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            attributes.put(attributeKey, other.get(attributeKey));
        }
    }
}
