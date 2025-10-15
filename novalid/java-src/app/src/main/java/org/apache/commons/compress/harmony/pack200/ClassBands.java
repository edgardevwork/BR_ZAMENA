package org.apache.commons.compress.harmony.pack200;

import androidx.media3.extractor.text.cea.Cea708Decoder;
import com.caverock.androidsvg.SVG;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.IntFunction;
import org.apache.commons.compress.harmony.pack200.AttributeDefinitionBands;
import org.apache.commons.compress.harmony.pack200.IcBands;
import org.objectweb.asm.Label;

/* loaded from: classes6.dex */
public class ClassBands extends BandSet {
    public boolean anySyntheticClasses;
    public boolean anySyntheticFields;
    public boolean anySyntheticMethods;
    public final AttributeDefinitionBands attrBands;
    public final List<NewAttributeBands> classAttributeBands;
    public final List<ConstantPoolEntry> classEnclosingMethodClass;
    public final List<ConstantPoolEntry> classEnclosingMethodDesc;
    public final IntList classFileVersionMajor;
    public final IntList classFileVersionMinor;
    public List<CPUTF8> classInnerClassesNameRUN;
    public List<CPClass> classInnerClassesOuterRCN;
    public final Map<CPClass, Set<CPClass>> classReferencesInnerClass;
    public final List<CPSignature> classSignature;
    public final List<CPUTF8> classSourceFile;
    public int[] class_InnerClasses_F;
    public int[] class_InnerClasses_N;
    public CPClass[] class_InnerClasses_RC;
    public final MetadataBandGroup class_RIA_bands;
    public final MetadataBandGroup class_RVA_bands;
    public int[] class_attr_calls;
    public final int[] class_field_count;
    public final long[] class_flags;
    public final CPClass[][] class_interface;
    public final int[] class_interface_count;
    public final int[] class_method_count;
    public final CPClass[] class_super;
    public final CPClass[] class_this;
    public final List<NewAttributeBands> codeAttributeBands;
    public final List<Long> codeFlags;
    public final List codeHandlerCatchPO;
    public final List<CPClass> codeHandlerClass;
    public final IntList codeHandlerCount;
    public final List codeHandlerEndPO;
    public final List codeHandlerStartP;
    public int[] codeHeaders;
    public final List codeLineNumberTableBciP;
    public final IntList codeLineNumberTableLine;
    public final IntList codeLineNumberTableN;
    public final List codeLocalVariableTableBciP;
    public final IntList codeLocalVariableTableN;
    public final List<ConstantPoolEntry> codeLocalVariableTableNameRU;
    public final IntList codeLocalVariableTableSlot;
    public final List codeLocalVariableTableSpanO;
    public final List<ConstantPoolEntry> codeLocalVariableTableTypeRS;
    public final List codeLocalVariableTypeTableBciP;
    public final IntList codeLocalVariableTypeTableN;
    public final List<ConstantPoolEntry> codeLocalVariableTypeTableNameRU;
    public final IntList codeLocalVariableTypeTableSlot;
    public final List codeLocalVariableTypeTableSpanO;
    public final List<ConstantPoolEntry> codeLocalVariableTypeTableTypeRS;
    public final IntList codeMaxLocals;
    public final IntList codeMaxStack;
    public int[] code_attr_calls;
    public final CpBands cpBands;
    public final List<NewAttributeBands> fieldAttributeBands;
    public final List<CPConstant<?>> fieldConstantValueKQ;
    public final List<CPSignature> fieldSignature;
    public final MetadataBandGroup field_RIA_bands;
    public final MetadataBandGroup field_RVA_bands;
    public int[] field_attr_calls;
    public final CPNameAndType[][] field_descr;
    public final long[][] field_flags;
    public int index;
    public final int[] major_versions;
    public final List<NewAttributeBands> methodAttributeBands;
    public final List<CPClass> methodExceptionClasses;
    public final IntList methodExceptionNumber;
    public final List<CPSignature> methodSignature;
    public final MetadataBandGroup method_AD_bands;
    public final MetadataBandGroup method_RIA_bands;
    public final MetadataBandGroup method_RIPA_bands;
    public final MetadataBandGroup method_RVA_bands;
    public final MetadataBandGroup method_RVPA_bands;
    public int[] method_attr_calls;
    public final CPNameAndType[][] method_descr;
    public final long[][] method_flags;
    public int numMethodArgs;
    public final Segment segment;
    public final boolean stripDebug;
    public final List<CPNameAndType> tempFieldDesc;
    public final List<Long> tempFieldFlags;
    public final List<CPNameAndType> tempMethodDesc;
    public final List<Long> tempMethodFlags;
    public TempParamAnnotation tempMethodRIPA;
    public TempParamAnnotation tempMethodRVPA;

    public ClassBands(Segment segment, int i, int i2, boolean z) throws IOException {
        super(i2, segment.getSegmentHeader());
        this.classSourceFile = new ArrayList();
        this.classEnclosingMethodClass = new ArrayList();
        this.classEnclosingMethodDesc = new ArrayList();
        this.classSignature = new ArrayList();
        this.classFileVersionMinor = new IntList();
        this.classFileVersionMajor = new IntList();
        this.fieldConstantValueKQ = new ArrayList();
        this.fieldSignature = new ArrayList();
        this.methodSignature = new ArrayList();
        this.methodExceptionNumber = new IntList();
        this.methodExceptionClasses = new ArrayList();
        this.codeMaxStack = new IntList();
        this.codeMaxLocals = new IntList();
        this.codeHandlerCount = new IntList();
        this.codeHandlerStartP = new ArrayList();
        this.codeHandlerEndPO = new ArrayList();
        this.codeHandlerCatchPO = new ArrayList();
        this.codeHandlerClass = new ArrayList();
        this.codeFlags = new ArrayList();
        this.codeLineNumberTableN = new IntList();
        this.codeLineNumberTableBciP = new ArrayList();
        this.codeLineNumberTableLine = new IntList();
        this.codeLocalVariableTableN = new IntList();
        this.codeLocalVariableTableBciP = new ArrayList();
        this.codeLocalVariableTableSpanO = new ArrayList();
        this.codeLocalVariableTableNameRU = new ArrayList();
        this.codeLocalVariableTableTypeRS = new ArrayList();
        this.codeLocalVariableTableSlot = new IntList();
        this.codeLocalVariableTypeTableN = new IntList();
        this.codeLocalVariableTypeTableBciP = new ArrayList();
        this.codeLocalVariableTypeTableSpanO = new ArrayList();
        this.codeLocalVariableTypeTableNameRU = new ArrayList();
        this.codeLocalVariableTypeTableTypeRS = new ArrayList();
        this.codeLocalVariableTypeTableSlot = new IntList();
        this.classAttributeBands = new ArrayList();
        this.methodAttributeBands = new ArrayList();
        this.fieldAttributeBands = new ArrayList();
        this.codeAttributeBands = new ArrayList();
        this.tempFieldFlags = new ArrayList();
        this.tempFieldDesc = new ArrayList();
        this.tempMethodFlags = new ArrayList();
        this.tempMethodDesc = new ArrayList();
        this.anySyntheticClasses = false;
        this.anySyntheticFields = false;
        this.anySyntheticMethods = false;
        this.classReferencesInnerClass = new HashMap();
        this.index = 0;
        this.numMethodArgs = 0;
        this.stripDebug = z;
        this.segment = segment;
        this.cpBands = segment.getCpBands();
        this.attrBands = segment.getAttrBands();
        this.class_this = new CPClass[i];
        this.class_super = new CPClass[i];
        this.class_interface_count = new int[i];
        this.class_interface = new CPClass[i][];
        this.class_field_count = new int[i];
        this.class_method_count = new int[i];
        this.field_descr = new CPNameAndType[i][];
        this.field_flags = new long[i][];
        this.method_descr = new CPNameAndType[i][];
        this.method_flags = new long[i][];
        for (int i3 = 0; i3 < i; i3++) {
            this.field_flags[i3] = new long[0];
            this.method_flags[i3] = new long[0];
        }
        this.major_versions = new int[i];
        this.class_flags = new long[i];
        this.class_RVA_bands = new MetadataBandGroup("RVA", 0, this.cpBands, this.segmentHeader, i2);
        this.class_RIA_bands = new MetadataBandGroup("RIA", 0, this.cpBands, this.segmentHeader, i2);
        this.field_RVA_bands = new MetadataBandGroup("RVA", 1, this.cpBands, this.segmentHeader, i2);
        this.field_RIA_bands = new MetadataBandGroup("RIA", 1, this.cpBands, this.segmentHeader, i2);
        this.method_RVA_bands = new MetadataBandGroup("RVA", 2, this.cpBands, this.segmentHeader, i2);
        this.method_RIA_bands = new MetadataBandGroup("RIA", 2, this.cpBands, this.segmentHeader, i2);
        this.method_RVPA_bands = new MetadataBandGroup("RVPA", 2, this.cpBands, this.segmentHeader, i2);
        this.method_RIPA_bands = new MetadataBandGroup("RIPA", 2, this.cpBands, this.segmentHeader, i2);
        this.method_AD_bands = new MetadataBandGroup("AD", 2, this.cpBands, this.segmentHeader, i2);
        createNewAttributeBands();
    }

