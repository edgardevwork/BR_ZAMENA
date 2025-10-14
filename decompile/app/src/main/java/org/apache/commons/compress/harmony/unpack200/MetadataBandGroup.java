package org.apache.commons.compress.harmony.unpack200;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.IntFunction;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationDefaultAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.Attribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPLong;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleAnnotationsAttribute;
import org.apache.commons.compress.harmony.unpack200.bytecode.RuntimeVisibleorInvisibleParameterAnnotationsAttribute;

/* loaded from: classes7.dex */
public class MetadataBandGroup {
    public static CPUTF8 riaUTF8;
    public static CPUTF8 ripaUTF8;
    public static CPUTF8 rvaUTF8;
    public static CPUTF8 rvpaUTF8;

    /* renamed from: T */
    public int[] f9881T;
    public int T_index;
    public int[] anno_N;
    public int anno_N_Index;
    public List<Attribute> attributes;
    public CPDouble[] caseD_KD;
    public int caseD_KD_Index;
    public CPFloat[] caseF_KF;
    public int caseF_KF_Index;
    public CPInteger[] caseI_KI;
    public int caseI_KI_Index;
    public CPLong[] caseJ_KJ;
    public int caseJ_KJ_Index;
    public int[] casearray_N;
    public int casearray_N_Index;
    public CPUTF8[] casec_RS;
    public int casec_RS_Index;
    public String[] caseec_RU;
    public int caseec_RU_Index;
    public String[] caseet_RS;
    public int caseet_RS_Index;
    public CPUTF8[] cases_RU;
    public int cases_RU_Index;
    public final CpBands cpBands;
    public CPUTF8[] name_RU;
    public CPUTF8[] nestname_RU;
    public Iterator<CPUTF8> nestname_RU_Iterator;
    public int[] nestpair_N;
    public int nestpair_N_Index;
    public CPUTF8[] nesttype_RS;
    public int nesttype_RS_Index;
    public int[][] pair_N;
    public int pair_N_Index;
    public int[] param_NB;
    public final String type;
    public CPUTF8[][] type_RS;

    public static void setRvaAttributeName(CPUTF8 cputf8) {
        rvaUTF8 = cputf8;
    }

    public static void setRiaAttributeName(CPUTF8 cputf8) {
        riaUTF8 = cputf8;
    }

    public static void setRvpaAttributeName(CPUTF8 cputf8) {
        rvpaUTF8 = cputf8;
    }

    public static void setRipaAttributeName(CPUTF8 cputf8) {
        ripaUTF8 = cputf8;
    }

    public MetadataBandGroup(String str, CpBands cpBands) {
        this.type = str;
        this.cpBands = cpBands;
    }

    public List<Attribute> getAttributes() {
        if (this.attributes == null) {
            this.attributes = new ArrayList();
            CPUTF8[] cputf8Arr = this.name_RU;
            int i = 0;
            if (cputf8Arr != null) {
                Iterator<CPUTF8> it = Arrays.asList(cputf8Arr).iterator();
                if (!this.type.equals("AD")) {
                    this.T_index = 0;
                }
                this.caseI_KI_Index = 0;
                this.caseD_KD_Index = 0;
                this.caseF_KF_Index = 0;
                this.caseJ_KJ_Index = 0;
                this.casec_RS_Index = 0;
                this.caseet_RS_Index = 0;
                this.caseec_RU_Index = 0;
                this.cases_RU_Index = 0;
                this.casearray_N_Index = 0;
                this.nesttype_RS_Index = 0;
                this.nestpair_N_Index = 0;
                this.nestname_RU_Iterator = Arrays.asList(this.nestname_RU).iterator();
                if (this.type.equals("RVA") || this.type.equals("RIA")) {
                    while (true) {
                        int[] iArr = this.anno_N;
                        if (i >= iArr.length) {
                            break;
                        }
                        this.attributes.add(getAttribute(iArr[i], this.type_RS[i], this.pair_N[i], it));
                        i++;
                    }
                } else if (this.type.equals("RVPA") || this.type.equals("RIPA")) {
                    this.anno_N_Index = 0;
                    this.pair_N_Index = 0;
                    int[] iArr2 = this.param_NB;
                    int length = iArr2.length;
                    while (i < length) {
                        this.attributes.add(getParameterAttribute(iArr2[i], it));
                        i++;
                    }
                }
            } else if (this.type.equals("AD")) {
                int[] iArr3 = this.f9881T;
                int length2 = iArr3.length;
                while (i < length2) {
                    int i2 = iArr3[i];
                    this.attributes.add(new AnnotationDefaultAttribute(new AnnotationsAttribute.ElementValue(i2, getNextValue(i2))));
                    i++;
                }
            }
        }
        return this.attributes;
    }

