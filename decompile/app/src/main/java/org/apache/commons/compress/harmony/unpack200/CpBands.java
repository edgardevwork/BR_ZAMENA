package org.apache.commons.compress.harmony.unpack200;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPLong;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMethodRef;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPString;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;

/* loaded from: classes6.dex */
public class CpBands extends BandSet {
    public int classOffset;
    public String[] cpClass;
    public int[] cpClassInts;
    public String[] cpDescriptor;
    public int[] cpDescriptorNameInts;
    public int[] cpDescriptorTypeInts;
    public double[] cpDouble;
    public String[] cpFieldClass;
    public int[] cpFieldClassInts;
    public String[] cpFieldDescriptor;
    public int[] cpFieldDescriptorInts;
    public float[] cpFloat;
    public String[] cpIMethodClass;
    public int[] cpIMethodClassInts;
    public String[] cpIMethodDescriptor;
    public int[] cpIMethodDescriptorInts;
    public int[] cpInt;
    public long[] cpLong;
    public String[] cpMethodClass;
    public int[] cpMethodClassInts;
    public String[] cpMethodDescriptor;
    public int[] cpMethodDescriptorInts;
    public String[] cpSignature;
    public int[] cpSignatureInts;
    public String[] cpString;
    public int[] cpStringInts;
    public String[] cpUTF8;
    public int descrOffset;
    public final Map<String, CPNameAndType> descriptorsToCPNameAndTypes;
    public int doubleOffset;
    public final Map<Double, CPDouble> doublesToCPDoubles;
    public int fieldOffset;
    public int floatOffset;
    public final Map<Float, CPFloat> floatsToCPFloats;
    public int imethodOffset;
    public int intOffset;
    public final Map<Integer, CPInteger> integersToCPIntegers;
    public int longOffset;
    public final Map<Long, CPLong> longsToCPLongs;
    public Map<String, Integer> mapClass;
    public Map<String, Integer> mapDescriptor;
    public Map<String, Integer> mapSignature;
    public Map<String, Integer> mapUTF8;
    public int methodOffset;
    public final SegmentConstantPool pool;
    public int signatureOffset;
    public int stringOffset;
    public final Map<String, CPClass> stringsToCPClass;
    public final Map<String, CPString> stringsToCPStrings;
    public final Map<String, CPUTF8> stringsToCPUTF8;

    @Override // org.apache.commons.compress.harmony.unpack200.BandSet
    public void unpack() {
    }

    public SegmentConstantPool getConstantPool() {
        return this.pool;
    }

    public CpBands(Segment segment) {
        super(segment);
        this.pool = new SegmentConstantPool(this);
        this.stringsToCPUTF8 = new HashMap();
        this.stringsToCPStrings = new HashMap();
        this.longsToCPLongs = new HashMap();
        this.integersToCPIntegers = new HashMap();
        this.floatsToCPFloats = new HashMap();
        this.stringsToCPClass = new HashMap();
        this.doublesToCPDoubles = new HashMap();
        this.descriptorsToCPNameAndTypes = new HashMap();
    }

    @Override // org.apache.commons.compress.harmony.unpack200.BandSet
    public void read(InputStream inputStream) throws Pack200Exception, IOException {
        parseCpUtf8(inputStream);
        parseCpInt(inputStream);
        parseCpFloat(inputStream);
        parseCpLong(inputStream);
        parseCpDouble(inputStream);
        parseCpString(inputStream);
        parseCpClass(inputStream);
        parseCpSignature(inputStream);
        parseCpDescriptor(inputStream);
        parseCpField(inputStream);
        parseCpMethod(inputStream);
        parseCpIMethod(inputStream);
        int length = this.cpUTF8.length;
        this.intOffset = length;
        int length2 = length + this.cpInt.length;
        this.floatOffset = length2;
        int length3 = length2 + this.cpFloat.length;
        this.longOffset = length3;
        int length4 = length3 + this.cpLong.length;
        this.doubleOffset = length4;
        int length5 = length4 + this.cpDouble.length;
        this.stringOffset = length5;
        int length6 = length5 + this.cpString.length;
        this.classOffset = length6;
        int length7 = length6 + this.cpClass.length;
        this.signatureOffset = length7;
        int length8 = length7 + this.cpSignature.length;
        this.descrOffset = length8;
        int length9 = length8 + this.cpDescriptor.length;
        this.fieldOffset = length9;
        int length10 = length9 + this.cpFieldClass.length;
        this.methodOffset = length10;
        this.imethodOffset = length10 + this.cpMethodClass.length;
    }