    public final void createNewAttributeBands() throws IOException {
        Iterator<AttributeDefinitionBands.AttributeDefinition> it = this.attrBands.getClassAttributeLayouts().iterator();
        while (it.hasNext()) {
            this.classAttributeBands.add(new NewAttributeBands(this.effort, this.cpBands, this.segment.getSegmentHeader(), it.next()));
        }
        Iterator<AttributeDefinitionBands.AttributeDefinition> it2 = this.attrBands.getMethodAttributeLayouts().iterator();
        while (it2.hasNext()) {
            this.methodAttributeBands.add(new NewAttributeBands(this.effort, this.cpBands, this.segment.getSegmentHeader(), it2.next()));
        }
        Iterator<AttributeDefinitionBands.AttributeDefinition> it3 = this.attrBands.getFieldAttributeLayouts().iterator();
        while (it3.hasNext()) {
            this.fieldAttributeBands.add(new NewAttributeBands(this.effort, this.cpBands, this.segment.getSegmentHeader(), it3.next()));
        }
        Iterator<AttributeDefinitionBands.AttributeDefinition> it4 = this.attrBands.getCodeAttributeLayouts().iterator();
        while (it4.hasNext()) {
            this.codeAttributeBands.add(new NewAttributeBands(this.effort, this.cpBands, this.segment.getSegmentHeader(), it4.next()));
        }
    }

    public void addClass(int i, int i2, String str, String str2, String str3, final String[] strArr) {
        this.class_this[this.index] = this.cpBands.getCPClass(str);
        this.class_super[this.index] = this.cpBands.getCPClass(str3);
        int[] iArr = this.class_interface_count;
        int i3 = this.index;
        iArr[i3] = strArr.length;
        CPClass[][] cPClassArr = this.class_interface;
        CPClass[] cPClassArr2 = new CPClass[strArr.length];
        cPClassArr[i3] = cPClassArr2;
        Arrays.setAll(cPClassArr2, new IntFunction() { // from class: org.apache.commons.compress.harmony.pack200.ClassBands$$ExternalSyntheticLambda0
            @Override // java.util.function.IntFunction
            public final Object apply(int i4) {
                return this.f$0.lambda$addClass$0(strArr, i4);
            }
        });
        int[] iArr2 = this.major_versions;
        int i4 = this.index;
        iArr2[i4] = i;
        this.class_flags[i4] = i2;
        if (!this.anySyntheticClasses && (i2 & 4096) != 0 && this.segment.getCurrentClassReader().hasSyntheticAttributes()) {
            this.cpBands.addCPUtf8("Synthetic");
            this.anySyntheticClasses = true;
        }
        if (str2 != null) {
            long[] jArr = this.class_flags;
            int i5 = this.index;
            jArr[i5] = jArr[i5] | 524288;
            this.classSignature.add(this.cpBands.getCPSignature(str2));
        }
    }

    public final /* synthetic */ CPClass lambda$addClass$0(String[] strArr, int i) {
        return this.cpBands.getCPClass(strArr[i]);
    }

