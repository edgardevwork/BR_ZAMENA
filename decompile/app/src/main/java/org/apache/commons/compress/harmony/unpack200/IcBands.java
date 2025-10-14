package org.apache.commons.compress.harmony.unpack200;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry;

/* loaded from: classes6.dex */
public class IcBands extends BandSet {
    public final String[] cpClass;
    public final String[] cpUTF8;
    public IcTuple[] icAll;
    public Map<String, List<IcTuple>> outerClassToTuples;
    public Map<String, IcTuple> thisClassToTuple;

    public IcBands(Segment segment) {
        super(segment);
        this.cpClass = segment.getCpBands().getCpClass();
        this.cpUTF8 = segment.getCpBands().getCpUTF8();
    }

    @Override // org.apache.commons.compress.harmony.unpack200.BandSet
    public void read(InputStream inputStream) throws Pack200Exception, IOException {
        String str;
        String str2;
        int i;
        int i2;
        int innerClassCount = this.header.getInnerClassCount();
        int[] iArrDecodeBandInt = decodeBandInt("ic_this_class", inputStream, Codec.UDELTA5, innerClassCount);
        String[] references = getReferences(iArrDecodeBandInt, this.cpClass);
        int[] iArrDecodeBandInt2 = decodeBandInt("ic_flags", inputStream, Codec.UNSIGNED5, innerClassCount);
        int iCountBit16 = SegmentUtils.countBit16(iArrDecodeBandInt2);
        int[] iArrDecodeBandInt3 = decodeBandInt("ic_outer_class", inputStream, Codec.DELTA5, iCountBit16);
        String[] strArr = new String[iCountBit16];
        for (int i3 = 0; i3 < iCountBit16; i3++) {
            int i4 = iArrDecodeBandInt3[i3];
            if (i4 == 0) {
                strArr[i3] = null;
            } else {
                strArr[i3] = this.cpClass[i4 - 1];
            }
        }
        int[] iArrDecodeBandInt4 = decodeBandInt("ic_name", inputStream, Codec.DELTA5, iCountBit16);
        String[] strArr2 = new String[iCountBit16];
        for (int i5 = 0; i5 < iCountBit16; i5++) {
            int i6 = iArrDecodeBandInt4[i5];
            if (i6 == 0) {
                strArr2[i5] = null;
            } else {
                strArr2[i5] = this.cpUTF8[i6 - 1];
            }
        }
        this.icAll = new IcTuple[references.length];
        int i7 = 0;
        for (int i8 = 0; i8 < references.length; i8++) {
            String str3 = references[i8];
            int i9 = iArrDecodeBandInt2[i8];
            int i10 = iArrDecodeBandInt[i8];
            if ((65536 & i9) != 0) {
                String str4 = strArr[i7];
                String str5 = strArr2[i7];
                int i11 = iArrDecodeBandInt3[i7] - 1;
                int i12 = iArrDecodeBandInt4[i7] - 1;
                i7++;
                i2 = i12;
                i = i11;
                str2 = str5;
                str = str4;
            } else {
                str = null;
                str2 = null;
                i = -1;
                i2 = -1;
            }
            this.icAll[i8] = new IcTuple(str3, i9, str, str2, i10, i, i2, i8);
        }
    }

    @Override // org.apache.commons.compress.harmony.unpack200.BandSet
    public void unpack() throws Pack200Exception, IOException {
        IcTuple[] icTuples = getIcTuples();
        this.thisClassToTuple = new HashMap(icTuples.length);
        this.outerClassToTuples = new HashMap(icTuples.length);
        for (IcTuple icTuple : icTuples) {
            if (this.thisClassToTuple.put(icTuple.thisClassString(), icTuple) != null) {
                throw new Error("Collision detected in <thisClassString, IcTuple> mapping. There are at least two inner clases with the same name.");
            }
            if ((!icTuple.isAnonymous() && !icTuple.outerIsAnonymous()) || icTuple.nestedExplicitFlagSet()) {
                String strOuterClassString = icTuple.outerClassString();
                List<IcTuple> arrayList = this.outerClassToTuples.get(strOuterClassString);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.outerClassToTuples.put(strOuterClassString, arrayList);
                }
                arrayList.add(icTuple);
            }
        }
    }

    public IcTuple[] getIcTuples() {
        return this.icAll;
    }

    public IcTuple[] getRelevantIcTuples(String str, ClassConstantPool classConstantPool) {
        IcTuple icTuple;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        List<IcTuple> list = this.outerClassToTuples.get(str);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                IcTuple icTuple2 = list.get(i);
                hashSet.add(icTuple2);
                arrayList.add(icTuple2);
            }
        }
        List<ClassFileEntry> listEntries = classConstantPool.entries();
        for (int i2 = 0; i2 < listEntries.size(); i2++) {
            ConstantPoolEntry constantPoolEntry = (ConstantPoolEntry) listEntries.get(i2);
            if ((constantPoolEntry instanceof CPClass) && (icTuple = this.thisClassToTuple.get(((CPClass) constantPoolEntry).name)) != null && hashSet.add(icTuple)) {
                arrayList.add(icTuple);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = new ArrayList();
        while (arrayList2.size() > 0) {
            arrayList3.clear();
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                IcTuple icTuple3 = (IcTuple) arrayList2.get(i3);
                IcTuple icTuple4 = this.thisClassToTuple.get(icTuple3.outerClassString());
                if (icTuple4 != null && !icTuple3.outerIsAnonymous()) {
                    arrayList3.add(icTuple4);
                }
            }
            arrayList2.clear();
            for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                IcTuple icTuple5 = (IcTuple) arrayList3.get(i4);
                if (hashSet.add(icTuple5)) {
                    arrayList.add(icTuple5);
                    arrayList2.add(icTuple5);
                }
            }
        }
        arrayList.sort(new Comparator() { // from class: org.apache.commons.compress.harmony.unpack200.IcBands$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return IcBands.lambda$getRelevantIcTuples$0((IcTuple) obj, (IcTuple) obj2);
            }
        });
        return (IcTuple[]) arrayList.toArray(IcTuple.EMPTY_ARRAY);
    }

    public static /* synthetic */ int lambda$getRelevantIcTuples$0(IcTuple icTuple, IcTuple icTuple2) {
        return Integer.valueOf(icTuple.getTupleIndex()).compareTo(Integer.valueOf(icTuple2.getTupleIndex()));
    }
}
