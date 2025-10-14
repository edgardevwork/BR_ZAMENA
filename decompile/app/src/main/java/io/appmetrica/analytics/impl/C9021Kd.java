package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.JsonParser;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Kd */
/* loaded from: classes8.dex */
public final class C9021Kd implements InterfaceC9399a8 {

    /* renamed from: a */
    public final C9093Nd f6886a;

    /* renamed from: b */
    public final C8789B3 f6887b;

    /* renamed from: c */
    public final C9801qa f6888c;

    /* renamed from: d */
    public final C9381Ze f6889d;

    public C9021Kd() {
        this(new C9093Nd(), new C8789B3(), new C9801qa(100), new C9381Ze());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C9288Vh> fromModel(@NonNull C8997Jd c8997Jd) {
        C9288Vh c9288VhFromModel;
        C9874t8 c9874t8 = new C9874t8();
        c9874t8.f9099a = c8997Jd.f6823a;
        c9874t8.f9104f = new C9599i8();
        C9045Ld c9045Ld = c8997Jd.f6824b;
        C9549g8 c9549g8 = new C9549g8();
        c9549g8.f8179a = StringUtils.getUTF8Bytes(c9045Ld.f6936a);
        C9054Lm c9054LmMo5318a = this.f6888c.mo5318a(c9045Ld.f6937b);
        c9549g8.f8180b = StringUtils.getUTF8Bytes((String) c9054LmMo5318a.f6954a);
        c9549g8.f8183e = c9045Ld.f6938c.size();
        Map<String, String> map = c9045Ld.f6939d;
        if (map != null) {
            c9288VhFromModel = this.f6886a.fromModel(map);
            c9549g8.f8181c = (C9649k8) c9288VhFromModel.f7371a;
        } else {
            c9288VhFromModel = null;
        }
        c9874t8.f9104f.f8350a = c9549g8;
        C9844s3 c9844s3 = new C9844s3(C9844s3.m6791b(c9054LmMo5318a, c9288VhFromModel));
        List list = c9045Ld.f6938c;
        ArrayList arrayList = new ArrayList();
        this.f6889d.getClass();
        int iComputeInt32Size = c9874t8.f9099a != new C9874t8().f9099a ? CodedOutputByteBufferNano.computeInt32Size(1, c9874t8.f9099a) : 0;
        C9849s8 c9849s8 = c9874t8.f9100b;
        if (c9849s8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(2, c9849s8);
        }
        C9799q8 c9799q8 = c9874t8.f9101c;
        if (c9799q8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c9799q8);
        }
        C9824r8 c9824r8 = c9874t8.f9102d;
        int i = 4;
        if (c9824r8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(4, c9824r8);
        }
        C9449c8 c9449c8 = c9874t8.f9103e;
        if (c9449c8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(5, c9449c8);
        }
        C9599i8 c9599i8 = c9874t8.f9104f;
        if (c9599i8 != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c9599i8);
        }
        ArrayList arrayList2 = new ArrayList();
        C9874t8 c9874t82 = new C9874t8();
        c9874t82.f9099a = c9874t8.f9099a;
        C9599i8 c9599i82 = new C9599i8();
        c9874t82.f9104f = c9599i82;
        c9599i82.f8350a = new C9549g8();
        C9549g8 c9549g82 = c9874t82.f9104f.f8350a;
        C9549g8 c9549g83 = c9874t8.f9104f.f8350a;
        c9549g82.f8180b = c9549g83.f8180b;
        c9549g82.f8179a = c9549g83.f8179a;
        c9549g82.f8183e = c9549g83.f8183e;
        c9549g82.f8181c = c9549g83.f8181c;
        int i2 = 0;
        C9844s3 c9844s32 = c9844s3;
        int i3 = iComputeInt32Size;
        while (i2 < list.size()) {
            C8814C3 c8814c3 = (C8814C3) list.get(i2);
            C9574h8 c9574h8 = new C9574h8();
            c9574h8.f8257a = i2;
            C9288Vh c9288VhFromModel2 = this.f6887b.fromModel(c8814c3);
            c9574h8.f8258b = (C9474d8) c9288VhFromModel2.f7371a;
            c9288VhFromModel2.f7372b.getBytesTruncated();
            C9288Vh c9288Vh = new C9288Vh(c9574h8, c9288VhFromModel2);
            C9381Ze c9381Ze = this.f6889d;
            C9574h8 c9574h82 = (C9574h8) c9288Vh.f7371a;
            c9381Ze.getClass();
            int iComputeTagSize = CodedOutputByteBufferNano.computeTagSize(i);
            int iComputeMessageSizeNoTag = CodedOutputByteBufferNano.computeMessageSizeNoTag(c9574h82);
            int iComputeRawVarint32Size = iComputeTagSize + iComputeMessageSizeNoTag + ((iComputeMessageSizeNoTag & JsonParser.MIN_BYTE_I) == 0 ? 0 : CodedOutputByteBufferNano.computeRawVarint32Size(iComputeMessageSizeNoTag));
            if (arrayList2.size() != 0 && i3 + iComputeRawVarint32Size > 204800) {
                c9874t82.f9104f.f8350a.f8182d = (C9574h8[]) arrayList2.toArray(new C9574h8[arrayList2.size()]);
                ArrayList arrayList3 = new ArrayList();
                arrayList.add(new C9288Vh(c9874t82, c9844s32));
                C9874t8 c9874t83 = new C9874t8();
                c9874t83.f9099a = c9874t8.f9099a;
                C9599i8 c9599i83 = new C9599i8();
                c9874t83.f9104f = c9599i83;
                c9599i83.f8350a = new C9549g8();
                C9549g8 c9549g84 = c9874t83.f9104f.f8350a;
                C9549g8 c9549g85 = c9874t8.f9104f.f8350a;
                c9549g84.f8180b = c9549g85.f8180b;
                c9549g84.f8179a = c9549g85.f8179a;
                c9549g84.f8183e = c9549g85.f8183e;
                c9549g84.f8181c = c9549g85.f8181c;
                c9844s32 = c9844s3;
                i3 = iComputeInt32Size;
                c9874t82 = c9874t83;
                arrayList2 = arrayList3;
            }
            arrayList2.add((C9574h8) c9288Vh.f7371a);
            c9844s32 = new C9844s3(C9844s3.m6791b(c9844s32, c9288Vh.f7372b));
            i3 += iComputeRawVarint32Size;
            i2++;
            i = 4;
        }
        c9874t82.f9104f.f8350a.f8182d = (C9574h8[]) arrayList2.toArray(new C9574h8[arrayList2.size()]);
        arrayList.add(new C9288Vh(c9874t82, c9844s32));
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C9021Kd(C9093Nd c9093Nd, C8789B3 c8789b3, C9801qa c9801qa, C9381Ze c9381Ze) {
        this.f6886a = c9093Nd;
        this.f6887b = c8789b3;
        this.f6888c = c9801qa;
        this.f6889d = c9381Ze;
    }

    @NonNull
    /* renamed from: a */
    public final C8997Jd m5329a(@NonNull List<C9288Vh> list) {
        throw new UnsupportedOperationException();
    }
}
