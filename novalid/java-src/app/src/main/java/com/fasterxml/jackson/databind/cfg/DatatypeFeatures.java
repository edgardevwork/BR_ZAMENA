package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.core.FormatFeature;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class DatatypeFeatures implements Serializable {
    public static final int FEATURE_INDEX_ENUM = 0;
    public static final int FEATURE_INDEX_JSON_NODE = 1;
    public static final long serialVersionUID = 1;
    public final int _enabledFor1;
    public final int _enabledFor2;
    public final int _explicitFor1;
    public final int _explicitFor2;

    public DatatypeFeatures(int i, int i2, int i3, int i4) {
        this._enabledFor1 = i;
        this._explicitFor1 = i2;
        this._enabledFor2 = i3;
        this._explicitFor2 = i4;
    }

    public static DatatypeFeatures defaultFeatures() {
        return DefaultHolder.getDefault();
    }

    public final DatatypeFeatures _with(int i, int i2, int i3, int i4) {
        return (this._enabledFor1 == i && this._explicitFor1 == i2 && this._enabledFor2 == i3 && this._explicitFor2 == i4) ? this : new DatatypeFeatures(i, i2, i3, i4);
    }

    public DatatypeFeatures with(DatatypeFeature datatypeFeature) {
        int mask = datatypeFeature.getMask();
        int iFeatureIndex = datatypeFeature.featureIndex();
        if (iFeatureIndex == 0) {
            return _with(this._enabledFor1 | mask, mask | this._explicitFor1, this._enabledFor2, this._explicitFor2);
        }
        if (iFeatureIndex == 1) {
            return _with(this._enabledFor1, this._explicitFor1, this._enabledFor2 | mask, mask | this._explicitFor2);
        }
        VersionUtil.throwInternal();
        return this;
    }

    public DatatypeFeatures withFeatures(DatatypeFeature... datatypeFeatureArr) {
        int i_calcMask = _calcMask(datatypeFeatureArr);
        if (i_calcMask == 0) {
            return this;
        }
        int iFeatureIndex = datatypeFeatureArr[0].featureIndex();
        if (iFeatureIndex == 0) {
            return _with(this._enabledFor1 | i_calcMask, i_calcMask | this._explicitFor1, this._enabledFor2, this._explicitFor2);
        }
        if (iFeatureIndex == 1) {
            return _with(this._enabledFor1, this._explicitFor1, this._enabledFor2 | i_calcMask, i_calcMask | this._explicitFor2);
        }
        VersionUtil.throwInternal();
        return this;
    }

    public DatatypeFeatures without(DatatypeFeature datatypeFeature) {
        int mask = datatypeFeature.getMask();
        int iFeatureIndex = datatypeFeature.featureIndex();
        if (iFeatureIndex == 0) {
            return _with(this._enabledFor1 & (~mask), mask | this._explicitFor1, this._enabledFor2, this._explicitFor2);
        }
        if (iFeatureIndex == 1) {
            return _with(this._enabledFor1, this._explicitFor1, this._enabledFor2 & (~mask), mask | this._explicitFor2);
        }
        VersionUtil.throwInternal();
        return this;
    }

    public DatatypeFeatures withoutFeatures(DatatypeFeature... datatypeFeatureArr) {
        int i_calcMask = _calcMask(datatypeFeatureArr);
        if (i_calcMask == 0) {
            return this;
        }
        int iFeatureIndex = datatypeFeatureArr[0].featureIndex();
        if (iFeatureIndex == 0) {
            return _with(this._enabledFor1 & (~i_calcMask), i_calcMask | this._explicitFor1, this._enabledFor2, this._explicitFor2);
        }
        if (iFeatureIndex == 1) {
            return _with(this._enabledFor1, this._explicitFor1, this._enabledFor2 & (~i_calcMask), i_calcMask | this._explicitFor2);
        }
        VersionUtil.throwInternal();
        return this;
    }

    public static final int _calcMask(DatatypeFeature... datatypeFeatureArr) {
        int mask = 0;
        for (DatatypeFeature datatypeFeature : datatypeFeatureArr) {
            mask |= datatypeFeature.getMask();
        }
        return mask;
    }

    public boolean isEnabled(DatatypeFeature datatypeFeature) {
        int iFeatureIndex = datatypeFeature.featureIndex();
        if (iFeatureIndex == 0) {
            return datatypeFeature.enabledIn(this._enabledFor1);
        }
        if (iFeatureIndex == 1) {
            return datatypeFeature.enabledIn(this._enabledFor2);
        }
        VersionUtil.throwInternal();
        return false;
    }

    public boolean isExplicitlySet(DatatypeFeature datatypeFeature) {
        int iFeatureIndex = datatypeFeature.featureIndex();
        if (iFeatureIndex == 0) {
            return datatypeFeature.enabledIn(this._explicitFor1);
        }
        if (iFeatureIndex == 1) {
            return datatypeFeature.enabledIn(this._explicitFor2);
        }
        VersionUtil.throwInternal();
        return false;
    }

    public Boolean getExplicitState(DatatypeFeature datatypeFeature) {
        int iFeatureIndex = datatypeFeature.featureIndex();
        if (iFeatureIndex == 0) {
            if (datatypeFeature.enabledIn(this._explicitFor1)) {
                return Boolean.valueOf(datatypeFeature.enabledIn(this._enabledFor1));
            }
            return null;
        }
        if (iFeatureIndex == 1) {
            if (datatypeFeature.enabledIn(this._explicitFor2)) {
                return Boolean.valueOf(datatypeFeature.enabledIn(this._enabledFor2));
            }
            return null;
        }
        VersionUtil.throwInternal();
        return null;
    }

    public static class DefaultHolder {
        public static final DatatypeFeatures DEFAULT_FEATURES = new DatatypeFeatures(collectDefaults(EnumFeature.values()), 0, collectDefaults(JsonNodeFeature.values()), 0);

        /* JADX WARN: Incorrect types in method signature: <F:Ljava/lang/Enum<TF;>;:Lcom/fasterxml/jackson/core/util/JacksonFeature;>([TF;)I */
        /* JADX WARN: Multi-variable type inference failed */
        public static int collectDefaults(Enum[] enumArr) {
            int mask = 0;
            for (FormatFeature formatFeature : enumArr) {
                if (formatFeature.enabledByDefault()) {
                    mask |= formatFeature.getMask();
                }
            }
            return mask;
        }

        public static DatatypeFeatures getDefault() {
            return DEFAULT_FEATURES;
        }
    }
}