    public void currentClassReferencesInnerClass(CPClass cPClass) {
        CPClass cPClass2;
        int i = this.index;
        CPClass[] cPClassArr = this.class_this;
        if (i >= cPClassArr.length || (cPClass2 = cPClassArr[i]) == null || cPClass2.equals(cPClass) || isInnerClassOf(cPClass2.toString(), cPClass)) {
            return;
        }
        Set<CPClass> hashSet = this.classReferencesInnerClass.get(cPClass2);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.classReferencesInnerClass.put(cPClass2, hashSet);
        }
        hashSet.add(cPClass);
    }

    public final boolean isInnerClassOf(String str, CPClass cPClass) {
        if (!isInnerClass(str)) {
            return false;
        }
        String strSubstring = str.substring(0, str.lastIndexOf(36));
        if (strSubstring.equals(cPClass.toString())) {
            return true;
        }
        return isInnerClassOf(strSubstring, cPClass);
    }

    public final boolean isInnerClass(String str) {
        return str.indexOf(36) != -1;
    }

    public void addField(int i, String str, String str2, String str3, Object obj) {
        int i2 = i & 65535;
        this.tempFieldDesc.add(this.cpBands.getCPNameAndType(str, str2));
        if (str3 != null) {
            this.fieldSignature.add(this.cpBands.getCPSignature(str3));
            i2 |= 524288;
        }
        if (obj != null) {
            this.fieldConstantValueKQ.add(this.cpBands.getConstant(obj));
            i2 |= 131072;
        }
        if (!this.anySyntheticFields && (i2 & 4096) != 0 && this.segment.getCurrentClassReader().hasSyntheticAttributes()) {
            this.cpBands.addCPUtf8("Synthetic");
            this.anySyntheticFields = true;
        }
        this.tempFieldFlags.add(Long.valueOf(i2));
    }

    public void finaliseBands() {
        int i;
        int defaultMajorVersion = this.segmentHeader.getDefaultMajorVersion();
        int i2 = 0;
        while (true) {
            long[] jArr = this.class_flags;
            if (i2 >= jArr.length) {
                break;
            }
            int i3 = this.major_versions[i2];
            if (i3 != defaultMajorVersion) {
                jArr[i2] = jArr[i2] | 16777216;
                this.classFileVersionMajor.add(i3);
                this.classFileVersionMinor.add(0);
            }
            i2++;
        }
        this.codeHeaders = new int[this.codeHandlerCount.size()];
        int i4 = 0;
        for (int i5 = 0; i5 < this.codeHeaders.length; i5++) {
            int i6 = i5 - i4;
            int i7 = this.codeHandlerCount.get(i6);
            int i8 = this.codeMaxLocals.get(i6);
            int i9 = this.codeMaxStack.get(i6);
            if (i7 == 0) {
                int i10 = (i8 * 12) + i9 + 1;
                if (i10 < 145 && i9 < 12) {
                    this.codeHeaders[i5] = i10;
                }
            } else if (i7 == 1) {
                int i11 = (i8 * 8) + i9 + Cea708Decoder.COMMAND_SPC;
                if (i11 < 209 && i9 < 8) {
                    this.codeHeaders[i5] = i11;
                }
            } else if (i7 == 2 && (i = (i8 * 7) + i9 + Cea708Decoder.CueInfoBuilder.HORIZONTAL_SIZE) < 256 && i9 < 7) {
                this.codeHeaders[i5] = i;
            }
            if (this.codeHeaders[i5] != 0) {
                this.codeHandlerCount.remove(i6);
                this.codeMaxLocals.remove(i6);
                this.codeMaxStack.remove(i6);
                i4++;
            } else if (!this.segment.getSegmentHeader().have_all_code_flags()) {
                this.codeFlags.add(0L);
            }
        }
        IntList intList = new IntList();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        while (true) {
            CPClass[] cPClassArr = this.class_this;
            if (i12 >= cPClassArr.length) {
                break;
            }
            CPClass cPClass = cPClassArr[i12];
            Set<CPClass> set = this.classReferencesInnerClass.get(cPClass);
            if (set != null) {
                List<IcBands.IcTuple> innerClassesForOuter = this.segment.getIcBands().getInnerClassesForOuter(cPClass.toString());
                if (innerClassesForOuter != null) {
                    Iterator<IcBands.IcTuple> it = innerClassesForOuter.iterator();
                    while (it.hasNext()) {
                        set.remove(it.next().f9869C);
                    }
                }
                Iterator<CPClass> it2 = set.iterator();
                int i13 = 0;
                while (it2.hasNext()) {
                    IcBands.IcTuple icTuple = this.segment.getIcBands().getIcTuple(it2.next());
                    if (icTuple != null && !icTuple.isAnonymous()) {
                        arrayList.add(icTuple);
                        i13++;
                    }
                }
                if (i13 != 0) {
                    intList.add(i13);
                    long[] jArr2 = this.class_flags;
                    jArr2[i12] = jArr2[i12] | SVG.SPECIFIED_MARKER_END;
                }
            }
            i12++;
        }
        this.class_InnerClasses_N = intList.toArray();
        this.class_InnerClasses_RC = new CPClass[arrayList.size()];
        this.class_InnerClasses_F = new int[arrayList.size()];
        this.classInnerClassesOuterRCN = new ArrayList();
        this.classInnerClassesNameRUN = new ArrayList();
        for (int i14 = 0; i14 < this.class_InnerClasses_RC.length; i14++) {
            IcBands.IcTuple icTuple2 = (IcBands.IcTuple) arrayList.get(i14);
            this.class_InnerClasses_RC[i14] = icTuple2.f9869C;
            CPClass cPClass2 = icTuple2.f9870C2;
            if (cPClass2 == null && icTuple2.f9872N == null) {
                this.class_InnerClasses_F[i14] = 0;
            } else {
                int i15 = icTuple2.f9871F;
                if (i15 == 0) {
                    this.class_InnerClasses_F[i14] = 65536;
                } else {
                    this.class_InnerClasses_F[i14] = i15;
                }
                this.classInnerClassesOuterRCN.add(cPClass2);
                this.classInnerClassesNameRUN.add(icTuple2.f9872N);
            }
        }
        IntList intList2 = new IntList();
        IntList intList3 = new IntList();
        IntList intList4 = new IntList();
        IntList intList5 = new IntList();
        if (this.class_RVA_bands.hasContent()) {
            intList2.add(this.class_RVA_bands.numBackwardsCalls());
        }
        if (this.class_RIA_bands.hasContent()) {
            intList2.add(this.class_RIA_bands.numBackwardsCalls());
        }
        if (this.field_RVA_bands.hasContent()) {
            intList3.add(this.field_RVA_bands.numBackwardsCalls());
        }
        if (this.field_RIA_bands.hasContent()) {
            intList3.add(this.field_RIA_bands.numBackwardsCalls());
        }
        if (this.method_RVA_bands.hasContent()) {
            intList4.add(this.method_RVA_bands.numBackwardsCalls());
        }
        if (this.method_RIA_bands.hasContent()) {
            intList4.add(this.method_RIA_bands.numBackwardsCalls());
        }
        if (this.method_RVPA_bands.hasContent()) {
            intList4.add(this.method_RVPA_bands.numBackwardsCalls());
        }
        if (this.method_RIPA_bands.hasContent()) {
            intList4.add(this.method_RIPA_bands.numBackwardsCalls());
        }
        if (this.method_AD_bands.hasContent()) {
            intList4.add(this.method_AD_bands.numBackwardsCalls());
        }
        Comparator<? super NewAttributeBands> comparator = new Comparator() { // from class: org.apache.commons.compress.harmony.pack200.ClassBands$$ExternalSyntheticLambda1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ClassBands.lambda$finaliseBands$1((NewAttributeBands) obj, (NewAttributeBands) obj2);
            }
        };
        this.classAttributeBands.sort(comparator);
        this.methodAttributeBands.sort(comparator);
        this.fieldAttributeBands.sort(comparator);
        this.codeAttributeBands.sort(comparator);
        for (NewAttributeBands newAttributeBands : this.classAttributeBands) {
            if (newAttributeBands.isUsedAtLeastOnce()) {
                for (int i16 : newAttributeBands.numBackwardsCalls()) {
                    intList2.add(i16);
                }
            }
        }
        for (NewAttributeBands newAttributeBands2 : this.methodAttributeBands) {
            if (newAttributeBands2.isUsedAtLeastOnce()) {
                for (int i17 : newAttributeBands2.numBackwardsCalls()) {
                    intList4.add(i17);
                }
            }
        }
        for (NewAttributeBands newAttributeBands3 : this.fieldAttributeBands) {
            if (newAttributeBands3.isUsedAtLeastOnce()) {
                for (int i18 : newAttributeBands3.numBackwardsCalls()) {
                    intList3.add(i18);
                }
            }
        }
        for (NewAttributeBands newAttributeBands4 : this.codeAttributeBands) {
            if (newAttributeBands4.isUsedAtLeastOnce()) {
                for (int i19 : newAttributeBands4.numBackwardsCalls()) {
                    intList5.add(i19);
                }
            }
        }
        this.class_attr_calls = intList2.toArray();
        this.field_attr_calls = intList3.toArray();
        this.method_attr_calls = intList4.toArray();
        this.code_attr_calls = intList5.toArray();
    }

    public static /* synthetic */ int lambda$finaliseBands$1(NewAttributeBands newAttributeBands, NewAttributeBands newAttributeBands2) {
        return newAttributeBands.getFlagIndex() - newAttributeBands2.getFlagIndex();
    }

    @Override // org.apache.commons.compress.harmony.pack200.BandSet
    public void pack(OutputStream outputStream) throws Pack200Exception, IOException {
        PackingUtils.log("Writing class bands...");
        int[] ints = getInts(this.class_this);
        BHSDCodec bHSDCodec = Codec.DELTA5;
        byte[] bArrEncodeBandInt = encodeBandInt("class_this", ints, bHSDCodec);
        outputStream.write(bArrEncodeBandInt);
        PackingUtils.log("Wrote " + bArrEncodeBandInt.length + " bytes from class_this[" + this.class_this.length + "]");
        byte[] bArrEncodeBandInt2 = encodeBandInt("class_super", getInts(this.class_super), bHSDCodec);
        outputStream.write(bArrEncodeBandInt2);
        PackingUtils.log("Wrote " + bArrEncodeBandInt2.length + " bytes from class_super[" + this.class_super.length + "]");
        byte[] bArrEncodeBandInt3 = encodeBandInt("class_interface_count", this.class_interface_count, bHSDCodec);
        outputStream.write(bArrEncodeBandInt3);
        PackingUtils.log("Wrote " + bArrEncodeBandInt3.length + " bytes from class_interface_count[" + this.class_interface_count.length + "]");
        int iSum = sum(this.class_interface_count);
        int[] iArr = new int[iSum];
        CPClass[][] cPClassArr = this.class_interface;
        int length = cPClassArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            CPClass[] cPClassArr2 = cPClassArr[i2];
            if (cPClassArr2 != null) {
                for (CPClass cPClass : cPClassArr2) {
                    iArr[i] = cPClass.getIndex();
                    i++;
                }
            }
        }
        BHSDCodec bHSDCodec2 = Codec.DELTA5;
        byte[] bArrEncodeBandInt4 = encodeBandInt("class_interface", iArr, bHSDCodec2);
        outputStream.write(bArrEncodeBandInt4);
        PackingUtils.log("Wrote " + bArrEncodeBandInt4.length + " bytes from class_interface[" + iSum + "]");
        byte[] bArrEncodeBandInt5 = encodeBandInt("class_field_count", this.class_field_count, bHSDCodec2);
        outputStream.write(bArrEncodeBandInt5);
        PackingUtils.log("Wrote " + bArrEncodeBandInt5.length + " bytes from class_field_count[" + this.class_field_count.length + "]");
        byte[] bArrEncodeBandInt6 = encodeBandInt("class_method_count", this.class_method_count, bHSDCodec2);
        outputStream.write(bArrEncodeBandInt6);
        PackingUtils.log("Wrote " + bArrEncodeBandInt6.length + " bytes from class_method_count[" + this.class_method_count.length + "]");
        int iSum2 = sum(this.class_field_count);
        int[] iArr2 = new int[iSum2];
        int i3 = 0;
        for (int i4 = 0; i4 < this.index; i4++) {
            int i5 = 0;
            while (true) {
                CPNameAndType[] cPNameAndTypeArr = this.field_descr[i4];
                if (i5 < cPNameAndTypeArr.length) {
                    iArr2[i3] = cPNameAndTypeArr[i5].getIndex();
                    i3++;
                    i5++;
                }
            }
        }
        byte[] bArrEncodeBandInt7 = encodeBandInt("field_descr", iArr2, Codec.DELTA5);
        outputStream.write(bArrEncodeBandInt7);
        PackingUtils.log("Wrote " + bArrEncodeBandInt7.length + " bytes from field_descr[" + iSum2 + "]");
        writeFieldAttributeBands(outputStream);
        int iSum3 = sum(this.class_method_count);
        int[] iArr3 = new int[iSum3];
        int i6 = 0;
        for (int i7 = 0; i7 < this.index; i7++) {
            int i8 = 0;
            while (true) {
                CPNameAndType[] cPNameAndTypeArr2 = this.method_descr[i7];
                if (i8 < cPNameAndTypeArr2.length) {
                    iArr3[i6] = cPNameAndTypeArr2[i8].getIndex();
                    i6++;
                    i8++;
                }
            }
        }
        byte[] bArrEncodeBandInt8 = encodeBandInt("method_descr", iArr3, Codec.MDELTA5);
        outputStream.write(bArrEncodeBandInt8);
        PackingUtils.log("Wrote " + bArrEncodeBandInt8.length + " bytes from method_descr[" + iSum3 + "]");
        writeMethodAttributeBands(outputStream);
        writeClassAttributeBands(outputStream);
        writeCodeBands(outputStream);
    }

    public final int sum(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    public final void writeFieldAttributeBands(OutputStream outputStream) throws Pack200Exception, IOException {
        long[][] jArr = this.field_flags;
        BHSDCodec bHSDCodec = Codec.UNSIGNED5;
        byte[] bArrEncodeFlags = encodeFlags("field_flags", jArr, bHSDCodec, bHSDCodec, this.segmentHeader.have_field_flags_hi());
        outputStream.write(bArrEncodeFlags);
        PackingUtils.log("Wrote " + bArrEncodeFlags.length + " bytes from field_flags[" + this.field_flags.length + "]");
        byte[] bArrEncodeBandInt = encodeBandInt("field_attr_calls", this.field_attr_calls, bHSDCodec);
        outputStream.write(bArrEncodeBandInt);
        PackingUtils.log("Wrote " + bArrEncodeBandInt.length + " bytes from field_attr_calls[" + this.field_attr_calls.length + "]");
        byte[] bArrEncodeBandInt2 = encodeBandInt("fieldConstantValueKQ", cpEntryListToArray(this.fieldConstantValueKQ), bHSDCodec);
        outputStream.write(bArrEncodeBandInt2);
        PackingUtils.log("Wrote " + bArrEncodeBandInt2.length + " bytes from fieldConstantValueKQ[" + this.fieldConstantValueKQ.size() + "]");
        byte[] bArrEncodeBandInt3 = encodeBandInt("fieldSignature", cpEntryListToArray(this.fieldSignature), bHSDCodec);
        outputStream.write(bArrEncodeBandInt3);
        PackingUtils.log("Wrote " + bArrEncodeBandInt3.length + " bytes from fieldSignature[" + this.fieldSignature.size() + "]");
        this.field_RVA_bands.pack(outputStream);
        this.field_RIA_bands.pack(outputStream);
        Iterator<NewAttributeBands> it = this.fieldAttributeBands.iterator();
        while (it.hasNext()) {
            it.next().pack(outputStream);
        }
    }

    public final void writeMethodAttributeBands(OutputStream outputStream) throws Pack200Exception, IOException {
        long[][] jArr = this.method_flags;
        BHSDCodec bHSDCodec = Codec.UNSIGNED5;
        byte[] bArrEncodeFlags = encodeFlags("method_flags", jArr, bHSDCodec, bHSDCodec, this.segmentHeader.have_method_flags_hi());
        outputStream.write(bArrEncodeFlags);
        PackingUtils.log("Wrote " + bArrEncodeFlags.length + " bytes from method_flags[" + this.method_flags.length + "]");
        byte[] bArrEncodeBandInt = encodeBandInt("method_attr_calls", this.method_attr_calls, bHSDCodec);
        outputStream.write(bArrEncodeBandInt);
        PackingUtils.log("Wrote " + bArrEncodeBandInt.length + " bytes from method_attr_calls[" + this.method_attr_calls.length + "]");
        byte[] bArrEncodeBandInt2 = encodeBandInt("methodExceptionNumber", this.methodExceptionNumber.toArray(), bHSDCodec);
        outputStream.write(bArrEncodeBandInt2);
        PackingUtils.log("Wrote " + bArrEncodeBandInt2.length + " bytes from methodExceptionNumber[" + this.methodExceptionNumber.size() + "]");
        byte[] bArrEncodeBandInt3 = encodeBandInt("methodExceptionClasses", cpEntryListToArray(this.methodExceptionClasses), bHSDCodec);
        outputStream.write(bArrEncodeBandInt3);
        PackingUtils.log("Wrote " + bArrEncodeBandInt3.length + " bytes from methodExceptionClasses[" + this.methodExceptionClasses.size() + "]");
        byte[] bArrEncodeBandInt4 = encodeBandInt("methodSignature", cpEntryListToArray(this.methodSignature), bHSDCodec);
        outputStream.write(bArrEncodeBandInt4);
        PackingUtils.log("Wrote " + bArrEncodeBandInt4.length + " bytes from methodSignature[" + this.methodSignature.size() + "]");
        this.method_RVA_bands.pack(outputStream);
        this.method_RIA_bands.pack(outputStream);
        this.method_RVPA_bands.pack(outputStream);
        this.method_RIPA_bands.pack(outputStream);
        this.method_AD_bands.pack(outputStream);
        Iterator<NewAttributeBands> it = this.methodAttributeBands.iterator();
        while (it.hasNext()) {
            it.next().pack(outputStream);
        }
    }

    public final void writeClassAttributeBands(OutputStream outputStream) throws Pack200Exception, IOException {
        long[] jArr = this.class_flags;
        BHSDCodec bHSDCodec = Codec.UNSIGNED5;
        byte[] bArrEncodeFlags = encodeFlags("class_flags", jArr, bHSDCodec, bHSDCodec, this.segmentHeader.have_class_flags_hi());
        outputStream.write(bArrEncodeFlags);
        PackingUtils.log("Wrote " + bArrEncodeFlags.length + " bytes from class_flags[" + this.class_flags.length + "]");
        byte[] bArrEncodeBandInt = encodeBandInt("class_attr_calls", this.class_attr_calls, bHSDCodec);
        outputStream.write(bArrEncodeBandInt);
        PackingUtils.log("Wrote " + bArrEncodeBandInt.length + " bytes from class_attr_calls[" + this.class_attr_calls.length + "]");
        byte[] bArrEncodeBandInt2 = encodeBandInt("classSourceFile", cpEntryOrNullListToArray(this.classSourceFile), bHSDCodec);
        outputStream.write(bArrEncodeBandInt2);
        PackingUtils.log("Wrote " + bArrEncodeBandInt2.length + " bytes from classSourceFile[" + this.classSourceFile.size() + "]");
        byte[] bArrEncodeBandInt3 = encodeBandInt("class_enclosing_method_RC", cpEntryListToArray(this.classEnclosingMethodClass), bHSDCodec);
        outputStream.write(bArrEncodeBandInt3);
        PackingUtils.log("Wrote " + bArrEncodeBandInt3.length + " bytes from class_enclosing_method_RC[" + this.classEnclosingMethodClass.size() + "]");
        byte[] bArrEncodeBandInt4 = encodeBandInt("class_EnclosingMethod_RDN", cpEntryOrNullListToArray(this.classEnclosingMethodDesc), bHSDCodec);
        outputStream.write(bArrEncodeBandInt4);
        PackingUtils.log("Wrote " + bArrEncodeBandInt4.length + " bytes from class_EnclosingMethod_RDN[" + this.classEnclosingMethodDesc.size() + "]");
        byte[] bArrEncodeBandInt5 = encodeBandInt("class_Signature_RS", cpEntryListToArray(this.classSignature), bHSDCodec);
        outputStream.write(bArrEncodeBandInt5);
        PackingUtils.log("Wrote " + bArrEncodeBandInt5.length + " bytes from class_Signature_RS[" + this.classSignature.size() + "]");
        this.class_RVA_bands.pack(outputStream);
        this.class_RIA_bands.pack(outputStream);
        byte[] bArrEncodeBandInt6 = encodeBandInt("class_InnerClasses_N", this.class_InnerClasses_N, bHSDCodec);
        outputStream.write(bArrEncodeBandInt6);
        PackingUtils.log("Wrote " + bArrEncodeBandInt6.length + " bytes from class_InnerClasses_N[" + this.class_InnerClasses_N.length + "]");
        byte[] bArrEncodeBandInt7 = encodeBandInt("class_InnerClasses_RC", getInts(this.class_InnerClasses_RC), bHSDCodec);
        outputStream.write(bArrEncodeBandInt7);
        PackingUtils.log("Wrote " + bArrEncodeBandInt7.length + " bytes from class_InnerClasses_RC[" + this.class_InnerClasses_RC.length + "]");
        byte[] bArrEncodeBandInt8 = encodeBandInt("class_InnerClasses_F", this.class_InnerClasses_F, bHSDCodec);
        outputStream.write(bArrEncodeBandInt8);
        PackingUtils.log("Wrote " + bArrEncodeBandInt8.length + " bytes from class_InnerClasses_F[" + this.class_InnerClasses_F.length + "]");
        byte[] bArrEncodeBandInt9 = encodeBandInt("class_InnerClasses_outer_RCN", cpEntryOrNullListToArray(this.classInnerClassesOuterRCN), bHSDCodec);
        outputStream.write(bArrEncodeBandInt9);
        PackingUtils.log("Wrote " + bArrEncodeBandInt9.length + " bytes from class_InnerClasses_outer_RCN[" + this.classInnerClassesOuterRCN.size() + "]");
        byte[] bArrEncodeBandInt10 = encodeBandInt("class_InnerClasses_name_RUN", cpEntryOrNullListToArray(this.classInnerClassesNameRUN), bHSDCodec);
        outputStream.write(bArrEncodeBandInt10);
        PackingUtils.log("Wrote " + bArrEncodeBandInt10.length + " bytes from class_InnerClasses_name_RUN[" + this.classInnerClassesNameRUN.size() + "]");
        byte[] bArrEncodeBandInt11 = encodeBandInt("classFileVersionMinor", this.classFileVersionMinor.toArray(), bHSDCodec);
        outputStream.write(bArrEncodeBandInt11);
        PackingUtils.log("Wrote " + bArrEncodeBandInt11.length + " bytes from classFileVersionMinor[" + this.classFileVersionMinor.size() + "]");
        byte[] bArrEncodeBandInt12 = encodeBandInt("classFileVersionMajor", this.classFileVersionMajor.toArray(), bHSDCodec);
        outputStream.write(bArrEncodeBandInt12);
        PackingUtils.log("Wrote " + bArrEncodeBandInt12.length + " bytes from classFileVersionMajor[" + this.classFileVersionMajor.size() + "]");
        Iterator<NewAttributeBands> it = this.classAttributeBands.iterator();
        while (it.hasNext()) {
            it.next().pack(outputStream);
        }
    }

    public final int[] getInts(CPClass[] cPClassArr) {
        int length = cPClassArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            CPClass cPClass = cPClassArr[i];
            if (cPClass != null) {
                iArr[i] = cPClass.getIndex();
            }
        }
        return iArr;
    }

    public final void writeCodeBands(OutputStream outputStream) throws Pack200Exception, IOException {
        byte[] bArrEncodeBandInt = encodeBandInt("codeHeaders", this.codeHeaders, Codec.BYTE1);
        outputStream.write(bArrEncodeBandInt);
        PackingUtils.log("Wrote " + bArrEncodeBandInt.length + " bytes from codeHeaders[" + this.codeHeaders.length + "]");
        int[] array = this.codeMaxStack.toArray();
        BHSDCodec bHSDCodec = Codec.UNSIGNED5;
        byte[] bArrEncodeBandInt2 = encodeBandInt("codeMaxStack", array, bHSDCodec);
        outputStream.write(bArrEncodeBandInt2);
        PackingUtils.log("Wrote " + bArrEncodeBandInt2.length + " bytes from codeMaxStack[" + this.codeMaxStack.size() + "]");
        byte[] bArrEncodeBandInt3 = encodeBandInt("codeMaxLocals", this.codeMaxLocals.toArray(), bHSDCodec);
        outputStream.write(bArrEncodeBandInt3);
        PackingUtils.log("Wrote " + bArrEncodeBandInt3.length + " bytes from codeMaxLocals[" + this.codeMaxLocals.size() + "]");
        byte[] bArrEncodeBandInt4 = encodeBandInt("codeHandlerCount", this.codeHandlerCount.toArray(), bHSDCodec);
        outputStream.write(bArrEncodeBandInt4);
        PackingUtils.log("Wrote " + bArrEncodeBandInt4.length + " bytes from codeHandlerCount[" + this.codeHandlerCount.size() + "]");
        byte[] bArrEncodeBandInt5 = encodeBandInt("codeHandlerStartP", integerListToArray(this.codeHandlerStartP), Codec.BCI5);
        outputStream.write(bArrEncodeBandInt5);
        PackingUtils.log("Wrote " + bArrEncodeBandInt5.length + " bytes from codeHandlerStartP[" + this.codeHandlerStartP.size() + "]");
        int[] iArrIntegerListToArray = integerListToArray(this.codeHandlerEndPO);
        BHSDCodec bHSDCodec2 = Codec.BRANCH5;
        byte[] bArrEncodeBandInt6 = encodeBandInt("codeHandlerEndPO", iArrIntegerListToArray, bHSDCodec2);
        outputStream.write(bArrEncodeBandInt6);
        PackingUtils.log("Wrote " + bArrEncodeBandInt6.length + " bytes from codeHandlerEndPO[" + this.codeHandlerEndPO.size() + "]");
        byte[] bArrEncodeBandInt7 = encodeBandInt("codeHandlerCatchPO", integerListToArray(this.codeHandlerCatchPO), bHSDCodec2);
        outputStream.write(bArrEncodeBandInt7);
        PackingUtils.log("Wrote " + bArrEncodeBandInt7.length + " bytes from codeHandlerCatchPO[" + this.codeHandlerCatchPO.size() + "]");
        byte[] bArrEncodeBandInt8 = encodeBandInt("codeHandlerClass", cpEntryOrNullListToArray(this.codeHandlerClass), bHSDCodec);
        outputStream.write(bArrEncodeBandInt8);
        PackingUtils.log("Wrote " + bArrEncodeBandInt8.length + " bytes from codeHandlerClass[" + this.codeHandlerClass.size() + "]");
        writeCodeAttributeBands(outputStream);
    }

    public final void writeCodeAttributeBands(OutputStream outputStream) throws Pack200Exception, IOException {
        long[] jArrLongListToArray = longListToArray(this.codeFlags);
        BHSDCodec bHSDCodec = Codec.UNSIGNED5;
        byte[] bArrEncodeFlags = encodeFlags("codeFlags", jArrLongListToArray, bHSDCodec, bHSDCodec, this.segmentHeader.have_code_flags_hi());
        outputStream.write(bArrEncodeFlags);
        PackingUtils.log("Wrote " + bArrEncodeFlags.length + " bytes from codeFlags[" + this.codeFlags.size() + "]");
        byte[] bArrEncodeBandInt = encodeBandInt("code_attr_calls", this.code_attr_calls, bHSDCodec);
        outputStream.write(bArrEncodeBandInt);
        PackingUtils.log("Wrote " + bArrEncodeBandInt.length + " bytes from code_attr_calls[" + this.code_attr_calls.length + "]");
        byte[] bArrEncodeBandInt2 = encodeBandInt("code_LineNumberTable_N", this.codeLineNumberTableN.toArray(), bHSDCodec);
        outputStream.write(bArrEncodeBandInt2);
        PackingUtils.log("Wrote " + bArrEncodeBandInt2.length + " bytes from code_LineNumberTable_N[" + this.codeLineNumberTableN.size() + "]");
        int[] iArrIntegerListToArray = integerListToArray(this.codeLineNumberTableBciP);
        BHSDCodec bHSDCodec2 = Codec.BCI5;
        byte[] bArrEncodeBandInt3 = encodeBandInt("code_LineNumberTable_bci_P", iArrIntegerListToArray, bHSDCodec2);
        outputStream.write(bArrEncodeBandInt3);
        PackingUtils.log("Wrote " + bArrEncodeBandInt3.length + " bytes from code_LineNumberTable_bci_P[" + this.codeLineNumberTableBciP.size() + "]");
        byte[] bArrEncodeBandInt4 = encodeBandInt("code_LineNumberTable_line", this.codeLineNumberTableLine.toArray(), bHSDCodec);
        outputStream.write(bArrEncodeBandInt4);
        PackingUtils.log("Wrote " + bArrEncodeBandInt4.length + " bytes from code_LineNumberTable_line[" + this.codeLineNumberTableLine.size() + "]");
        byte[] bArrEncodeBandInt5 = encodeBandInt("code_LocalVariableTable_N", this.codeLocalVariableTableN.toArray(), bHSDCodec);
        outputStream.write(bArrEncodeBandInt5);
        PackingUtils.log("Wrote " + bArrEncodeBandInt5.length + " bytes from code_LocalVariableTable_N[" + this.codeLocalVariableTableN.size() + "]");
        byte[] bArrEncodeBandInt6 = encodeBandInt("code_LocalVariableTable_bci_P", integerListToArray(this.codeLocalVariableTableBciP), bHSDCodec2);
        outputStream.write(bArrEncodeBandInt6);
        PackingUtils.log("Wrote " + bArrEncodeBandInt6.length + " bytes from code_LocalVariableTable_bci_P[" + this.codeLocalVariableTableBciP.size() + "]");
        int[] iArrIntegerListToArray2 = integerListToArray(this.codeLocalVariableTableSpanO);
        BHSDCodec bHSDCodec3 = Codec.BRANCH5;
        byte[] bArrEncodeBandInt7 = encodeBandInt("code_LocalVariableTable_span_O", iArrIntegerListToArray2, bHSDCodec3);
        outputStream.write(bArrEncodeBandInt7);
        PackingUtils.log("Wrote " + bArrEncodeBandInt7.length + " bytes from code_LocalVariableTable_span_O[" + this.codeLocalVariableTableSpanO.size() + "]");
        byte[] bArrEncodeBandInt8 = encodeBandInt("code_LocalVariableTable_name_RU", cpEntryListToArray(this.codeLocalVariableTableNameRU), bHSDCodec);
        outputStream.write(bArrEncodeBandInt8);
        PackingUtils.log("Wrote " + bArrEncodeBandInt8.length + " bytes from code_LocalVariableTable_name_RU[" + this.codeLocalVariableTableNameRU.size() + "]");
        byte[] bArrEncodeBandInt9 = encodeBandInt("code_LocalVariableTable_type_RS", cpEntryListToArray(this.codeLocalVariableTableTypeRS), bHSDCodec);
        outputStream.write(bArrEncodeBandInt9);
        PackingUtils.log("Wrote " + bArrEncodeBandInt9.length + " bytes from code_LocalVariableTable_type_RS[" + this.codeLocalVariableTableTypeRS.size() + "]");
        byte[] bArrEncodeBandInt10 = encodeBandInt("code_LocalVariableTable_slot", this.codeLocalVariableTableSlot.toArray(), bHSDCodec);
        outputStream.write(bArrEncodeBandInt10);
        PackingUtils.log("Wrote " + bArrEncodeBandInt10.length + " bytes from code_LocalVariableTable_slot[" + this.codeLocalVariableTableSlot.size() + "]");
        byte[] bArrEncodeBandInt11 = encodeBandInt("code_LocalVariableTypeTable_N", this.codeLocalVariableTypeTableN.toArray(), bHSDCodec);
        outputStream.write(bArrEncodeBandInt11);
        PackingUtils.log("Wrote " + bArrEncodeBandInt11.length + " bytes from code_LocalVariableTypeTable_N[" + this.codeLocalVariableTypeTableN.size() + "]");
        byte[] bArrEncodeBandInt12 = encodeBandInt("code_LocalVariableTypeTable_bci_P", integerListToArray(this.codeLocalVariableTypeTableBciP), bHSDCodec2);
        outputStream.write(bArrEncodeBandInt12);
        PackingUtils.log("Wrote " + bArrEncodeBandInt12.length + " bytes from code_LocalVariableTypeTable_bci_P[" + this.codeLocalVariableTypeTableBciP.size() + "]");
        byte[] bArrEncodeBandInt13 = encodeBandInt("code_LocalVariableTypeTable_span_O", integerListToArray(this.codeLocalVariableTypeTableSpanO), bHSDCodec3);
        outputStream.write(bArrEncodeBandInt13);
        PackingUtils.log("Wrote " + bArrEncodeBandInt13.length + " bytes from code_LocalVariableTypeTable_span_O[" + this.codeLocalVariableTypeTableSpanO.size() + "]");
        byte[] bArrEncodeBandInt14 = encodeBandInt("code_LocalVariableTypeTable_name_RU", cpEntryListToArray(this.codeLocalVariableTypeTableNameRU), bHSDCodec);
        outputStream.write(bArrEncodeBandInt14);
        PackingUtils.log("Wrote " + bArrEncodeBandInt14.length + " bytes from code_LocalVariableTypeTable_name_RU[" + this.codeLocalVariableTypeTableNameRU.size() + "]");
        byte[] bArrEncodeBandInt15 = encodeBandInt("code_LocalVariableTypeTable_type_RS", cpEntryListToArray(this.codeLocalVariableTypeTableTypeRS), bHSDCodec);
        outputStream.write(bArrEncodeBandInt15);
        PackingUtils.log("Wrote " + bArrEncodeBandInt15.length + " bytes from code_LocalVariableTypeTable_type_RS[" + this.codeLocalVariableTypeTableTypeRS.size() + "]");
        byte[] bArrEncodeBandInt16 = encodeBandInt("code_LocalVariableTypeTable_slot", this.codeLocalVariableTypeTableSlot.toArray(), bHSDCodec);
        outputStream.write(bArrEncodeBandInt16);
        PackingUtils.log("Wrote " + bArrEncodeBandInt16.length + " bytes from code_LocalVariableTypeTable_slot[" + this.codeLocalVariableTypeTableSlot.size() + "]");
        Iterator<NewAttributeBands> it = this.codeAttributeBands.iterator();
        while (it.hasNext()) {
            it.next().pack(outputStream);
        }
    }

    public void addMethod(int i, String str, String str2, String str3, String[] strArr) {
        this.tempMethodDesc.add(this.cpBands.getCPNameAndType(str, str2));
        if (str3 != null) {
            this.methodSignature.add(this.cpBands.getCPSignature(str3));
            i |= 524288;
        }
        if (strArr != null) {
            this.methodExceptionNumber.add(strArr.length);
            for (String str4 : strArr) {
                this.methodExceptionClasses.add(this.cpBands.getCPClass(str4));
            }
            i |= 262144;
        }
        if ((131072 & i) != 0) {
            i = (i & (-131073)) | 1048576;
        }
        this.tempMethodFlags.add(Long.valueOf(i));
        this.numMethodArgs = countArgs(str2);
        if (this.anySyntheticMethods || (i & 4096) == 0 || !this.segment.getCurrentClassReader().hasSyntheticAttributes()) {
            return;
        }
        this.cpBands.addCPUtf8("Synthetic");
        this.anySyntheticMethods = true;
    }

    public void endOfMethod() {
        TempParamAnnotation tempParamAnnotation = this.tempMethodRVPA;
        if (tempParamAnnotation != null) {
            this.method_RVPA_bands.addParameterAnnotation(tempParamAnnotation.numParams, tempParamAnnotation.annoN, tempParamAnnotation.pairN, tempParamAnnotation.typeRS, tempParamAnnotation.nameRU, tempParamAnnotation.tags, tempParamAnnotation.values, tempParamAnnotation.caseArrayN, tempParamAnnotation.nestTypeRS, tempParamAnnotation.nestNameRU, tempParamAnnotation.nestPairN);
            this.tempMethodRVPA = null;
        }
        TempParamAnnotation tempParamAnnotation2 = this.tempMethodRIPA;
        if (tempParamAnnotation2 != null) {
            this.method_RIPA_bands.addParameterAnnotation(tempParamAnnotation2.numParams, tempParamAnnotation2.annoN, tempParamAnnotation2.pairN, tempParamAnnotation2.typeRS, tempParamAnnotation2.nameRU, tempParamAnnotation2.tags, tempParamAnnotation2.values, tempParamAnnotation2.caseArrayN, tempParamAnnotation2.nestTypeRS, tempParamAnnotation2.nestNameRU, tempParamAnnotation2.nestPairN);
            this.tempMethodRIPA = null;
        }
        if (this.codeFlags.size() > 0) {
            long jLongValue = this.codeFlags.get(r0.size() - 1).longValue();
            int i = this.codeLocalVariableTableN.get(r2.size() - 1);
            if (jLongValue == 4 && i == 0) {
                this.codeLocalVariableTableN.remove(r0.size() - 1);
                this.codeFlags.remove(r0.size() - 1);
                this.codeFlags.add(0L);
            }
        }
    }

    public static int countArgs(String str) {
        int iIndexOf = str.indexOf(40);
        int iIndexOf2 = str.indexOf(41);
        if (iIndexOf == -1 || iIndexOf2 == -1 || iIndexOf2 < iIndexOf) {
            throw new IllegalArgumentException("No arguments");
        }
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        for (int i2 = iIndexOf + 1; i2 < iIndexOf2; i2++) {
            char cCharAt = str.charAt(i2);
            if (z && cCharAt == ';') {
                z = false;
                z2 = false;
            } else if (!z && cCharAt == 'L') {
                i++;
                z = true;
            } else if (cCharAt == '[') {
                z2 = true;
            } else if (!z) {
                if (z2) {
                    i++;
                    z2 = false;
                } else {
                    i = (cCharAt == 'D' || cCharAt == 'J') ? i + 2 : i + 1;
                }
            }
        }
        return i;
    }

    public void endOfClass() {
        int size = this.tempFieldDesc.size();
        int[] iArr = this.class_field_count;
        int i = this.index;
        iArr[i] = size;
        this.field_descr[i] = new CPNameAndType[size];
        this.field_flags[i] = new long[size];
        for (int i2 = 0; i2 < size; i2++) {
            this.field_descr[this.index][i2] = this.tempFieldDesc.get(i2);
            this.field_flags[this.index][i2] = this.tempFieldFlags.get(i2).longValue();
        }
        int size2 = this.tempMethodDesc.size();
        int[] iArr2 = this.class_method_count;
        int i3 = this.index;
        iArr2[i3] = size2;
        this.method_descr[i3] = new CPNameAndType[size2];
        this.method_flags[i3] = new long[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            this.method_descr[this.index][i4] = this.tempMethodDesc.get(i4);
            this.method_flags[this.index][i4] = this.tempMethodFlags.get(i4).longValue();
        }
        this.tempFieldDesc.clear();
        this.tempFieldFlags.clear();
        this.tempMethodDesc.clear();
        this.tempMethodFlags.clear();
        this.index++;
    }

    public void addSourceFile(String str) {
        String string = this.class_this[this.index].toString();
        if (string.indexOf(36) != -1) {
            string = string.substring(0, string.indexOf(36));
        }
        if (str.equals(string.substring(string.lastIndexOf(47) + 1) + ".java")) {
            this.classSourceFile.add(null);
        } else {
            this.classSourceFile.add(this.cpBands.getCPUtf8(str));
        }
        long[] jArr = this.class_flags;
        int i = this.index;
        jArr[i] = jArr[i] | 131072;
    }

    public void addEnclosingMethod(String str, String str2, String str3) {
        long[] jArr = this.class_flags;
        int i = this.index;
        jArr[i] = jArr[i] | 262144;
        this.classEnclosingMethodClass.add(this.cpBands.getCPClass(str));
        this.classEnclosingMethodDesc.add(str2 == null ? null : this.cpBands.getCPNameAndType(str2, str3));
    }

    public void addClassAttribute(NewAttribute newAttribute) {
        String str = newAttribute.type;
        for (NewAttributeBands newAttributeBands : this.classAttributeBands) {
            if (newAttributeBands.getAttributeName().equals(str)) {
                newAttributeBands.addAttribute(newAttribute);
                int flagIndex = newAttributeBands.getFlagIndex();
                long[] jArr = this.class_flags;
                int i = this.index;
                jArr[i] = jArr[i] | (1 << flagIndex);
                return;
            }
        }
        throw new IllegalArgumentException("No suitable definition for " + str);
    }

    public void addFieldAttribute(NewAttribute newAttribute) {
        String str = newAttribute.type;
        for (NewAttributeBands newAttributeBands : this.fieldAttributeBands) {
            if (newAttributeBands.getAttributeName().equals(str)) {
                newAttributeBands.addAttribute(newAttribute);
                int flagIndex = newAttributeBands.getFlagIndex();
                List<Long> list = this.tempFieldFlags;
                this.tempFieldFlags.add(Long.valueOf(list.remove(list.size() - 1).longValue() | (1 << flagIndex)));
                return;
            }
        }
        throw new IllegalArgumentException("No suitable definition for " + str);
    }

    public void addMethodAttribute(NewAttribute newAttribute) {
        String str = newAttribute.type;
        for (NewAttributeBands newAttributeBands : this.methodAttributeBands) {
            if (newAttributeBands.getAttributeName().equals(str)) {
                newAttributeBands.addAttribute(newAttribute);
                int flagIndex = newAttributeBands.getFlagIndex();
                List<Long> list = this.tempMethodFlags;
                this.tempMethodFlags.add(Long.valueOf(list.remove(list.size() - 1).longValue() | (1 << flagIndex)));
                return;
            }
        }
        throw new IllegalArgumentException("No suitable definition for " + str);
    }

    public void addCodeAttribute(NewAttribute newAttribute) {
        String str = newAttribute.type;
        for (NewAttributeBands newAttributeBands : this.codeAttributeBands) {
            if (newAttributeBands.getAttributeName().equals(str)) {
                newAttributeBands.addAttribute(newAttribute);
                int flagIndex = newAttributeBands.getFlagIndex();
                List<Long> list = this.codeFlags;
                this.codeFlags.add(Long.valueOf(list.remove(list.size() - 1).longValue() | (1 << flagIndex)));
                return;
            }
        }
        throw new IllegalArgumentException("No suitable definition for " + str);
    }

    public void addMaxStack(int i, int i2) {
        long jIntValue = this.tempMethodFlags.remove(r0.size() - 1).intValue() | 131072;
        this.tempMethodFlags.add(Long.valueOf(jIntValue));
        this.codeMaxStack.add(i);
        if ((jIntValue & 8) == 0) {
            i2--;
        }
        this.codeMaxLocals.add(i2 - this.numMethodArgs);
    }

    public void addCode() {
        this.codeHandlerCount.add(0);
        if (this.stripDebug) {
            return;
        }
        this.codeFlags.add(4L);
        this.codeLocalVariableTableN.add(0);
    }

    public void addHandler(Label label, Label label2, Label label3, String str) {
        this.codeHandlerCount.add(this.codeHandlerCount.remove(r0.size() - 1) + 1);
        this.codeHandlerStartP.add(label);
        this.codeHandlerEndPO.add(label2);
        this.codeHandlerCatchPO.add(label3);
        this.codeHandlerClass.add(str == null ? null : this.cpBands.getCPClass(str));
    }

    public void addLineNumber(int i, Label label) {
        List<Long> list = this.codeFlags;
        if ((list.get(list.size() - 1).intValue() & 2) == 0) {
            List<Long> list2 = this.codeFlags;
            list2.remove(list2.size() - 1);
            this.codeFlags.add(Long.valueOf(r0.intValue() | 2));
            this.codeLineNumberTableN.add(1);
        } else {
            IntList intList = this.codeLineNumberTableN;
            intList.increment(intList.size() - 1);
        }
        this.codeLineNumberTableLine.add(i);
        this.codeLineNumberTableBciP.add(label);
    }

    public void addLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        if (str3 != null) {
            List<Long> list = this.codeFlags;
            if ((list.get(list.size() - 1).intValue() & 8) == 0) {
                List<Long> list2 = this.codeFlags;
                list2.remove(list2.size() - 1);
                this.codeFlags.add(Long.valueOf(r1.intValue() | 8));
                this.codeLocalVariableTypeTableN.add(1);
            } else {
                IntList intList = this.codeLocalVariableTypeTableN;
                intList.increment(intList.size() - 1);
            }
            this.codeLocalVariableTypeTableBciP.add(label);
            this.codeLocalVariableTypeTableSpanO.add(label2);
            this.codeLocalVariableTypeTableNameRU.add(this.cpBands.getCPUtf8(str));
            this.codeLocalVariableTypeTableTypeRS.add(this.cpBands.getCPSignature(str3));
            this.codeLocalVariableTypeTableSlot.add(i);
        }
        IntList intList2 = this.codeLocalVariableTableN;
        intList2.increment(intList2.size() - 1);
        this.codeLocalVariableTableBciP.add(label);
        this.codeLocalVariableTableSpanO.add(label2);
        this.codeLocalVariableTableNameRU.add(this.cpBands.getCPUtf8(str));
        this.codeLocalVariableTableTypeRS.add(this.cpBands.getCPSignature(str2));
        this.codeLocalVariableTableSlot.add(i);
    }

    public void doBciRenumbering(IntList intList, Map<Label, Integer> map) {
        renumberBci(this.codeLineNumberTableBciP, intList, map);
        renumberBci(this.codeLocalVariableTableBciP, intList, map);
        renumberOffsetBci(this.codeLocalVariableTableBciP, this.codeLocalVariableTableSpanO, intList, map);
        renumberBci(this.codeLocalVariableTypeTableBciP, intList, map);
        renumberOffsetBci(this.codeLocalVariableTypeTableBciP, this.codeLocalVariableTypeTableSpanO, intList, map);
        renumberBci(this.codeHandlerStartP, intList, map);
        renumberOffsetBci(this.codeHandlerStartP, this.codeHandlerEndPO, intList, map);
        renumberDoubleOffsetBci(this.codeHandlerStartP, this.codeHandlerEndPO, this.codeHandlerCatchPO, intList, map);
        Iterator<NewAttributeBands> it = this.classAttributeBands.iterator();
        while (it.hasNext()) {
            it.next().renumberBci(intList, map);
        }
        Iterator<NewAttributeBands> it2 = this.methodAttributeBands.iterator();
        while (it2.hasNext()) {
            it2.next().renumberBci(intList, map);
        }
        Iterator<NewAttributeBands> it3 = this.fieldAttributeBands.iterator();
        while (it3.hasNext()) {
            it3.next().renumberBci(intList, map);
        }
        Iterator<NewAttributeBands> it4 = this.codeAttributeBands.iterator();
        while (it4.hasNext()) {
            it4.next().renumberBci(intList, map);
        }
    }

    public final void renumberBci(List<Integer> list, IntList intList, Map<Label, Integer> map) {
        for (int size = list.size() - 1; size >= 0; size--) {
            Integer num = list.get(size);
            if (num instanceof Integer) {
                return;
            }
            if (num instanceof Label) {
                list.remove(size);
                list.add(size, Integer.valueOf(intList.get(map.get(num).intValue())));
            }
        }
    }

    public final void renumberOffsetBci(List<Integer> list, List<Integer> list2, IntList intList, Map<Label, Integer> map) {
        for (int size = list2.size() - 1; size >= 0; size--) {
            Integer num = list2.get(size);
            if (num instanceof Integer) {
                return;
            }
            if (num instanceof Label) {
                list2.remove(size);
                list2.add(size, Integer.valueOf(intList.get(map.get(num).intValue()) - list.get(size).intValue()));
            }
        }
    }

    public final void renumberDoubleOffsetBci(List<Integer> list, List<Integer> list2, List<Object> list3, IntList intList, Map<Label, Integer> map) {
        for (int size = list3.size() - 1; size >= 0; size--) {
            Object obj = list3.get(size);
            if (obj instanceof Integer) {
                return;
            }
            if (obj instanceof Label) {
                list3.remove(size);
                list3.add(size, Integer.valueOf((intList.get(map.get(obj).intValue()) - list.get(size).intValue()) - list2.get(size).intValue()));
            }
        }
    }

    public boolean isAnySyntheticClasses() {
        return this.anySyntheticClasses;
    }

    public boolean isAnySyntheticFields() {
        return this.anySyntheticFields;
    }

    public boolean isAnySyntheticMethods() {
        return this.anySyntheticMethods;
    }

    public void addParameterAnnotation(int i, String str, boolean z, List<String> list, List<String> list2, List<Object> list3, List<Integer> list4, List<String> list5, List<String> list6, List<Integer> list7) {
        if (z) {
            if (this.tempMethodRVPA == null) {
                TempParamAnnotation tempParamAnnotation = new TempParamAnnotation(this.numMethodArgs);
                this.tempMethodRVPA = tempParamAnnotation;
                tempParamAnnotation.addParameterAnnotation(i, str, list, list2, list3, list4, list5, list6, list7);
            }
            this.tempMethodFlags.add(Long.valueOf(this.tempMethodFlags.remove(r1.size() - 1).longValue() | SVG.SPECIFIED_MARKER_END));
            return;
        }
        if (this.tempMethodRIPA == null) {
            TempParamAnnotation tempParamAnnotation2 = new TempParamAnnotation(this.numMethodArgs);
            this.tempMethodRIPA = tempParamAnnotation2;
            tempParamAnnotation2.addParameterAnnotation(i, str, list, list2, list3, list4, list5, list6, list7);
        }
        this.tempMethodFlags.add(Long.valueOf(this.tempMethodFlags.remove(r1.size() - 1).longValue() | 16777216));
    }

    /* loaded from: classes7.dex */
    public static class TempParamAnnotation {
        public int[] annoN;
        public int numParams;
        public IntList pairN = new IntList();
        public List<String> typeRS = new ArrayList();
        public List<String> nameRU = new ArrayList();
        public List<String> tags = new ArrayList();
        public List<Object> values = new ArrayList();
        public List<Integer> caseArrayN = new ArrayList();
        public List<String> nestTypeRS = new ArrayList();
        public List<String> nestNameRU = new ArrayList();
        public List<Integer> nestPairN = new ArrayList();

        public TempParamAnnotation(int i) {
            this.numParams = i;
            this.annoN = new int[i];
        }

        public void addParameterAnnotation(int i, String str, List<String> list, List<String> list2, List<Object> list3, List<Integer> list4, List<String> list5, List<String> list6, List<Integer> list7) {
            int[] iArr = this.annoN;
            iArr[i] = iArr[i] + 1;
            this.typeRS.add(str);
            this.pairN.add(list.size());
            this.nameRU.addAll(list);
            this.tags.addAll(list2);
            this.values.addAll(list3);
            this.caseArrayN.addAll(list4);
            this.nestTypeRS.addAll(list5);
            this.nestNameRU.addAll(list6);
            this.nestPairN.addAll(list7);
        }
    }

    public void addAnnotation(int i, String str, boolean z, List<String> list, List<String> list2, List<Object> list3, List<Integer> list4, List<String> list5, List<String> list6, List<Integer> list7) {
        if (i == 0) {
            if (z) {
                this.class_RVA_bands.addAnnotation(str, list, list2, list3, list4, list5, list6, list7);
                if ((this.class_flags[this.index] & 2097152) != 0) {
                    this.class_RVA_bands.incrementAnnoN();
                    return;
                }
                this.class_RVA_bands.newEntryInAnnoN();
                long[] jArr = this.class_flags;
                int i2 = this.index;
                jArr[i2] = jArr[i2] | 2097152;
                return;
            }
            this.class_RIA_bands.addAnnotation(str, list, list2, list3, list4, list5, list6, list7);
            if ((this.class_flags[this.index] & 4194304) != 0) {
                this.class_RIA_bands.incrementAnnoN();
                return;
            }
            this.class_RIA_bands.newEntryInAnnoN();
            long[] jArr2 = this.class_flags;
            int i3 = this.index;
            jArr2[i3] = jArr2[i3] | 4194304;
            return;
        }
        if (i == 1) {
            if (z) {
                this.field_RVA_bands.addAnnotation(str, list, list2, list3, list4, list5, list6, list7);
                List<Long> list8 = this.tempFieldFlags;
                if ((list8.remove(list8.size() - 1).intValue() & 2097152) != 0) {
                    this.field_RVA_bands.incrementAnnoN();
                } else {
                    this.field_RVA_bands.newEntryInAnnoN();
                }
                this.tempFieldFlags.add(Long.valueOf(r1.intValue() | 2097152));
                return;
            }
            this.field_RIA_bands.addAnnotation(str, list, list2, list3, list4, list5, list6, list7);
            List<Long> list9 = this.tempFieldFlags;
            if ((list9.remove(list9.size() - 1).intValue() & 4194304) != 0) {
                this.field_RIA_bands.incrementAnnoN();
            } else {
                this.field_RIA_bands.newEntryInAnnoN();
            }
            this.tempFieldFlags.add(Long.valueOf(r1.intValue() | 4194304));
            return;
        }
        if (i != 2) {
            return;
        }
        if (z) {
            this.method_RVA_bands.addAnnotation(str, list, list2, list3, list4, list5, list6, list7);
            List<Long> list10 = this.tempMethodFlags;
            if ((list10.remove(list10.size() - 1).intValue() & 2097152) != 0) {
                this.method_RVA_bands.incrementAnnoN();
            } else {
                this.method_RVA_bands.newEntryInAnnoN();
            }
            this.tempMethodFlags.add(Long.valueOf(r1.intValue() | 2097152));
            return;
        }
        this.method_RIA_bands.addAnnotation(str, list, list2, list3, list4, list5, list6, list7);
        List<Long> list11 = this.tempMethodFlags;
        if ((list11.remove(list11.size() - 1).intValue() & 4194304) != 0) {
            this.method_RIA_bands.incrementAnnoN();
        } else {
            this.method_RIA_bands.newEntryInAnnoN();
        }
        this.tempMethodFlags.add(Long.valueOf(r1.intValue() | 4194304));
    }

    public void addAnnotationDefault(List<String> list, List<String> list2, List<Object> list3, List<Integer> list4, List<String> list5, List<String> list6, List<Integer> list7) {
        this.method_AD_bands.addAnnotation(null, list, list2, list3, list4, list5, list6, list7);
        this.tempMethodFlags.add(Long.valueOf(this.tempMethodFlags.remove(r1.size() - 1).longValue() | SVG.SPECIFIED_VISIBILITY));
    }

    public void removeCurrentClass() {
        long j = 131072;
        if ((this.class_flags[this.index] & 131072) != 0) {
            this.classSourceFile.remove(r1.size() - 1);
        }
        if ((this.class_flags[this.index] & 262144) != 0) {
            this.classEnclosingMethodClass.remove(r1.size() - 1);
            this.classEnclosingMethodDesc.remove(r1.size() - 1);
        }
        long j2 = 524288;
        if ((this.class_flags[this.index] & 524288) != 0) {
            this.classSignature.remove(r1.size() - 1);
        }
        if ((this.class_flags[this.index] & 2097152) != 0) {
            this.class_RVA_bands.removeLatest();
        }
        if ((this.class_flags[this.index] & 4194304) != 0) {
            this.class_RIA_bands.removeLatest();
        }
        Iterator<Long> it = this.tempFieldFlags.iterator();
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            if ((jLongValue & 524288) != 0) {
                this.fieldSignature.remove(r8.size() - 1);
            }
            if ((jLongValue & 131072) != 0) {
                this.fieldConstantValueKQ.remove(r8.size() - 1);
            }
            if ((jLongValue & 2097152) != 0) {
                this.field_RVA_bands.removeLatest();
            }
            if ((jLongValue & 4194304) != 0) {
                this.field_RIA_bands.removeLatest();
            }
        }
        Iterator<Long> it2 = this.tempMethodFlags.iterator();
        while (it2.hasNext()) {
            long jLongValue2 = it2.next().longValue();
            if ((jLongValue2 & j2) != 0) {
                this.methodSignature.remove(r2.size() - 1);
            }
            if ((jLongValue2 & 262144) != 0) {
                int iRemove = this.methodExceptionNumber.remove(r2.size() - 1);
                for (int i = 0; i < iRemove; i++) {
                    this.methodExceptionClasses.remove(r11.size() - 1);
                }
            }
            if ((jLongValue2 & j) != 0) {
                this.codeMaxLocals.remove(r2.size() - 1);
                this.codeMaxStack.remove(r2.size() - 1);
                int iRemove2 = this.codeHandlerCount.remove(r2.size() - 1);
                for (int i2 = 0; i2 < iRemove2; i2++) {
                    int size = this.codeHandlerStartP.size() - 1;
                    this.codeHandlerStartP.remove(size);
                    this.codeHandlerEndPO.remove(size);
                    this.codeHandlerCatchPO.remove(size);
                    this.codeHandlerClass.remove(size);
                }
                if (!this.stripDebug) {
                    long jLongValue3 = this.codeFlags.remove(r2.size() - 1).longValue();
                    int iRemove3 = this.codeLocalVariableTableN.remove(r10.size() - 1);
                    for (int i3 = 0; i3 < iRemove3; i3++) {
                        int size2 = this.codeLocalVariableTableBciP.size() - 1;
                        this.codeLocalVariableTableBciP.remove(size2);
                        this.codeLocalVariableTableSpanO.remove(size2);
                        this.codeLocalVariableTableNameRU.remove(size2);
                        this.codeLocalVariableTableTypeRS.remove(size2);
                        this.codeLocalVariableTableSlot.remove(size2);
                    }
                    if ((8 & jLongValue3) != 0) {
                        int iRemove4 = this.codeLocalVariableTypeTableN.remove(r4.size() - 1);
                        for (int i4 = 0; i4 < iRemove4; i4++) {
                            int size3 = this.codeLocalVariableTypeTableBciP.size() - 1;
                            this.codeLocalVariableTypeTableBciP.remove(size3);
                            this.codeLocalVariableTypeTableSpanO.remove(size3);
                            this.codeLocalVariableTypeTableNameRU.remove(size3);
                            this.codeLocalVariableTypeTableTypeRS.remove(size3);
                            this.codeLocalVariableTypeTableSlot.remove(size3);
                        }
                    }
                    if ((jLongValue3 & 2) != 0) {
                        int iRemove5 = this.codeLineNumberTableN.remove(r2.size() - 1);
                        for (int i5 = 0; i5 < iRemove5; i5++) {
                            int size4 = this.codeLineNumberTableBciP.size() - 1;
                            this.codeLineNumberTableBciP.remove(size4);
                            this.codeLineNumberTableLine.remove(size4);
                        }
                    }
                }
            }
            if ((jLongValue2 & 2097152) != 0) {
                this.method_RVA_bands.removeLatest();
            }
            if ((jLongValue2 & 4194304) != 0) {
                this.method_RIA_bands.removeLatest();
            }
            if ((SVG.SPECIFIED_MARKER_END & jLongValue2) != 0) {
                this.method_RVPA_bands.removeLatest();
            }
            if ((16777216 & jLongValue2) != 0) {
                this.method_RIPA_bands.removeLatest();
            }
            if ((SVG.SPECIFIED_VISIBILITY & jLongValue2) != 0) {
                this.method_AD_bands.removeLatest();
            }
            j = 131072;
            j2 = 524288;
        }
        CPClass[] cPClassArr = this.class_this;
        int i6 = this.index;
        cPClassArr[i6] = null;
        this.class_super[i6] = null;
        this.class_interface_count[i6] = 0;
        this.class_interface[i6] = null;
        this.major_versions[i6] = 0;
        this.class_flags[i6] = 0;
        this.tempFieldDesc.clear();
        this.tempFieldFlags.clear();
        this.tempMethodDesc.clear();
        this.tempMethodFlags.clear();
        int i7 = this.index;
        if (i7 > 0) {
            this.index = i7 - 1;
        }
    }

    public int numClassesProcessed() {
        return this.index;
    }
}
