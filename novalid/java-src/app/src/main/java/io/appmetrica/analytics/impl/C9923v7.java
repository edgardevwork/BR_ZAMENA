package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.v7 */
/* loaded from: classes5.dex */
public final class C9923v7 implements Converter {

    /* renamed from: a */
    public final C9848s7 f9216a;

    public C9923v7() {
        this(null, 1, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final ContentValues fromModel(@NotNull C9898u7 c9898u7) {
        ContentValues contentValues = new ContentValues();
        Long l = c9898u7.f9166a;
        if (l != null) {
            contentValues.put("id", Long.valueOf(l.longValue()));
        }
        EnumC9436bk enumC9436bk = c9898u7.f9167b;
        if (enumC9436bk != null) {
            contentValues.put("type", Integer.valueOf(enumC9436bk.f7798a));
        }
        String str = c9898u7.f9168c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        C9848s7 c9848s7 = this.f9216a;
        contentValues.put("session_description", MessageNano.toByteArray(c9848s7.f9039a.fromModel(c9898u7.f9169d)));
        return contentValues;
    }

    public C9923v7(@NotNull C9848s7 c9848s7) {
        this.f9216a = c9848s7;
    }

    public /* synthetic */ C9923v7(C9848s7 c9848s7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C9848s7(null, 1, null) : c9848s7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final C9898u7 toModel(@NotNull ContentValues contentValues) {
        EnumC9436bk enumC9436bk;
        Long asLong = contentValues.getAsLong("id");
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            int iIntValue = asInteger.intValue();
            enumC9436bk = EnumC9436bk.FOREGROUND;
            if (iIntValue != 0 && iIntValue == 1) {
                enumC9436bk = EnumC9436bk.BACKGROUND;
            }
        } else {
            enumC9436bk = null;
        }
        return new C9898u7(asLong, enumC9436bk, contentValues.getAsString("report_request_parameters"), this.f9216a.toModel(contentValues.getAsByteArray("session_description")));
    }
}
