package com.fasterxml.jackson.annotation;

import com.google.common.reflect.ClassPath;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@JacksonAnnotation
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface JsonInclude {

    public enum Include {
        ALWAYS,
        NON_NULL,
        NON_ABSENT,
        NON_EMPTY,
        NON_DEFAULT,
        CUSTOM,
        USE_DEFAULTS
    }

    Include content() default Include.ALWAYS;

    Class<?> contentFilter() default Void.class;

    Include value() default Include.ALWAYS;

    Class<?> valueFilter() default Void.class;

    /* loaded from: classes7.dex */
    public static class Value implements JacksonAnnotationValue<JsonInclude>, Serializable {
        public static final Value EMPTY;
        public static final long serialVersionUID = 1;
        public final Class<?> _contentFilter;
        public final Include _contentInclusion;
        public final Class<?> _valueFilter;
        public final Include _valueInclusion;

        static {
            Include include = Include.USE_DEFAULTS;
            EMPTY = new Value(include, include, null, null);
        }

        public Value(JsonInclude jsonInclude) {
            this(jsonInclude.value(), jsonInclude.content(), jsonInclude.valueFilter(), jsonInclude.contentFilter());
        }

        public Value(Include include, Include include2, Class<?> cls, Class<?> cls2) {
            this._valueInclusion = include == null ? Include.USE_DEFAULTS : include;
            this._contentInclusion = include2 == null ? Include.USE_DEFAULTS : include2;
            this._valueFilter = cls == Void.class ? null : cls;
            this._contentFilter = cls2 == Void.class ? null : cls2;
        }

        public static Value empty() {
            return EMPTY;
        }

        public static Value merge(Value value, Value value2) {
            return value == null ? value2 : value.withOverrides(value2);
        }

        public static Value mergeAll(Value... valueArr) {
            Value value = null;
            for (Value valueWithOverrides : valueArr) {
                if (valueWithOverrides != null) {
                    if (value != null) {
                        valueWithOverrides = value.withOverrides(valueWithOverrides);
                    }
                    value = valueWithOverrides;
                }
            }
            return value;
        }

        public Object readResolve() {
            Include include = this._valueInclusion;
            Include include2 = Include.USE_DEFAULTS;
            return (include == include2 && this._contentInclusion == include2 && this._valueFilter == null && this._contentFilter == null) ? EMPTY : this;
        }

        public Value withOverrides(Value value) {
            if (value != null && value != EMPTY) {
                Include include = value._valueInclusion;
                Include include2 = value._contentInclusion;
                Class<?> cls = value._valueFilter;
                Class<?> cls2 = value._contentFilter;
                Include include3 = this._valueInclusion;
                boolean z = (include == include3 || include == Include.USE_DEFAULTS) ? false : true;
                Include include4 = this._contentInclusion;
                boolean z2 = (include2 == include4 || include2 == Include.USE_DEFAULTS) ? false : true;
                Class<?> cls3 = this._valueFilter;
                boolean z3 = (cls == cls3 && cls2 == cls3) ? false : true;
                if (z) {
                    if (z2) {
                        return new Value(include, include2, cls, cls2);
                    }
                    return new Value(include, include4, cls, cls2);
                }
                if (z2) {
                    return new Value(include3, include2, cls, cls2);
                }
                if (z3) {
                    return new Value(include3, include4, cls, cls2);
                }
            }
            return this;
        }

        public static Value construct(Include include, Include include2) {
            Include include3 = Include.USE_DEFAULTS;
            if ((include == include3 || include == null) && (include2 == include3 || include2 == null)) {
                return EMPTY;
            }
            return new Value(include, include2, null, null);
        }

        public static Value construct(Include include, Include include2, Class<?> cls, Class<?> cls2) {
            if (cls == Void.class) {
                cls = null;
            }
            if (cls2 == Void.class) {
                cls2 = null;
            }
            Include include3 = Include.USE_DEFAULTS;
            if ((include == include3 || include == null) && ((include2 == include3 || include2 == null) && cls == null && cls2 == null)) {
                return EMPTY;
            }
            return new Value(include, include2, cls, cls2);
        }

        public static Value from(JsonInclude jsonInclude) {
            if (jsonInclude == null) {
                return EMPTY;
            }
            Include includeValue = jsonInclude.value();
            Include includeContent = jsonInclude.content();
            Include include = Include.USE_DEFAULTS;
            if (includeValue == include && includeContent == include) {
                return EMPTY;
            }
            Class<?> clsValueFilter = jsonInclude.valueFilter();
            if (clsValueFilter == Void.class) {
                clsValueFilter = null;
            }
            Class<?> clsContentFilter = jsonInclude.contentFilter();
            return new Value(includeValue, includeContent, clsValueFilter, clsContentFilter != Void.class ? clsContentFilter : null);
        }

        public Value withValueInclusion(Include include) {
            return include == this._valueInclusion ? this : new Value(include, this._contentInclusion, this._valueFilter, this._contentFilter);
        }

        public Value withValueFilter(Class<?> cls) {
            Include include;
            if (cls == null || cls == Void.class) {
                include = Include.USE_DEFAULTS;
                cls = null;
            } else {
                include = Include.CUSTOM;
            }
            return construct(include, this._contentInclusion, cls, this._contentFilter);
        }

        public Value withContentFilter(Class<?> cls) {
            Include include;
            if (cls == null || cls == Void.class) {
                include = Include.USE_DEFAULTS;
                cls = null;
            } else {
                include = Include.CUSTOM;
            }
            return construct(this._valueInclusion, include, this._valueFilter, cls);
        }

        public Value withContentInclusion(Include include) {
            return include == this._contentInclusion ? this : new Value(this._valueInclusion, include, this._valueFilter, this._contentFilter);
        }

        @Override // com.fasterxml.jackson.annotation.JacksonAnnotationValue
        public Class<JsonInclude> valueFor() {
            return JsonInclude.class;
        }

        public Include getValueInclusion() {
            return this._valueInclusion;
        }

        public Include getContentInclusion() {
            return this._contentInclusion;
        }

        public Class<?> getValueFilter() {
            return this._valueFilter;
        }

        public Class<?> getContentFilter() {
            return this._contentFilter;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(80);
            sb.append("JsonInclude.Value(value=");
            sb.append(this._valueInclusion);
            sb.append(",content=");
            sb.append(this._contentInclusion);
            if (this._valueFilter != null) {
                sb.append(",valueFilter=");
                sb.append(this._valueFilter.getName());
                sb.append(ClassPath.CLASS_FILE_NAME_EXTENSION);
            }
            if (this._contentFilter != null) {
                sb.append(",contentFilter=");
                sb.append(this._contentFilter.getName());
                sb.append(ClassPath.CLASS_FILE_NAME_EXTENSION);
            }
            sb.append(')');
            return sb.toString();
        }

        public int hashCode() {
            return (this._valueInclusion.hashCode() << 2) + this._contentInclusion.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            Value value = (Value) obj;
            return value._valueInclusion == this._valueInclusion && value._contentInclusion == this._contentInclusion && value._valueFilter == this._valueFilter && value._contentFilter == this._contentFilter;
        }
    }
}
