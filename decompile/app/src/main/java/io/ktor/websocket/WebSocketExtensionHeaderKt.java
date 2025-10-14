package io.ktor.websocket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jfrog.filespecs.properties.PropertiesParser;

/* compiled from: WebSocketExtensionHeader.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m7105d2 = {"parseWebSocketExtensions", "", "Lio/ktor/websocket/WebSocketExtensionHeader;", "value", "", "ktor-websockets"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWebSocketExtensionHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketExtensionHeader.kt\nio/ktor/websocket/WebSocketExtensionHeaderKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1549#2:47\n1620#2,2:48\n1549#2:50\n1620#2,3:51\n1622#2:54\n*S KotlinDebug\n*F\n+ 1 WebSocketExtensionHeader.kt\nio/ktor/websocket/WebSocketExtensionHeaderKt\n*L\n40#1:47\n40#1:48,2\n43#1:50\n43#1:51,3\n40#1:54\n*E\n"})
/* loaded from: classes7.dex */
public final class WebSocketExtensionHeaderKt {
    @NotNull
    public static final List<WebSocketExtensionHeader> parseWebSocketExtensions(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) value, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{PropertiesParser.PROPS_SEPARATOR}, false, 0, 6, (Object) null);
            String string = StringsKt__StringsKt.trim((CharSequence) CollectionsKt___CollectionsKt.first(listSplit$default2)).toString();
            List listDrop = CollectionsKt___CollectionsKt.drop(listSplit$default2, 1);
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listDrop, 10));
            Iterator it2 = listDrop.iterator();
            while (it2.hasNext()) {
                arrayList2.add(StringsKt__StringsKt.trim((CharSequence) it2.next()).toString());
            }
            arrayList.add(new WebSocketExtensionHeader(string, arrayList2));
        }
        return arrayList;
    }
}
