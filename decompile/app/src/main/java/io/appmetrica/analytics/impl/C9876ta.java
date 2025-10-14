package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.ta */
/* loaded from: classes7.dex */
public final class C9876ta extends AbstractC9010K2 {

    /* renamed from: b */
    public final C9801qa f9115b;

    /* renamed from: c */
    public final C9801qa f9116c;

    /* renamed from: d */
    public final C9851sa f9117d;

    public C9876ta(int i, int i2, int i3) {
        this(i, new C9801qa(i2), new C9801qa(i3));
    }

    public C9876ta(int i, @NonNull C9801qa c9801qa, @NonNull C9801qa c9801qa2) {
        super(i);
        this.f9117d = new C9851sa();
        this.f9115b = c9801qa;
        this.f9116c = c9801qa2;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9010K2, io.appmetrica.analytics.impl.InterfaceC9826ra
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9054Lm mo5318a(@Nullable Map<String, String> map) {
        HashMap map2;
        int bytesTruncated;
        int i = 0;
        if (map != null) {
            map2 = new HashMap();
            Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
            Map.Entry[] entryArr = (Map.Entry[]) setEntrySet.toArray(new Map.Entry[setEntrySet.size()]);
            Arrays.sort(entryArr, this.f9117d);
            int length = entryArr.length;
            bytesTruncated = 0;
            int i2 = 0;
            boolean z = false;
            int i3 = 0;
            while (i < length) {
                Map.Entry entry = entryArr[i];
                C9054Lm c9054LmMo5318a = this.f9115b.mo5318a((String) entry.getKey());
                C9054Lm c9054LmMo5318a2 = this.f9116c.mo5318a((String) entry.getValue());
                int utf8BytesLength = StringUtils.getUtf8BytesLength((String) entry.getValue()) + StringUtils.getUtf8BytesLength((String) entry.getKey());
                int utf8BytesLength2 = StringUtils.getUtf8BytesLength((String) c9054LmMo5318a2.f6954a) + StringUtils.getUtf8BytesLength((String) c9054LmMo5318a.f6954a);
                if (z || utf8BytesLength2 + i3 > this.f6853a) {
                    i2++;
                    bytesTruncated += utf8BytesLength;
                    z = true;
                } else {
                    bytesTruncated = c9054LmMo5318a2.f6955b.getBytesTruncated() + c9054LmMo5318a.f6955b.getBytesTruncated() + bytesTruncated;
                    int utf8BytesLength3 = StringUtils.getUtf8BytesLength((String) c9054LmMo5318a2.f6954a) + StringUtils.getUtf8BytesLength((String) c9054LmMo5318a.f6954a) + i3;
                    map2.put((String) c9054LmMo5318a.f6954a, (String) c9054LmMo5318a2.f6954a);
                    i3 = utf8BytesLength3;
                }
                i++;
            }
            i = i2;
        } else {
            map2 = null;
            bytesTruncated = 0;
        }
        return new C9054Lm(map2, new C8815C4(i, bytesTruncated));
    }
}
