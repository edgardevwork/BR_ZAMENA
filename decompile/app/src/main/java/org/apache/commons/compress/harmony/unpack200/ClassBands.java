package org.apache.commons.compress.harmony.unpack200;

import com.blackhub.bronline.launcher.LauncherConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.thoughtworks.xstream.converters.reflection.SerializableConverter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry;
import org.apache.commons.compress.harmony.unpack200.bytecode.ConstantValueAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.DeprecatedAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.EnclosingMethodAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.SignatureAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.SourceFileAttribute;
import org.apache.commons.lang3.time.DurationFormatUtils;

/* loaded from: classes6.dex */
public class ClassBands extends BandSet {
    public final AttributeLayoutMap attrMap;
    public long[] classAccessFlags;
    public ArrayList<Attribute>[] classAttributes;
    public final int classCount;
    public int[] classFieldCount;
    public long[] classFlags;
    public int[][] classInterfacesInts;
    public int[] classMethodCount;
    public int[] classSuperInts;
    public String[] classThis;
    public int[] classThisInts;
    public int[] classVersionMajor;
    public int[] classVersionMinor;
    public List<Attribute>[] codeAttributes;
    public int[][] codeHandlerCatchPO;
    public int[][] codeHandlerClassRCN;
    public int[] codeHandlerCount;
    public int[][] codeHandlerEndPO;
    public int[][] codeHandlerStartP;
    public boolean[] codeHasAttributes;
    public int[] codeMaxNALocals;
    public int[] codeMaxStack;
    public final CpBands cpBands;
    public long[][] fieldAccessFlags;
    public ArrayList<Attribute>[][] fieldAttributes;
    public String[][] fieldDescr;
    public int[][] fieldDescrInts;
    public long[][] fieldFlags;
    public IcTuple[][] icLocal;
    public long[][] methodAccessFlags;
    public int[] methodAttrCalls;
    public ArrayList<Attribute>[][] methodAttributes;
    public String[][] methodDescr;
    public int[][] methodDescrInts;
    public long[][] methodFlags;
    public final SegmentOptions options;

    @Override // org.apache.commons.compress.harmony.unpack200.BandSet
    public void unpack() {
    }

    public ClassBands(Segment segment) {
        super(segment);
        this.attrMap = segment.getAttrDefinitionBands().getAttributeDefinitionMap();
        this.cpBands = segment.getCpBands();
        this.classCount = this.header.getClassCount();
        this.options = this.header.getOptions();
    }

    @Override // org.apache.commons.compress.harmony.unpack200.BandSet
    public void read(InputStream inputStream) throws Pack200Exception, IOException {
        int classCount = this.header.getClassCount();
        BHSDCodec bHSDCodec = Codec.DELTA5;
        int[] iArrDecodeBandInt = decodeBandInt("class_this", inputStream, bHSDCodec, classCount);
        this.classThisInts = iArrDecodeBandInt;
        this.classThis = getReferences(iArrDecodeBandInt, this.cpBands.getCpClass());
        this.classSuperInts = decodeBandInt("class_super", inputStream, bHSDCodec, classCount);
        this.classInterfacesInts = decodeBandInt("class_interface", inputStream, bHSDCodec, decodeBandInt("class_interface_count", inputStream, bHSDCodec, classCount));
        this.classFieldCount = decodeBandInt("class_field_count", inputStream, bHSDCodec, classCount);
        this.classMethodCount = decodeBandInt("class_method_count", inputStream, bHSDCodec, classCount);
        parseFieldBands(inputStream);
        parseMethodBands(inputStream);
        parseClassAttrBands(inputStream);
        parseCodeBands(inputStream);
    }

    public final void parseFieldBands(InputStream inputStream) throws Pack200Exception, IOException {
        int[][] iArrDecodeBandInt = decodeBandInt("field_descr", inputStream, Codec.DELTA5, this.classFieldCount);
        this.fieldDescrInts = iArrDecodeBandInt;
        this.fieldDescr = getReferences(iArrDecodeBandInt, this.cpBands.getCpDescriptor());
        parseFieldAttrBands(inputStream);
    }

