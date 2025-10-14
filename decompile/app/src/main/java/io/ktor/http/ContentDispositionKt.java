package io.ktor.http;

import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;

/* compiled from: ContentDisposition.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002¨\u0006\u0004"}, m7105d2 = {"encodeContentDispositionAttribute", "", "key", "value", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nContentDisposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentDisposition.kt\nio/ktor/http/ContentDispositionKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,103:1\n1064#2,2:104\n*S KotlinDebug\n*F\n+ 1 ContentDisposition.kt\nio/ktor/http/ContentDispositionKt\n*L\n98#1:104,2\n*E\n"})
/* loaded from: classes5.dex */
public final class ContentDispositionKt {
    public static final String encodeContentDispositionAttribute(String str, String str2) {
        if (!Intrinsics.areEqual(str, ContentDisposition.Parameters.FileNameAsterisk) || StringsKt__StringsJVMKt.startsWith(str2, "utf-8''", true)) {
            return str2;
        }
        for (int i = 0; i < str2.length(); i++) {
            if (!CodecsKt.getATTRIBUTE_CHARACTERS().contains(Character.valueOf(str2.charAt(i)))) {
                return "utf-8''" + CodecsKt.percentEncode(str2, CodecsKt.getATTRIBUTE_CHARACTERS());
            }
        }
        return str2;
    }
}