    public final Attribute getAttribute(int i, final CPUTF8[] cputf8Arr, final int[] iArr, final Iterator<CPUTF8> it) {
        AnnotationsAttribute.Annotation[] annotationArr = new AnnotationsAttribute.Annotation[i];
        Arrays.setAll(annotationArr, new IntFunction() { // from class: org.apache.commons.compress.harmony.unpack200.MetadataBandGroup$$ExternalSyntheticLambda1
            @Override // java.util.function.IntFunction
            public final Object apply(int i2) {
                return this.f$0.lambda$getAttribute$0(cputf8Arr, iArr, it, i2);
            }
        });
        return new RuntimeVisibleorInvisibleAnnotationsAttribute(this.type.equals("RVA") ? rvaUTF8 : riaUTF8, annotationArr);
    }

    public final /* synthetic */ AnnotationsAttribute.Annotation lambda$getAttribute$0(CPUTF8[] cputf8Arr, int[] iArr, Iterator it, int i) {
        return getAnnotation(cputf8Arr[i], iArr[i], it);
    }

    public final Attribute getParameterAttribute(int i, final Iterator<CPUTF8> it) {
        RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[] parameterAnnotationArr = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation[i];
        for (int i2 = 0; i2 < i; i2++) {
            int[] iArr = this.anno_N;
            int i3 = this.anno_N_Index;
            this.anno_N_Index = i3 + 1;
            int i4 = iArr[i3];
            int[][] iArr2 = this.pair_N;
            int i5 = this.pair_N_Index;
            this.pair_N_Index = i5 + 1;
            final int[] iArr3 = iArr2[i5];
            AnnotationsAttribute.Annotation[] annotationArr = new AnnotationsAttribute.Annotation[i4];
            Arrays.setAll(annotationArr, new IntFunction() { // from class: org.apache.commons.compress.harmony.unpack200.MetadataBandGroup$$ExternalSyntheticLambda0
                @Override // java.util.function.IntFunction
                public final Object apply(int i6) {
                    return this.f$0.lambda$getParameterAttribute$1(iArr3, it, i6);
                }
            });
            parameterAnnotationArr[i2] = new RuntimeVisibleorInvisibleParameterAnnotationsAttribute.ParameterAnnotation(annotationArr);
        }
        return new RuntimeVisibleorInvisibleParameterAnnotationsAttribute(this.type.equals("RVPA") ? rvpaUTF8 : ripaUTF8, parameterAnnotationArr);
    }

    public final /* synthetic */ AnnotationsAttribute.Annotation lambda$getParameterAttribute$1(int[] iArr, Iterator it, int i) {
        return getAnnotation(this.type_RS[this.anno_N_Index - 1][i], iArr[i], it);
    }

