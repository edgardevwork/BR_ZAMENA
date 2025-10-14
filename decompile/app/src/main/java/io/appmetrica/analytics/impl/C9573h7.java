package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.h7 */
/* loaded from: classes8.dex */
public final class C9573h7 implements Converter {

    /* renamed from: a */
    public final C9498e7 f8255a;

    public C9573h7() {
        this(null, 1, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final ContentValues fromModel(@NotNull C9548g7 c9548g7) {
        ContentValues contentValues = new ContentValues();
        Long l = c9548g7.f8171a;
        if (l != null) {
            contentValues.put("session_id", Long.valueOf(l.longValue()));
        }
        EnumC9436bk enumC9436bk = c9548g7.f8172b;
        if (enumC9436bk != null) {
            contentValues.put("session_type", Integer.valueOf(enumC9436bk.f7798a));
        }
        Long l2 = c9548g7.f8173c;
        if (l2 != null) {
            contentValues.put("number_in_session", Long.valueOf(l2.longValue()));
        }
        EnumC9329Xa enumC9329Xa = c9548g7.f8174d;
        if (enumC9329Xa != null) {
            contentValues.put("type", Integer.valueOf(enumC9329Xa.f7518a));
        }
        Long l3 = c9548g7.f8175e;
        if (l3 != null) {
            contentValues.put("global_number", Long.valueOf(l3.longValue()));
        }
        Long l4 = c9548g7.f8176f;
        if (l4 != null) {
            contentValues.put("time", Long.valueOf(l4.longValue()));
        }
        C9498e7 c9498e7 = this.f8255a;
        contentValues.put("event_description", MessageNano.toByteArray(c9498e7.f7993a.fromModel(c9548g7.f8177g)));
        return contentValues;
    }

    public C9573h7(@NotNull C9498e7 c9498e7) {
        this.f8255a = c9498e7;
    }

    public /* synthetic */ C9573h7(C9498e7 c9498e7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C9498e7(null, 1, null) : c9498e7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final C9548g7 toModel(@NotNull ContentValues contentValues) {
        EnumC9436bk enumC9436bk;
        Long asLong = contentValues.getAsLong("session_id");
        Integer asInteger = contentValues.getAsInteger("session_type");
        if (asInteger != null) {
            int iIntValue = asInteger.intValue();
            enumC9436bk = EnumC9436bk.FOREGROUND;
            if (iIntValue != 0 && iIntValue == 1) {
                enumC9436bk = EnumC9436bk.BACKGROUND;
            }
        } else {
            enumC9436bk = null;
        }
        Long asLong2 = contentValues.getAsLong("number_in_session");
        Integer asInteger2 = contentValues.getAsInteger("type");
        return new C9548g7(asLong, enumC9436bk, asLong2, asInteger2 != null ? EnumC9329Xa.m5744a(asInteger2.intValue()) : null, contentValues.getAsLong("global_number"), contentValues.getAsLong("time"), this.f8255a.toModel(contentValues.getAsByteArray("event_description")));
    }
}