    public final void parseCpClass(InputStream inputStream) throws Pack200Exception, IOException {
        int cpClassCount = this.header.getCpClassCount();
        this.cpClassInts = decodeBandInt("cp_Class", inputStream, Codec.UDELTA5, cpClassCount);
        this.cpClass = new String[cpClassCount];
        this.mapClass = new HashMap(cpClassCount);
        for (int i = 0; i < cpClassCount; i++) {
            String[] strArr = this.cpClass;
            String str = this.cpUTF8[this.cpClassInts[i]];
            strArr[i] = str;
            this.mapClass.put(str, Integer.valueOf(i));
        }
    }

    public final void parseCpDescriptor(InputStream inputStream) throws Pack200Exception, IOException {
        int cpDescriptorCount = this.header.getCpDescriptorCount();
        this.cpDescriptorNameInts = decodeBandInt("cp_Descr_name", inputStream, Codec.DELTA5, cpDescriptorCount);
        this.cpDescriptorTypeInts = decodeBandInt("cp_Descr_type", inputStream, Codec.UDELTA5, cpDescriptorCount);
        String[] references = getReferences(this.cpDescriptorNameInts, this.cpUTF8);
        String[] references2 = getReferences(this.cpDescriptorTypeInts, this.cpSignature);
        this.cpDescriptor = new String[cpDescriptorCount];
        this.mapDescriptor = new HashMap(cpDescriptorCount);
        for (int i = 0; i < cpDescriptorCount; i++) {
            this.cpDescriptor[i] = references[i] + StringUtils.PROCESS_POSTFIX_DELIMITER + references2[i];
            this.mapDescriptor.put(this.cpDescriptor[i], Integer.valueOf(i));
        }
    }

    public final void parseCpDouble(InputStream inputStream) throws Pack200Exception, IOException {
        final long[] flags = parseFlags("cp_Double", inputStream, this.header.getCpDoubleCount(), Codec.UDELTA5, Codec.DELTA5);
        double[] dArr = new double[flags.length];
        this.cpDouble = dArr;
        Arrays.setAll(dArr, new IntToDoubleFunction() { // from class: org.apache.commons.compress.harmony.unpack200.CpBands$$ExternalSyntheticLambda1
            @Override // java.util.function.IntToDoubleFunction
            public final double applyAsDouble(int i) {
                return CpBands.lambda$parseCpDouble$0(flags, i);
            }
        });
    }

    public static /* synthetic */ double lambda$parseCpDouble$0(long[] jArr, int i) {
        return Double.longBitsToDouble(jArr[i]);
    }

    public final void parseCpField(InputStream inputStream) throws Pack200Exception, IOException {
        int cpFieldCount = this.header.getCpFieldCount();
        this.cpFieldClassInts = decodeBandInt("cp_Field_class", inputStream, Codec.DELTA5, cpFieldCount);
        this.cpFieldDescriptorInts = decodeBandInt("cp_Field_desc", inputStream, Codec.UDELTA5, cpFieldCount);
        this.cpFieldClass = new String[cpFieldCount];
        this.cpFieldDescriptor = new String[cpFieldCount];
        for (int i = 0; i < cpFieldCount; i++) {
            this.cpFieldClass[i] = this.cpClass[this.cpFieldClassInts[i]];
            this.cpFieldDescriptor[i] = this.cpDescriptor[this.cpFieldDescriptorInts[i]];
        }
    }