    public final AnnotationsAttribute.Annotation getAnnotation(CPUTF8 cputf8, int i, Iterator<CPUTF8> it) {
        CPUTF8[] cputf8Arr = new CPUTF8[i];
        AnnotationsAttribute.ElementValue[] elementValueArr = new AnnotationsAttribute.ElementValue[i];
        for (int i2 = 0; i2 < i; i2++) {
            cputf8Arr[i2] = it.next();
            int[] iArr = this.f9881T;
            int i3 = this.T_index;
            this.T_index = i3 + 1;
            int i4 = iArr[i3];
            elementValueArr[i2] = new AnnotationsAttribute.ElementValue(i4, getNextValue(i4));
        }
        return new AnnotationsAttribute.Annotation(i, cputf8, cputf8Arr, elementValueArr);
    }

    public final Object getNextValue(int i) {
        if (i == 64) {
            CPUTF8[] cputf8Arr = this.nesttype_RS;
            int i2 = this.nesttype_RS_Index;
            this.nesttype_RS_Index = i2 + 1;
            CPUTF8 cputf8 = cputf8Arr[i2];
            int[] iArr = this.nestpair_N;
            int i3 = this.nestpair_N_Index;
            this.nestpair_N_Index = i3 + 1;
            return getAnnotation(cputf8, iArr[i3], this.nestname_RU_Iterator);
        }
        if (i != 70) {
            if (i != 83) {
                if (i == 99) {
                    CPUTF8[] cputf8Arr2 = this.casec_RS;
                    int i4 = this.casec_RS_Index;
                    this.casec_RS_Index = i4 + 1;
                    return cputf8Arr2[i4];
                }
                if (i == 101) {
                    StringBuilder sb = new StringBuilder();
                    String[] strArr = this.caseet_RS;
                    int i5 = this.caseet_RS_Index;
                    this.caseet_RS_Index = i5 + 1;
                    sb.append(strArr[i5]);
                    sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    String[] strArr2 = this.caseec_RU;
                    int i6 = this.caseec_RU_Index;
                    this.caseec_RU_Index = i6 + 1;
                    sb.append(strArr2[i6]);
                    return this.cpBands.cpNameAndTypeValue(sb.toString());
                }
                if (i == 115) {
                    CPUTF8[] cputf8Arr3 = this.cases_RU;
                    int i7 = this.cases_RU_Index;
                    this.cases_RU_Index = i7 + 1;
                    return cputf8Arr3[i7];
                }
                if (i != 73) {
                    if (i == 74) {
                        CPLong[] cPLongArr = this.caseJ_KJ;
                        int i8 = this.caseJ_KJ_Index;
                        this.caseJ_KJ_Index = i8 + 1;
                        return cPLongArr[i8];
                    }
                    if (i != 90) {
                        if (i != 91) {
                            switch (i) {
                                case 66:
                                case 67:
                                    break;
                                case 68:
                                    CPDouble[] cPDoubleArr = this.caseD_KD;
                                    int i9 = this.caseD_KD_Index;
                                    this.caseD_KD_Index = i9 + 1;
                                    return cPDoubleArr[i9];
                                default:
                                    return null;
                            }
                        } else {
                            int[] iArr2 = this.casearray_N;
                            int i10 = this.casearray_N_Index;
                            this.casearray_N_Index = i10 + 1;
                            int i11 = iArr2[i10];
                            AnnotationsAttribute.ElementValue[] elementValueArr = new AnnotationsAttribute.ElementValue[i11];
                            for (int i12 = 0; i12 < i11; i12++) {
                                int[] iArr3 = this.f9881T;
                                int i13 = this.T_index;
                                this.T_index = i13 + 1;
                                int i14 = iArr3[i13];
                                elementValueArr[i12] = new AnnotationsAttribute.ElementValue(i14, getNextValue(i14));
                            }
                            return elementValueArr;
                        }
                    }
                }
            }
            CPInteger[] cPIntegerArr = this.caseI_KI;
            int i15 = this.caseI_KI_Index;
            this.caseI_KI_Index = i15 + 1;
            return cPIntegerArr[i15];
        }
        CPFloat[] cPFloatArr = this.caseF_KF;
        int i16 = this.caseF_KF_Index;
        this.caseF_KF_Index = i16 + 1;
        return cPFloatArr[i16];
    }
}