    public final void parseFieldAttrBands(InputStream inputStream) throws Pack200Exception, IOException {
        int i;
        int[] iArr;
        int[] iArr2;
        AttributeLayout attributeLayout;
        int i2;
        int[] iArr3 = this.classFieldCount;
        BHSDCodec bHSDCodec = Codec.UNSIGNED5;
        long[][] flags = parseFlags("field_flags", inputStream, iArr3, bHSDCodec, this.options.hasFieldFlagsHi());
        this.fieldFlags = flags;
        int[] iArrDecodeBandInt = decodeBandInt("field_attr_calls", inputStream, bHSDCodec, getCallCount(decodeBandInt("field_attr_indexes", inputStream, bHSDCodec, decodeBandInt("field_attr_count", inputStream, bHSDCodec, SegmentUtils.countBit16(flags))), this.fieldFlags, 1));
        this.fieldAttributes = new ArrayList[this.classCount][];
        for (int i3 = 0; i3 < this.classCount; i3++) {
            this.fieldAttributes[i3] = new ArrayList[this.fieldFlags[i3].length];
            for (int i4 = 0; i4 < this.fieldFlags[i3].length; i4++) {
                this.fieldAttributes[i3][i4] = new ArrayList<>();
            }
        }
        AttributeLayout attributeLayout2 = this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_CONSTANT_VALUE, 1);
        int iCountMatches = SegmentUtils.countMatches(this.fieldFlags, attributeLayout2);
        BHSDCodec bHSDCodec2 = Codec.UNSIGNED5;
        int[] iArrDecodeBandInt2 = decodeBandInt("field_ConstantValue_KQ", inputStream, bHSDCodec2, iCountMatches);
        AttributeLayout attributeLayout3 = this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_SIGNATURE, 1);
        int[] iArrDecodeBandInt3 = decodeBandInt("field_Signature_RS", inputStream, bHSDCodec2, SegmentUtils.countMatches(this.fieldFlags, attributeLayout3));
        AttributeLayout attributeLayout4 = this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_DEPRECATED, 1);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < this.classCount; i7++) {
            int i8 = 0;
            while (true) {
                long[] jArr = this.fieldFlags[i7];
                if (i8 < jArr.length) {
                    long j = jArr[i8];
                    if (attributeLayout4.matches(j)) {
                        this.fieldAttributes[i7][i8].add(new DeprecatedAttribute());
                    }
                    if (attributeLayout2.matches(j)) {
                        iArr = iArrDecodeBandInt2;
                        iArr2 = iArrDecodeBandInt3;
                        long j2 = iArrDecodeBandInt2[i5];
                        String str = this.fieldDescr[i7][i8];
                        attributeLayout = attributeLayout4;
                        i2 = 58;
                        String strSubstring = str.substring(str.indexOf(58) + 1);
                        if (strSubstring.equals("B") || strSubstring.equals("S") || strSubstring.equals("C") || strSubstring.equals("Z")) {
                            strSubstring = "I";
                        }
                        this.fieldAttributes[i7][i8].add(new ConstantValueAttribute(attributeLayout2.getValue(j2, strSubstring, this.cpBands.getConstantPool())));
                        i5++;
                    } else {
                        iArr = iArrDecodeBandInt2;
                        iArr2 = iArrDecodeBandInt3;
                        attributeLayout = attributeLayout4;
                        i2 = 58;
                    }
                    if (attributeLayout3.matches(j)) {
                        long j3 = iArr2[i6];
                        String str2 = this.fieldDescr[i7][i8];
                        this.fieldAttributes[i7][i8].add(new SignatureAttribute((CPUTF8) attributeLayout3.getValue(j3, str2.substring(str2.indexOf(i2) + 1), this.cpBands.getConstantPool())));
                        i6++;
                    }
                    i8++;
                    iArrDecodeBandInt2 = iArr;
                    iArrDecodeBandInt3 = iArr2;
                    attributeLayout4 = attributeLayout;
                }
            }
        }
        int fieldMetadataBands = parseFieldMetadataBands(inputStream, iArrDecodeBandInt);
        int i9 = this.options.hasFieldFlagsHi() ? 62 : 31;
        int i10 = i9 + 1;
        AttributeLayout[] attributeLayoutArr = new AttributeLayout[i10];
        int[] iArr4 = new int[i10];
        List[] listArr = new List[i10];
        for (int i11 = 0; i11 < i9; i11++) {
            AttributeLayout attributeLayout5 = this.attrMap.getAttributeLayout(i11, 1);
            if (attributeLayout5 != null && !attributeLayout5.isDefaultLayout()) {
                attributeLayoutArr[i11] = attributeLayout5;
                iArr4[i11] = SegmentUtils.countMatches(this.fieldFlags, attributeLayout5);
            }
        }
        for (int i12 = 0; i12 < i10; i12++) {
            if (iArr4[i12] > 0) {
                NewAttributeBands attributeBands = this.attrMap.getAttributeBands(attributeLayoutArr[i12]);
                listArr[i12] = attributeBands.parseAttributes(inputStream, iArr4[i12]);
                int iNumBackwardsCallables = attributeLayoutArr[i12].numBackwardsCallables();
                if (iNumBackwardsCallables > 0) {
                    int[] iArr5 = new int[iNumBackwardsCallables];
                    System.arraycopy(iArrDecodeBandInt, fieldMetadataBands, iArr5, 0, iNumBackwardsCallables);
                    attributeBands.setBackwardsCalls(iArr5);
                    fieldMetadataBands += iNumBackwardsCallables;
                }
            }
        }
        for (int i13 = 0; i13 < this.classCount; i13++) {
            int i14 = 0;
            while (true) {
                long[] jArr2 = this.fieldFlags[i13];
                if (i14 < jArr2.length) {
                    long j4 = jArr2[i14];
                    int i15 = 0;
                    for (int i16 = 0; i16 < i10; i16++) {
                        AttributeLayout attributeLayout6 = attributeLayoutArr[i16];
                        if (attributeLayout6 != null && attributeLayout6.matches(j4)) {
                            if (attributeLayoutArr[i16].getIndex() < 15) {
                                i = 0;
                                this.fieldAttributes[i13][i14].add(i15, listArr[i16].get(0));
                                i15++;
                            } else {
                                i = 0;
                                this.fieldAttributes[i13][i14].add(listArr[i16].get(0));
                            }
                            listArr[i16].remove(i);
                        }
                    }
                    i14++;
                }
            }
        }
    }

    public final void parseMethodBands(InputStream inputStream) throws Pack200Exception, IOException {
        int[][] iArrDecodeBandInt = decodeBandInt("method_descr", inputStream, Codec.MDELTA5, this.classMethodCount);
        this.methodDescrInts = iArrDecodeBandInt;
        this.methodDescr = getReferences(iArrDecodeBandInt, this.cpBands.getCpDescriptor());
        parseMethodAttrBands(inputStream);
    }

    public final void parseMethodAttrBands(InputStream inputStream) throws Pack200Exception, IOException {
        int i;
        AttributeLayout attributeLayout;
        int[][] iArr;
        int[] iArr2 = this.classMethodCount;
        BHSDCodec bHSDCodec = Codec.UNSIGNED5;
        long[][] flags = parseFlags("method_flags", inputStream, iArr2, bHSDCodec, this.options.hasMethodFlagsHi());
        this.methodFlags = flags;
        this.methodAttrCalls = decodeBandInt("method_attr_calls", inputStream, bHSDCodec, getCallCount(decodeBandInt("method_attr_indexes", inputStream, bHSDCodec, decodeBandInt("method_attr_count", inputStream, bHSDCodec, SegmentUtils.countBit16(flags))), this.methodFlags, 2));
        this.methodAttributes = new ArrayList[this.classCount][];
        for (int i2 = 0; i2 < this.classCount; i2++) {
            this.methodAttributes[i2] = new ArrayList[this.methodFlags[i2].length];
            for (int i3 = 0; i3 < this.methodFlags[i2].length; i3++) {
                this.methodAttributes[i2][i3] = new ArrayList<>();
            }
        }
        AttributeLayout attributeLayout2 = this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_EXCEPTIONS, 2);
        int iCountMatches = SegmentUtils.countMatches(this.methodFlags, attributeLayout2);
        BHSDCodec bHSDCodec2 = Codec.UNSIGNED5;
        int[] iArrDecodeBandInt = decodeBandInt("method_Exceptions_n", inputStream, bHSDCodec2, iCountMatches);
        int[][] iArrDecodeBandInt2 = decodeBandInt("method_Exceptions_RC", inputStream, bHSDCodec2, iArrDecodeBandInt);
        AttributeLayout attributeLayout3 = this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_SIGNATURE, 2);
        int[] iArrDecodeBandInt3 = decodeBandInt("method_signature_RS", inputStream, bHSDCodec2, SegmentUtils.countMatches(this.methodFlags, attributeLayout3));
        AttributeLayout attributeLayout4 = this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_DEPRECATED, 2);
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < this.methodAttributes.length; i6++) {
            int i7 = 0;
            while (i7 < this.methodAttributes[i6].length) {
                int[] iArr3 = iArrDecodeBandInt;
                long j = this.methodFlags[i6][i7];
                if (attributeLayout2.matches(j)) {
                    int i8 = iArr3[i4];
                    int[] iArr4 = iArrDecodeBandInt2[i4];
                    CPClass[] cPClassArr = new CPClass[i8];
                    int i9 = 0;
                    while (i9 < i8) {
                        cPClassArr[i9] = this.cpBands.cpClassValue(iArr4[i9]);
                        i9++;
                        attributeLayout2 = attributeLayout2;
                        iArrDecodeBandInt2 = iArrDecodeBandInt2;
                    }
                    attributeLayout = attributeLayout2;
                    iArr = iArrDecodeBandInt2;
                    this.methodAttributes[i6][i7].add(new ExceptionsAttribute(cPClassArr));
                    i4++;
                } else {
                    attributeLayout = attributeLayout2;
                    iArr = iArrDecodeBandInt2;
                }
                if (attributeLayout3.matches(j)) {
                    long j2 = iArrDecodeBandInt3[i5];
                    String str = this.methodDescr[i6][i7];
                    String strSubstring = str.substring(str.indexOf(58) + 1);
                    if (strSubstring.equals("B") || strSubstring.equals(DurationFormatUtils.f9908H)) {
                        strSubstring = "I";
                    }
                    this.methodAttributes[i6][i7].add(new SignatureAttribute((CPUTF8) attributeLayout3.getValue(j2, strSubstring, this.cpBands.getConstantPool())));
                    i5++;
                }
                if (attributeLayout4.matches(j)) {
                    this.methodAttributes[i6][i7].add(new DeprecatedAttribute());
                }
                i7++;
                iArrDecodeBandInt = iArr3;
                attributeLayout2 = attributeLayout;
                iArrDecodeBandInt2 = iArr;
            }
        }
        int methodMetadataBands = parseMethodMetadataBands(inputStream, this.methodAttrCalls);
        int i10 = this.options.hasMethodFlagsHi() ? 62 : 31;
        int i11 = i10 + 1;
        AttributeLayout[] attributeLayoutArr = new AttributeLayout[i11];
        int[] iArr5 = new int[i11];
        for (int i12 = 0; i12 < i10; i12++) {
            AttributeLayout attributeLayout5 = this.attrMap.getAttributeLayout(i12, 2);
            if (attributeLayout5 != null && !attributeLayout5.isDefaultLayout()) {
                attributeLayoutArr[i12] = attributeLayout5;
                iArr5[i12] = SegmentUtils.countMatches(this.methodFlags, attributeLayout5);
            }
        }
        List[] listArr = new List[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            if (iArr5[i13] > 0) {
                NewAttributeBands attributeBands = this.attrMap.getAttributeBands(attributeLayoutArr[i13]);
                listArr[i13] = attributeBands.parseAttributes(inputStream, iArr5[i13]);
                int iNumBackwardsCallables = attributeLayoutArr[i13].numBackwardsCallables();
                if (iNumBackwardsCallables > 0) {
                    int[] iArr6 = new int[iNumBackwardsCallables];
                    System.arraycopy(this.methodAttrCalls, methodMetadataBands, iArr6, 0, iNumBackwardsCallables);
                    attributeBands.setBackwardsCalls(iArr6);
                    methodMetadataBands += iNumBackwardsCallables;
                }
            }
        }
        for (int i14 = 0; i14 < this.methodAttributes.length; i14++) {
            for (int i15 = 0; i15 < this.methodAttributes[i14].length; i15++) {
                long j3 = this.methodFlags[i14][i15];
                int i16 = 0;
                for (int i17 = 0; i17 < i11; i17++) {
                    AttributeLayout attributeLayout6 = attributeLayoutArr[i17];
                    if (attributeLayout6 != null && attributeLayout6.matches(j3)) {
                        if (attributeLayoutArr[i17].getIndex() < 15) {
                            i = 0;
                            this.methodAttributes[i14][i15].add(i16, listArr[i17].get(0));
                            i16++;
                        } else {
                            i = 0;
                            this.methodAttributes[i14][i15].add(listArr[i17].get(0));
                        }
                        listArr[i17].remove(i);
                    }
                }
            }
        }
    }

    public final int getCallCount(int[][] iArr, long[][] jArr, int i) {
        int iNumBackwardsCallables = 0;
        for (int[] iArr2 : iArr) {
            int i2 = 0;
            while (true) {
                if (i2 < iArr2.length) {
                    iNumBackwardsCallables += this.attrMap.getAttributeLayout(iArr2[i2], i).numBackwardsCallables();
                    i2++;
                }
            }
        }
        int i3 = 0;
        for (long[] jArr2 : jArr) {
            int i4 = 0;
            while (true) {
                if (i4 < jArr2.length) {
                    i3 = (int) (i3 | jArr2[i4]);
                    i4++;
                }
            }
        }
        for (int i5 = 0; i5 < 26; i5++) {
            if (((1 << i5) & i3) != 0) {
                iNumBackwardsCallables += this.attrMap.getAttributeLayout(i5, i).numBackwardsCallables();
            }
        }
        return iNumBackwardsCallables;
    }

    public final void parseClassAttrBands(InputStream inputStream) throws Pack200Exception, IOException {
        AttributeLayout attributeLayout;
        List[] listArr;
        AttributeLayout attributeLayout2;
        int[] iArr;
        int i;
        int i2;
        AttributeLayout attributeLayout3;
        AttributeLayout attributeLayout4;
        int i3;
        AttributeLayout attributeLayout5;
        int i4;
        AttributeLayout attributeLayout6;
        AttributeLayout attributeLayout7;
        int i5;
        String str;
        String n;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr2;
        int[][] iArr3;
        InputStream inputStream2 = inputStream;
        String[] cpUTF8 = this.cpBands.getCpUTF8();
        String[] cpClass = this.cpBands.getCpClass();
        ArrayList<Attribute>[] arrayListArr = new ArrayList[this.classCount];
        this.classAttributes = arrayListArr;
        Arrays.setAll(arrayListArr, new IntFunction() { // from class: org.apache.commons.compress.harmony.unpack200.ClassBands$$ExternalSyntheticLambda2
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return ClassBands.lambda$parseClassAttrBands$0(i10);
            }
        });
        int i10 = this.classCount;
        BHSDCodec bHSDCodec = Codec.UNSIGNED5;
        long[] flags = parseFlags("class_flags", inputStream, i10, bHSDCodec, this.options.hasClassFlagsHi());
        this.classFlags = flags;
        int[] iArrDecodeBandInt = decodeBandInt("class_attr_calls", inputStream2, bHSDCodec, getCallCount(decodeBandInt("class_attr_indexes", inputStream2, bHSDCodec, decodeBandInt("class_attr_count", inputStream2, bHSDCodec, SegmentUtils.countBit16(flags))), new long[][]{this.classFlags}, 0));
        AttributeLayout attributeLayout8 = this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_DEPRECATED, 0);
        AttributeLayout attributeLayout9 = this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_SOURCE_FILE, 0);
        int[] iArrDecodeBandInt2 = decodeBandInt("class_SourceFile_RUN", inputStream2, bHSDCodec, SegmentUtils.countMatches(this.classFlags, attributeLayout9));
        AttributeLayout attributeLayout10 = this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_ENCLOSING_METHOD, 0);
        int iCountMatches = SegmentUtils.countMatches(this.classFlags, attributeLayout10);
        int[] iArrDecodeBandInt3 = decodeBandInt("class_EnclosingMethod_RC", inputStream2, bHSDCodec, iCountMatches);
        int[] iArrDecodeBandInt4 = decodeBandInt("class_EnclosingMethod_RDN", inputStream2, bHSDCodec, iCountMatches);
        AttributeLayout attributeLayout11 = this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_SIGNATURE, 0);
        int[] iArrDecodeBandInt5 = decodeBandInt("class_Signature_RS", inputStream2, bHSDCodec, SegmentUtils.countMatches(this.classFlags, attributeLayout11));
        int classMetadataBands = parseClassMetadataBands(inputStream2, iArrDecodeBandInt);
        AttributeLayout attributeLayout12 = this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_INNER_CLASSES, 0);
        int[] iArrDecodeBandInt6 = decodeBandInt("class_InnerClasses_N", inputStream2, bHSDCodec, SegmentUtils.countMatches(this.classFlags, attributeLayout12));
        int[][] iArrDecodeBandInt7 = decodeBandInt("class_InnerClasses_RC", inputStream2, bHSDCodec, iArrDecodeBandInt6);
        int[][] iArrDecodeBandInt8 = decodeBandInt("class_InnerClasses_F", inputStream2, bHSDCodec, iArrDecodeBandInt6);
        int i11 = 0;
        int i12 = 0;
        while (i11 < iArrDecodeBandInt8.length) {
            AttributeLayout attributeLayout13 = attributeLayout12;
            int i13 = 0;
            while (true) {
                int[] iArr4 = iArrDecodeBandInt8[i11];
                iArr3 = iArrDecodeBandInt8;
                if (i13 < iArr4.length) {
                    if (iArr4[i13] != 0) {
                        i12++;
                    }
                    i13++;
                    iArrDecodeBandInt8 = iArr3;
                }
            }
            i11++;
            attributeLayout12 = attributeLayout13;
            iArrDecodeBandInt8 = iArr3;
        }
        AttributeLayout attributeLayout14 = attributeLayout12;
        int[][] iArr5 = iArrDecodeBandInt8;
        BHSDCodec bHSDCodec2 = Codec.UNSIGNED5;
        int[] iArrDecodeBandInt9 = decodeBandInt("class_InnerClasses_outer_RCN", inputStream2, bHSDCodec2, i12);
        int[] iArrDecodeBandInt10 = decodeBandInt("class_InnerClasses_name_RUN", inputStream2, bHSDCodec2, i12);
        AttributeLayout attributeLayout15 = this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_CLASS_FILE_VERSION, 0);
        int iCountMatches2 = SegmentUtils.countMatches(this.classFlags, attributeLayout15);
        int[] iArrDecodeBandInt11 = decodeBandInt("class_file_version_minor_H", inputStream2, bHSDCodec2, iCountMatches2);
        int[] iArrDecodeBandInt12 = decodeBandInt("class_file_version_major_H", inputStream2, bHSDCodec2, iCountMatches2);
        if (iCountMatches2 > 0) {
            int i14 = this.classCount;
            this.classVersionMajor = new int[i14];
            this.classVersionMinor = new int[i14];
        }
        int defaultClassMajorVersion = this.header.getDefaultClassMajorVersion();
        int defaultClassMinorVersion = this.header.getDefaultClassMinorVersion();
        int i15 = this.options.hasClassFlagsHi() ? 62 : 31;
        int i16 = i15 + 1;
        AttributeLayout[] attributeLayoutArr = new AttributeLayout[i16];
        AttributeLayout attributeLayout16 = attributeLayout15;
        int[] iArr6 = new int[i16];
        List[] listArr2 = new List[i16];
        int i17 = 0;
        while (i17 < i15) {
            int i18 = i15;
            AttributeLayout attributeLayout17 = attributeLayout11;
            AttributeLayout attributeLayout18 = this.attrMap.getAttributeLayout(i17, 0);
            if (attributeLayout18 != null && !attributeLayout18.isDefaultLayout()) {
                attributeLayoutArr[i17] = attributeLayout18;
                iArr6[i17] = SegmentUtils.countMatches(this.classFlags, attributeLayout18);
            }
            i17++;
            i15 = i18;
            attributeLayout11 = attributeLayout17;
        }
        AttributeLayout attributeLayout19 = attributeLayout11;
        int i19 = classMetadataBands;
        int i20 = 0;
        while (i20 < i16) {
            if (iArr6[i20] > 0) {
                i9 = i16;
                NewAttributeBands attributeBands = this.attrMap.getAttributeBands(attributeLayoutArr[i20]);
                listArr2[i20] = attributeBands.parseAttributes(inputStream2, iArr6[i20]);
                int iNumBackwardsCallables = attributeLayoutArr[i20].numBackwardsCallables();
                if (iNumBackwardsCallables > 0) {
                    int[] iArr7 = new int[iNumBackwardsCallables];
                    iArr2 = iArr6;
                    System.arraycopy(iArrDecodeBandInt, i19, iArr7, 0, iNumBackwardsCallables);
                    attributeBands.setBackwardsCalls(iArr7);
                    i19 += iNumBackwardsCallables;
                }
                i20++;
                inputStream2 = inputStream;
                i16 = i9;
                iArr6 = iArr2;
            } else {
                i9 = i16;
            }
            iArr2 = iArr6;
            i20++;
            inputStream2 = inputStream;
            i16 = i9;
            iArr6 = iArr2;
        }
        int i21 = i16;
        this.icLocal = new IcTuple[this.classCount][];
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (i25 < this.classCount) {
            int i29 = i28;
            long j = this.classFlags[i25];
            if (attributeLayout8.matches(j)) {
                attributeLayout = attributeLayout8;
                listArr = listArr2;
                this.classAttributes[i25].add(new DeprecatedAttribute());
            } else {
                attributeLayout = attributeLayout8;
                listArr = listArr2;
            }
            if (attributeLayout9.matches(j)) {
                i = i25;
                ClassFileEntry value = attributeLayout9.getValue(iArrDecodeBandInt2[i23], this.cpBands.getConstantPool());
                if (value == null) {
                    String str2 = this.classThis[i];
                    String strSubstring = str2.substring(str2.lastIndexOf(47) + 1);
                    String strSubstring2 = strSubstring.substring(strSubstring.lastIndexOf(46) + 1);
                    char[] charArray = strSubstring2.toCharArray();
                    attributeLayout2 = attributeLayout9;
                    int i30 = 0;
                    while (true) {
                        if (i30 >= charArray.length) {
                            iArr = iArrDecodeBandInt2;
                            i8 = -1;
                            i30 = -1;
                            break;
                        } else {
                            iArr = iArrDecodeBandInt2;
                            if (charArray[i30] <= '-') {
                                i8 = -1;
                                break;
                            } else {
                                i30++;
                                iArrDecodeBandInt2 = iArr;
                            }
                        }
                    }
                    if (i30 > i8) {
                        strSubstring2 = strSubstring2.substring(0, i30);
                    }
                    value = this.cpBands.cpUTF8Value(strSubstring2 + ".java", true);
                } else {
                    attributeLayout2 = attributeLayout9;
                    iArr = iArrDecodeBandInt2;
                }
                this.classAttributes[i].add(new SourceFileAttribute((CPUTF8) value));
                i23++;
            } else {
                attributeLayout2 = attributeLayout9;
                iArr = iArrDecodeBandInt2;
                i = i25;
            }
            if (attributeLayout10.matches(j)) {
                CPClass cPClassCpClassValue = this.cpBands.cpClassValue(iArrDecodeBandInt3[i24]);
                int i31 = iArrDecodeBandInt4[i24];
                this.classAttributes[i].add(new EnclosingMethodAttribute(cPClassCpClassValue, i31 != 0 ? this.cpBands.cpNameAndTypeValue(i31 - 1) : null));
                i24++;
            }
            AttributeLayout attributeLayout20 = attributeLayout19;
            if (attributeLayout20.matches(j)) {
                this.classAttributes[i].add(new SignatureAttribute((CPUTF8) attributeLayout20.getValue(iArrDecodeBandInt5[i26], this.cpBands.getConstantPool())));
                i26++;
            }
            AttributeLayout attributeLayout21 = attributeLayout14;
            if (attributeLayout21.matches(j)) {
                this.icLocal[i] = new IcTuple[iArrDecodeBandInt6[i27]];
                i3 = i22;
                int i32 = 0;
                while (i32 < this.icLocal[i].length) {
                    int i33 = iArrDecodeBandInt7[i27][i32];
                    String str3 = cpClass[i33];
                    int i34 = iArr5[i27][i32];
                    if (i34 != 0) {
                        int i35 = iArrDecodeBandInt9[i3];
                        int i36 = iArrDecodeBandInt10[i3];
                        String str4 = cpClass[i35];
                        String str5 = cpUTF8[i36];
                        i3++;
                        attributeLayout6 = attributeLayout20;
                        attributeLayout7 = attributeLayout21;
                        i6 = i35;
                        i7 = i36;
                        str = str4;
                        n = str5;
                        i4 = i23;
                        i5 = i34;
                    } else {
                        i4 = i23;
                        IcTuple[] icTuples = this.segment.getIcBands().getIcTuples();
                        attributeLayout6 = attributeLayout20;
                        attributeLayout7 = attributeLayout21;
                        int i37 = 0;
                        while (true) {
                            if (i37 >= icTuples.length) {
                                i5 = i34;
                                str = null;
                                n = null;
                                break;
                            } else {
                                if (icTuples[i37].getC().equals(str3)) {
                                    int f = icTuples[i37].getF();
                                    String c2 = icTuples[i37].getC2();
                                    n = icTuples[i37].getN();
                                    i5 = f;
                                    str = c2;
                                    break;
                                }
                                i37++;
                            }
                        }
                        i6 = -1;
                        i7 = -1;
                    }
                    this.icLocal[i][i32] = new IcTuple(str3, i5, str, n, i33, i6, i7, i32);
                    i32++;
                    i23 = i4;
                    attributeLayout20 = attributeLayout6;
                    attributeLayout21 = attributeLayout7;
                }
                i2 = i23;
                attributeLayout3 = attributeLayout20;
                attributeLayout4 = attributeLayout21;
                i27++;
            } else {
                i2 = i23;
                attributeLayout3 = attributeLayout20;
                attributeLayout4 = attributeLayout21;
                i3 = i22;
            }
            AttributeLayout attributeLayout22 = attributeLayout16;
            if (attributeLayout22.matches(j)) {
                this.classVersionMajor[i] = iArrDecodeBandInt12[i29];
                this.classVersionMinor[i] = iArrDecodeBandInt11[i29];
                i29++;
            } else {
                int[] iArr8 = this.classVersionMajor;
                if (iArr8 != null) {
                    iArr8[i] = defaultClassMajorVersion;
                    this.classVersionMinor[i] = defaultClassMinorVersion;
                }
            }
            int i38 = i21;
            int i39 = 0;
            while (i39 < i38) {
                AttributeLayout attributeLayout23 = attributeLayoutArr[i39];
                if (attributeLayout23 == null || !attributeLayout23.matches(j)) {
                    attributeLayout5 = attributeLayout22;
                } else {
                    attributeLayout5 = attributeLayout22;
                    this.classAttributes[i].add(listArr[i39].get(0));
                    listArr[i39].remove(0);
                }
                i39++;
                attributeLayout22 = attributeLayout5;
            }
            attributeLayout16 = attributeLayout22;
            i25 = i + 1;
            i21 = i38;
            i22 = i3;
            i28 = i29;
            attributeLayout8 = attributeLayout;
            listArr2 = listArr;
            i23 = i2;
            attributeLayout9 = attributeLayout2;
            iArrDecodeBandInt2 = iArr;
            attributeLayout19 = attributeLayout3;
            attributeLayout14 = attributeLayout4;
        }
    }

    public static /* synthetic */ ArrayList lambda$parseClassAttrBands$0(int i) {
        return new ArrayList();
    }

    public final void parseCodeBands(InputStream inputStream) throws Pack200Exception, IOException {
        char c;
        char c2 = 2;
        int iCountMatches = SegmentUtils.countMatches(this.methodFlags, this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_CODE, 2));
        int[] iArrDecodeBandInt = decodeBandInt("code_headers", inputStream, Codec.BYTE1, iCountMatches);
        boolean zHasAllCodeFlags = this.segment.getSegmentHeader().getOptions().hasAllCodeFlags();
        if (!zHasAllCodeFlags) {
            this.codeHasAttributes = new boolean[iCountMatches];
        }
        int i = 0;
        for (int i2 = 0; i2 < iCountMatches; i2++) {
            if (iArrDecodeBandInt[i2] == 0) {
                i++;
                if (!zHasAllCodeFlags) {
                    this.codeHasAttributes[i2] = true;
                }
            }
        }
        BHSDCodec bHSDCodec = Codec.UNSIGNED5;
        int[] iArrDecodeBandInt2 = decodeBandInt("code_max_stack", inputStream, bHSDCodec, i);
        int[] iArrDecodeBandInt3 = decodeBandInt("code_max_na_locals", inputStream, bHSDCodec, i);
        int[] iArrDecodeBandInt4 = decodeBandInt("code_handler_count", inputStream, bHSDCodec, i);
        this.codeMaxStack = new int[iCountMatches];
        this.codeMaxNALocals = new int[iCountMatches];
        this.codeHandlerCount = new int[iCountMatches];
        int i3 = 0;
        int i4 = 0;
        while (i3 < iCountMatches) {
            int i5 = iArrDecodeBandInt[i3] & 255;
            if (i5 < 0) {
                throw new IllegalStateException("Shouldn't get here");
            }
            if (i5 == 0) {
                this.codeMaxStack[i3] = iArrDecodeBandInt2[i4];
                this.codeMaxNALocals[i3] = iArrDecodeBandInt3[i4];
                this.codeHandlerCount[i3] = iArrDecodeBandInt4[i4];
                i4++;
                c = c2;
            } else {
                if (i5 <= 144) {
                    int i6 = i5 - 1;
                    this.codeMaxStack[i3] = i6 % 12;
                    this.codeMaxNALocals[i3] = i6 / 12;
                    this.codeHandlerCount[i3] = 0;
                } else if (i5 <= 208) {
                    int i7 = i5 - 145;
                    this.codeMaxStack[i3] = i7 % 8;
                    this.codeMaxNALocals[i3] = i7 / 8;
                    this.codeHandlerCount[i3] = 1;
                } else if (i5 <= 255) {
                    int i8 = i5 - 209;
                    this.codeMaxStack[i3] = i8 % 7;
                    this.codeMaxNALocals[i3] = i8 / 7;
                    c = 2;
                    this.codeHandlerCount[i3] = 2;
                } else {
                    throw new IllegalStateException("Shouldn't get here either");
                }
                c = 2;
            }
            i3++;
            c2 = c;
        }
        this.codeHandlerStartP = decodeBandInt("code_handler_start_P", inputStream, Codec.BCI5, this.codeHandlerCount);
        BHSDCodec bHSDCodec2 = Codec.BRANCH5;
        this.codeHandlerEndPO = decodeBandInt("code_handler_end_PO", inputStream, bHSDCodec2, this.codeHandlerCount);
        this.codeHandlerCatchPO = decodeBandInt("code_handler_catch_PO", inputStream, bHSDCodec2, this.codeHandlerCount);
        this.codeHandlerClassRCN = decodeBandInt("code_handler_class_RCN", inputStream, Codec.UNSIGNED5, this.codeHandlerCount);
        if (!zHasAllCodeFlags) {
            iCountMatches = i;
        }
        List<Attribute>[] listArr = new List[iCountMatches];
        this.codeAttributes = listArr;
        Arrays.setAll(listArr, new IntFunction() { // from class: org.apache.commons.compress.harmony.unpack200.ClassBands$$ExternalSyntheticLambda0
            @Override // java.util.function.IntFunction
            public final Object apply(int i9) {
                return ClassBands.lambda$parseCodeBands$1(i9);
            }
        });
        parseCodeAttrBands(inputStream, iCountMatches);
    }

    public static /* synthetic */ List lambda$parseCodeBands$1(int i) {
        return new ArrayList();
    }

    public final void parseCodeAttrBands(InputStream inputStream, int i) throws Pack200Exception, IOException {
        AttributeLayout attributeLayout;
        int[] iArr;
        int i2;
        int[] iArr2;
        InputStream inputStream2 = inputStream;
        BHSDCodec bHSDCodec = Codec.UNSIGNED5;
        long[] flags = parseFlags("code_flags", inputStream, i, bHSDCodec, this.segment.getSegmentHeader().getOptions().hasCodeFlagsHi());
        int iNumBackwardsCallables = 0;
        for (int[] iArr3 : decodeBandInt("code_attr_indexes", inputStream2, bHSDCodec, decodeBandInt("code_attr_count", inputStream2, bHSDCodec, SegmentUtils.countBit16(flags)))) {
            int i3 = 0;
            while (true) {
                if (i3 < iArr3.length) {
                    iNumBackwardsCallables += this.attrMap.getAttributeLayout(iArr3[i3], 3).numBackwardsCallables();
                    i3++;
                }
            }
        }
        BHSDCodec bHSDCodec2 = Codec.UNSIGNED5;
        int[] iArrDecodeBandInt = decodeBandInt("code_attr_calls", inputStream2, bHSDCodec2, iNumBackwardsCallables);
        AttributeLayout attributeLayout2 = this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_LINE_NUMBER_TABLE, 3);
        int[] iArrDecodeBandInt2 = decodeBandInt("code_LineNumberTable_N", inputStream2, bHSDCodec2, SegmentUtils.countMatches(flags, attributeLayout2));
        BHSDCodec bHSDCodec3 = Codec.BCI5;
        int[][] iArrDecodeBandInt3 = decodeBandInt("code_LineNumberTable_bci_P", inputStream2, bHSDCodec3, iArrDecodeBandInt2);
        int[][] iArrDecodeBandInt4 = decodeBandInt("code_LineNumberTable_line", inputStream2, bHSDCodec2, iArrDecodeBandInt2);
        AttributeLayout attributeLayout3 = this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_LOCAL_VARIABLE_TABLE, 3);
        AttributeLayout attributeLayout4 = this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_LOCAL_VARIABLE_TYPE_TABLE, 3);
        int[] iArrDecodeBandInt5 = decodeBandInt("code_LocalVariableTable_N", inputStream2, bHSDCodec2, SegmentUtils.countMatches(flags, attributeLayout3));
        int[][] iArrDecodeBandInt6 = decodeBandInt("code_LocalVariableTable_bci_P", inputStream2, bHSDCodec3, iArrDecodeBandInt5);
        BHSDCodec bHSDCodec4 = Codec.BRANCH5;
        int[][] iArrDecodeBandInt7 = decodeBandInt("code_LocalVariableTable_span_O", inputStream2, bHSDCodec4, iArrDecodeBandInt5);
        CPUTF8[][] cPUTF8References = parseCPUTF8References("code_LocalVariableTable_name_RU", inputStream2, bHSDCodec2, iArrDecodeBandInt5);
        CPUTF8[][] cPSignatureReferences = parseCPSignatureReferences("code_LocalVariableTable_type_RS", inputStream2, bHSDCodec2, iArrDecodeBandInt5);
        int[][] iArrDecodeBandInt8 = decodeBandInt("code_LocalVariableTable_slot", inputStream2, bHSDCodec2, iArrDecodeBandInt5);
        AttributeLayout attributeLayout5 = attributeLayout4;
        int[] iArrDecodeBandInt9 = decodeBandInt("code_LocalVariableTypeTable_N", inputStream2, bHSDCodec2, SegmentUtils.countMatches(flags, attributeLayout4));
        int[][] iArrDecodeBandInt10 = decodeBandInt("code_LocalVariableTypeTable_bci_P", inputStream2, bHSDCodec3, iArrDecodeBandInt9);
        int[][] iArrDecodeBandInt11 = decodeBandInt("code_LocalVariableTypeTable_span_O", inputStream2, bHSDCodec4, iArrDecodeBandInt9);
        CPUTF8[][] cPUTF8References2 = parseCPUTF8References("code_LocalVariableTypeTable_name_RU", inputStream2, bHSDCodec2, iArrDecodeBandInt9);
        CPUTF8[][] cPSignatureReferences2 = parseCPSignatureReferences("code_LocalVariableTypeTable_type_RS", inputStream2, bHSDCodec2, iArrDecodeBandInt9);
        int[][] iArrDecodeBandInt12 = decodeBandInt("code_LocalVariableTypeTable_slot", inputStream2, bHSDCodec2, iArrDecodeBandInt9);
        int i4 = this.options.hasCodeFlagsHi() ? 62 : 31;
        int i5 = i4 + 1;
        AttributeLayout[] attributeLayoutArr = new AttributeLayout[i5];
        int[] iArr4 = new int[i5];
        List[] listArr = new List[i5];
        int i6 = 0;
        while (i6 < i4) {
            int i7 = i4;
            int[] iArr5 = iArrDecodeBandInt5;
            AttributeLayout attributeLayout6 = this.attrMap.getAttributeLayout(i6, 3);
            if (attributeLayout6 != null && !attributeLayout6.isDefaultLayout()) {
                attributeLayoutArr[i6] = attributeLayout6;
                iArr4[i6] = SegmentUtils.countMatches(flags, attributeLayout6);
            }
            i6++;
            i4 = i7;
            iArrDecodeBandInt5 = iArr5;
        }
        int[] iArr6 = iArrDecodeBandInt5;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i5) {
            if (iArr4[i8] > 0) {
                i2 = i5;
                NewAttributeBands attributeBands = this.attrMap.getAttributeBands(attributeLayoutArr[i8]);
                listArr[i8] = attributeBands.parseAttributes(inputStream2, iArr4[i8]);
                int iNumBackwardsCallables2 = attributeLayoutArr[i8].numBackwardsCallables();
                if (iNumBackwardsCallables2 > 0) {
                    int[] iArr7 = new int[iNumBackwardsCallables2];
                    iArr2 = iArr4;
                    System.arraycopy(iArrDecodeBandInt, i9, iArr7, 0, iNumBackwardsCallables2);
                    attributeBands.setBackwardsCalls(iArr7);
                    i9 += iNumBackwardsCallables2;
                }
                i8++;
                inputStream2 = inputStream;
                i5 = i2;
                iArr4 = iArr2;
            } else {
                i2 = i5;
            }
            iArr2 = iArr4;
            i8++;
            inputStream2 = inputStream;
            i5 = i2;
            iArr4 = iArr2;
        }
        int i10 = i5;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i14 < i) {
            if (attributeLayout2.matches(flags[i14])) {
                attributeLayout = attributeLayout2;
                iArr = iArrDecodeBandInt2;
                LineNumberTableAttribute lineNumberTableAttribute = new LineNumberTableAttribute(iArrDecodeBandInt2[i11], iArrDecodeBandInt3[i11], iArrDecodeBandInt4[i11]);
                i11++;
                this.codeAttributes[i14].add(lineNumberTableAttribute);
            } else {
                attributeLayout = attributeLayout2;
                iArr = iArrDecodeBandInt2;
            }
            if (attributeLayout3.matches(flags[i14])) {
                LocalVariableTableAttribute localVariableTableAttribute = new LocalVariableTableAttribute(iArr6[i12], iArrDecodeBandInt6[i12], iArrDecodeBandInt7[i12], cPUTF8References[i12], cPSignatureReferences[i12], iArrDecodeBandInt8[i12]);
                i12++;
                this.codeAttributes[i14].add(localVariableTableAttribute);
            }
            AttributeLayout attributeLayout7 = attributeLayout5;
            if (attributeLayout7.matches(flags[i14])) {
                LocalVariableTypeTableAttribute localVariableTypeTableAttribute = new LocalVariableTypeTableAttribute(iArrDecodeBandInt9[i13], iArrDecodeBandInt10[i13], iArrDecodeBandInt11[i13], cPUTF8References2[i13], cPSignatureReferences2[i13], iArrDecodeBandInt12[i13]);
                i13++;
                this.codeAttributes[i14].add(localVariableTypeTableAttribute);
            }
            int i15 = i10;
            int i16 = 0;
            while (i16 < i15) {
                AttributeLayout attributeLayout8 = attributeLayoutArr[i16];
                int i17 = i11;
                AttributeLayout[] attributeLayoutArr2 = attributeLayoutArr;
                if (attributeLayout8 != null && attributeLayout8.matches(flags[i14])) {
                    this.codeAttributes[i14].add(listArr[i16].get(0));
                    listArr[i16].remove(0);
                }
                i16++;
                i11 = i17;
                attributeLayoutArr = attributeLayoutArr2;
            }
            i14++;
            attributeLayout5 = attributeLayout7;
            attributeLayout2 = attributeLayout;
            i10 = i15;
            iArrDecodeBandInt2 = iArr;
        }
    }

    public final int parseFieldMetadataBands(InputStream inputStream, int[] iArr) throws Pack200Exception, IOException {
        int i;
        String[] strArr = {"RVA", "RIA"};
        AttributeLayout attributeLayout = this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_RUNTIME_VISIBLE_ANNOTATIONS, 1);
        AttributeLayout attributeLayout2 = this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_RUNTIME_INVISIBLE_ANNOTATIONS, 1);
        int iCountMatches = SegmentUtils.countMatches(this.fieldFlags, attributeLayout);
        int iCountMatches2 = SegmentUtils.countMatches(this.fieldFlags, attributeLayout2);
        int[] iArr2 = {iCountMatches, iCountMatches2};
        int[] iArr3 = {0, 0};
        if (iCountMatches > 0) {
            iArr3[0] = iArr[0];
            if (iCountMatches2 > 0) {
                iArr3[1] = iArr[1];
                i = 2;
            } else {
                i = 1;
            }
        } else if (iCountMatches2 > 0) {
            iArr3[1] = iArr[0];
            i = 1;
        } else {
            i = 0;
        }
        MetadataBandGroup[] metadata = parseMetadata(inputStream, strArr, iArr2, iArr3, SerializableConverter.ELEMENT_FIELD);
        List<Attribute> attributes = metadata[0].getAttributes();
        List<Attribute> attributes2 = metadata[1].getAttributes();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.fieldFlags.length; i4++) {
            int i5 = 0;
            while (true) {
                long[] jArr = this.fieldFlags[i4];
                if (i5 < jArr.length) {
                    if (attributeLayout.matches(jArr[i5])) {
                        this.fieldAttributes[i4][i5].add(attributes.get(i2));
                        i2++;
                    }
                    if (attributeLayout2.matches(this.fieldFlags[i4][i5])) {
                        this.fieldAttributes[i4][i5].add(attributes2.get(i3));
                        i3++;
                    }
                    i5++;
                }
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MetadataBandGroup[] parseMetadata(InputStream inputStream, String[] strArr, int[] iArr, int[] iArr2, String str) throws Pack200Exception, IOException {
        int i;
        MetadataBandGroup metadataBandGroup;
        ClassBands classBands = this;
        InputStream inputStream2 = inputStream;
        String[] strArr2 = strArr;
        MetadataBandGroup[] metadataBandGroupArr = new MetadataBandGroup[strArr2.length];
        int i2 = 0;
        while (i2 < strArr2.length) {
            metadataBandGroupArr[i2] = new MetadataBandGroup(strArr2[i2], classBands.cpBands);
            String str2 = strArr2[i2];
            if (str2.indexOf(80) >= 0) {
                metadataBandGroupArr[i2].param_NB = classBands.decodeBandInt(str + LauncherConstants.UNDERSCORE_STRING + str2 + "_param_NB", inputStream2, Codec.BYTE1, iArr[i2]);
            }
            if (!str2.equals("AD")) {
                MetadataBandGroup metadataBandGroup2 = metadataBandGroupArr[i2];
                String str3 = str + LauncherConstants.UNDERSCORE_STRING + str2 + "_anno_N";
                BHSDCodec bHSDCodec = Codec.UNSIGNED5;
                metadataBandGroup2.anno_N = classBands.decodeBandInt(str3, inputStream2, bHSDCodec, iArr[i2]);
                metadataBandGroupArr[i2].type_RS = classBands.parseCPSignatureReferences(str + LauncherConstants.UNDERSCORE_STRING + str2 + "_type_RS", inputStream2, bHSDCodec, metadataBandGroupArr[i2].anno_N);
                metadataBandGroupArr[i2].pair_N = classBands.decodeBandInt(str + LauncherConstants.UNDERSCORE_STRING + str2 + "_pair_N", inputStream2, bHSDCodec, metadataBandGroupArr[i2].anno_N);
                int i3 = 0;
                i = 0;
                while (true) {
                    MetadataBandGroup metadataBandGroup3 = metadataBandGroupArr[i2];
                    if (i3 < metadataBandGroup3.pair_N.length) {
                        int i4 = 0;
                        while (true) {
                            int[] iArr3 = metadataBandGroupArr[i2].pair_N[i3];
                            if (i4 < iArr3.length) {
                                i += iArr3[i4];
                                i4++;
                            }
                        }
                        i3++;
                    } else {
                        metadataBandGroup3.name_RU = classBands.parseCPUTF8References(str + LauncherConstants.UNDERSCORE_STRING + str2 + "_name_RU", inputStream2, Codec.UNSIGNED5, i);
                    }
                }
            } else {
                i = iArr[i2];
            }
            metadataBandGroupArr[i2].f9881T = classBands.decodeBandInt(str + LauncherConstants.UNDERSCORE_STRING + str2 + "_T", inputStream2, Codec.BYTE1, i + iArr2[i2]);
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                MetadataBandGroup metadataBandGroup4 = metadataBandGroupArr[i2];
                MetadataBandGroup[] metadataBandGroupArr2 = metadataBandGroupArr;
                int[] iArr4 = metadataBandGroup4.f9881T;
                if (i5 < iArr4.length) {
                    char c = (char) iArr4[i5];
                    if (c == '@') {
                        i11++;
                    } else if (c == 'F') {
                        i8++;
                    } else if (c == 'S') {
                        i6++;
                    } else if (c == 'c') {
                        i10++;
                    } else if (c == 'e') {
                        i14++;
                    } else if (c == 's') {
                        i13++;
                    } else if (c != 'I') {
                        if (c == 'J') {
                            i9++;
                        } else if (c != 'Z') {
                            if (c != '[') {
                                switch (c) {
                                    case 'D':
                                        i7++;
                                        break;
                                }
                            } else {
                                i12++;
                            }
                        }
                    }
                    i5++;
                    metadataBandGroupArr = metadataBandGroupArr2;
                } else {
                    String str4 = str + LauncherConstants.UNDERSCORE_STRING + str2 + "_caseI_KI";
                    BHSDCodec bHSDCodec2 = Codec.UNSIGNED5;
                    int i15 = i11;
                    classBands = this;
                    int i16 = i12;
                    metadataBandGroup4.caseI_KI = classBands.parseCPIntReferences(str4, inputStream, bHSDCodec2, i6);
                    metadataBandGroupArr2[i2].caseD_KD = classBands.parseCPDoubleReferences(str + LauncherConstants.UNDERSCORE_STRING + str2 + "_caseD_KD", inputStream, bHSDCodec2, i7);
                    metadataBandGroupArr2[i2].caseF_KF = classBands.parseCPFloatReferences(str + LauncherConstants.UNDERSCORE_STRING + str2 + "_caseF_KF", inputStream, bHSDCodec2, i8);
                    metadataBandGroupArr2[i2].caseJ_KJ = classBands.parseCPLongReferences(str + LauncherConstants.UNDERSCORE_STRING + str2 + "_caseJ_KJ", inputStream, bHSDCodec2, i9);
                    metadataBandGroupArr2[i2].casec_RS = classBands.parseCPSignatureReferences(str + LauncherConstants.UNDERSCORE_STRING + str2 + "_casec_RS", inputStream, bHSDCodec2, i10);
                    int i17 = i14;
                    metadataBandGroupArr2[i2].caseet_RS = parseReferences(str + LauncherConstants.UNDERSCORE_STRING + str2 + "_caseet_RS", inputStream, bHSDCodec2, i17, classBands.cpBands.getCpSignature());
                    metadataBandGroupArr2[i2].caseec_RU = parseReferences(str + LauncherConstants.UNDERSCORE_STRING + str2 + "_caseec_RU", inputStream, bHSDCodec2, i17, classBands.cpBands.getCpUTF8());
                    metadataBandGroupArr2[i2].cases_RU = classBands.parseCPUTF8References(str + LauncherConstants.UNDERSCORE_STRING + str2 + "_cases_RU", inputStream, bHSDCodec2, i13);
                    metadataBandGroupArr2[i2].casearray_N = classBands.decodeBandInt(str + LauncherConstants.UNDERSCORE_STRING + str2 + "_casearray_N", inputStream, bHSDCodec2, i16);
                    metadataBandGroupArr2[i2].nesttype_RS = classBands.parseCPUTF8References(str + LauncherConstants.UNDERSCORE_STRING + str2 + "_nesttype_RS", inputStream, bHSDCodec2, i15);
                    metadataBandGroupArr2[i2].nestpair_N = classBands.decodeBandInt(str + LauncherConstants.UNDERSCORE_STRING + str2 + "_nestpair_N", inputStream, bHSDCodec2, i15);
                    int i18 = 0;
                    int i19 = 0;
                    while (true) {
                        metadataBandGroup = metadataBandGroupArr2[i2];
                        int[] iArr5 = metadataBandGroup.nestpair_N;
                        if (i18 < iArr5.length) {
                            i19 += iArr5[i18];
                            i18++;
                        }
                    }
                    metadataBandGroup.nestname_RU = classBands.parseCPUTF8References(str + LauncherConstants.UNDERSCORE_STRING + str2 + "_nestname_RU", inputStream, Codec.UNSIGNED5, i19);
                    i2++;
                    strArr2 = strArr;
                    inputStream2 = inputStream;
                    metadataBandGroupArr = metadataBandGroupArr2;
                }
            }
        }
        return metadataBandGroupArr;
    }

    public final int parseMethodMetadataBands(InputStream inputStream, int[] iArr) throws Pack200Exception, IOException {
        String[] strArr = {"RVA", "RIA", "RVPA", "RIPA", "AD"};
        int[] iArr2 = {0, 0, 0, 0, 0};
        final AttributeLayout[] attributeLayoutArr = {this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_RUNTIME_VISIBLE_ANNOTATIONS, 2), this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_RUNTIME_INVISIBLE_ANNOTATIONS, 2), this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_RUNTIME_VISIBLE_PARAMETER_ANNOTATIONS, 2), this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_RUNTIME_INVISIBLE_PARAMETER_ANNOTATIONS, 2), this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_ANNOTATION_DEFAULT, 2)};
        Arrays.setAll(iArr2, new IntUnaryOperator() { // from class: org.apache.commons.compress.harmony.unpack200.ClassBands$$ExternalSyntheticLambda1
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i) {
                return this.f$0.lambda$parseMethodMetadataBands$2(attributeLayoutArr, i);
            }
        });
        int[] iArr3 = new int[5];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 5; i3++) {
            if (iArr2[i3] > 0) {
                i++;
                iArr3[i3] = iArr[i2];
                i2++;
            } else {
                iArr3[i3] = 0;
            }
        }
        MetadataBandGroup[] metadata = parseMetadata(inputStream, strArr, iArr2, iArr3, FirebaseAnalytics.Param.METHOD);
        List[] listArr = new List[5];
        int[] iArr4 = new int[5];
        for (int i4 = 0; i4 < metadata.length; i4++) {
            listArr[i4] = metadata[i4].getAttributes();
            iArr4[i4] = 0;
        }
        for (int i5 = 0; i5 < this.methodFlags.length; i5++) {
            for (int i6 = 0; i6 < this.methodFlags[i5].length; i6++) {
                for (int i7 = 0; i7 < 5; i7++) {
                    if (attributeLayoutArr[i7].matches(this.methodFlags[i5][i6])) {
                        ArrayList arrayList = this.methodAttributes[i5][i6];
                        List list = listArr[i7];
                        int i8 = iArr4[i7];
                        iArr4[i7] = i8 + 1;
                        arrayList.add(list.get(i8));
                    }
                }
            }
        }
        return i;
    }

    public final /* synthetic */ int lambda$parseMethodMetadataBands$2(AttributeLayout[] attributeLayoutArr, int i) {
        return SegmentUtils.countMatches(this.methodFlags, attributeLayoutArr[i]);
    }

    public final int parseClassMetadataBands(InputStream inputStream, int[] iArr) throws Pack200Exception, IOException {
        int i;
        String[] strArr = {"RVA", "RIA"};
        int i2 = 0;
        AttributeLayout attributeLayout = this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_RUNTIME_VISIBLE_ANNOTATIONS, 0);
        AttributeLayout attributeLayout2 = this.attrMap.getAttributeLayout(AttributeLayout.ATTRIBUTE_RUNTIME_INVISIBLE_ANNOTATIONS, 0);
        int iCountMatches = SegmentUtils.countMatches(this.classFlags, attributeLayout);
        int iCountMatches2 = SegmentUtils.countMatches(this.classFlags, attributeLayout2);
        int[] iArr2 = {iCountMatches, iCountMatches2};
        int[] iArr3 = {0, 0};
        if (iCountMatches > 0) {
            iArr3[0] = iArr[0];
            if (iCountMatches2 > 0) {
                iArr3[1] = iArr[1];
                i = 2;
            } else {
                i = 1;
            }
        } else if (iCountMatches2 > 0) {
            iArr3[1] = iArr[0];
            i = 1;
        } else {
            i = 0;
        }
        MetadataBandGroup[] metadata = parseMetadata(inputStream, strArr, iArr2, iArr3, "class");
        List<Attribute> attributes = metadata[0].getAttributes();
        List<Attribute> attributes2 = metadata[1].getAttributes();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            long[] jArr = this.classFlags;
            if (i2 >= jArr.length) {
                return i;
            }
            if (attributeLayout.matches(jArr[i2])) {
                this.classAttributes[i2].add(attributes.get(i3));
                i3++;
            }
            if (attributeLayout2.matches(this.classFlags[i2])) {
                this.classAttributes[i2].add(attributes2.get(i4));
                i4++;
            }
            i2++;
        }
    }

    public ArrayList<Attribute>[] getClassAttributes() {
        return this.classAttributes;
    }

    public int[] getClassFieldCount() {
        return this.classFieldCount;
    }

    public long[] getRawClassFlags() {
        return this.classFlags;
    }

    public long[] getClassFlags() {
        if (this.classAccessFlags == null) {
            int i = 0;
            long j = 32767;
            for (int i2 = 0; i2 < 16; i2++) {
                AttributeLayout attributeLayout = this.attrMap.getAttributeLayout(i2, 0);
                if (attributeLayout != null && !attributeLayout.isDefaultLayout()) {
                    j &= ~(1 << i2);
                }
            }
            this.classAccessFlags = new long[this.classFlags.length];
            while (true) {
                long[] jArr = this.classFlags;
                if (i >= jArr.length) {
                    break;
                }
                this.classAccessFlags[i] = jArr[i] & j;
                i++;
            }
        }
        return this.classAccessFlags;
    }

    public int[][] getClassInterfacesInts() {
        return this.classInterfacesInts;
    }

    public int[] getClassMethodCount() {
        return this.classMethodCount;
    }

    public int[] getClassSuperInts() {
        return this.classSuperInts;
    }

    public int[] getClassThisInts() {
        return this.classThisInts;
    }

    public int[] getCodeMaxNALocals() {
        return this.codeMaxNALocals;
    }

    public int[] getCodeMaxStack() {
        return this.codeMaxStack;
    }

    public ArrayList<Attribute>[][] getFieldAttributes() {
        return this.fieldAttributes;
    }

    public int[][] getFieldDescrInts() {
        return this.fieldDescrInts;
    }

    public int[][] getMethodDescrInts() {
        return this.methodDescrInts;
    }

    public long[][] getFieldFlags() {
        if (this.fieldAccessFlags == null) {
            long j = 32767;
            for (int i = 0; i < 16; i++) {
                AttributeLayout attributeLayout = this.attrMap.getAttributeLayout(i, 1);
                if (attributeLayout != null && !attributeLayout.isDefaultLayout()) {
                    j &= ~(1 << i);
                }
            }
            this.fieldAccessFlags = new long[this.fieldFlags.length][];
            int i2 = 0;
            while (true) {
                long[][] jArr = this.fieldFlags;
                if (i2 >= jArr.length) {
                    break;
                }
                this.fieldAccessFlags[i2] = new long[jArr[i2].length];
                int i3 = 0;
                while (true) {
                    long[] jArr2 = this.fieldFlags[i2];
                    if (i3 < jArr2.length) {
                        this.fieldAccessFlags[i2][i3] = jArr2[i3] & j;
                        i3++;
                    }
                }
                i2++;
            }
        }
        return this.fieldAccessFlags;
    }

    public ArrayList<List<Attribute>> getOrderedCodeAttributes() {
        ArrayList<List<Attribute>> arrayList = new ArrayList<>(this.codeAttributes.length);
        for (int i = 0; i < this.codeAttributes.length; i++) {
            ArrayList arrayList2 = new ArrayList(this.codeAttributes[i].size());
            for (int i2 = 0; i2 < this.codeAttributes[i].size(); i2++) {
                arrayList2.add(this.codeAttributes[i].get(i2));
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    public ArrayList<Attribute>[][] getMethodAttributes() {
        return this.methodAttributes;
    }

    public String[][] getMethodDescr() {
        return this.methodDescr;
    }

    public long[][] getMethodFlags() {
        if (this.methodAccessFlags == null) {
            long j = 32767;
            for (int i = 0; i < 16; i++) {
                AttributeLayout attributeLayout = this.attrMap.getAttributeLayout(i, 2);
                if (attributeLayout != null && !attributeLayout.isDefaultLayout()) {
                    j &= ~(1 << i);
                }
            }
            this.methodAccessFlags = new long[this.methodFlags.length][];
            int i2 = 0;
            while (true) {
                long[][] jArr = this.methodFlags;
                if (i2 >= jArr.length) {
                    break;
                }
                this.methodAccessFlags[i2] = new long[jArr[i2].length];
                int i3 = 0;
                while (true) {
                    long[] jArr2 = this.methodFlags[i2];
                    if (i3 < jArr2.length) {
                        this.methodAccessFlags[i2][i3] = jArr2[i3] & j;
                        i3++;
                    }
                }
                i2++;
            }
        }
        return this.methodAccessFlags;
    }

    public int[] getClassVersionMajor() {
        return this.classVersionMajor;
    }

    public int[] getClassVersionMinor() {
        return this.classVersionMinor;
    }

    public int[] getCodeHandlerCount() {
        return this.codeHandlerCount;
    }

    public int[][] getCodeHandlerCatchPO() {
        return this.codeHandlerCatchPO;
    }

    public int[][] getCodeHandlerClassRCN() {
        return this.codeHandlerClassRCN;
    }

    public int[][] getCodeHandlerEndPO() {
        return this.codeHandlerEndPO;
    }

    public int[][] getCodeHandlerStartP() {
        return this.codeHandlerStartP;
    }

    public IcTuple[][] getIcLocal() {
        return this.icLocal;
    }

    public boolean[] getCodeHasAttributes() {
        return this.codeHasAttributes;
    }
}