    public final void parseCpFloat(InputStream inputStream) throws Pack200Exception, IOException {
        int cpFloatCount = this.header.getCpFloatCount();
        this.cpFloat = new float[cpFloatCount];
        int[] iArrDecodeBandInt = decodeBandInt("cp_Float", inputStream, Codec.UDELTA5, cpFloatCount);
        for (int i = 0; i < cpFloatCount; i++) {
            this.cpFloat[i] = Float.intBitsToFloat(iArrDecodeBandInt[i]);
        }
    }

    public final void parseCpIMethod(InputStream inputStream) throws Pack200Exception, IOException {
        int cpIMethodCount = this.header.getCpIMethodCount();
        this.cpIMethodClassInts = decodeBandInt("cp_Imethod_class", inputStream, Codec.DELTA5, cpIMethodCount);
        this.cpIMethodDescriptorInts = decodeBandInt("cp_Imethod_desc", inputStream, Codec.UDELTA5, cpIMethodCount);
        this.cpIMethodClass = new String[cpIMethodCount];
        this.cpIMethodDescriptor = new String[cpIMethodCount];
        for (int i = 0; i < cpIMethodCount; i++) {
            this.cpIMethodClass[i] = this.cpClass[this.cpIMethodClassInts[i]];
            this.cpIMethodDescriptor[i] = this.cpDescriptor[this.cpIMethodDescriptorInts[i]];
        }
    }

    public final void parseCpInt(InputStream inputStream) throws Pack200Exception, IOException {
        this.cpInt = decodeBandInt("cpInt", inputStream, Codec.UDELTA5, this.header.getCpIntCount());
    }

    public final void parseCpLong(InputStream inputStream) throws Pack200Exception, IOException {
        this.cpLong = parseFlags("cp_Long", inputStream, this.header.getCpLongCount(), Codec.UDELTA5, Codec.DELTA5);
    }

    public final void parseCpMethod(InputStream inputStream) throws Pack200Exception, IOException {
        int cpMethodCount = this.header.getCpMethodCount();
        this.cpMethodClassInts = decodeBandInt("cp_Method_class", inputStream, Codec.DELTA5, cpMethodCount);
        this.cpMethodDescriptorInts = decodeBandInt("cp_Method_desc", inputStream, Codec.UDELTA5, cpMethodCount);
        this.cpMethodClass = new String[cpMethodCount];
        this.cpMethodDescriptor = new String[cpMethodCount];
        for (int i = 0; i < cpMethodCount; i++) {
            this.cpMethodClass[i] = this.cpClass[this.cpMethodClassInts[i]];
            this.cpMethodDescriptor[i] = this.cpDescriptor[this.cpMethodDescriptorInts[i]];
        }
    }

