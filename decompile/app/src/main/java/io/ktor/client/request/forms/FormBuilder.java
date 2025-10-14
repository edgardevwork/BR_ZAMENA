package io.ktor.client.request.forms;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import io.ktor.http.Headers;
import io.ktor.util.InternalAPI;
import io.ktor.utils.p050io.core.ByteReadPacket;
import io.ktor.utils.p050io.core.Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: formDsl.kt */
@Metadata(m7104d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0012\n\u0002\u0010\u0004\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0006\u001a\u00020\u0007\"\b\b\u0000\u0010\b*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u0005J1\u0010\u0006\u001a\u00020\u0007\"\b\b\u0000\u0010\b*\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u0002H\b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000fJ \u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00102\b\b\u0002\u0010\r\u001a\u00020\u000eJ \u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00112\b\b\u0002\u0010\r\u001a\u00020\u000eJ \u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00122\b\b\u0002\u0010\r\u001a\u00020\u000eJ+\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u0015J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00162\b\b\u0002\u0010\r\u001a\u00020\u000eJ \u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00172\b\b\u0002\u0010\r\u001a\u00020\u000eJ \u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00182\b\b\u0002\u0010\r\u001a\u00020\u000eJ \u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eJ&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00192\b\b\u0002\u0010\r\u001a\u00020\u000eJ7\u0010\u001a\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0002\u0010 J\u0017\u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\"H\u0000¢\u0006\u0002\b#R\u0018\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m7105d2 = {"Lio/ktor/client/request/forms/FormBuilder;", "", "()V", "parts", "", "Lio/ktor/client/request/forms/FormPart;", "append", "", ExifInterface.GPS_DIRECTION_TRUE, "part", "key", "", "value", "headers", "Lio/ktor/http/Headers;", "(Ljava/lang/String;Ljava/lang/Object;Lio/ktor/http/Headers;)V", "Lio/ktor/client/request/forms/ChannelProvider;", "Lio/ktor/client/request/forms/InputProvider;", "Lio/ktor/utils/io/core/ByteReadPacket;", SavedStateHandle.VALUES, "", "(Ljava/lang/String;[Ljava/lang/String;Lio/ktor/http/Headers;)V", "", "", "", "", "appendInput", "size", "", "block", "Lkotlin/Function0;", "Lio/ktor/utils/io/core/Input;", "(Ljava/lang/String;Lio/ktor/http/Headers;Ljava/lang/Long;Lkotlin/jvm/functions/Function0;)V", "build", "", "build$ktor_client_core", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nformDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 formDsl.kt\nio/ktor/client/request/forms/FormBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,234:1\n1855#2,2:235\n*S KotlinDebug\n*F\n+ 1 formDsl.kt\nio/ktor/client/request/forms/FormBuilder\n*L\n151#1:235,2\n*E\n"})
/* loaded from: classes4.dex */
public final class FormBuilder {

    @NotNull
    public final List<FormPart<?>> parts = new ArrayList();

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, Object obj, Headers headers, int i, Object obj2) {
        if ((i & 4) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, (String) obj, headers);
    }

    @InternalAPI
    public final <T> void append(@NotNull String key, @NotNull T value, @NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.parts.add(new FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, String str2, Headers headers, int i, Object obj) {
        if ((i & 4) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, str2, headers);
    }

    public final void append(@NotNull String key, @NotNull String value, @NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.parts.add(new FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, Number number, Headers headers, int i, Object obj) {
        if ((i & 4) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, number, headers);
    }

    public final void append(@NotNull String key, @NotNull Number value, @NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.parts.add(new FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, boolean z, Headers headers, int i, Object obj) {
        if ((i & 4) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, z, headers);
    }

    public final void append(@NotNull String key, boolean value, @NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.parts.add(new FormPart<>(key, Boolean.valueOf(value), headers));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, byte[] bArr, Headers headers, int i, Object obj) {
        if ((i & 4) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, bArr, headers);
    }

    public final void append(@NotNull String key, @NotNull byte[] value, @NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.parts.add(new FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, InputProvider inputProvider, Headers headers, int i, Object obj) {
        if ((i & 4) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, inputProvider, headers);
    }

    public final void append(@NotNull String key, @NotNull InputProvider value, @NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.parts.add(new FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void appendInput$default(FormBuilder formBuilder, String str, Headers headers, Long l, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        if ((i & 4) != 0) {
            l = null;
        }
        formBuilder.appendInput(str, headers, l, function0);
    }

    public final void appendInput(@NotNull String key, @NotNull Headers headers, @Nullable Long size, @NotNull Function0<? extends Input> block) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(block, "block");
        this.parts.add(new FormPart<>(key, new InputProvider(size, block), headers));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, ByteReadPacket byteReadPacket, Headers headers, int i, Object obj) {
        if ((i & 4) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, byteReadPacket, headers);
    }

    public final void append(@NotNull String key, @NotNull ByteReadPacket value, @NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.parts.add(new FormPart<>(key, value, headers));
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, Iterable iterable, Headers headers, int i, Object obj) {
        if ((i & 4) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, (Iterable<String>) iterable, headers);
    }

    public final void append(@NotNull String key, @NotNull Iterable<String> values, @NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (!StringsKt__StringsJVMKt.endsWith$default(key, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, false, 2, null)) {
            throw new IllegalArgumentException(("Array parameter must be suffixed with square brackets ie `" + key + "[]`").toString());
        }
        Iterator<String> it = values.iterator();
        while (it.hasNext()) {
            this.parts.add(new FormPart<>(key, it.next(), headers));
        }
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, String[] strArr, Headers headers, int i, Object obj) {
        if ((i & 4) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, strArr, headers);
    }

    public final void append(@NotNull String key, @NotNull String[] values, @NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(headers, "headers");
        append(key, ArraysKt___ArraysKt.asIterable(values), headers);
    }

    public static /* synthetic */ void append$default(FormBuilder formBuilder, String str, ChannelProvider channelProvider, Headers headers, int i, Object obj) {
        if ((i & 4) != 0) {
            headers = Headers.INSTANCE.getEmpty();
        }
        formBuilder.append(str, channelProvider, headers);
    }

    public final void append(@NotNull String key, @NotNull ChannelProvider value, @NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.parts.add(new FormPart<>(key, value, headers));
    }

    public final <T> void append(@NotNull FormPart<T> part) {
        Intrinsics.checkNotNullParameter(part, "part");
        this.parts.add(part);
    }

    @NotNull
    public final List<FormPart<?>> build$ktor_client_core() {
        return this.parts;
    }
}
