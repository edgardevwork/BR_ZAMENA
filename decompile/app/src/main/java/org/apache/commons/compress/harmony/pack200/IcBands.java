package org.apache.commons.compress.harmony.pack200;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes6.dex */
public class IcBands extends BandSet {
    public int bit16Count;
    public final CpBands cpBands;
    public final Set<IcTuple> innerClasses;
    public final Map<String, List<IcTuple>> outerToInner;

    public IcBands(SegmentHeader segmentHeader, CpBands cpBands, int i) {
        super(i, segmentHeader);
        this.innerClasses = new TreeSet();
        this.bit16Count = 0;
        this.outerToInner = new HashMap();
        this.cpBands = cpBands;
    }

    public void finaliseBands() {
        this.segmentHeader.setIc_count(this.innerClasses.size());
    }

    @Override // org.apache.commons.compress.harmony.pack200.BandSet
    public void pack(OutputStream outputStream) throws Pack200Exception, IOException {
        PackingUtils.log("Writing internal class bands...");
        int size = this.innerClasses.size();
        int[] iArr = new int[size];
        int size2 = this.innerClasses.size();
        int[] iArr2 = new int[size2];
        int i = this.bit16Count;
        int[] iArr3 = new int[i];
        int[] iArr4 = new int[i];
        ArrayList arrayList = new ArrayList(this.innerClasses);
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            IcTuple icTuple = (IcTuple) arrayList.get(i3);
            iArr[i3] = icTuple.f9869C.getIndex();
            int i4 = icTuple.f9871F;
            iArr2[i3] = i4;
            if ((i4 & 65536) != 0) {
                CPClass cPClass = icTuple.f9870C2;
                iArr3[i2] = cPClass == null ? 0 : cPClass.getIndex() + 1;
                CPUTF8 cputf8 = icTuple.f9872N;
                iArr4[i2] = cputf8 == null ? 0 : cputf8.getIndex() + 1;
                i2++;
            }
        }
        byte[] bArrEncodeBandInt = encodeBandInt("ic_this_class", iArr, Codec.UDELTA5);
        outputStream.write(bArrEncodeBandInt);
        PackingUtils.log("Wrote " + bArrEncodeBandInt.length + " bytes from ic_this_class[" + size + "]");
        byte[] bArrEncodeBandInt2 = encodeBandInt("ic_flags", iArr2, Codec.UNSIGNED5);
        outputStream.write(bArrEncodeBandInt2);
        PackingUtils.log("Wrote " + bArrEncodeBandInt2.length + " bytes from ic_flags[" + size2 + "]");
        BHSDCodec bHSDCodec = Codec.DELTA5;
        byte[] bArrEncodeBandInt3 = encodeBandInt("ic_outer_class", iArr3, bHSDCodec);
        outputStream.write(bArrEncodeBandInt3);
        PackingUtils.log("Wrote " + bArrEncodeBandInt3.length + " bytes from ic_outer_class[" + i + "]");
        byte[] bArrEncodeBandInt4 = encodeBandInt("ic_name", iArr4, bHSDCodec);
        outputStream.write(bArrEncodeBandInt4);
        PackingUtils.log("Wrote " + bArrEncodeBandInt4.length + " bytes from ic_name[" + i + "]");
    }

    public void addInnerClass(String str, String str2, String str3, int i) {
        if (str2 != null || str3 != null) {
            if (namesArePredictable(str, str2, str3)) {
                IcTuple icTuple = new IcTuple(this.cpBands.getCPClass(str), i, null, null);
                addToMap(str2, icTuple);
                this.innerClasses.add(icTuple);
                return;
            } else {
                IcTuple icTuple2 = new IcTuple(this.cpBands.getCPClass(str), i | 65536, this.cpBands.getCPClass(str2), this.cpBands.getCPUtf8(str3));
                if (this.innerClasses.add(icTuple2)) {
                    this.bit16Count++;
                    addToMap(str2, icTuple2);
                    return;
                }
                return;
            }
        }
        IcTuple icTuple3 = new IcTuple(this.cpBands.getCPClass(str), i, null, null);
        addToMap(getOuter(str), icTuple3);
        this.innerClasses.add(icTuple3);
    }

    public List<IcTuple> getInnerClassesForOuter(String str) {
        return this.outerToInner.get(str);
    }

    public final String getOuter(String str) {
        return str.substring(0, str.lastIndexOf(36));
    }

    public final void addToMap(String str, IcTuple icTuple) {
        List<IcTuple> list = this.outerToInner.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.outerToInner.put(str, arrayList);
            arrayList.add(icTuple);
        } else {
            Iterator<IcTuple> it = list.iterator();
            while (it.hasNext()) {
                if (icTuple.equals(it.next())) {
                    return;
                }
            }
            list.add(icTuple);
        }
    }

    public final boolean namesArePredictable(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append('$');
        sb.append(str3);
        return str.equals(sb.toString()) && str3.indexOf(36) == -1;
    }

    /* loaded from: classes7.dex */
    public class IcTuple implements Comparable<IcTuple> {

        /* renamed from: C */
        public CPClass f9869C;

        /* renamed from: C2 */
        public CPClass f9870C2;

        /* renamed from: F */
        public int f9871F;

        /* renamed from: N */
        public CPUTF8 f9872N;

        public IcTuple(CPClass cPClass, int i, CPClass cPClass2, CPUTF8 cputf8) {
            this.f9869C = cPClass;
            this.f9871F = i;
            this.f9870C2 = cPClass2;
            this.f9872N = cputf8;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof IcTuple)) {
                return false;
            }
            IcTuple icTuple = (IcTuple) obj;
            return this.f9869C.equals(icTuple.f9869C) && this.f9871F == icTuple.f9871F && Objects.equals(this.f9870C2, icTuple.f9870C2) && Objects.equals(this.f9872N, icTuple.f9872N);
        }

        public String toString() {
            return this.f9869C.toString();
        }

        @Override // java.lang.Comparable
        public int compareTo(IcTuple icTuple) {
            return this.f9869C.compareTo(icTuple.f9869C);
        }

        public boolean isAnonymous() {
            String string = this.f9869C.toString();
            return Character.isDigit(string.substring(string.lastIndexOf(36) + 1).charAt(0));
        }
    }

    public IcTuple getIcTuple(CPClass cPClass) {
        for (IcTuple icTuple : this.innerClasses) {
            if (icTuple.f9869C.equals(cPClass)) {
                return icTuple;
            }
        }
        return null;
    }
}