    public final void parseCpSignature(InputStream inputStream) throws Pack200Exception, IOException {
        int cpSignatureCount = this.header.getCpSignatureCount();
        int[] iArrDecodeBandInt = decodeBandInt("cp_Signature_form", inputStream, Codec.DELTA5, cpSignatureCount);
        this.cpSignatureInts = iArrDecodeBandInt;
        String[] references = getReferences(iArrDecodeBandInt, this.cpUTF8);
        this.cpSignature = new String[cpSignatureCount];
        this.mapSignature = new HashMap();
        int i = 0;
        for (int i2 = 0; i2 < cpSignatureCount; i2++) {
            for (char c : references[i2].toCharArray()) {
                if (c == 'L') {
                    this.cpSignatureInts[i2] = -1;
                    i++;
                }
            }
        }
        String[] references2 = parseReferences("cp_Signature_classes", inputStream, Codec.UDELTA5, i, this.cpClass);
        int i3 = 0;
        for (int i4 = 0; i4 < cpSignatureCount; i4++) {
            String str = references[i4];
            int length = str.length();
            StringBuilder sb = new StringBuilder(64);
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < length; i5++) {
                char cCharAt = str.charAt(i5);
                sb.append(cCharAt);
                if (cCharAt == 'L') {
                    String str2 = references2[i3];
                    arrayList.add(str2);
                    sb.append(str2);
                    i3++;
                }
            }
            this.cpSignature[i4] = sb.toString();
            this.mapSignature.put(sb.toString(), Integer.valueOf(i4));
        }
    }

    public final void parseCpString(InputStream inputStream) throws Pack200Exception, IOException {
        int cpStringCount = this.header.getCpStringCount();
        this.cpStringInts = decodeBandInt("cp_String", inputStream, Codec.UDELTA5, cpStringCount);
        String[] strArr = new String[cpStringCount];
        this.cpString = strArr;
        Arrays.setAll(strArr, new IntFunction() { // from class: org.apache.commons.compress.harmony.unpack200.CpBands$$ExternalSyntheticLambda0
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return this.f$0.lambda$parseCpString$1(i);
            }
        });
    }

    public final /* synthetic */ String lambda$parseCpString$1(int i) {
        return this.cpUTF8[this.cpStringInts[i]];
    }

    public final void parseCpUtf8(InputStream inputStream) throws Pack200Exception, IOException {
        int cpUTF8Count = this.header.getCpUTF8Count();
        this.cpUTF8 = new String[cpUTF8Count];
        HashMap map = new HashMap(cpUTF8Count + 1);
        this.mapUTF8 = map;
        this.cpUTF8[0] = "";
        map.put("", 0);
        int[] iArrDecodeBandInt = decodeBandInt("cpUTF8Prefix", inputStream, Codec.DELTA5, cpUTF8Count - 2);
        int[] iArrDecodeBandInt2 = decodeBandInt("cpUTF8Suffix", inputStream, Codec.UNSIGNED5, cpUTF8Count - 1);
        int i = 0;
        int i2 = 0;
        for (int i3 : iArrDecodeBandInt2) {
            if (i3 == 0) {
                i2++;
            } else {
                i += i3;
            }
        }
        char[] cArr = new char[i];
        int[] iArrDecodeBandInt3 = decodeBandInt("cp_Utf8_chars", inputStream, Codec.CHAR3, i);
        for (int i4 = 0; i4 < i; i4++) {
            cArr[i4] = (char) iArrDecodeBandInt3[i4];
        }
        int[] iArrDecodeBandInt4 = decodeBandInt("cp_Utf8_big_suffix", inputStream, Codec.DELTA5, i2);
        int[][] iArr = new int[i2][];
        for (int i5 = 0; i5 < i2; i5++) {
            iArr[i5] = decodeBandInt("cp_Utf8_big_chars " + i5, inputStream, Codec.DELTA5, iArrDecodeBandInt4[i5]);
        }
        char[][] cArr2 = new char[i2][];
        for (int i6 = 0; i6 < i2; i6++) {
            cArr2[i6] = new char[iArr[i6].length];
            int i7 = 0;
            while (true) {
                int[] iArr2 = iArr[i6];
                if (i7 < iArr2.length) {
                    cArr2[i6][i7] = (char) iArr2[i7];
                    i7++;
                }
            }
        }
        int i8 = 0;
        int i9 = 0;
        int i10 = 1;
        while (i10 < cpUTF8Count) {
            String[] strArr = this.cpUTF8;
            int i11 = i10 - 1;
            String str = strArr[i11];
            if (iArrDecodeBandInt2[i11] == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(str.substring(0, i10 > 1 ? iArrDecodeBandInt[i10 - 2] : 0));
                sb.append(new String(cArr2[i9]));
                strArr[i10] = sb.toString();
                this.mapUTF8.put(this.cpUTF8[i10], Integer.valueOf(i10));
                i9++;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str.substring(0, i10 > 1 ? iArrDecodeBandInt[i10 - 2] : 0));
                sb2.append(new String(cArr, i8, iArrDecodeBandInt2[i11]));
                strArr[i10] = sb2.toString();
                i8 += iArrDecodeBandInt2[i11];
                this.mapUTF8.put(this.cpUTF8[i10], Integer.valueOf(i10));
            }
            i10++;
        }
    }

    public String[] getCpClass() {
        return this.cpClass;
    }

    public String[] getCpDescriptor() {
        return this.cpDescriptor;
    }

    public String[] getCpFieldClass() {
        return this.cpFieldClass;
    }

    public String[] getCpIMethodClass() {
        return this.cpIMethodClass;
    }

    public int[] getCpInt() {
        return this.cpInt;
    }

    public long[] getCpLong() {
        return this.cpLong;
    }

    public String[] getCpMethodClass() {
        return this.cpMethodClass;
    }

    public String[] getCpMethodDescriptor() {
        return this.cpMethodDescriptor;
    }

    public String[] getCpSignature() {
        return this.cpSignature;
    }

    public String[] getCpUTF8() {
        return this.cpUTF8;
    }

    public CPUTF8 cpUTF8Value(int i) {
        String str = this.cpUTF8[i];
        CPUTF8 cputf8 = this.stringsToCPUTF8.get(str);
        if (cputf8 == null) {
            CPUTF8 cputf82 = new CPUTF8(str, i);
            this.stringsToCPUTF8.put(str, cputf82);
            return cputf82;
        }
        if (cputf8.getGlobalIndex() <= i) {
            return cputf8;
        }
        cputf8.setGlobalIndex(i);
        return cputf8;
    }

    public CPUTF8 cpUTF8Value(String str) {
        return cpUTF8Value(str, true);
    }

    public CPUTF8 cpUTF8Value(String str, boolean z) {
        CPUTF8 cputf8 = this.stringsToCPUTF8.get(str);
        if (cputf8 != null) {
            return cputf8;
        }
        Integer num = z ? this.mapUTF8.get(str) : null;
        if (num != null) {
            return cpUTF8Value(num.intValue());
        }
        if (z) {
            num = this.mapSignature.get(str);
        }
        if (num != null) {
            return cpSignatureValue(num.intValue());
        }
        CPUTF8 cputf82 = new CPUTF8(str, -1);
        this.stringsToCPUTF8.put(str, cputf82);
        return cputf82;
    }

    public CPString cpStringValue(int i) {
        String str = this.cpString[i];
        int i2 = this.cpStringInts[i];
        int i3 = this.stringOffset + i;
        CPString cPString = this.stringsToCPStrings.get(str);
        if (cPString != null) {
            return cPString;
        }
        CPString cPString2 = new CPString(cpUTF8Value(i2), i3);
        this.stringsToCPStrings.put(str, cPString2);
        return cPString2;
    }

    public CPLong cpLongValue(int i) {
        Long lValueOf = Long.valueOf(this.cpLong[i]);
        CPLong cPLong = this.longsToCPLongs.get(lValueOf);
        if (cPLong != null) {
            return cPLong;
        }
        CPLong cPLong2 = new CPLong(lValueOf, i + this.longOffset);
        this.longsToCPLongs.put(lValueOf, cPLong2);
        return cPLong2;
    }

    public CPInteger cpIntegerValue(int i) {
        Integer numValueOf = Integer.valueOf(this.cpInt[i]);
        CPInteger cPInteger = this.integersToCPIntegers.get(numValueOf);
        if (cPInteger != null) {
            return cPInteger;
        }
        CPInteger cPInteger2 = new CPInteger(numValueOf, i + this.intOffset);
        this.integersToCPIntegers.put(numValueOf, cPInteger2);
        return cPInteger2;
    }

    public CPFloat cpFloatValue(int i) {
        Float fValueOf = Float.valueOf(this.cpFloat[i]);
        CPFloat cPFloat = this.floatsToCPFloats.get(fValueOf);
        if (cPFloat != null) {
            return cPFloat;
        }
        CPFloat cPFloat2 = new CPFloat(fValueOf, i + this.floatOffset);
        this.floatsToCPFloats.put(fValueOf, cPFloat2);
        return cPFloat2;
    }

    public CPClass cpClassValue(int i) {
        String str = this.cpClass[i];
        int i2 = this.cpClassInts[i];
        int i3 = this.classOffset + i;
        CPClass cPClass = this.stringsToCPClass.get(str);
        if (cPClass != null) {
            return cPClass;
        }
        CPClass cPClass2 = new CPClass(cpUTF8Value(i2), i3);
        this.stringsToCPClass.put(str, cPClass2);
        return cPClass2;
    }

    public CPClass cpClassValue(String str) {
        CPClass cPClass = this.stringsToCPClass.get(str);
        if (cPClass != null) {
            return cPClass;
        }
        Integer num = this.mapClass.get(str);
        if (num != null) {
            return cpClassValue(num.intValue());
        }
        CPClass cPClass2 = new CPClass(cpUTF8Value(str, false), -1);
        this.stringsToCPClass.put(str, cPClass2);
        return cPClass2;
    }

    public CPDouble cpDoubleValue(int i) {
        Double dValueOf = Double.valueOf(this.cpDouble[i]);
        CPDouble cPDouble = this.doublesToCPDoubles.get(dValueOf);
        if (cPDouble != null) {
            return cPDouble;
        }
        CPDouble cPDouble2 = new CPDouble(dValueOf, i + this.doubleOffset);
        this.doublesToCPDoubles.put(dValueOf, cPDouble2);
        return cPDouble2;
    }

    public CPNameAndType cpNameAndTypeValue(int i) {
        String str = this.cpDescriptor[i];
        CPNameAndType cPNameAndType = this.descriptorsToCPNameAndTypes.get(str);
        if (cPNameAndType != null) {
            return cPNameAndType;
        }
        CPNameAndType cPNameAndType2 = new CPNameAndType(cpUTF8Value(this.cpDescriptorNameInts[i]), cpSignatureValue(this.cpDescriptorTypeInts[i]), i + this.descrOffset);
        this.descriptorsToCPNameAndTypes.put(str, cPNameAndType2);
        return cPNameAndType2;
    }

    public CPInterfaceMethodRef cpIMethodValue(int i) {
        return new CPInterfaceMethodRef(cpClassValue(this.cpIMethodClassInts[i]), cpNameAndTypeValue(this.cpIMethodDescriptorInts[i]), i + this.imethodOffset);
    }

    public CPMethodRef cpMethodValue(int i) {
        return new CPMethodRef(cpClassValue(this.cpMethodClassInts[i]), cpNameAndTypeValue(this.cpMethodDescriptorInts[i]), i + this.methodOffset);
    }

    public CPFieldRef cpFieldValue(int i) {
        return new CPFieldRef(cpClassValue(this.cpFieldClassInts[i]), cpNameAndTypeValue(this.cpFieldDescriptorInts[i]), i + this.fieldOffset);
    }

    public CPUTF8 cpSignatureValue(int i) {
        int i2 = this.cpSignatureInts[i];
        if (i2 == -1) {
            i2 = this.signatureOffset + i;
        }
        String str = this.cpSignature[i];
        CPUTF8 cputf8 = this.stringsToCPUTF8.get(str);
        if (cputf8 != null) {
            return cputf8;
        }
        CPUTF8 cputf82 = new CPUTF8(str, i2);
        this.stringsToCPUTF8.put(str, cputf82);
        return cputf82;
    }

    public CPNameAndType cpNameAndTypeValue(String str) {
        CPNameAndType cPNameAndType = this.descriptorsToCPNameAndTypes.get(str);
        if (cPNameAndType != null) {
            return cPNameAndType;
        }
        Integer num = this.mapDescriptor.get(str);
        if (num != null) {
            return cpNameAndTypeValue(num.intValue());
        }
        int iIndexOf = str.indexOf(58);
        CPNameAndType cPNameAndType2 = new CPNameAndType(cpUTF8Value(str.substring(0, iIndexOf), true), cpUTF8Value(str.substring(iIndexOf + 1), true), this.descrOffset - 1);
        this.descriptorsToCPNameAndTypes.put(str, cPNameAndType2);
        return cPNameAndType2;
    }

    public int[] getCpDescriptorNameInts() {
        return this.cpDescriptorNameInts;
    }

    public int[] getCpDescriptorTypeInts() {
        return this.cpDescriptorTypeInts;
    }
}
